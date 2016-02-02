/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.LevelModel;
import model.UserModel;
import view.HakAksesPanel;
import view.PenggunaPanel;

/**
 *
 * @author akmal
 */
public class PenggunaControl {

    private UserModel userModel = new UserModel();
    private LevelModel levelModel = new LevelModel();

    public void clear(PenggunaPanel penggunaPanel) {
        penggunaPanel.getKodePenggunaComboBox().setSelectedIndex(0);
        penggunaPanel.getNamaPenggunaText().setText("");
        penggunaPanel.getUsernameText().setText("");
        penggunaPanel.getPasswordText().setText("");
        penggunaPanel.getKonfirmPassword().setText("");
        penggunaPanel.getLevelComboBox().setSelectedIndex(0);
    }

    public void enable(PenggunaPanel penggunaPanel) {
//        penggunaPanel.getKodePenggunaComboBox().setEnabled(true);
        penggunaPanel.getNamaPenggunaText().setEnabled(true);
        penggunaPanel.getUsernameText().setEnabled(true);
        penggunaPanel.getPasswordText().setEnabled(true);
        penggunaPanel.getKonfirmPassword().setEnabled(true);
        penggunaPanel.getLevelComboBox().setEnabled(true);
    }

    public void disable(PenggunaPanel penggunaPanel) {
//        penggunaPanel.getKodePenggunaComboBox().setEnabled(false);
        penggunaPanel.getNamaPenggunaText().setEnabled(false);
        penggunaPanel.getUsernameText().setEnabled(false);
        penggunaPanel.getPasswordText().setEnabled(false);
        penggunaPanel.getKonfirmPassword().setEnabled(false);
        penggunaPanel.getLevelComboBox().setEnabled(false);
    }

    public void tambah(PenggunaPanel penggunaPanel) {
        clear(penggunaPanel);
        enable(penggunaPanel);
        penggunaPanel.getKodePenggunaComboBox().setEnabled(false);
        penggunaPanel.getHapusButton().setEnabled(false);
        penggunaPanel.getUbahButton().setEnabled(false);
    }

    public void ubah(PenggunaPanel penggunaPanel) {
        enable(penggunaPanel);
    }

    public void batal(PenggunaPanel penggunaPanel) {
        clear(penggunaPanel);
        disable(penggunaPanel);
        penggunaPanel.getKodePenggunaComboBox().setEnabled(true);
        penggunaPanel.getHapusButton().setEnabled(true);
        penggunaPanel.getUbahButton().setEnabled(true);
    }

    public void loadKodePengguna(PenggunaPanel penggunaPanel) {
        ArrayList<UserModel> userList = userModel.select("");
        penggunaPanel.getKodePenggunaComboBox().removeAllItems();
        penggunaPanel.getKodePenggunaComboBox().addItem("");
        for (UserModel user : userList) {
            penggunaPanel.getKodePenggunaComboBox().addItem(user.getKodePengguna());
        }
    }

    public void getUser(PenggunaPanel penggunaPanel) {
        String kodePengguna = "";
        if (penggunaPanel.getKodePenggunaComboBox().getSelectedIndex() != -1) {
            kodePengguna = penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString();
            ArrayList<UserModel> userList = userModel.select(kodePengguna);
            penggunaPanel.getUsernameText().setText(userList.get(0).getUsername());
            penggunaPanel.getNamaPenggunaText().setText(userList.get(0).getNamaPengguna());
            penggunaPanel.getLevelComboBox().setSelectedItem(userList.get(0).getLevel());
        }
    }
    
    public void loadLevel(PenggunaPanel penggunaPanel) {
        ArrayList<LevelModel> levelList = levelModel.select("");

        penggunaPanel.getLevelComboBox().removeAllItems();
        penggunaPanel.getLevelComboBox().addItem("");

        for (LevelModel level : levelList) {
            penggunaPanel.getLevelComboBox().addItem(level.getLevel());
        }
    }
    
    public void set(PenggunaPanel penggunaPanel){
        if(penggunaPanel.getKodePenggunaComboBox().getSelectedIndex() != 0){
            ubahPengguna(penggunaPanel);
        }else{
            tambahPengguna(penggunaPanel);
        }
    }
    
    public void ubahPengguna(PenggunaPanel penggunaPanel){
        userModel.setKodePengguna(penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString());
        userModel.setNamaPengguna(penggunaPanel.getNamaPenggunaText().getText());
        userModel.setUsername(penggunaPanel.getUsernameText().getText());
        userModel.setPassword(penggunaPanel.getPasswordText().getText());
        userModel.setLevel(Integer.parseInt(penggunaPanel.getLevelComboBox().getSelectedItem().toString()));
        
        if (userModel.update()) {
                JOptionPane.showMessageDialog(penggunaPanel, "Pengguna berhasil dirubah !");
                
            } else {
                JOptionPane.showMessageDialog(penggunaPanel, "Gagal merubah data Pengguna !");
            }
        
    }
    
    public void tambahPengguna(PenggunaPanel penggunaPanel){
        userModel.setKodePengguna(penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString());
        userModel.setNamaPengguna(penggunaPanel.getNamaPenggunaText().getText());
        userModel.setUsername(penggunaPanel.getUsernameText().getText());
        userModel.setPassword(penggunaPanel.getPasswordText().getText());
        userModel.setLevel(Integer.parseInt(penggunaPanel.getLevelComboBox().getSelectedItem().toString()));
        
        if (userModel.update()) {
                JOptionPane.showMessageDialog(penggunaPanel, "Pengguna berhasil dirubah !");
                
            } else {
                JOptionPane.showMessageDialog(penggunaPanel, "Gagal merubah data Pengguna !");
            }
    }
    
    public void hapus(PenggunaPanel penggunaPanel){
        int option = JOptionPane.showConfirmDialog(penggunaPanel, "Anda yakin akan menghapus pengguna ini?");
        if (option == JOptionPane.OK_OPTION) {
            userModel.setKodePengguna(penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString());
            if (userModel.delete()) {
                JOptionPane.showMessageDialog(null, "Pengguna berhasil dihapus !");
                
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menghapus Pengguna !");
            }
           
        }
    }
}
