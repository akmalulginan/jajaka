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
public class UserModel extends Model {

    private String kodePengguna;
    private String namaPengguna;
    private String username;
    private String password;
    private int level;

    public UserModel() {
    }

    public String getKodePengguna() {
        return kodePengguna;
    }

    public void setKodePengguna(String kodePengguna) {
        this.kodePengguna = kodePengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
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

    public UserModel login() {
        UserModel userModel = new UserModel();
        LevelModel levelModel = new LevelModel();

        String query = "SELECT * FROM user WHERE user.username = ? AND user.password = ?";

        conn = SqliteConnection.ConnectDb();

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                userModel.setUsername(rs.getString("username"));
                userModel.setPassword(rs.getString("password"));
                userModel.setLevel(rs.getInt("level"));
            } else {
                userModel.setUsername("");
                userModel.setPassword("");
                userModel.setLevel(0);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println("e : " + e);
        }

        return userModel;
    }

    public ArrayList<UserModel> select(String cari) {

        ArrayList<UserModel> userList = new ArrayList<>();

//        LevelModel levelModel = new LevelModel();
        String query = "SELECT * FROM user";
        boolean login = false;

        if (username != null && password != null) {
            query = "SELECT * FROM user WHERE user.username = ? AND user.password = ?";
            login = true;
        }
        conn = SqliteConnection.ConnectDb();
        System.out.println(query);
        try {
            pst = conn.prepareStatement(query);
            if (login) {
                pst.setString(1, username);
                pst.setString(2, password);
            }
            rs = pst.executeQuery();

            while (rs.next()) {

                UserModel userModel = new UserModel();

                userModel.setKodePengguna(rs.getString("kodePengguna"));
                userModel.setNamaPengguna(rs.getString("namaPengguna"));
                userModel.setUsername(rs.getString("username"));
                userModel.setPassword(rs.getString("password"));
                userModel.setLevel(rs.getInt("level"));
                userList.add(userModel);

            }
            conn.close();

        } catch (Exception e) {
            System.out.println("ecd : " + e);
        }

        return userList;
    }

    public UserModel selectUser(String cari) {
        boolean login = false;
//        LevelModel levelModel = new LevelModel();
        String query = "SELECT * FROM user WHERE user.kodePengguna = '" + cari + "'";
        if (username != null && password != null) {
            query = "SELECT * FROM user WHERE user.username = ? AND user.password = ?";
            login = true;
        }
        conn = SqliteConnection.ConnectDb();
        System.out.println(query);
        UserModel userModel = new UserModel();

        try {
            pst = conn.prepareStatement(query);
            if (login) {
                pst.setString(1, username);
                pst.setString(2, password);
            }
            rs = pst.executeQuery();

            while (rs.next()) {

                userModel.setKodePengguna(rs.getString("kodePengguna"));
                userModel.setNamaPengguna(rs.getString("namaPengguna"));
                userModel.setUsername(rs.getString("username"));
                userModel.setPassword(rs.getString("password"));
                userModel.setLevel(rs.getInt("level"));

            }
            conn.close();

        } catch (Exception e) {
            System.out.println("ecd : " + e);
        }

        return userModel;
    }

    public boolean update() {
        boolean toReturn = false;
        String query = "UPDATE user SET "
                + "namaPengguna = ?,"
                + "username = ?,"
                + "level = ?";
        if (!password.equals("")) {
            query = query + ",password = ?";
            System.out.println("isi");
        }
        query = query + "Where kodePengguna = ?";
        conn = SqliteConnection.ConnectDb();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, namaPengguna);
            pst.setString(2, username);
            pst.setInt(3, level);
            if (!password.equals("")) {
                pst.setString(4, password);
                pst.setString(5, kodePengguna);
            } else {
                pst.setString(4, kodePengguna);
            }
            pst.execute();
            toReturn = true;
            conn.close();
        } catch (Exception e) {
            System.out.println("e : " + e);
        }
        return toReturn;
    }

    @Override
    public String toString() {
        return "UserModel{" + "username=" + username + ", password=" + password + ", level=" + level + '}';
    }

    public boolean delete() {
        boolean toReturn = false;
        String query = "DELETE FROM user WHERE kodePengguna = ?";
        conn = SqliteConnection.ConnectDb();
        try {

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodePengguna);

                pst.execute();
                toReturn = true;

            }
            conn.close();

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public boolean insert() {
        boolean toReturn = false;
        conn = SqliteConnection.ConnectDb();
        try {
            String sql = "INSERT INTO user (kodePengguna, namaPengguna, username, password, level) VALUES (?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(1, kodePengguna);
            pst.setString(2, namaPengguna);
            pst.setString(3, password);
            pst.setString(4, username);
            pst.setInt(5, level);

            pst.execute();
            conn.close();
            toReturn = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return toReturn;
    }

}
