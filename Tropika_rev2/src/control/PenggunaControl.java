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
        penggunaPanel.getLevelComboBox().setSelectedIndex(0);

        penggunaPanel.getNamaPenggunaText().setText("");
        penggunaPanel.getUsernameText().setText("");
        penggunaPanel.getPasswordText().setText("");
        penggunaPanel.getKonfirmPassword().setText("");
        penggunaPanel.getKodePenggunaComboBox().setEnabled(true);
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
        penggunaPanel.getUbahButton().setEnabled(false);
        penggunaPanel.getHapusButton().setEnabled(false);
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
        resetUserModel();
        clear(penggunaPanel);
        disable(penggunaPanel);
        loadKodePengguna(penggunaPanel);

//        JOptionPane.showMessageDialog(penggunaPanel, penggunaPanel.getLevelComboBox().getSelectedIndex());
//        penggunaPanel.getKodePenggunaComboBox().setEnabled(true);
//        penggunaPanel.getHapusButton().setEnabled(true);
//        penggunaPanel.getUbahButton().setEnabled(true);
    }

    public void loadKodePengguna(PenggunaPanel penggunaPanel) {
        if (penggunaPanel.getKodePenggunaComboBox().isEnabled()) {
            penggunaPanel.getKodePenggunaComboBox().removeAllItems();
            penggunaPanel.getKodePenggunaComboBox().addItem("");
            ArrayList<UserModel> userList = userModel.select("");

            for (UserModel user : userList) {
                penggunaPanel.getKodePenggunaComboBox().addItem(user.getKodePengguna());
            }
        }

//        JOptionPane.showMessageDialog(penggunaPanel, penggunaPanel.getKodePenggunaComboBox().getSelectedIndex());
    }

    public void getUser(PenggunaPanel penggunaPanel) {
        String kodePengguna = "";
//        System.out.println("ojp " + penggunaPanel.getKodePenggunaComboBox().getSelectedIndex());

        if (penggunaPanel.getKodePenggunaComboBox().getSelectedIndex() != -1) {
//            JOptionPane.showMessageDialog(penggunaPanel, "ISI");
//            System.out.println("ojp " + penggunaPanel.getKodePenggunaComboBox().getSelectedIndex());

            if (penggunaPanel.getKodePenggunaComboBox().getSelectedIndex() != 0) {
                kodePengguna = penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString();
                userModel = userModel.selectUser(kodePengguna);

                penggunaPanel.getUsernameText().setText(userModel.getUsername());
                penggunaPanel.getNamaPenggunaText().setText(userModel.getNamaPengguna());
                penggunaPanel.getLevelComboBox().setSelectedItem(userModel.getLevel());

                penggunaPanel.getKodePenggunaComboBox().setEnabled(true);
                penggunaPanel.getHapusButton().setEnabled(true);
                penggunaPanel.getUbahButton().setEnabled(true);
            }

        }

    }

    public String generateKodePengguna() {
        ArrayList<UserModel> userList = userModel.select("");
        int size = userList.size();
        String kodeLast = userList.get(size - 1).getKodePengguna();
        int next = Integer.parseInt(kodeLast.substring(1)) + 1;
        int length = String.valueOf(next).length();
        String kodeNext = "P";

        if (length == 1) {
            kodeNext = kodeNext + "00" + next;
        } else if (length == 2) {
            kodeNext = kodeNext + "0" + next;
        } else if (length == 3) {
            kodeNext = kodeNext + next;
        }

        return kodeNext;
    }

    public void loadLevel(PenggunaPanel penggunaPanel) {
        ArrayList<LevelModel> levelList = levelModel.select("");

        penggunaPanel.getLevelComboBox().removeAllItems();
        penggunaPanel.getLevelComboBox().addItem("");

        for (LevelModel level : levelList) {
            penggunaPanel.getLevelComboBox().addItem(level.getLevel());
        }
    }

    public void simpan(PenggunaPanel penggunaPanel) {
        if (penggunaPanel.getKodePenggunaComboBox().getSelectedIndex() != 0) {
            ubahPengguna(penggunaPanel);
        } else {
            tambahPengguna(penggunaPanel);
        }
//        resetUserModel();
        batal(penggunaPanel);
//        loadKodePengguna(penggunaPanel);
    }

    public void resetUserModel() {
        userModel.setKodePengguna(null);
        userModel.setNamaPengguna(null);
        userModel.setUsername(null);
        userModel.setPassword(null);
        userModel.setLevel(0);
    }

    public void setUser(PenggunaPanel penggunaPanel) {
        userModel.setKodePengguna(penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString());

        if (penggunaPanel.getKodePenggunaComboBox().getSelectedIndex() == 0) {
            userModel.setKodePengguna(generateKodePengguna());
        }
        userModel.setNamaPengguna(penggunaPanel.getNamaPenggunaText().getText());
        userModel.setUsername(penggunaPanel.getUsernameText().getText());
        userModel.setPassword(penggunaPanel.getPasswordText().getText());
        userModel.setLevel(Integer.parseInt(penggunaPanel.getLevelComboBox().getSelectedItem().toString()));
    }

    public void ubahPengguna(PenggunaPanel penggunaPanel) {
        setUser(penggunaPanel);

        if (userModel.update()) {
            JOptionPane.showMessageDialog(penggunaPanel, "Pengguna berhasil dirubah !");

        } else {
            JOptionPane.showMessageDialog(penggunaPanel, "Gagal merubah data Pengguna !");
        }

    }

    public void tambahPengguna(PenggunaPanel penggunaPanel) {
        setUser(penggunaPanel);

        if (userModel.insert()) {
            JOptionPane.showMessageDialog(penggunaPanel, "Pengguna berhasil disimpan !");

        } else {
            JOptionPane.showMessageDialog(penggunaPanel, "Data pengguna gagal disimpan !");
        }
    }

    public void hapus(PenggunaPanel penggunaPanel) {
        int option = JOptionPane.showConfirmDialog(penggunaPanel, "Anda yakin akan menghapus pengguna ini?");
        if (option == JOptionPane.OK_OPTION) {
            userModel.setKodePengguna(penggunaPanel.getKodePenggunaComboBox().getSelectedItem().toString());
            if (userModel.delete()) {
                JOptionPane.showMessageDialog(null, "Pengguna berhasil dihapus !");

            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menghapus Pengguna !");
            }

        }

//        penggunaPanel.getLevelComboBox().setSelectedIndex(0);
//        JOptionPane.showMessageDialog(penggunaPanel, penggunaPanel.getKodePenggunaComboBox().getSelectedIndex());
        batal(penggunaPanel);
//        loadKodePengguna(penggunaPanel);
    }
    
    public void validasi(PenggunaPanel penggunaPanel){
        
    }
}
