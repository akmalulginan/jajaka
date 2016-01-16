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
public class SupplierModel extends Model {

    String kodeSupplier;
    String namaSupplier;
    String kategoriSupplier;
    String alamat;
    String kota;
    String kodePos;
    String noTelp;
    String noFax;
    String email;
    String catatan;
    String contactPerson;
    String noTelpCs;
    String emailCs;

    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getKategoriSupplier() {
        return kategoriSupplier;
    }

    public void setKategoriSupplier(String kategoriSupplier) {
        this.kategoriSupplier = kategoriSupplier;
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

    public String getNoTelpCs() {
        return noTelpCs;
    }

    public void setNoTelpCs(String noTelpCs) {
        this.noTelpCs = noTelpCs;
    }

    public String getEmailCs() {
        return emailCs;
    }

    public void setEmailCs(String emailCs) {
        this.emailCs = emailCs;
    }

    public boolean insert() {
        try {
            String sql = "INSERT INTO "
                    + "supplier "
                    + "("
                    + "kodeSupplier, "
                    + "namaSupplier, "
                    + "kategoriSupplier, "
                    + "alamat, "
                    + "kota, "
                    + "kodePos, "
                    + "noTelp, "
                    + "noFax, "
                    + "email, "
                    + "catatan, "
                    + "contactPerson, "
                    + "noTelpCs, "
                    + "emailCs"
                    + ") "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeSupplier);
            pst.setString(2, namaSupplier);
            pst.setString(3, kategoriSupplier);
            pst.setString(4, kota);
            pst.setString(5, kodePos);
            pst.setString(6, noTelp);
            pst.setString(7, noFax);
            pst.setString(8, email);
            pst.setString(9, catatan);
            pst.setString(10, catatan);
            pst.setString(11, contactPerson);
            pst.setString(12, noTelpCs);
            pst.setString(13, emailCs);

            pst.execute();
            JOptionPane.showMessageDialog(null, "SUKSES");

            return true;

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

}
