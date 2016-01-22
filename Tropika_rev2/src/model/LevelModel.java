/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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

    public LevelModel select(int id) {
        LevelModel levelModel = new LevelModel();

        String query = "SELECT * FROM level WHERE level.level = ?";
        try {
            conn = SqliteConnection.getInstance().getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
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
                levelModel.setTransaksi(rs.getBoolean("transaksi"));
                levelModel.setLaporanGudang(rs.getBoolean("laporanGudang"));
                levelModel.setLaporanPembelian(rs.getBoolean("laporanPembelian"));
                levelModel.setLaporanPenjualan(rs.getBoolean("laporanPenjualan"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("e : " + e);
        }
        return levelModel;
    }

    @Override
    public String toString() {
        return "LevelModel{" + "level=" + level + ", pengguna=" + pengguna + ", hakAkses=" + hakAkses + ", gudang=" + gudang + ", item=" + item + ", harga=" + harga + ", kategori=" + kategori + ", satuan=" + satuan + ", supplier=" + supplier + ", pembelian=" + pembelian + ", penjualan=" + penjualan + ", transaksiGudang=" + transaksiGudang + ", transaksi=" + transaksi + ", laporanGudang=" + laporanGudang + ", laporanPembelian=" + laporanPembelian + ", laporanPenjualan=" + laporanPenjualan + '}';
    }

}
