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
public class UserLoginModel{
    private static String username;
    private static String password;
    private static LevelModel levelModel;

    public static LevelModel getLevelModel() {
        return levelModel;
    }

    public static void setLevelModel(LevelModel levelModel) {
        UserLoginModel.levelModel = levelModel;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserLoginModel.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserLoginModel.password = password;
    }
    
    
    
    
}
