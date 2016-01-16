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
public class ItemModel extends Model {

    String kodeItem;
    String barcode;
    String namaItem;
    String kategori;
    String satuan;
    boolean dapatDibeli;
    boolean dapatDijual;
    boolean dapatDiproduksi;
    boolean dipakaiUntukProduksi;
    boolean dapatDibongkar;
    boolean statusItem;
    byte[] gambar;
    String keterangan;

    public ItemModel() {
    }

    public ItemModel(String kodeItem, String barcode, String namaItem, String kategori, String satuan, boolean dapatDibeli, boolean dapatDijual, boolean dapatDiproduksi, boolean dipakaiUntukProduksi, boolean dapatDibongkar, boolean statusItem, byte[] gambar, String keterangan) {
        this.kodeItem = kodeItem;
        this.barcode = barcode;
        this.namaItem = namaItem;
        this.kategori = kategori;
        this.satuan = satuan;
        this.dapatDibeli = dapatDibeli;
        this.dapatDijual = dapatDijual;
        this.dapatDiproduksi = dapatDiproduksi;
        this.dipakaiUntukProduksi = dipakaiUntukProduksi;
        this.dapatDibongkar = dapatDibongkar;
        this.statusItem = statusItem;
        this.gambar = gambar;
        this.keterangan = keterangan;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public boolean isDapatDibeli() {
        return dapatDibeli;
    }

    public void setDapatDibeli(boolean dapatDibeli) {
        this.dapatDibeli = dapatDibeli;
    }

    public boolean isDapatDijual() {
        return dapatDijual;
    }

    public void setDapatDijual(boolean dapatDijual) {
        this.dapatDijual = dapatDijual;
    }

    public boolean isDapatDiproduksi() {
        return dapatDiproduksi;
    }

    public void setDapatDiproduksi(boolean dapatDiproduksi) {
        this.dapatDiproduksi = dapatDiproduksi;
    }

    public boolean isDipakaiUntukProduksi() {
        return dipakaiUntukProduksi;
    }

    public void setDipakaiUntukProduksi(boolean dipakaiUntukProduksi) {
        this.dipakaiUntukProduksi = dipakaiUntukProduksi;
    }

    public boolean isDapatDibongkar() {
        return dapatDibongkar;
    }

    public void setDapatDibongkar(boolean dapatDibongkar) {
        this.dapatDibongkar = dapatDibongkar;
    }

    public boolean isStatusItem() {
        return statusItem;
    }

    public void setStatusItem(boolean statusItem) {
        this.statusItem = statusItem;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void insert() {
        try {
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            String sql = "INSERT INTO item "
                    + "("
                    + "kodeItem, "
                    + "barcode, "
                    + "namaItem, "
                    + "kategori, "
                    + "satuan, "
                    + "dapatDibeli, "
                    + "dapatDijual, "
                    + "dapatDiproduksi, "
                    + "dipakaiUntukProduksi, "
                    + "dapatDibongkar, "
                    + "statusItem, "
                    + "gambar, "
                    + "keterangan "
                    + ") "
                    + "VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeItem);
            pst.setString(2, barcode);
            pst.setString(3, namaItem);
            pst.setString(4, kategori);
            pst.setString(5, satuan);
            pst.setBoolean(6, dapatDibeli);
            pst.setBoolean(7, dapatDijual);
            pst.setBoolean(8, dapatDiproduksi);
            pst.setBoolean(9, dipakaiUntukProduksi);
            pst.setBoolean(10, dapatDibongkar);
            pst.setBoolean(11, statusItem);
            pst.setBytes(12, gambar);
            pst.setString(13, keterangan);
            pst.execute();
            JOptionPane.showMessageDialog(null, "SUKSES");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<ItemModel> selectItem() {
        try {
            pst = conn.prepareStatement("SELCT * FROM item");
            rs = pst.executeQuery();
            while (rs.next()) {   
                this.setKodeItem(rs.getString("kodeItem"));
                this.setBarcode(rs.getString("barcode"));
                this.setNamaItem(rs.getString("namaItem"));
                this.setKategori(rs.getString("kategori"));
                this.setSatuan(rs.getString("satuan"));
                this.setDapatDibeli(rs.getBoolean("dapatDibeli"));
                this.setDapatDijual(rs.getBoolean("dapatDibeli"));
                this.setDapatDiproduksi(rs.getBoolean("dapatDiproduksi"));
                this.setDipakaiUntukProduksi(rs.getBoolean("dapaatUntukProduksi"));
                this.setDapatDibongkar(rs.getBoolean("dapatDibongkar"));
                this.setStatusItem(rs.getBoolean("statusItem"));
                this.setGambar(rs.getBytes("gambar"));
                this.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            System.out.println("e : " + e);
        }
        return null;
    }
}
