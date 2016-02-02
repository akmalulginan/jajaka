/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.toedter.calendar.JDateChooser;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import model.KaryawanModel;
import view.KaryawanPanel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.JabatanModel;

/**
 *
 * @author hendar
 */
public class KaryawanControl {

    private KaryawanModel karyawanModel = new KaryawanModel();
    private JabatanModel jabatanModel = new JabatanModel();

    public void setKaryawan(KaryawanPanel karyawanPanel) {

        karyawanModel.setKodeKaryawan(karyawanPanel.getKodeKaryawanText().getText());
        karyawanModel.setNamaLengkap(karyawanPanel.getNamaLengkapText().getText());
        karyawanModel.setNamaPanggilan(karyawanPanel.getNamaPanggilanText().getText());
        if (karyawanPanel.getLaki2RadioButton().isSelected()) {
            karyawanModel.setJenisKelamin("Laki-Laki");
        } else if (karyawanPanel.getPerempuanRadioButton().isSelected()) {
            karyawanModel.setJenisKelamin("Perempuan");
        }
        karyawanModel.setJabatan(karyawanPanel.getJabatanText().getText());
        karyawanModel.setTanggalMasuk(karyawanPanel.getTanggalMasukKerjaDate().getDate());
        karyawanModel.setTempatLahir(karyawanPanel.getTempatLahir().getText());
        karyawanModel.setTanggalLahir(karyawanPanel.getTanggalLahirDate().getDate());
        karyawanModel.setAlamat(karyawanPanel.getAlamat().getText());
        karyawanModel.setKota(karyawanPanel.getKota().getText());
        karyawanModel.setKodePos(karyawanPanel.getKodePos().getText());
        karyawanModel.setNoHp(karyawanPanel.getNoHp().getText());
        karyawanModel.setEmail(karyawanPanel.getEmail().getText());
        karyawanModel.setCatatan(karyawanPanel.getCatatan().getText());
        if (karyawanPanel.getAktif().isSelected()) {
            karyawanModel.setStatus(true);
        }
        karyawanModel.setGambar(karyawanPanel.getGambar());
        karyawanModel.setKodeJabatan(karyawanPanel.getKodeJabatanComboBox().getSelectedItem().toString());

    }

    public void simpanKaryawan(KaryawanPanel karyawanPanel) {
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
        } else if (karyawanPanel.getKodeJabatanComboBox().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(karyawanPanel, "Pilih salah satu kode jabatan!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getKodeJabatanComboBox().requestFocus();
        } else if (karyawanPanel.getNamaLengkapText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Nama Lengkap tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaLengkapText().requestFocus();
        } else if (karyawanPanel.getNamaPanggilanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Nama Panggilan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaPanggilanText().requestFocus();
        } else if (karyawanPanel.getJabatanText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Jabatan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getJabatanText().requestFocus();
        } else if (!karyawanPanel.getLaki2RadioButton().isSelected() && !karyawanPanel.getPerempuanRadioButton().isSelected()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Pilih salah satu jenis kelamin!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (karyawanPanel.getTanggalMasukKerjaDate().getDate() == null) {
            JOptionPane.showMessageDialog(karyawanPanel, "Tanggal Masuk tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaPanggilanText().requestFocus();
        } else if (karyawanPanel.getTempatLahir().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Tempat Lahir tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getTempatLahir().requestFocus();
        } else if (karyawanPanel.getTanggalLahirDate().getDate() == null) {
            JOptionPane.showMessageDialog(karyawanPanel, "Tanggal Lahir tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getTanggalLahirDate().requestFocus();
        } else if (karyawanPanel.getAlamat().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Alamat tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getAlamat().requestFocus();
        } else if (karyawanPanel.getKota().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Kota tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getKota().requestFocus();
        } else if (karyawanPanel.getKodePos().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Kode Pos tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getKodePos().requestFocus();
        } else if (karyawanPanel.getNoTelp().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "No Telphone tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNoTelp().requestFocus();
        } else if (karyawanPanel.getNoHp().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "No Handphone tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNoHp().requestFocus();
        } else if (karyawanPanel.getEmail().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Email tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getEmail().requestFocus();
        } else if (karyawanPanel.getCatatan().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Catatan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getCatatan().requestFocus();
        } else if (karyawanPanel.getNamaBank().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Nama Bank tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNamaBank().requestFocus();
        } else if (karyawanPanel.getNoRek().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "No Rekening tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getNoRek().requestFocus();
        } else if (karyawanPanel.getAtasNama().getText().isEmpty()) {
            JOptionPane.showMessageDialog(karyawanPanel, "Atas Nama tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            karyawanPanel.getAtasNama().requestFocus();
        } else {
            toReturn = true;
        }
        return toReturn;
    }

    public void clear(KaryawanPanel karyawanPanel) {
        karyawanPanel.getKodeKaryawanText().setText("");
        karyawanPanel.getKodeJabatanComboBox().setSelectedIndex(0);
        karyawanPanel.getNamaLengkapText().setText("");
        karyawanPanel.getNamaPanggilanText().setText("");
        karyawanPanel.getJabatanText().setText("");
        karyawanPanel.getLaki2RadioButton().setSelected(false);
        karyawanPanel.getPerempuanRadioButton().setSelected(false);
        karyawanPanel.getTanggalMasukKerjaDate().setDate(null);
        karyawanPanel.getTempatLahir().setText("");
        karyawanPanel.getTanggalLahirDate().setDate(null);
        karyawanPanel.getAlamat().setText("");
        karyawanPanel.getKota().setText("");
        karyawanPanel.getKodePos().setText("");
        karyawanPanel.getNoTelp().setText("");
        karyawanPanel.getNoHp().setText("");
        karyawanPanel.getEmail().setText("");
        karyawanPanel.getCatatan().setText("");
        karyawanPanel.getNamaBank().setText("");
        karyawanPanel.getNoRek().setText("");
        karyawanPanel.getAtasNama().setText("");
        karyawanPanel.getUsia().setText("");
    }

    public int hitungUmur(KaryawanPanel karyawanPanel) {

        int usia;
        Date tanggalSekarang = new Date();

        usia = tanggalSekarang.getYear() - karyawanPanel.getTanggalLahirDate().getDate().getYear();

        return usia;

    }

    public void getJabatan(KaryawanPanel karyawanPanel) {
        String kodeJabatan = "";
        if (karyawanPanel.getKodeJabatanComboBox().getSelectedIndex() != -1) {
            kodeJabatan = karyawanPanel.getKodeJabatanComboBox().getSelectedItem().toString();
            if (!kodeJabatan.equals("")) {
                karyawanPanel.getJabatanText().setText(jabatanModel.select(kodeJabatan).get(0).getNamaJabatan());
            }
        }
    }

    public void loadJabatan(JComboBox combo) {
        ArrayList<JabatanModel> jabatanList = jabatanModel.select("");
        combo.removeAllItems();
        combo.addItem("");
        for (JabatanModel jabatan : jabatanList) {
            combo.addItem(jabatan.getKodeJabatan());
        }
    }

    public void usia(KaryawanPanel karyawanPanel) {

        karyawanPanel.getTanggalLahirDate().addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                // If the 'date' property was changed...
                if ("date".equals(evt.getPropertyName())) {
                    JDateChooser aDateChooser = (JDateChooser) evt.getSource();
                    boolean isDateSelectedByUser = false;
                    // Get the otherwise unaccessible JDateChooser's 'dateSelected' field.
                    try {
                        // Get the desired field using reflection
                        Field dateSelectedField = JDateChooser.class.getDeclaredField("dateSelected");
                        // This line makes the value accesible (can be read and/or modified)
                        dateSelectedField.setAccessible(true);
                        isDateSelectedByUser = dateSelectedField.getBoolean(aDateChooser);
                    } catch (Exception ignoreOrNot) {
                    }

                    // Do some important stuff depending on wether value was changed by user
                    if (isDateSelectedByUser) {
                        hitungUsia(karyawanPanel);
                    }

                    // Reset the value to false
                    try {
                        Field dateSelectedField = JDateChooser.class.getDeclaredField("dateSelected");
                        dateSelectedField.setAccessible(true);
//                        isDateSelectedByUser = dateSelectedField.setBoolean(aDateChooser, false);
                    } catch (Exception ignoreOrNot) {
                    }
                }
            }
        });
    }

    public void hitungUsia(KaryawanPanel karyawanPanel) {
        Date now = new Date();
        Date tanggalLahir = karyawanPanel.getTanggalLahirDate().getDate();
        int usia = 0;

            if (tanggalLahir.getMonth() <= now.getMonth()) {
                if (tanggalLahir.getDate() <= now.getDate()) {
                    usia = now.getYear() - tanggalLahir.getYear();
                } else {
                    usia = now.getYear() - tanggalLahir.getYear() - 1;
                }
            } else {
                usia = now.getYear() - tanggalLahir.getYear() - 1;
            }

        karyawanPanel.getUsia().setText(String.valueOf(usia));

    }

}
