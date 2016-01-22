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
public class UserLoginModel extends UserModel {
    LevelModel levelModel;

    public LevelModel getLevelModel() {
        return levelModel;
    }

    public void setLevelModel(LevelModel levelModel) {
        this.levelModel = levelModel;
    }
    
    
}
