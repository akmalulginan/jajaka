/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hendar
 */
public class JabatanModel extends Model {

    String kodeJabatan;
    String namaJabatan;

    public JabatanModel(String kodeJabatan, String namaJabatan) {
        this.kodeJabatan = kodeJabatan;
        this.namaJabatan = namaJabatan;
    }

    public JabatanModel() {

    }

    public String getKodeJabatan() {
        return kodeJabatan;
    }

    public void setKodeJabatan(String kodeJabatan) {
        this.kodeJabatan = kodeJabatan;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }

    public ArrayList<JabatanModel> select(String cari) {
        ArrayList<JabatanModel> jabatanList = new ArrayList<>();
        String query = "SELECT * FROM jabatan";
        if (!cari.isEmpty()) {
            query = query + " WHERE kodeJabatan = '"+cari+"'";
        }
        try {
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            JabatanModel jabatanModel;
            while (rs.next()) {
                jabatanModel = new JabatanModel();
                jabatanModel.kodeJabatan = rs.getString("kodeJabatan");
                jabatanModel.namaJabatan = rs.getString("namaJabatan");
                jabatanList.add(jabatanModel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return jabatanList;
    }

    public void insert() {
        try {
            String sql = "INSERT INTO jabatan (kodeJabatan, namaJabatan) VALUES (?,?);";
            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeJabatan);
            pst.setString(2, namaJabatan);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penambahan Jabatan Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kode Jabatan Sudah Dipakai!");
        }
    }

}
