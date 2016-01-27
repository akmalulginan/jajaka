/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.UserLoginModel;
import model.UserModel;
import view.PasswordPanel;

/**
 *
 * @author akmal
 */
public class PasswordControl {

    private UserModel user = new UserModel();

    public void ubahPassword(PasswordPanel passwordPanel) {
        if (validasi(passwordPanel)) {
            String passwordLama = passwordPanel.getPasswordLamaText().getText();
            String passwordBaru = passwordPanel.getPasswordBaruText().getText();
            
            if (!passwordLama.equals(UserLoginModel.getPassword())) {
                JOptionPane.showMessageDialog(passwordPanel, "password lama salah !");
            } else {
                user.setUsername(UserLoginModel.getUsername());
                user.setPassword(passwordBaru);
                
                if (user.update()) {
                    JOptionPane.showMessageDialog(passwordPanel, "Ubah password berhasil !");
                    UserLoginModel.setPassword(passwordBaru);
                    clear(passwordPanel);
                } else {
                    JOptionPane.showMessageDialog(passwordPanel, "Ubah password gagal !");
                }
            }
        }
    }
    
    public boolean validasi(PasswordPanel passwordPanel) {
        boolean toReturn = false;
        if (passwordPanel.getPasswordLamaText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(passwordPanel, "Password lama tidak boleh kosong !");
        } else if (passwordPanel.getPasswordBaruText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(passwordPanel, "Password baru tidak boleh kosong !");
        } else {
            toReturn = true;
        }
        return toReturn;
    }
    
    public void clear(PasswordPanel passwordPanel) {
        passwordPanel.getPasswordBaruText().setText("");
        passwordPanel.getPasswordLamaText().setText("");
    }
}
