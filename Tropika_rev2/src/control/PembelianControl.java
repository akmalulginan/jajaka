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
    
     PembelianBarangPanel pembelianPanel = new PembelianBarangPanel();
     PembelianModel pembelianModel = new PembelianModel();
     public void setPembelian(PembelianBarangPanel pembelianPanel){
         
         
     }
     
     public void simpanPembelian(PembelianBarangPanel pembelianPanel){
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
     
     public void clear(PembelianBarangPanel pembelianPanel){
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
     }

    private boolean validasi(PembelianBarangPanel pembelianPanel) {
         boolean toReturn = false;
        if( pembelianPanel.getKodeUsulanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(pembelianPanel, "Kode Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getKodeUsulanText().requestFocus();
        }else if(pembelianPanel.getNamaUsulanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(pembelianPanel, "Nama Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getNamaUsulanText().requestFocus();
        }else if(pembelianPanel.getTanggalDate().getDate() == null){
            JOptionPane.showMessageDialog(pembelianPanel, "Tanggal tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getTanggalDate().requestFocus();
        }else if(pembelianPanel.getNamaUsulanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(pembelianPanel, "Nama Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getNamaUsulanText().requestFocus();
        }else if(pembelianPanel.getNamaUsulanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(pembelianPanel, "Nama Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getNamaUsulanText().requestFocus();
        }else if(pembelianPanel.getNamaUsulanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(pembelianPanel, "Nama Usulan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            pembelianPanel.getNamaUsulanText().requestFocus();
        }else{
             toReturn = true;
        }
        
        return toReturn;
    }
}
