/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.KaryawanModel;
import view.KaryawanPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author hendar
 */
public class KaryawanControl {

    private KaryawanModel karyawanModel = new KaryawanModel();

    public void setKaryawan(KaryawanPanel karyawanPanel) {

        karyawanModel.setKodeKaryawan(karyawanPanel.getKodeKaryawanText().getText());
        karyawanModel.setNamaLengkap(karyawanPanel.getNamaLengkapText().getText());
        karyawanModel.setNamaPanggilan(karyawanPanel.getNamaPanggilanText().getText());
        if (karyawanPanel.getLaki2RadioButton().isSelected()) {
            karyawanModel.setJenisKelamin("Laki-Laki");
        } else if (karyawanPanel.getPerempuanRadioButton().isSelected()) {
            karyawanModel.setJenisKelamin("Perempuan");
        }
        karyawanModel.setJenisKelamin(karyawanPanel.getJenisKelaminButtonGroup().getSelection().toString());
        karyawanModel.setTanggalMasuk(karyawanPanel.getTanggalMasukKerjaDate().getDate().getTime());
        karyawanModel.setTempatLahir(karyawanPanel.getTempatLahir().getText());
        karyawanModel.setTanggalLahir(karyawanPanel.getTanggalLahirDate().getDate().getTime());
        karyawanModel.setAlamat(karyawanPanel.getAlamat().getText());
        karyawanModel.setKota(karyawanPanel.getKota().getText());
        karyawanModel.setKodePos(karyawanPanel.getKodePos().getText());
        karyawanModel.setNoHp(karyawanPanel.getNoHp().getText());
        karyawanModel.setEmail(karyawanPanel.getEmail().getText());
        karyawanModel.setCatatan(karyawanPanel.getCatatan().getText());
        karyawanModel.setStatus(karyawanPanel.getAktif().getSelectedObjects().toString());
        karyawanModel.setGambar(karyawanPanel.getGambar());

    }
    
    
    public void simpanGudang(KaryawanPanel karyawanPanel) {
        if (validasi(karyawanPanel)) {
            setKaryawan(karyawanPanel);
            if (karyawanModel.insert()) {
                JOptionPane.showMessageDialog(karyawanPanel, "Data Karyawan berhasil Disimpan!");
                clear(karyawanPanel);
            } else {
                JOptionPane.showMessageDialog(karyawanPanel, "Data Karyawan gagal Disimpan!\nKode karyawan sudah terdaftar");
            }
        }
    }
    
    public boolean validasi(KaryawanPanel karyawanPanel) {
        boolean toReturn = false;
        if (karyawanPanel.getKodeKaryawanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Kode Karyawan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getKodeKaryawanText().requestFocus();
        }else if(karyawanPanel.getKodeJabatanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Kode Jabatan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getKodeJabatanText().requestFocus();
        }else if (karyawanPanel.getNamaLengkapText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Nama Lengkap tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaLengkapText().requestFocus();
        } else if (karyawanPanel.getNamaPanggilanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(karyawanPanel, "Nama Panggilan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaPanggilanText().requestFocus();
        } else if(karyawanPanel.getJabatanText().getText().isEmpty()){
            JOptionPane.showMessageDialog(karyawanPanel, "Jabatan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getJabatanText().requestFocus();
        }else if(karyawanPanel.getTanggalMasukKerjaDate().getDate() == null){
            JOptionPane.showMessageDialog(karyawanPanel, "Tanggal Masuk tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaPanggilanText().requestFocus();
        }else if(!karyawanPanel.getLaki2RadioButton().isSelected() && !karyawanPanel.getPerempuanRadioButton().isSelected()){
            JOptionPane.showMessageDialog(karyawanPanel, "Pilih salah satu jenis kelamin!", "Error", JOptionPane.ERROR_MESSAGE);     
        }else if(karyawanPanel.getTempatLahir().getText().isEmpty()){
            JOptionPane.showMessageDialog(karyawanPanel, "Tempat Lahir tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getTempatLahir().requestFocus();
        }
//         else if (gudangPanel.getKodePosText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "Kode pos tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getKodePosText().requestFocus();
//        } else if (gudangPanel.getKotaText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "Kota tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getKotaText().requestFocus();
//        }  else if (gudangPanel.getNoTelpText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "No Telephone tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getNoTelpText().requestFocus();
//        } else if (gudangPanel.getNoFaxText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "No Fax tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getNoFaxText().requestFocus();
//        } else if (gudangPanel.getEmailText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "Email tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getEmailText().requestFocus();
//        } else if (gudangPanel.getCatatanText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "Catatan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getCatatanText().requestFocus();
//        } else if (gudangPanel.getcPersonText().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(gudangPanel, "Contact Person tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//            gudangPanel.getcPersonText().requestFocus();
         else {
            toReturn = true;
        }
        return toReturn;
    }

    public void clear(KaryawanPanel karyawanPanel) {
       
    }


}
