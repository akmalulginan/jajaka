/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

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
        } else if (!cari.isEmpty()) {
            query = "SELECT * FROM user WHERE user.kodePengguna = '" + cari + "'";
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
                if (true) {
                    UserModel userModel = new UserModel();

                    userModel.setKodePengguna(rs.getString("kodePengguna"));
                    userModel.setNamaPengguna(rs.getString("namaPengguna"));
                    userModel.setUsername(rs.getString("username"));
                    userModel.setPassword(rs.getString("password"));
                    userModel.setLevel(rs.getInt("level"));
                    userList.add(userModel);
                } else {
                    UserModel userModel = new UserModel();

                    userModel.setUsername("");
                    userModel.setPassword("");
                    userModel.setLevel(0);
                    userList.add(userModel);
                }
            }
            conn.close();

        } catch (Exception e) {
            System.out.println("ecd : " + e);
        }

        return userList;
    }

    public boolean update() {
        boolean toReturn = false;
        String query = "UPDATE user SET password = ? WHERE username = ?";
        conn = SqliteConnection.ConnectDb();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(2, username);
            pst.setString(1, password);
            pst.execute();
            toReturn = true;

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
        try{
            String query = "DELETE FROM user WHERE kodePengguna = ?";
            conn = SqliteConnection.ConnectDb();
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, kodePengguna);
                pst.execute();
                conn.close();
               
            }

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());

        }
        return true;
    }
    
     public void cekPengguna(){
         if(kodePengguna.isEmpty()){
             insertPengguna();
         }else{
             updatePengguna();
         }
     }

    private void insertPengguna() {
        
    }

    private void updatePengguna() {
        String query = "UPDATE user SET "
                + "namaPengguna = ?,"
                + "password = ?,"
                + "username = ?,"
                + "level = ?"
                + "Where"
                + "kodePengguna = ?";
        conn = SqliteConnection.ConnectDb();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(2, username);
            pst.setString(2, username);
            pst.setString(2, username);
            pst.setString(2, username);
            pst.setString(1, kodePengguna);
            pst.execute(); 

        } catch (Exception e) {
            System.out.println("e : " + e);
        }
    }

}
