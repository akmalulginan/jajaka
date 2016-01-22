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
            } else {
                JOptionPane.showMessageDialog(login, "username atau password salah");
            }
        }

    }

    public void setUser(Login login) {
        userModel.setUsername(login.getUsernameText().getText());
        userModel.setPassword(login.getPasswordText().getText());
    }

    public void hakAkses() {

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
