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

    protected String username;
    protected String password;
    protected LevelModel level;

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

    public LevelModel getLevel() {
        return level;
    }

    public void setLevel(LevelModel level) {
        this.level = level;
    }
    
    

    public UserModel select() {
        UserModel userModel = new UserModel();
        
        String query = "SELECT * FROM user WHERE user.username = ? AND user.password = ?";
        System.out.println(query);
        try {
            conn = SqliteConnect.ConnectDb();
            pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                userModel.setUsername(rs.getString("username"));
                userModel.setPassword(rs.getString("password"));
//                userModel.setLevel(new LevelModel().select(rs.getInt("level")));
                System.out.println(rs.getInt("level"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("esss : " + e);
        }

        return userModel;
    }

}
