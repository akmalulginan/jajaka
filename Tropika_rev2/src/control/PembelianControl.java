/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.PembelianModel;
import view.PembelianBarangPanel;

/**
 *
 * @author hendar
 */
public class PembelianControl {

    PembelianModel pembelianModel = new PembelianModel();

    public void setPembelian(PembelianBarangPanel pembelianPanel) {

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
        } else if (!pembelianPanel.getTunaiCheckBox().isSelected() && !pembelianPanel.getKreditCheckBox().isSelected() && !pembelianPanel.getTransferCheckBox().isSelected()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu jenis Pembelian !", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (pembelianPanel.getJumlahPembayaranText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Jumlah uang yang dibayarkan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getJumlahPembayaranText().requestFocus();
        } else if (!pembelianPanel.getSatu().isSelected() && !pembelianPanel.getDua().isSelected() && !pembelianPanel.getTiga().isSelected()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu Persetujuan !", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!pembelianPanel.getGudangCheckBox().isSelected() && !pembelianPanel.getLokasiLainCheckBox().isSelected()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu tempat Penyimpanan !", "Error", JOptionPane.ERROR_MESSAGE);
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
}
