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

    public ArrayList<GudangModel> select(String cari) {
        ArrayList<GudangModel> gudangList = new ArrayList<>();
        String query = "SELECT * FROM gudang";
        if (!cari.isEmpty()) {
            query = query + " WHERE kodeGudang LIKE '%" + cari + "%' "
                    + "OR kategoriGudang LIKE '%" + cari + "%' "
                    + "OR alamat LIKE '%" + cari + "%' "
                    + "OR kota LIKE '%" + cari + "%' "
                    + "OR kodePos LIKE '%" + cari + "%' "
                    + "OR noTelp LIKE '%" + cari + "%' "
                    + "OR noFax LIKE '%" + cari + "%' "
                    + "OR email LIKE '%" + cari + "%' "
                    + "OR catatan LIKE '%" + cari + "%' "
                    + "OR contactPerson LIKE '%" + cari + "%' ";
            if (cari.equals("produksi")) {
                query = query + "OR produksi = 1";
            } else if (cari.equals("penyimpanan")) {
                query = query + "OR penyimpanan = 1";
            }
        }
        System.out.println(query);
        try {
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                GudangModel gudangModel = new GudangModel();
                gudangModel.setKodeGudang(rs.getString("kodeGudang"));
                gudangModel.setKategoriGudang(rs.getString("kategoriGudang"));
                gudangModel.setAlamat(rs.getString("alamat"));
                gudangModel.setKota(rs.getString("kota"));
                gudangModel.setKodePos(rs.getString("kodePos"));
                gudangModel.setNoTelp(rs.getString("noTelp"));
                gudangModel.setNoFax(rs.getString("noFax"));
                gudangModel.setEmail(rs.getString("email"));
                gudangModel.setCatatan(rs.getString("catatan"));
                gudangModel.setContactPerson(rs.getString("contactPerson"));
                gudangModel.setPenyimpanan(rs.getBoolean("penyimpanan"));
                gudangModel.setProduksi(rs.getBoolean("produksi"));

                gudangList.add(gudangModel);
            }
            return gudangList;
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
