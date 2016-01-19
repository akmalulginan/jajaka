/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.GudangModel;
import view.GudangPanel;

/**
 *
 * @author akmal
 */
public class GudangControl {

    private GudangModel gudangModel = new GudangModel();

    public void setGudang(GudangPanel gudangPanel) {
        gudangModel.setKodeGudang(gudangPanel.getKodeGudangText().getText());
        gudangModel.setKategoriGudang(gudangPanel.getKategoriGudangText().getText());
        gudangModel.setAlamat(gudangPanel.getAlamatText().getText());
        gudangModel.setKota(gudangPanel.getKotaText().getText());
        gudangModel.setKodePos(gudangPanel.getKodePosText().getText());
        gudangModel.setNoTelp(gudangPanel.getNoTelpText().getText());
        gudangModel.setNoFax(gudangPanel.getNoFaxText().getText());
        gudangModel.setEmail(gudangPanel.getEmailText().getText());
        gudangModel.setCatatan(gudangPanel.getCatatanText().getText());
        gudangModel.setContactPerson(gudangPanel.getcPersonText().getText());
        gudangModel.setPenyimpanan(gudangPanel.getPenyimpanan());
        gudangModel.setProduksi(gudangPanel.getProduksi());

    }

    public void simpanGudang(GudangPanel gudangPanel) {
        if (validasi(gudangPanel)) {
            setGudang(gudangPanel);
            if (gudangModel.insert()) {
                JOptionPane.showMessageDialog(gudangPanel, "Data Gudang berhasil Disimpan!");
                clear(gudangPanel);
            } else {
                JOptionPane.showMessageDialog(gudangPanel, "Data Gudang gagal Disimpan!\nKode Gudang sudah terdaftar");
            }
        }
    }

    public boolean validasi(GudangPanel gudangPanel) {
        boolean toReturn = false;
        if (gudangPanel.getKodeGudangText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Kode Gudang tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getKodeGudangText().requestFocus();
        } else if (gudangPanel.getKategoriGudangText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Kategori Gudang tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getKategoriGudangText().requestFocus();
        } else if (gudangPanel.getAlamatText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Alamat tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getAlamatText().requestFocus();
        } else if (gudangPanel.getKodePosText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Kode pos tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getKodePosText().requestFocus();
        } else if (gudangPanel.getKotaText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Kota tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getKotaText().requestFocus();
        }  else if (gudangPanel.getNoTelpText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "No Telephone tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getNoTelpText().requestFocus();
        } else if (gudangPanel.getNoFaxText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "No Fax tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getNoFaxText().requestFocus();
        } else if (gudangPanel.getEmailText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Email tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getEmailText().requestFocus();
        } else if (gudangPanel.getCatatanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Catatan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getCatatanText().requestFocus();
        } else if (gudangPanel.getcPersonText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(gudangPanel, "Contact Person tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            gudangPanel.getcPersonText().requestFocus();
        } else {
            toReturn = true;
        }
        return toReturn;
    }

    public void clear(GudangPanel gudangPanel) {
        gudangPanel.getKodeGudangText().setText("");
        gudangPanel.getKategoriGudangText().setText("");
        gudangPanel.getAlamatText().setText("");
        gudangPanel.getKotaText().setText("");
        gudangPanel.getKodePosText().setText("");
        gudangPanel.getNoTelpText().setText("");
        gudangPanel.getNoFaxText().setText("");
        gudangPanel.getEmailText().setText("");
        gudangPanel.getCatatanText().setText("");
        gudangPanel.getcPersonText().setText("");
        gudangPanel.getPenyimpananCheck().setSelected(false);
        gudangPanel.getProduksiCheck().setSelected(false);
    }
}
