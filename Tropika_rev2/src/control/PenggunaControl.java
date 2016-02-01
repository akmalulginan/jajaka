/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.PenggunaPanel;

/**
 *
 * @author akmal
 */
public class PenggunaControl {

    public void clear(PenggunaPanel penggunaPanel) {
        penggunaPanel.getKodePenggunaComboBox().setSelectedIndex(0);
        penggunaPanel.getNamaPenggunaText().setText("");
        penggunaPanel.getUsernameText().setText("");
        penggunaPanel.getPasswordText().setText("");
        penggunaPanel.getKonfirmPassword().setText("");
        penggunaPanel.getLevelComboBox().setSelectedIndex(0);
    }
}
