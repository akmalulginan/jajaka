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

            return true;

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean update() {
        boolean toReturn = false;
        try {

            String query = "UPDATE supplier "
                    + "SET "
                    + "namaSupplier = ? "
                    + "kategoriSupplier = ? "
                    + "alamat = ? "
                    + "kota = ? "
                    + "kodePos = ? "
                    + "noTelp = ? "
                    + "noFax = ? "
                    + "email = ? "
                    + "catatan = ? "
                    + "contactPerson = ? "
                    + "noTelpCs = ? "
                    + "emailCs = ? "
                    + "WHERE kodeSupplier = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(13, kodeSupplier);
                pst.setString(1, namaSupplier);
                pst.setString(2, kategoriSupplier);
                pst.setString(3, kota);
                pst.setString(4, kodePos);
                pst.setString(5, noTelp);
                pst.setString(6, noFax);
                pst.setString(7, email);
                pst.setString(8, catatan);
                pst.setString(9, catatan);
                pst.setString(10, contactPerson);
                pst.setString(11, noTelpCs);
                pst.setString(12, emailCs);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public ArrayList<SupplierModel> select(String cari) {
        String query = "SELECT * FROM supplier";
        if (!cari.isEmpty()) {
            query = query + " WHERE kodeSupplier LIKE '%" + cari + "%' OR namaSupplier LIKE '%" + cari + "%'";
        }
        ArrayList<SupplierModel> list = new ArrayList<>();
        
        try {
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                SupplierModel supplierModel = new SupplierModel();
                supplierModel.setKodeSupplier(rs.getString("kodeSupplier"));
                supplierModel.setNamaSupplier(rs.getString("namaSupplier"));
                supplierModel.setKategoriSupplier(rs.getString("kategoriSupplier"));
                supplierModel.setAlamat(rs.getString("alamat"));
                supplierModel.setKota(rs.getString("kota"));
                supplierModel.setKodePos(rs.getString("kodePos"));
                supplierModel.setNoTelp(rs.getString("noTelp"));
                supplierModel.setNoFax(rs.getString("noFax"));
                supplierModel.setEmail(rs.getString("email"));
                supplierModel.setCatatan(rs.getString("catatan"));
                supplierModel.setContactPerson(rs.getString("contactPerson"));
                supplierModel.setNoTelpCs(rs.getString("noTelpCs"));
                supplierModel.setEmailCs(rs.getString("emailCs"));
                list.add(supplierModel);
            }
            return list;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }

    public Boolean delete() {
        Boolean toReturn = false;

        try {
            String query = "DELETE FROM supplier WHERE kodeSupplier = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodeSupplier);
                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {

        }

        return toReturn;
    }


}
