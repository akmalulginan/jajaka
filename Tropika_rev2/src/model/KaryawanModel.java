/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hendar
 */
public class KaryawanModel extends Model {

    private String kodeKaryawan;
    private String namaLengkap;
    private String namaPanggilan;
    private String jenisKelamin;
    private Date tanggalMasuk;
    private String tempatLahir;
    private Date tanggalLahir;
    private String alamat;
    private String kota;
    private String kodePos;
    private String noHp;
    private String email;
    private String catatan;
    private String status;
    private byte[] gambar;

    public String getKodeKaryawan() {
        return kodeKaryawan;
    }

    public void setKodeKaryawan(String kodeKaryawan) {
        this.kodeKaryawan = kodeKaryawan;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNamaPanggilan() {
        return namaPanggilan;
    }

    public void setNamaPanggilan(String namaPanggilan) {
        this.namaPanggilan = namaPanggilan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public boolean insert() {
        try {
            String sql = "INSERT INTO karyawan (kodeKaryawan, namaLengkap, namaPanggilan, jenisKelamin,"
                    + "tanggalMasuk, tempatLahir, tanggalLahir, alamat, kota, kodePos, noHp, email,"
                    + "catatan, status, gambar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(1, kodeKaryawan);
            pst.setString(2, namaLengkap);
            pst.setString(3, namaPanggilan);
            pst.setString(4, jenisKelamin);
            pst.setDate(5, tanggalMasuk);
            pst.setString(6, tempatLahir);
            pst.setDate(7, tanggalLahir);
            pst.setString(8, alamat);
            pst.setString(9, kota);
            pst.setString(10, kodePos);
            pst.setString(11, noHp);
            pst.setString(12, email);
            pst.setString(13, catatan);
            pst.setString(14, status);
            pst.setBytes(15, gambar);

            pst.execute();

            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean update() {

        boolean toReturn = false;

        try {
            String query = "UPDATE karyawan "
                    + "SET "
                    + "kodeKaryawan = ?"
                    + "namaLengkap = ?"
                    + "namaPanggilan = ?"
                    + "jenisKelamin = ?"
                    + "tanggalMasuk = ?"
                    + "tempatLahir = ?"
                    + "tanggalLahir = ?"
                    + "alamat = ?"
                    + "kota = ?"
                    + "kodePos = ?"
                    + "noHp = ?"
                    + "email = ?"
                    + "catatan = ?"
                    + "status = ?"
                    + "gambar = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);

                pst.setString(1, kodeKaryawan);
                pst.setString(2, namaLengkap);
                pst.setString(3, namaPanggilan);
                pst.setString(4, jenisKelamin);
                pst.setDate(5, tanggalMasuk);
                pst.setString(6, tempatLahir);
                pst.setDate(7, tanggalLahir);
                pst.setString(8, alamat);
                pst.setString(9, kota);
                pst.setString(10, kodePos);
                pst.setString(11, noHp);
                pst.setString(12, email);
                pst.setString(13, catatan);
                pst.setString(14, status);
                pst.setBytes(15, gambar);

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
        boolean toReturn = false;

        try {
            String query = "DELETE FROM karyawan WHERE kodeKaryawan = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodeKaryawan);
                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }

        return toReturn;
    }
    
    public ArrayList<KaryawanModel> select() {
        ArrayList<KaryawanModel> list = new ArrayList<>();
        try {
            pst = conn.prepareStatement("SELECT * FROM karyawan");
            rs = pst.executeQuery();
            while (rs.next()) {
                this.setKodeKaryawan(rs.getString("kodeKaryawan"));
                this.setNamaLengkap(rs.getString("namaLengkap"));
                this.setNamaPanggilan(rs.getString("namaPanggilan"));
                this.setJenisKelamin(rs.getString("jenisKelamin"));
                this.setTanggalMasuk(rs.getDate("tanggalMasuk"));
                this.setTempatLahir(rs.getString("tempatLahir"));
                this.setTanggalLahir(rs.getDate("tanggalLahir"));
                this.setAlamat(rs.getString("alamat"));
                this.setKota(rs.getString("kota"));
                this.setKodePos(rs.getString("kodePos"));
                this.setNoHp(rs.getString("noHp"));
                this.setEmail(rs.getString("email"));
                this.setCatatan(rs.getString("catatan"));
                this.setStatus(rs.getString("status"));
                this.setGambar(rs.getBytes("gambar"));        
                list.add(this);
            }
            return list;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }
}