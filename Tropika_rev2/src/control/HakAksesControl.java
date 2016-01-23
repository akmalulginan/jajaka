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

    public void clear(HakAksesPanel hakAksesPanel) {
        hakAksesPanel.getjTabbedPane1().setSelectedIndex(0);
        hakAksesPanel.getLevelComboBox().setSelectedIndex(0);
        hakAksesPanel.getPenggunaCheckBox().setSelected(false);
        hakAksesPanel.getHakAksesCheckBox().setSelected(false);
        hakAksesPanel.getGudangCheckBox().setSelected(false);
        hakAksesPanel.getItemCheckBox().setSelected(false);
        hakAksesPanel.getHargaCheckBox().setSelected(false);
        hakAksesPanel.getKategoriCheckBox().setSelected(false);
        hakAksesPanel.getSupplierCheckBox().setSelected(false);
        hakAksesPanel.getPembelianCheckBox().setSelected(false);
        hakAksesPanel.getPenjualanCheckBox().setSelected(false);
        hakAksesPanel.getTransaksiGudangCheckBox().setSelected(false);
        hakAksesPanel.getTransaksiCheckBox().setSelected(false);
        hakAksesPanel.getLaporanGudangCheckBox().setSelected(false);
        hakAksesPanel.getLaporanPembelianCheckBox().setSelected(false);
        hakAksesPanel.getLaporanPenjualanCheckBox().setSelected(false);
    }

    public void disable(HakAksesPanel hakAksesPanel) {
        hakAksesPanel.getjTabbedPane1().setEnabled(false);
        hakAksesPanel.getLevelComboBox();
        hakAksesPanel.getPenggunaCheckBox();
        hakAksesPanel.getHakAksesCheckBox();
        hakAksesPanel.getGudangCheckBox();
        hakAksesPanel.getItemCheckBox();
        hakAksesPanel.getHargaCheckBox();
        hakAksesPanel.getKategoriCheckBox();
        hakAksesPanel.getSupplierCheckBox();
        hakAksesPanel.getPembelianCheckBox();
        hakAksesPanel.getPenjualanCheckBox();
        hakAksesPanel.getTransaksiGudangCheckBox();
        hakAksesPanel.getTransaksiCheckBox();
        hakAksesPanel.getLaporanGudangCheckBox();
        hakAksesPanel.getLaporanPembelianCheckBox();
        hakAksesPanel.getLaporanPenjualanCheckBox();
    }

    public void enable(HakAksesPanel hakAksesPanel) {
        hakAksesPanel.getjTabbedPane1();
        hakAksesPanel.getLevelComboBox();
        hakAksesPanel.getPenggunaCheckBox();
        hakAksesPanel.getHakAksesCheckBox();
        hakAksesPanel.getGudangCheckBox();
        hakAksesPanel.getItemCheckBox();
        hakAksesPanel.getHargaCheckBox();
        hakAksesPanel.getKategoriCheckBox();
        hakAksesPanel.getSupplierCheckBox();
        hakAksesPanel.getPembelianCheckBox();
        hakAksesPanel.getPenjualanCheckBox();
        hakAksesPanel.getTransaksiGudangCheckBox();
        hakAksesPanel.getTransaksiCheckBox();
        hakAksesPanel.getLaporanGudangCheckBox();
        hakAksesPanel.getLaporanPembelianCheckBox();
        hakAksesPanel.getLaporanPenjualanCheckBox();
    }

}
