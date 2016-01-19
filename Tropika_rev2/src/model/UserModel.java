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
public class UserModel extends Model {

    private String username;
    private String password;
    private int level;

    public UserModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public UserModel select() {
        String query = "SELECT "
                + "user.username, "
                + "user.password, "
                + "user.level, "
                + "level.pengguna, "
                + "level.hakAkses, "
                + "level.item, "
                + "level.kategori, "
                + "level.satuan, "
                + "level.supplier, "
                + "level.pembelian, "
                + "level.harga, "
                + "level.transfer, "
                + "level.laporanGudang, "
                + "level.laporanPembelian, "
                + "level.laporanPenjualan "
                + "FROM "
                + "level "
                + "INNER JOIN user ON user.level = level.level "
                + "where user.username = ? AND user.password = ?";

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {

            }
        } catch (Exception e) {
        }

        return this;
    }

}
