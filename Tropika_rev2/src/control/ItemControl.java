/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.ItemModel;
import model.SatuanModel;
import view.ItemPanel;

/**
 *
 * @author akmal
 */
public class ItemControl {

    private ItemModel itemModel = new ItemModel();
    private SatuanModel satuanModel = new SatuanModel();

    public void setItem(ItemPanel itemPanel) {
        itemModel.setKodeItem(itemPanel.getKodeItemText().getText());
        itemModel.setBarcode(itemPanel.getBarcodeText().getText());
        itemModel.setNamaItem(itemPanel.getNamaItemText().getText());
        itemModel.setKategori(itemPanel.getKategoriCombo().getSelectedItem().toString());
        itemModel.setDapatDibeli(itemPanel.getDapatDibeli());
        itemModel.setDapatDijual(itemPanel.getDapatDijual());
        itemModel.setDapatDiproduksi(itemPanel.getDapatDiproduksi());
        itemModel.setDipakaiUntukProduksi(itemPanel.getDipakaiUntukProduksi());
        itemModel.setDapatDibongkar(itemPanel.getDapatDibongkar());
        itemModel.setStatusItem(itemPanel.getStatusItem());
        if (itemPanel.getGambar() != null) {
            itemModel.setGambar(itemPanel.getGambar());
        } else {
            String filename = System.getProperty("user.dir") + "\\lib\\item.bak";
            itemModel.setGambar(setImage(filename));
        }
        itemModel.setKeterangan(itemPanel.getKeteranganText().getText());
        itemModel.setSatuan(itemPanel.getSatuanCombo().getSelectedItem().toString());
    }

    public void simpanItem(ItemPanel itemPanel) {

        if (validasi(itemPanel)) {
            setItem(itemPanel);

            if (itemModel.insert()) {
                JOptionPane.showMessageDialog(itemPanel, "Item berhasil Disimpan!");
                clear(itemPanel);
            } else {
                JOptionPane.showMessageDialog(itemPanel, "Item gagal Disimpan!\nKode Item sudah terdaftar");
            }
        }

    }

    public void loadSatuan(JComboBox combo) {
        ArrayList<SatuanModel> satuanList = satuanModel.select();
        combo.addItem("");
        for (SatuanModel satuan : satuanList) {
            combo.addItem(satuan.getKodeSatuan());
        }
    }

    public String openImage(JTextField pathText) {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        pathText.setText(filename);
        return filename;
    }

    public byte[] setImage(String filename, JLabel gambarLabel) {

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            byte[] photo;
            photo = bos.toByteArray();
            ImageIcon poto = new ImageIcon(photo);
            Image img = poto.getImage().getScaledInstance(170, (170 * poto.getIconHeight()) / poto.getIconWidth(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon i = new ImageIcon(img);
            gambarLabel.setIcon(i);
            return photo;
        } catch (Exception e) {
            return null;
        }
    }

    public byte[] setImage(String filename) {

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            byte[] photo;
            photo = bos.toByteArray();
            return photo;
        } catch (Exception e) {
            return null;
        }
    }

    public void loadSatuanCombo(JComboBox comboBox) {
        comboBox.removeAllItems();
        ItemControl bC = new ItemControl();
        loadSatuan(comboBox);
    }
    
    

    public boolean validasi(ItemPanel itemPanel) {
        boolean toReturn = false;
        if (itemPanel.getKodeItemText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(itemPanel, "Kode Item tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            itemPanel.getKodeItemText().requestFocus();
        } else if (itemPanel.getBarcodeText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(itemPanel, "Barcode Item tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            itemPanel.getBarcodeText().requestFocus();
        } else if (itemPanel.getNamaItemText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(itemPanel, "Nama Item tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            itemPanel.getNamaItemText().requestFocus();
        } else if (itemPanel.getSatuanCombo().getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(itemPanel, "satuan item belum dipilih!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (itemPanel.getKategoriCombo().getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(itemPanel, "Kategori Item tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            toReturn = true;
        }
        return toReturn;
    }

    public void clear(ItemPanel itemPanel) {
        setImage(System.getProperty("user.dir") + "\\lib\\item.bak", itemPanel.getGambarLabel());
        itemPanel.getPathText().setText("");
        itemPanel.getKeteranganText().setText("");
        itemPanel.getjTabbedPane1().setSelectedIndex(0);
        itemPanel.getKodeItemText().setText("");
        itemPanel.getBarcodeText().setText("");
        itemPanel.getNamaItemText().setText("");
        itemPanel.getSatuanCombo().setSelectedIndex(0);
        itemPanel.getKategoriCombo().setSelectedIndex(0);
        itemPanel.getDapatDibeliCheck().setSelected(false);
        itemPanel.getDapatDijualCheck().setSelected(false);
        itemPanel.getDapatDiproduksiCheck().setSelected(false);
        itemPanel.getDapatDibongkarCheck().setSelected(false);
        itemPanel.getDipakaiUntukProduksiCheck().setSelected(false);
        itemPanel.getStatusItemCheck().setSelected(false);
    }

}
