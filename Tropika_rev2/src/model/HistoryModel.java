/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author akmal
 */
public class HistoryModel extends Model {

    private int kodeHistory;
    private String kodePengguna;
    private String aksi;
    private Date tanggalAksi;

    public int getKodeHistory() {
        return kodeHistory;
    }

    public void setKodeHistory(int kodeHistory) {
        this.kodeHistory = kodeHistory;
    }

    public String getKodePengguna() {
        return kodePengguna;
    }

    public void setKodePengguna(String kodePengguna) {
        this.kodePengguna = kodePengguna;
    }

    public String getAksi() {
        return aksi;
    }

    public void setAksi(String aksi) {
        this.aksi = aksi;
    }

    public Date getTanggalAksi() {
        return tanggalAksi;
    }

    public void setTanggalAksi(Date tanggalAksi) {
        this.tanggalAksi = tanggalAksi;
    }

    public boolean insert() {
        boolean toReturn = false;
        String query = "INSERT INTO "
                + "history (kodePengguna, aksi, tanggalAksi) "
                + "VALUES (?,?,?)";
        conn = SqliteConnection.ConnectDb();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, kodePengguna);
            pst.setString(2, aksi);
            pst.setDate(3, (java.sql.Date) tanggalAksi);
            pst.execute();
            
            conn.close();
            toReturn = true;
        } catch (Exception e) {
            System.out.println("E : " + e);
        }
        return toReturn;
    }
}
