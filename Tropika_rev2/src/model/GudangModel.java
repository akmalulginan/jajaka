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
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeGudang);
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

                pst.setString(11, kodeGudang);
                pst.setString(1, alamat);
                pst.setString(2, kota);
                pst.setString(3, kodePos);
                pst.setString(4, noTelp);
                pst.setString(5, noFax);
                pst.setString(6, email);
                pst.setString(7, catatan);
                pst.setString(8, contactPerson);
                pst.setBoolean(9, penyimpanan);
                pst.setBoolean(10, produksi);

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
