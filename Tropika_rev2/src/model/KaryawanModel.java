/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hendar
 */
public class KaryawanModel extends Model {

    private String kodeKaryawan;
    private String kodeJabatan;
    private String namaLengkap;
    private String namaPanggilan;
    private String jabatan;
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
    private boolean status;
    private byte[] gambar;

    public String getKodeKaryawan() {
        return kodeKaryawan;
    }

    public String getKodeJabatan() {
        return kodeJabatan;
    }

    public void setKodeJabatan(String kodeJabatan) {
        this.kodeJabatan = kodeJabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public boolean insert() {
        java.sql.Date tglMasuk = new java.sql.Date(tanggalMasuk.getTime());
        java.sql.Date tglLahir = new java.sql.Date(tanggalLahir.getTime());
        System.out.println(jenisKelamin);
        try {
            String sql = "INSERT INTO karyawan (kodeKaryawan, namaLengkap, namaPanggilan, jenisKelamin,"
                    + "tanggalMasuk, tempatLahir, tanggalLahir, alamat, kota, kodePos, noHp, email,"
                    + "catatan, status, gambar, kodeJabatan) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(1, kodeKaryawan);
            pst.setString(2, namaLengkap);
            pst.setString(3, namaPanggilan);
            pst.setString(4, jenisKelamin);
            pst.setDate(5, tglMasuk);
            pst.setString(6, tempatLahir);
            pst.setDate(7, tglLahir);
            pst.setString(8, alamat);
            pst.setString(9, kota);
            pst.setString(10, kodePos);
            pst.setString(11, noHp);
            pst.setString(12, email);
            pst.setString(13, catatan);
            pst.setBoolean(14, status);
            pst.setBytes(15, gambar);
             pst.setString(16, kodeJabatan);

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
                    + "gambar = ?"
                    + "WHERE kodeKaryawan = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);

                pst.setString(15, kodeKaryawan);
                pst.setString(1, namaLengkap);
                pst.setString(2, namaPanggilan);
                pst.setString(3, jenisKelamin);
//                pst.setDate(4, new java.sql.Date(tanggalMasuk));
                pst.setString(5, tempatLahir);
//                pst.setDate(6, new java.sql.Date(tanggalLahir));
                pst.setString(7, alamat);
                pst.setString(8, kota);
                pst.setString(9, kodePos);
                pst.setString(10, noHp);
                pst.setString(11, email);
                pst.setString(12, catatan);
                pst.setBoolean(13, status);
                pst.setBytes(14, gambar);

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

    public ArrayList<KaryawanModel> select(String cari) {
        
        String query = "SELECT * FROM karyawan";;
        
         if (!cari.isEmpty()) {
            query = query + " WHERE "
                    + "kodeKaryawan LIKE '%" + cari + "%' OR "
                    + "namaLengkap LIKE '%" + cari + "%' OR "
                    + "namaPanggilan LIKE '%" + cari + "%' OR "
                    + "jenisKelamin LIKE '%" + cari + "%' OR "
                    + "tanggalMasuk LIKE '%" + cari + "%' OR "
                    + "tanggalLahir LIKE '%" + cari + "%' OR "
                    + "alamat LIKE '%" + cari + "%' OR "
                    + "kota LIKE '%" + cari + "%' OR "
                    + "kodePos LIKE '%" + cari + "%' OR "
                    + "noHp LIKE '%" + cari + "%' OR "
                    + "catatan LIKE '%" + cari + "%' OR "
                    + "status LIKE '%" + cari + "%' OR "
                    + "kodeJabatan LIKE '%" + cari + "%'";
        }
        
        ArrayList<KaryawanModel> karyawanList = new ArrayList<>();
        try {
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                KaryawanModel karyawanModel = new KaryawanModel();
                
                karyawanModel.setKodeKaryawan(rs.getString("kodeKaryawan"));
                karyawanModel.setNamaLengkap(rs.getString("namaLengkap"));
                karyawanModel.setNamaPanggilan(rs.getString("namaPanggilan"));
                karyawanModel.setJenisKelamin(rs.getString("jenisKelamin"));
//                this.setTanggalMasuk(rs.getDate("tanggalMasuk").getTime());
                karyawanModel.setTempatLahir(rs.getString("tempatLahir"));
//                this.setTanggalLahir(rs.getDate("tanggalLahir").getTime());
                karyawanModel.setAlamat(rs.getString("alamat"));
                karyawanModel.setKota(rs.getString("kota"));
                karyawanModel.setKodePos(rs.getString("kodePos"));
                karyawanModel.setNoHp(rs.getString("noHp"));
                karyawanModel.setEmail(rs.getString("email"));
                karyawanModel.setCatatan(rs.getString("catatan"));
                karyawanModel.setStatus(rs.getBoolean("status"));
                karyawanModel.setGambar(rs.getBytes("gambar"));
                karyawanList.add(karyawanModel);
            }
            return karyawanList;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }
}
