/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.GudangModel;
import model.ItemModel;
import view.TransaksiGudangPanel;

/**
 *
 * @author akmal
 */
public class TransaksiGudangControl {
    
    private ItemModel itemModel = new ItemModel();
    private GudangModel gudangModel = new GudangModel();
    
    public void setGudang(TransaksiGudangPanel gudangPanel) {
        int row = gudangPanel.getGudangTable().getSelectedRow();
        gudangPanel.getKodeGudangText().setText(gudangPanel.getGudangTable().getValueAt(row, 0).toString());
    }
    
    public void setBarang(TransaksiGudangPanel gudangPanel) {
        int row = gudangPanel.getItemTable().getSelectedRow();
        gudangPanel.getKodeItemText().setText(gudangPanel.getItemTable().getValueAt(row, 0).toString());
        gudangPanel.getNamaItemText().setText(gudangPanel.getItemTable().getValueAt(row, 1).toString());
    }
    
    public void populateTable(TransaksiGudangPanel gudangPanel) {
        poputalteTableGudang(gudangPanel);
        poputalteTableItem(gudangPanel);
    }
    
    public void poputalteTableItem(TransaksiGudangPanel gudangPanel) {
        ArrayList<ItemModel> itemList = itemModel.select("");
        DefaultTableModel defaultTableModel = (DefaultTableModel) gudangPanel.getItemTable().getModel();
        defaultTableModel.setRowCount(0);
        for (ItemModel item : itemList) {
            defaultTableModel.addRow(new Object[]{
                item.getKodeItem(),
                item.getNamaItem()
            });
        }
        gudangPanel.getItemTable().setModel(defaultTableModel);
    }
    
    public void poputalteTableGudang(TransaksiGudangPanel gudangPanel) {
        ArrayList<GudangModel> gudangList = gudangModel.select();
        DefaultTableModel defaultTableModel = (DefaultTableModel) gudangPanel.getGudangTable().getModel();
        defaultTableModel.setRowCount(0);
        for (GudangModel gudang : gudangList) {
            defaultTableModel.addRow(new Object[]{
                gudang.getKodeGudang(),
                gudang.getAlamat(),
                gudang.getKota(),
                gudang.getNoTelp(),
                gudang.getEmail(),
                gudang.getContactPerson()
            });
        }
        gudangPanel.getGudangTable().setModel(defaultTableModel);
    }
    
    public void getDataItem(TransaksiGudangPanel gudangPanel) {
        int row = gudangPanel.getItemTable().getSelectedRow();
        gudangPanel.getKodeItemText().setText(gudangPanel.getItemTable().getValueAt(row, 0).toString());
        gudangPanel.getNamaItemText().setText(gudangPanel.getItemTable().getValueAt(row, 1).toString());
        getImage(gudangPanel, gudangPanel.getItemTable().getValueAt(row, 0).toString());
        
    }
    
    public void getImage(TransaksiGudangPanel gudangPanel, String kodeItem) {
        ImageIcon gambar = new ImageIcon(itemModel.select(kodeItem).get(0).getGambar());
        Image image = gambar.getImage().getScaledInstance(gudangPanel.getGambarLabel().getWidth(), (gudangPanel.getGambarLabel().getWidth() * gambar.getIconHeight()) / gambar.getIconWidth(), java.awt.Image.SCALE_SMOOTH);
        gambar = new ImageIcon(image);
        
        gudangPanel.getGambarLabel().setIcon(gambar);
    }
    
    public boolean validasi(TransaksiGudangPanel gudangPanel) {
        boolean toReturn = false;
        
        if (gudangPanel.getBarisText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Baris tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getBarisText().requestFocus();
        } else if (gudangPanel.getRakText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Rak tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getRakText().requestFocus();
        } else if (gudangPanel.getTanggalBarangMasukDate().getDate() == null) {
            JOptionPane.showMessageDialog(gudangPanel, "Tanggal Barang Masuk tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getTanggalBarangMasukDate().requestFocus();
        } else if (gudangPanel.getjBarangMasukText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Jumlah Barang Masuk tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getjBarangMasukText().requestFocus();
        } else if (gudangPanel.getStockText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Jumlah stock sekarang harus diisi!!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getStockText().requestFocus();
        } else {
            toReturn = true;
        }
        
        return toReturn;
    }
    
    public void clear(TransaksiGudangPanel gudangPanel) {
        gudangPanel.getBarisText().setText("");
        gudangPanel.getRakText().setText("");
        gudangPanel.getTanggalBarangMasukDate().setDate(null);
        gudangPanel.getjBarangMasukText().setText("");
        gudangPanel.getStockText().setText("");
    }
    
    public void setTransaksiGudang(TransaksiGudangPanel gudangPanel){
        
    }
    
    public void simpanTransaksiGudang(TransaksiGudangPanel gudangPanel) {
        if (validasi(gudangPanel)) {
            setTransaksiGudang(gudangPanel);
            if (true) {
                JOptionPane.showMessageDialog(gudangPanel, "Data Transaksi Gudang berhasil Disimpan!", "Error", JOptionPane.ERROR_MESSAGE);
                clear(gudangPanel);
            } else {
                JOptionPane.showMessageDialog(gudangPanel, "Data Transaksi Gudang gagal Disimpan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
