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

    public boolean insert() {
        try {
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

            return true;
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean update() {
        boolean toReturn = false;
        try {

            String query = "UPDATE item "
                    + "SET "
                    + "barcode = ? "
                    + "namaItem = ? "
                    + "kategori = ? "
                    + "satuan = ? "
                    + "dapatDibeli = ? "
                    + "dapatDijual = ? "
                    + "dapatDiproduksi = ? "
                    + "dipakaiUntukProduksi = ? "
                    + "dapatDibongkar = ? "
                    + "statusItem = ? "
                    + "gambar = ? "
                    + "keterangan = ? "
                    + "WHERE kodeItem = ?";

            if (conn != null) {

                pst = conn.prepareStatement(query);
                pst.setString(13, kodeItem);
                pst.setString(1, barcode);
                pst.setString(2, namaItem);
                pst.setString(3, kategori);
                pst.setString(4, satuan);
                pst.setBoolean(5, dapatDibeli);
                pst.setBoolean(6, dapatDijual);
                pst.setBoolean(7, dapatDiproduksi);
                pst.setBoolean(8, dipakaiUntukProduksi);
                pst.setBoolean(9, dapatDibongkar);
                pst.setBoolean(10, statusItem);
                pst.setBytes(11, gambar);
                pst.setString(12, keterangan);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public ArrayList<ItemModel> select(String cari) {
        String query = "SELECT * FROM item";

        if (!cari.isEmpty()) {
            query = query + " WHERE kategori LIKE '%" + cari + "%'";
        }
        
        ArrayList<ItemModel> itemList = new ArrayList<>();
        try {
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                ItemModel itemModel = new ItemModel();
                itemModel.setKodeItem(rs.getString("kodeItem"));
                itemModel.setBarcode(rs.getString("barcode"));
                itemModel.setNamaItem(rs.getString("namaItem"));
                itemModel.setKategori(rs.getString("kategori"));
                itemModel.setSatuan(rs.getString("satuan"));
                itemModel.setDapatDibeli(rs.getBoolean("dapatDibeli"));
                itemModel.setDapatDijual(rs.getBoolean("dapatDibeli"));
                itemModel.setDapatDiproduksi(rs.getBoolean("dapatDiproduksi"));
                itemModel.setDipakaiUntukProduksi(rs.getBoolean("dipakaiUntukProduksi"));
                itemModel.setDapatDibongkar(rs.getBoolean("dapatDibongkar"));
                itemModel.setStatusItem(rs.getBoolean("statusItem"));
                itemModel.setGambar(rs.getBytes("gambar"));
                itemModel.setKeterangan(rs.getString("keterangan"));
                itemList.add(itemModel);
            }
            return itemList;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }

    public boolean delete() {
        boolean toReturn = false;
        try {
            String query = "DELETE FROM item WHERE kodeItem = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodeItem);
                pst.execute();
                conn.close();
                toReturn = true;
            }

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }
    
    

}
