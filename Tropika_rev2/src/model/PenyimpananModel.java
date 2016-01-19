/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class PenyimpananModel extends Model {

    private int kodePenyimpanan;
    private String kodeItem;
    private String kodeGudang;
    private Date waktuPenyimpanan;

    public int getKodePenyimpanan() {
        return kodePenyimpanan;
    }

    public void setKodePenyimpanan(int kodePenyimpanan) {
        this.kodePenyimpanan = kodePenyimpanan;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public Date getWaktuPenyimpanan() {
        return waktuPenyimpanan;
    }

    public void setWaktuPenyimpanan(Date waktuPenyimpanan) {
        this.waktuPenyimpanan = waktuPenyimpanan;
    }

    public boolean insert() {
        try {
            String sql = "INSERT INTO penyimpanan "
                    + "("
                    + "kodePenyimpanan, "
                    + "kodeItem, "
                    + "kodeGudang, "
                    + "waktuPenyimpanan"
                    + ") VALUES (?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setInt(1, kodePenyimpanan);
            pst.setString(2, kodeItem);
            pst.setString(3, kodeGudang);
            pst.setDate(4, waktuPenyimpanan);
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
            String query = "UPDATE  "
                    + "SET "
                    + "kodeItem = ?"
                    + "kodeGudang = ?"
                    + "waktuPenyimpanan = ?"
                    + "WHERE kodePenyimpanan = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);

                pst.setInt(4, kodePenyimpanan);
                pst.setString(1, kodeItem);
                pst.setString(2, kodeGudang);
                pst.setDate(3, waktuPenyimpanan);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public ArrayList<PenyimpananModel> select() {
        ArrayList<PenyimpananModel> list = new ArrayList<>();
        try {
            pst = conn.prepareStatement("SELECT * FROM penyimpanan");
            rs = pst.executeQuery();
            while (rs.next()) {
                this.setKodePenyimpanan(rs.getInt("kodePenyimpanan"));
                this.setKodeGudang(rs.getString("kodeGudang"));
                this.setKodeItem(rs.getString("kodeItem"));
                this.setWaktuPenyimpanan(rs.getDate("waktuPenyimpanan"));

                list.add(this);
            }
            return list;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }

    public boolean delete() {
        boolean toReturn = false;

        try {
            String query = "DELETE FROM penyimpanan WHERE kodePenyimpanan = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setInt(1, kodePenyimpanan);
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
