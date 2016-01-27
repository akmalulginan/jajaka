/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author akmal
 */
public class TransaksiGudangModel extends Model {
    private int kodePenyimpanan;
    private ItemModel item;
    private GudangModel gudang;
    
    private String kodeGudang;
    private String kodeItem;
    private String namaItem;
    private String baris;
    private String rak;
    private long tanggalBarangMasuk;
    private int jumlahBarangMasuk;
    private int jumlahStockBarang;

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getBaris() {
        return baris;
    }

    public void setBaris(String baris) {
        this.baris = baris;
    }

    public String getRak() {
        return rak;
    }

    public void setRak(String rak) {
        this.rak = rak;
    }

    public long getTanggalBarangMasuk() {
        return tanggalBarangMasuk;
    }

    public void setTanggalBarangMasuk(long tanggalBarangMasuk) {
        this.tanggalBarangMasuk = tanggalBarangMasuk;
    }

    public int getJumlahBarangMasuk() {
        return jumlahBarangMasuk;
    }

    public void setJumlahBarangMasuk(int jumlahBarangMasuk) {
        this.jumlahBarangMasuk = jumlahBarangMasuk;
    }

    public int getJumlahStockBarang() {
        return jumlahStockBarang;
    }

    public void setJumlahStockBarang(int jumlahStockBarang) {
        this.jumlahStockBarang = jumlahStockBarang;
    }
    
    
    
//    Date waktu

    public void select(String sql, JTable table) {
        try {
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getImage(String kode, JLabel gambarLabel) {
        String sql = "SELECT gambar FROM item WHERE kodeItem=?";

        try {
//            conn = DbConnect.ConnectDb();
            pst = conn.prepareStatement(sql);
            pst.setString(1, kode);
            rs = pst.executeQuery();
            while (rs.next()) {
                byte[] photo = rs.getBytes("gambar");
                ImageIcon poto = new ImageIcon(photo);
                Image img = poto.getImage().getScaledInstance(gambarLabel.getWidth(), (gambarLabel.getWidth() * poto.getIconHeight()) / poto.getIconWidth(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon i = new ImageIcon(img);
                gambarLabel.setIcon(i);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean insert() {
        try {
            String sql = "INSERT INTO transaksiGudang (kodeTransaksi, kodeGudang, kodeItem, namaItem, baris, rak, tanggalBarangMasuk, jumlahBarangMasuk, jumlahStockBarang) VALUES (null,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
           
            pst.setString(1, kodeGudang);
            pst.setString(2, kodeItem);
            pst.setString(3, namaItem);
            pst.setString(4, baris);
            pst.setString(5, rak);
            pst.setLong(6, tanggalBarangMasuk);
            pst.setInt(7, jumlahBarangMasuk);
            pst.setInt(8, jumlahStockBarang);
            pst.execute();

            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
