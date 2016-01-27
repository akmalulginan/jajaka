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

}
