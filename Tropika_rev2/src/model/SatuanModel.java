/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class SatuanModel extends Model {

    String kodeSatuan;
    String namaSatuan;

    public SatuanModel() {
    }

    public SatuanModel(String kodeSatuan, String namaSatuan) {
        this.kodeSatuan = kodeSatuan;
        this.namaSatuan = namaSatuan;
    }

    public String getKodeSatuan() {
        return kodeSatuan;
    }

    public void setKodeSatuan(String kodeSatuan) {
        this.kodeSatuan = kodeSatuan;
    }

    public String getNamaSatuan() {
        return namaSatuan;
    }

    public void setNamaSatuan(String namaSatuan) {
        this.namaSatuan = namaSatuan;
    }

//    @Override
    public void insert() {
        try {
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            String sql = "INSERT INTO satuan (kodeSatuan, namaSatuan) VALUES (?,?);";
            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeSatuan);
            pst.setString(2, namaSatuan);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penambahan Satuan Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kode Satuan Sudah Dipakai!");
//            System.out.println(e);
        }
    }
    
    public void select(JComboBox combo){
        try {
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            String sql = "SELECT * FROM satuan";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String satuan = rs.getString("kodeSatuan");
                combo.addItem(satuan);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
