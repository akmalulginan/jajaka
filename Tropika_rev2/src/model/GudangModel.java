/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.SQLException;
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
    Boolean penyimpanan;
    Boolean produksi;

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

    public Boolean getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(Boolean penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    public Boolean getProduksi() {
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
    
    public static void main(String[] args) {
        new GudangModel().insert();
    }
}
