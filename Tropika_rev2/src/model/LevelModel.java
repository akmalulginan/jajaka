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
 * @author akmal
 */
public class LevelModel extends Model {

    private int level;
    private boolean pengguna;
    private boolean hakAkses;
    private boolean gudang;
    private boolean item;
    private boolean harga;
    private boolean kategori;
    private boolean satuan;
    private boolean supplier;
    private boolean pembelian;
    private boolean penjualan;
    private boolean transaksiGudang;
    private boolean transaksi;
    private boolean laporanGudang;
    private boolean laporanPembelian;
    private boolean laporanPenjualan;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isPengguna() {
        return pengguna;
    }

    public void setPengguna(boolean pengguna) {
        this.pengguna = pengguna;
    }

    public boolean isHakAkses() {
        return hakAkses;
    }

    public void setHakAkses(boolean hakAkses) {
        this.hakAkses = hakAkses;
    }

    public boolean isGudang() {
        return gudang;
    }

    public void setGudang(boolean gudang) {
        this.gudang = gudang;
    }

    public boolean isItem() {
        return item;
    }

    public void setItem(boolean item) {
        this.item = item;
    }

    public boolean isHarga() {
        return harga;
    }

    public void setHarga(boolean harga) {
        this.harga = harga;
    }

    public boolean isKategori() {
        return kategori;
    }

    public void setKategori(boolean kategori) {
        this.kategori = kategori;
    }

    public boolean isSatuan() {
        return satuan;
    }

    public void setSatuan(boolean satuan) {
        this.satuan = satuan;
    }

    public boolean isSupplier() {
        return supplier;
    }

    public void setSupplier(boolean supplier) {
        this.supplier = supplier;
    }

    public boolean isPembelian() {
        return pembelian;
    }

    public void setPembelian(boolean pembelian) {
        this.pembelian = pembelian;
    }

    public boolean isPenjualan() {
        return penjualan;
    }

    public void setPenjualan(boolean penjualan) {
        this.penjualan = penjualan;
    }

    public boolean isTransaksiGudang() {
        return transaksiGudang;
    }

    public void setTransaksiGudang(boolean transaksiGudang) {
        this.transaksiGudang = transaksiGudang;
    }

    public boolean isTransaksi() {
        return transaksi;
    }

    public void setTransaksi(boolean transaksi) {
        this.transaksi = transaksi;
    }

    public boolean isLaporanGudang() {
        return laporanGudang;
    }

    public void setLaporanGudang(boolean laporanGudang) {
        this.laporanGudang = laporanGudang;
    }

    public boolean isLaporanPembelian() {
        return laporanPembelian;
    }

    public void setLaporanPembelian(boolean laporanPembelian) {
        this.laporanPembelian = laporanPembelian;
    }

    public boolean isLaporanPenjualan() {
        return laporanPenjualan;
    }

    public void setLaporanPenjualan(boolean laporanPenjualan) {
        this.laporanPenjualan = laporanPenjualan;
    }

    public ArrayList<LevelModel> select(String id) {
        ArrayList<LevelModel> levelList = new ArrayList<>();

        String query = "SELECT * FROM level WHERE level LIKE '%" + id + "%'";
        try {
            conn = SqliteConnection.ConnectDb();
            pst = conn.prepareStatement(query);
//            pst.setString(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {
                LevelModel levelModel = new LevelModel();
                levelModel.setLevel(rs.getInt("level"));
                levelModel.setPengguna(rs.getBoolean("pengguna"));
                levelModel.setHakAkses(rs.getBoolean("hakAkses"));
                levelModel.setGudang(rs.getBoolean("gudang"));
                levelModel.setItem(rs.getBoolean("item"));
                levelModel.setHarga(rs.getBoolean("harga"));
                levelModel.setKategori(rs.getBoolean("kategori"));
                levelModel.setSatuan(rs.getBoolean("satuan"));
                levelModel.setSupplier(rs.getBoolean("supplier"));
                levelModel.setPembelian(rs.getBoolean("pembelian"));
                levelModel.setPenjualan(rs.getBoolean("penjualan"));
                levelModel.setTransaksiGudang(rs.getBoolean("transaksiGudang"));
                levelModel.setTransaksi(rs.getBoolean("transfer"));
                levelModel.setLaporanGudang(rs.getBoolean("laporanGudang"));
                levelModel.setLaporanPembelian(rs.getBoolean("laporanPembelian"));
                levelModel.setLaporanPenjualan(rs.getBoolean("laporanPenjualan"));
                levelList.add(levelModel);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("e : " + e);
        }
        return levelList;
    }

    public boolean insert() {
        boolean toReturn = false;
        conn = SqliteConnection.ConnectDb();
        try {
            
            String sql = "INSERT INTO level (level, pengguna, hakAkses, gudang, item, harga, "
                + "kategori, satuan, supplier, pembelian, penjualan, transaksiGudang, transfer, "
                + "laporanGudang, laporanPembelian, laporanPenjualan) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setBoolean(1, pengguna);
            pst.setBoolean(2, hakAkses);
            pst.setBoolean(3, gudang);
            pst.setBoolean(4, item);
            pst.setBoolean(5, harga);
            pst.setBoolean(6, kategori);
            pst.setBoolean(7, satuan);
            pst.setBoolean(8, supplier);
            pst.setBoolean(9, pembelian);
            pst.setBoolean(10, penjualan);
            pst.setBoolean(11, transaksiGudang);
            pst.setBoolean(12, transaksi);
            pst.setBoolean(13, laporanGudang);
            pst.setBoolean(14, laporanPembelian);
            pst.setBoolean(15, laporanPenjualan);
            pst.execute();
           
            toReturn = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            toReturn= false;
        }
        return toReturn;
    }

    @Override
    public String toString() {
        return "LevelModel{" + "level=" + level + ", pengguna=" + pengguna + ", hakAkses=" + hakAkses + ", gudang=" + gudang + ", item=" + item + ", harga=" + harga + ", kategori=" + kategori + ", satuan=" + satuan + ", supplier=" + supplier + ", pembelian=" + pembelian + ", penjualan=" + penjualan + ", transaksiGudang=" + transaksiGudang + ", transaksi=" + transaksi + ", laporanGudang=" + laporanGudang + ", laporanPembelian=" + laporanPembelian + ", laporanPenjualan=" + laporanPenjualan + '}';
    }

    public boolean update() {
       boolean toReturn = false;
        String query = "UPDATE level SET"
                + " pengguna = ?,"
                + " hakAkses = ?,"
                + " gudang = ?,"
                + "item = ?,"
                + "harga = ?,"
                + " kategori = ?,"
                + " satuan = ?, "
                + " supplier = ?, "
                + "pembelian = ?,"
                + " penjualan = ?,"
                + " transaksiGudang = ?,"
                + " transfer = ?,"
                + " laporanGudang = ?,"
                + " laporanPembelian = ?,"
                + " laporanPenjualan = ?"
                + " WHERE level = ?";
        try {
            pst = conn.prepareStatement(query);
            System.out.println(level);
            pst.setInt(16, level);
            pst.setBoolean(1, pengguna);
            pst.setBoolean(2, hakAkses);
            pst.setBoolean(3, gudang);
            pst.setBoolean(4, item);
            pst.setBoolean(5, harga);
            pst.setBoolean(6, kategori);
            pst.setBoolean(7, satuan);
            pst.setBoolean(8, supplier);
            pst.setBoolean(9, pembelian);
            pst.setBoolean(10, penjualan);
            pst.setBoolean(11, transaksiGudang);
            pst.setBoolean(12, transaksi);
            pst.setBoolean(13, laporanGudang);
            pst.setBoolean(14, laporanPembelian);
            pst.setBoolean(15, laporanPenjualan);
            pst.execute();
           
            toReturn = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            toReturn= false;
        }
        return toReturn;
    }

    public boolean hapus() {
        boolean toReturn = false;
        String query = "DELETE FROM level WHERE level = ?";
        conn = SqliteConnection.ConnectDb();
        try {

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setInt(1, level);

                pst.execute();
                toReturn = true;

            }
            conn.close();

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

}
