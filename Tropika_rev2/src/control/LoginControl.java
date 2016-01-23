/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import model.UserLoginModel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.LevelModel;
import model.UserLoginModel;
import model.UserModel;
import view.Login;
import view.MainMenu;

/**
 *
 * @author akmal
 */
public class LoginControl {

    private UserModel userModel = new UserModel();
    private UserLoginModel userLoginModel = new UserLoginModel();
    private LevelModel levelModel = new LevelModel();

    public void login(Login login) {
        if (validasi(login)) {
            setUser(login);
            userModel = userModel.select();
            if (userModel.getLevel() != 999999) {
                userLoginModel.setUsername(userModel.getUsername());
                userLoginModel.setPassword(userModel.getPassword());
                userLoginModel.setLevel(userModel.getLevel());
                userLoginModel.setLevelModel(levelModel.select(userLoginModel.getLevel()));
                hakAkses(userLoginModel);
            } else {
                JOptionPane.showMessageDialog(login, "username atau password salah");
            }
        }

    }

    public void setUser(Login login) {
        userModel.setUsername(login.getUsernameText().getText());
        userModel.setPassword(login.getPasswordText().getText());
    }

    public void hakAkses(UserLoginModel user) {
        MainMenu mainMenu = new MainMenu();
        System.out.println(user.toString() + user.getLevelModel().toString());

//        level.isSatuan();

        mainMenu.getGudangButton().setEnabled(user.getLevelModel().isGudang());
        mainMenu.getItemButton().setEnabled(user.getLevelModel().isItem());
        mainMenu.getHargaButton().setEnabled(user.getLevelModel().isHarga());
        mainMenu.getKelompokButton().setEnabled(user.getLevelModel().isKategori());
        mainMenu.getSupplierButton().setEnabled(user.getLevelModel().isSupplier());
        mainMenu.getUserButton().setEnabled(user.getLevelModel().isPengguna());
        mainMenu.getHakAksesButton().setEnabled(user.getLevelModel().isHakAkses());
        mainMenu.getLaporanGudangButton().setEnabled(user.getLevelModel().isLaporanGudang());
        mainMenu.getLaporanPembelianButton().setEnabled(user.getLevelModel().isLaporanPembelian());
        mainMenu.getLaporanPenjualanButton().setEnabled(user.getLevelModel().isLaporanPenjualan());
        mainMenu.getPembelianButton().setEnabled(user.getLevelModel().isPembelian());
        mainMenu.getPenjualanButton().setEnabled(user.getLevelModel().isPenjualan());
        mainMenu.getTransaksiButton().setEnabled(user.getLevelModel().isTransaksi());
        mainMenu.getTransaksiGudangButton().setEnabled(user.getLevelModel().isTransaksiGudang());
        
        mainMenu.setVisible(true);
    }

    public boolean validasi(Login login) {
        boolean toReturn = false;
        if (login.getUsernameText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(login, "Username tidak boleh kosong !");
            login.getUsernameText().requestFocus();
        } else if (login.getPasswordText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(login, "Password tidak boleh kosong !");
            login.getPasswordText().requestFocus();
        } else {
            toReturn = true;
        }
        return toReturn;
    }

    public void enter(Login login, KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                login(login);
            } catch (Exception e) {
                System.out.println("e : " + e);
            }
        }
    }

}
