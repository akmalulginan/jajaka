/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.ItemModel;
import model.SatuanModel;

/**
 *
 * @author akmal
 */
public class ItemControl {

    ItemModel itemModel = new ItemModel();

    public void set(
            String kodeItem,
            String barcode,
            String namaItem,
            String kategori,
            boolean dapatDibeli,
            boolean dapatDijual,
            boolean dapatDiproduksi,
            boolean dipakaiUntukProduksi,
            boolean dapatDibongkar,
            boolean statusItem,
            byte[] gambar,
            String keterangan,
            String kodeSatuan
    ) {
        itemModel.setKodeItem(kodeItem);
        itemModel.setBarcode(barcode);
        itemModel.setNamaItem(namaItem);
        itemModel.setKategori(kategori);
        itemModel.setDapatDibeli(dapatDibeli);
        itemModel.setDapatDijual(dapatDijual);
        itemModel.setDapatDiproduksi(dapatDiproduksi);
        itemModel.setDipakaiUntukProduksi(dipakaiUntukProduksi);
        itemModel.setDapatDibongkar(dapatDibongkar);
        itemModel.setStatusItem(statusItem);
        if (gambar != null) {
            itemModel.setGambar(gambar);
        } else {
            String filename = System.getProperty("user.dir") + "\\lib\\item.bak";
            itemModel.setGambar(setImage(filename));
        }
        itemModel.setKeterangan(keterangan);
        itemModel.setSatuan(kodeSatuan);

        itemModel.insert();
//        System.out.println(itemModel.toString());
    }

    public void loadSatuan(JComboBox combo) {
        SatuanModel sM = new SatuanModel();
        sM.select(combo);
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
            Image img = poto.getImage().getScaledInstance(gambarLabel.getWidth(), (gambarLabel.getWidth() * poto.getIconHeight()) / poto.getIconWidth(), java.awt.Image.SCALE_SMOOTH);
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

//    public void loadCombo() {
//        this.satuanCombo.removeAllItems();
//        ItemControl bC = new ItemControl();
//        bC.loadSatuan(this.satuanCombo);
//    }
}
