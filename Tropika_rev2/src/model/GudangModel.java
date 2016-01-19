/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class GudangModel extends Model {

    String kodeGudang;
    String kategoriGudang;
    String alamat;
    String kota;
    String kodePos;
    String noTelp;
    String noFax;
    String email;
    String catatan;
    String contactPerson;
    boolean penyimpanan;
    boolean produksi;

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String getKategoriGudang() {
        return kategoriGudang;
    }

    public void setKategoriGudang(String kategoriGudang) {
        this.kategoriGudang = kategoriGudang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNoFax() {
        return noFax;
    }

    public void setNoFax(String noFax) {
        this.noFax = noFax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public boolean getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(Boolean penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    public boolean getProduksi() {
        return produksi;
    }

    public void setProduksi(Boolean produksi) {
        this.produksi = produksi;
    }

    public boolean insert() {
        try {
            String sql = "INSERT INTO gudang "
                    + "("
                    + "kodeGudang, "
                    + "kategoriGudang, "
                    + "alamat, "
                    + "kota, "
                    + "kodePos, "
                    + "noTelp, "
                    + "noFax, "
                    + "email, "
                    + "catatan, "
                    + "contactPerson, "
                    + "penyimpanan, "
                    + "produksi"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeGudang);
            pst.setString(2, kategoriGudang);
            pst.setString(3, alamat);
            pst.setString(4, kota);
            pst.setString(5, kodePos);
            pst.setString(6, noTelp);
            pst.setString(7, noFax);
            pst.setString(8, email);
            pst.setString(9, catatan);
            pst.setString(10, contactPerson);
            pst.setBoolean(11, penyimpanan);
            pst.setBoolean(12, produksi);

            pst.execute();

            return true;

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean update() {
        boolean toReturn = false;

        try {
            String query = "UPDATE  "
                    + "SET "
                    + "kategoriGudang = ?"
                    + "alamat = ?"
                    + "kota = ?"
                    + "kodePos = ?"
                    + "noTelp = ?"
                    + "noFax = ?"
                    + "email = ?"
                    + "catatan = ?"
                    + "contactPerson = ?"
                    + "penyimpanan = ?"
                    + "produksi = ?"
                    + "WHERE kodeGudang = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);

                pst.setString(12, kodeGudang);
                pst.setString(1, kategoriGudang);
                pst.setString(2, alamat);
                pst.setString(3, kota);
                pst.setString(4, kodePos);
                pst.setString(5, noTelp);
                pst.setString(6, noFax);
                pst.setString(7, email);
                pst.setString(8, catatan);
                pst.setString(9, contactPerson);
                pst.setBoolean(10, penyimpanan);
                pst.setBoolean(11, produksi);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public ArrayList<GudangModel> select() {
        ArrayList<GudangModel> list = new ArrayList<>();
        try {
            pst = conn.prepareStatement("SELECT * FROM gudang");
            rs = pst.executeQuery();
            while (rs.next()) {

                this.setKodeGudang(rs.getString("kodeGudang"));
                this.setKategoriGudang(rs.getString("kategoriGudang"));
                this.setAlamat(rs.getString("alamat"));
                this.setKota(rs.getString("kota"));
                this.setKodePos(rs.getString("kodePos"));
                this.setNoTelp(rs.getString("noTelp"));
                this.setNoFax(rs.getString("noFax"));
                this.setEmail(rs.getString("email"));
                this.setCatatan(rs.getString("catatan"));
                this.setContactPerson(rs.getString("contactPerson"));
                this.setPenyimpanan(rs.getBoolean("penyimpanan"));
                this.setProduksi(rs.getBoolean("produksi"));

                list.add(this);
            }
            return list;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }

    public boolean delete() {
        boolean toReturn = false;

        try {
            String query = "DELETE FROM gudang WHERE kodeGudang = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodeGudang);
                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }

        return toReturn;
    }

}
