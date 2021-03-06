/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
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
//        hakAksesPanel.getLevelComboBox().setEnabled(false);
        hakAksesPanel.getPenggunaCheckBox().setEnabled(false);
        hakAksesPanel.getHakAksesCheckBox().setEnabled(false);
        hakAksesPanel.getGudangCheckBox().setEnabled(false);
        hakAksesPanel.getItemCheckBox().setEnabled(false);
        hakAksesPanel.getHargaCheckBox().setEnabled(false);
        hakAksesPanel.getKategoriCheckBox().setEnabled(false);
        hakAksesPanel.getSupplierCheckBox().setEnabled(false);
        hakAksesPanel.getPembelianCheckBox().setEnabled(false);
        hakAksesPanel.getPenjualanCheckBox().setEnabled(false);
        hakAksesPanel.getTransaksiGudangCheckBox().setEnabled(false);
        hakAksesPanel.getTransaksiCheckBox().setEnabled(false);
        hakAksesPanel.getLaporanGudangCheckBox().setEnabled(false);
        hakAksesPanel.getLaporanPembelianCheckBox().setEnabled(false);
        hakAksesPanel.getLaporanPenjualanCheckBox().setEnabled(false);
        hakAksesPanel.getUbahButton().setEnabled(false);
        hakAksesPanel.getHapusButton().setEnabled(false);
        hakAksesPanel.getSimpanButton().setEnabled(false);
    }

    public void enable(HakAksesPanel hakAksesPanel) {
        hakAksesPanel.getjTabbedPane1().setEnabled(true);
//        hakAksesPanel.getLevelComboBox().setEnabled(true);
        hakAksesPanel.getPenggunaCheckBox().setEnabled(true);
        hakAksesPanel.getHakAksesCheckBox().setEnabled(true);
        hakAksesPanel.getGudangCheckBox().setEnabled(true);
        hakAksesPanel.getItemCheckBox().setEnabled(true);
        hakAksesPanel.getHargaCheckBox().setEnabled(true);
        hakAksesPanel.getKategoriCheckBox().setEnabled(true);
        hakAksesPanel.getSupplierCheckBox().setEnabled(true);
        hakAksesPanel.getPembelianCheckBox().setEnabled(true);
        hakAksesPanel.getPenjualanCheckBox().setEnabled(true);
        hakAksesPanel.getTransaksiGudangCheckBox().setEnabled(true);
        hakAksesPanel.getTransaksiCheckBox().setEnabled(true);
        hakAksesPanel.getLaporanGudangCheckBox().setEnabled(true);
        hakAksesPanel.getLaporanPembelianCheckBox().setEnabled(true);
        hakAksesPanel.getLaporanPenjualanCheckBox().setEnabled(true);
        hakAksesPanel.getUbahButton().setEnabled(true);
        hakAksesPanel.getHapusButton().setEnabled(true);
        hakAksesPanel.getSimpanButton().setEnabled(true);

    }

    public void tambah(HakAksesPanel hakAksesPanel) {
        reset(hakAksesPanel);
        enable(hakAksesPanel);
        hakAksesPanel.getSimpanButton().setEnabled(true);
        hakAksesPanel.getUbahButton().setEnabled(false);
        hakAksesPanel.getHapusButton().setEnabled(false);
        hakAksesPanel.getLevelComboBox().setEnabled(false);
    }

    public void reset(HakAksesPanel hakAksesPanel) {
        clear(hakAksesPanel);
        disable(hakAksesPanel);
        hakAksesPanel.getLevelComboBox().setEnabled(true);
    }

    public void setLevel(HakAksesPanel hakAksesPanel) {
        disable(hakAksesPanel);
        hakAksesPanel.getUbahButton().setEnabled(true);
        hakAksesPanel.getHapusButton().setEnabled(true);
        if (hakAksesPanel.getLevelComboBox().getSelectedIndex() != -1 && hakAksesPanel.getLevelComboBox().getSelectedIndex() != 0) {
            levelModel = levelModel.select(hakAksesPanel.getLevelComboBox().getSelectedItem().toString()).get(0);
            hakAksesPanel.getPenggunaCheckBox().setSelected(levelModel.isPengguna());
            hakAksesPanel.getHakAksesCheckBox().setSelected(levelModel.isHakAkses());
            hakAksesPanel.getGudangCheckBox().setSelected(levelModel.isGudang());
            hakAksesPanel.getItemCheckBox().setSelected(levelModel.isItem());
            hakAksesPanel.getHargaCheckBox().setSelected(levelModel.isHarga());
            hakAksesPanel.getKategoriCheckBox().setSelected(levelModel.isKategori());
            hakAksesPanel.getSupplierCheckBox().setSelected(levelModel.isSupplier());
            hakAksesPanel.getPembelianCheckBox().setSelected(levelModel.isPembelian());
            hakAksesPanel.getPenjualanCheckBox().setSelected(levelModel.isPenjualan());
            hakAksesPanel.getTransaksiGudangCheckBox().setSelected(levelModel.isTransaksiGudang());
            hakAksesPanel.getTransaksiCheckBox().setSelected(levelModel.isTransaksi());
            hakAksesPanel.getLaporanGudangCheckBox().setSelected(levelModel.isLaporanGudang());
            hakAksesPanel.getLaporanPembelianCheckBox().setSelected(levelModel.isLaporanPembelian());
            hakAksesPanel.getLaporanPenjualanCheckBox().setSelected(levelModel.isLaporanPenjualan());
        }
    }

    public void ubah(HakAksesPanel hakAksesPanel) {
        enable(hakAksesPanel);
        hakAksesPanel.getSimpanButton().setEnabled(true);
    }

    public void setLevelModel(HakAksesPanel hakAksesPanel) {
        levelModel.setLevel(hakAksesPanel.getLevelComboBox().getSelectedItem().hashCode());
        levelModel.setPengguna(hakAksesPanel.getPenggunaCheckBox().isSelected());
        levelModel.setHakAkses(hakAksesPanel.getHakAksesCheckBox().isSelected());
        levelModel.setGudang(hakAksesPanel.getGudangCheckBox().isSelected());
        levelModel.setItem(hakAksesPanel.getItemCheckBox().isSelected());
        levelModel.setHarga(hakAksesPanel.getHargaCheckBox().isSelected());
        levelModel.setKategori(hakAksesPanel.getKategoriCheckBox().isSelected());
//        levelModel.setSatuan(hakAksesPanel);
        levelModel.setSupplier(hakAksesPanel.getSupplierCheckBox().isSelected());
        levelModel.setPembelian(hakAksesPanel.getPembelianCheckBox().isSelected());
        levelModel.setPenjualan(hakAksesPanel.getPenjualanCheckBox().isSelected());
        levelModel.setTransaksiGudang(hakAksesPanel.getTransaksiGudangCheckBox().isSelected());
        levelModel.setTransaksi(hakAksesPanel.getTransaksiCheckBox().isSelected());
        levelModel.setLaporanPembelian(hakAksesPanel.getLaporanPembelianCheckBox().isSelected());
        levelModel.setLaporanPenjualan(hakAksesPanel.getLaporanPenjualanCheckBox().isSelected());
        levelModel.setLaporanGudang(hakAksesPanel.getLaporanGudangCheckBox().isSelected());

    }

    public void simpan(HakAksesPanel hakAksesPanel) {
        setLevelModel(hakAksesPanel);
        if (hakAksesPanel.getLevelComboBox().getSelectedIndex() == 0) {
            //insert
            if (levelModel.insert()) {
                JOptionPane.showMessageDialog(hakAksesPanel, "Data berhasil Disimpan!");
                reset(hakAksesPanel);
                setLevel(hakAksesPanel);
            } else {
                JOptionPane.showMessageDialog(hakAksesPanel, "Data Gagal Disimpan!");
            }

        } else {
            //update
            if (levelModel.update()) {
                JOptionPane.showMessageDialog(hakAksesPanel, "Data berhasil Diubah!");
                reset(hakAksesPanel);
            } else {
                JOptionPane.showMessageDialog(hakAksesPanel, "Data Gagal Diubah!");
            }
        }

    }

    public void hapus(HakAksesPanel hakAksesPanel) {
        int option = JOptionPane.showConfirmDialog(hakAksesPanel, "Anda yakin akan menghapus Data ini?");
        if (option == JOptionPane.OK_OPTION) {
            levelModel.setLevel(hakAksesPanel.getLevelComboBox().getSelectedItem().hashCode());
            if (levelModel.hapus()) {
                JOptionPane.showMessageDialog(hakAksesPanel, "Data berhasil dihapus !");
                reset(hakAksesPanel);

            } else {
                JOptionPane.showMessageDialog(hakAksesPanel, "Gagal Menghapus Data !");
                reset(hakAksesPanel);
            }
        }
    }
}
