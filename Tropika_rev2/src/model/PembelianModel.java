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
    private Date tanggal;
    private String kodeItem;
    private int jumlahPembelian;
    private double harga;
    private String keterangan;

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

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
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

    public void setHarga(double harga) {
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
            String sql = "INSERT INTO pembelian (kodeUsulan, namaUsulan, tanggal, kodeItem, jumlahPembelian, harga, keterangan) VALUES (?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, kodeUsulan);
            pst.setString(2, namaUsulan);
            pst.setDate(3, tanggal);
            pst.setString(4, kodeItem);
            pst.setInt(5, jumlahPembelian);
            pst.setDouble(6, harga);
            pst.setString(7, keterangan);

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
                    + "WHERE kodeUsulan = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(7, kodeUsulan);
                pst.setString(1, namaUsulan);
                pst.setDate(2, tanggal);
                pst.setString(3, kodeItem);
                pst.setInt(4, jumlahPembelian);
                pst.setDouble(5, harga);
                pst.setString(6, keterangan);

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
                this.setTanggal(rs.getDate("tanggal"));
                this.setJumlahPembelian(rs.getInt("jumlahPembelian"));
                this.setHarga(rs.getDouble("harga"));
                this.setKeterangan(rs.getString("keterangan"));
                list.add(this);
            }
            return list;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }
}
