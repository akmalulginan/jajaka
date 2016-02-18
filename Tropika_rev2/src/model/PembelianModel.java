/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hendar
 */
public class PembelianModel extends Model {

    private String kodeUsulan;
    private String namaUsulan;
    private long tanggal;
    private String kodeItem;
    private int jumlahPembelian;
    private int harga;
    private String keterangan;
    private String jenisPembayaran;
    private int jumlahPembayaran;
    private long tanngalPenerimaan;
    private String kodeGudang;
    private String lokasiLain;

    public long getTanngalPenerimaan() {
        return tanngalPenerimaan;
    }

    public void setTanngalPenerimaan(long tanngalPenerimaan) {
        this.tanngalPenerimaan = tanngalPenerimaan;
    }

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String getLokasiLain() {
        return lokasiLain;
    }

    public void setLokasiLain(String lokasiLain) {
        this.lokasiLain = lokasiLain;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public void setJumlahPembayaran(int jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public String getJenisPembayaran() {
        return jenisPembayaran;
    }

    public void setJenisPembayaran(String jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }

    public String getKodeUsulan() {
        return kodeUsulan;
    }

    public void setKodeUsulan(String kodeUsulan) {
        this.kodeUsulan = kodeUsulan;
    }

    public String getNamaUsulan() {
        return namaUsulan;
    }

    public void setNamaUsulan(String namaUsulan) {
        this.namaUsulan = namaUsulan;
    }

    public long getTanggal() {
        return tanggal;
    }

    public void setTanggal(long tanggal) {
        this.tanggal = tanggal;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public int getJumlahPembelian() {
        return jumlahPembelian;
    }

    public void setJumlahPembelian(int jumlahPembelian) {
        this.jumlahPembelian = jumlahPembelian;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public boolean insert() {
        try {
            String sql = "INSERT INTO pembelian "
                    + "("
                    + "kodeUsulan, "
                    + "namaUsulan, "
                    + "tanggal, "
                    + "kodeItem, "
                    + "jumlahPembelian, "
                    + "harga, "
                    + "keterangan, "
                    + "jenisPembayaran, "
                    + "jumlahPembayaran, "
                    + "tanggalPenerimaan, "
                    + "kodeGudang, "
                    + "lokasiLain"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeUsulan);
            pst.setString(2, namaUsulan);
            pst.setLong(3, tanggal);
            pst.setString(4, kodeItem);
            pst.setInt(5, jumlahPembelian);
            pst.setDouble(6, harga);
            pst.setString(7, keterangan);
            pst.setString(8, jenisPembayaran);
            pst.setInt(9, jumlahPembayaran);
            pst.setLong(10, tanngalPenerimaan);
            pst.setString(11, kodeGudang);
            pst.setString(12, lokasiLain);
            pst.setInt(9, jumlahPembayaran);
            pst.execute();

            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean update() {

        Boolean toReturn = false;

        try {
            String query = "UPDATE pembelian "
                    + "SET "
                    + "namaUsulan = ? "
                    + "tanggal = ? "
                    + "kodeItem = ? "
                    + "jumlahPembelian = ? "
                    + "harga = ? "
                    + "keterangan = ?"
                    + "jumlahPembayaran = ?"
                    + "WHERE kodeUsulan = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(8, kodeUsulan);
                pst.setString(1, namaUsulan);
                pst.setLong(2, tanggal);
                pst.setString(3, kodeItem);
                pst.setInt(4, jumlahPembelian);
                pst.setDouble(5, harga);
                pst.setString(6, keterangan);
                pst.setDouble(7, jumlahPembayaran);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public boolean delete() {
        Boolean toReturn = false;

        try {
            String query = "DELETE FROM pembelian WHERE kodeUsulan = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodeUsulan);
                pst.execute();
                conn.close();

                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }

        return toReturn;
    }

    public ArrayList<PembelianModel> select() {
        ArrayList<PembelianModel> list = new ArrayList<>();
        try {
            pst = conn.prepareStatement("SELECT * FROM pembelian");
            rs = pst.executeQuery();
            while (rs.next()) {
                this.setKodeUsulan(rs.getString("kodeUsulan"));
                this.setNamaUsulan(rs.getString("namaUsulan"));
                this.setTanggal(rs.getLong("tanggal"));
                this.setJumlahPembelian(rs.getInt("jumlahPembelian"));
                this.setHarga(rs.getInt("harga"));
                this.setKeterangan(rs.getString("keterangan"));
                this.setJumlahPembayaran(rs.getInt("jumlahPembayaran"));
                list.add(this);
            }
            return list;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }
}
