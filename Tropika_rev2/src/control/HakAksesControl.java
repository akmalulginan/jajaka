/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.LevelModel;
import view.HakAksesPanel;

/**
 *
 * @author akmal
 */
public class HakAksesControl {

    private LevelModel levelModel = new LevelModel();

    public void loadLevel(HakAksesPanel hakAksesPanel) {
        ArrayList<LevelModel> levelList = levelModel.select("");
        
        hakAksesPanel.getLevelComboBox().removeAllItems();
        hakAksesPanel.getLevelComboBox().addItem("");
        
        
        for (LevelModel level : levelList) {
            hakAksesPanel.getLevelComboBox().addItem(level.getLevel());
        }
    }
    
    public static void main(String[] args) {
        ArrayList<LevelModel> levelList = new LevelModel().select("");

        for (LevelModel level : levelList) {
            System.out.println(level.getLevel());
        }
    }
}
