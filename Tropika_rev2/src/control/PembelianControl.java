/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import model.PembelianModel;
import view.PembelianBarangPanel;
import java.sql.Date;
import java.util.ArrayList;
import model.DataBankModel;

import model.ItemModel;
import model.SupplierModel;

import view.PilihItemDialog;
import view.PilihSupplierDialog;

/**
 *
 * @author hendar
 */
public class PembelianControl {

    PembelianModel pembelianModel = new PembelianModel();
    DataBankModel dataBankModel = new DataBankModel();
    ItemModel itemModel = new ItemModel();

    public void setPembelian(PembelianBarangPanel pembelianPanel) {
        pembelianModel.setKodeUsulan(pembelianPanel.getKodeUsulanText().getText());
        pembelianModel.setNamaUsulan(pembelianPanel.getNamaUsulanText().getText());
        pembelianModel.setTanggal(pembelianPanel.getTanggalDate().getDate().getTime());
        pembelianModel.setKodeItem(pembelianPanel.getKodeItem().getText());
        if (pembelianPanel.getTunaiCheckBox().isSelected()) {
            pembelianModel.setJenisPembayaran("Tunai");
        } else if (pembelianPanel.getKreditCheckBox().isSelected()) {
            pembelianModel.setJenisPembayaran("Kredit");
        } else if (pembelianPanel.getTransferCheckBox().isSelected()) {
            pembelianModel.setJenisPembayaran("Transfer");
        }
        pembelianModel.setJumlahPembelian(Integer.parseInt(pembelianPanel.getjPembelian().getText()));
        pembelianModel.setJumlahPembayaran(Double.parseDouble(pembelianPanel.getJumlahPembayaranText().getText()));
        pembelianModel.setKeterangan(pembelianPanel.getKeterangan().getText());

    }

    public void simpanPembelian(PembelianBarangPanel pembelianPanel) {
        if (validasi(pembelianPanel)) {
            setPembelian(pembelianPanel);
            if (pembelianModel.insert()) {
                JOptionPane.showMessageDialog(pembelianPanel, "Data Pembelian Barang berhasil Disimpan!");
                clear(pembelianPanel);
            } else {
                JOptionPane.showMessageDialog(pembelianPanel, "Data Pembelian Barang gagal Disimpan!\nKode Usulan mungkin sudah terdaftar");
            }
        }
    }

    public void clear(PembelianBarangPanel pembelianPanel) {
        pembelianPanel.getKodeUsulanText().setText("");
        pembelianPanel.getNamaUsulanText().setText("");
        pembelianPanel.getTanggalDate().setDate(null);
        pembelianPanel.getTunaiCheckBox().setSelected(false);
        pembelianPanel.getKreditCheckBox().setSelected(false);
        pembelianPanel.getTransferCheckBox().setSelected(false);
        pembelianPanel.getJumlahPembayaranText().setText("");
        pembelianPanel.getjPembelian().setText("");
        pembelianPanel.getSatu().setSelected(false);
        pembelianPanel.getDua().setSelected(false);
        pembelianPanel.getTiga().setSelected(false);
        pembelianPanel.getTanggalPenerimaanDate().setDate(null);
        pembelianPanel.getGudangCheckBox().setSelected(false);
        pembelianPanel.getLokasiLainCheckBox().setSelected(false);
        pembelianPanel.getNamaLokasiText().setText("");
    }

    private boolean validasi(PembelianBarangPanel pembelianPanel) {
        boolean toReturn = false;
        if (pembelianPanel.getKodeUsulanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Kode Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getKodeUsulanText().requestFocus();
        } else if (pembelianPanel.getNamaUsulanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Nama Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getNamaUsulanText().requestFocus();
        } else if (pembelianPanel.getTanggalDate().getDate() == null) {
            JOptionPane.showMessageDialog(pembelianPanel, "Tanggal tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getTanggalDate().requestFocus();
        } else if (pembelianPanel.getjPembelian().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Jumlah Pembelian tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getjPembelian().requestFocus();
        } else if (!pembelianPanel.getTunaiCheckBox().isSelected() && !pembelianPanel.getKreditCheckBox().isSelected() && !pembelianPanel.getTransferCheckBox().isSelected()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu jenis Pembayaran !", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (pembelianPanel.getJumlahPembayaranText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Jumlah uang yang dibayarkan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getJumlahPembayaranText().requestFocus();
        } else if (!pembelianPanel.getSatu().isSelected() && !pembelianPanel.getDua().isSelected() && !pembelianPanel.getTiga().isSelected()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu Persetujuan !", "Error", JOptionPane.ERROR_MESSAGE);
//            pembelianPanel.getjTabbedPane1().setSelectedIndex(1);
        } else if (!pembelianPanel.getGudangCheckBox().isSelected() && !pembelianPanel.getLokasiLainCheckBox().isSelected()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu tempat Penyimpanan !", "Error", JOptionPane.ERROR_MESSAGE);
//            pembelianPanel.getjTabbedPane1().setSelectedIndex(3);
        } else if (pembelianPanel.getNamaLokasiText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Nama lokasi tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getNamaLokasiText().requestFocus();
        } else if (pembelianPanel.getTanggalPenerimaanDate().getDate() == null) {
            JOptionPane.showMessageDialog(pembelianPanel, "Tanggal Penerimaan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getTanggalPenerimaanDate().requestFocus();
        } else {
            toReturn = true;
        }

        return toReturn;
    }

    public void pilihItem(PembelianBarangPanel pembelianBarangPanel) {
        PilihItemDialog itemDialog = new PilihItemDialog(null, true);
        itemDialog.setVisible(true);
        itemDialog.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                setItem(pembelianBarangPanel, itemDialog.getItem());
            }
        });

    }
    
    public void pilihSupplier(PembelianBarangPanel pembelianBarangPanel) {
        PilihSupplierDialog supplierDialog = new PilihSupplierDialog(null, true);
        supplierDialog.setVisible(true);
        supplierDialog.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                setSupplier(pembelianBarangPanel, supplierDialog.getSupplier());
            }
        });

    }

    public void setItem(PembelianBarangPanel pembelianBarangPanel, ItemModel item) {
        pembelianBarangPanel.getKodeItem().setText(item.getKodeItem());
        pembelianBarangPanel.getNamaItem().setText(item.getNamaItem());
        pembelianBarangPanel.getSatuanText().setText(item.getSatuan());
        pembelianBarangPanel.getKeterangan().setText(item.getKeterangan());
    }
    
    public void setSupplier(PembelianBarangPanel pembelianBarangPanel, SupplierModel supplier) {
        pembelianBarangPanel.getKoseSupplier().setText(supplier.getKodeSupplier());
        pembelianBarangPanel.getNamaSupplier().setText(supplier.getNamaSupplier());
        pembelianBarangPanel.getAlamat().setText(supplier.getAlamat());
        pembelianBarangPanel.getNoTelp().setText(supplier.getNoTelp());
        pembelianBarangPanel.getEmail().setText(supplier.getEmail());
        pembelianBarangPanel.getcPerson().setText(supplier.getContactPerson());
        
    }
    

}
