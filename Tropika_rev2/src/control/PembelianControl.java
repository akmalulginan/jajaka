/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import model.PembelianModel;
import view.PembelianBarangPanel;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
        pembelianModel.setHarga(Integer.parseInt(pembelianPanel.getHarga().getText()));
        if (pembelianPanel.getTunaiCheckBox().isSelected()) {
            pembelianModel.setJenisPembayaran("Tunai");
        } else if (pembelianPanel.getKreditCheckBox().isSelected()) {
            pembelianModel.setJenisPembayaran("Kredit");
        } else if (pembelianPanel.getTransferCheckBox().isSelected()) {
            pembelianModel.setJenisPembayaran("Transfer");
        }
        pembelianModel.setJumlahPembelian(Integer.parseInt(pembelianPanel.getjPembelian().getText()));
        pembelianModel.setJumlahPembayaran(Integer.parseInt(pembelianPanel.getJumlahPembayaranText().getText()));
        pembelianModel.setKeterangan(pembelianPanel.getKeterangan().getText());

        pembelianModel.setTanngalPenerimaan(pembelianPanel.getTanggalPenerimaanDate().getDate().getTime());
        pembelianModel.setKodeGudang(pembelianPanel.getKodeGudangText().getText());
        pembelianModel.setLokasiLain(pembelianPanel.getNamaLokasiText().getText());
        pembelianModel.setHarga(Integer.parseInt(pembelianPanel.getHarga().getText()));

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
        pembelianPanel.getKodeItem().setText("");
        pembelianPanel.getNamaItem().setText("");
        pembelianPanel.getHarga().setText("");
        pembelianPanel.getSatuanText().setText("");
        pembelianPanel.getKeterangan().setText("");
        pembelianPanel.getKoseSupplier().setText("");
        pembelianPanel.getNamaSupplier().setText("");
        pembelianPanel.getAlamat().setText("");
        pembelianPanel.getNoTelp().setText("");
        pembelianPanel.getEmail().setText("");
        pembelianPanel.getcPerson().setText("");
        pembelianPanel.getNoRekeningText().setText(dataBankModel.getNoRekening());
        pembelianPanel.getNamaBankText().setText(dataBankModel.getNamaBank());
        pembelianPanel.getAtasNamaText().setText(dataBankModel.getAtasNama());
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
        } else if (pembelianPanel.getGudangCheckBox().isSelected() && pembelianPanel.getKodeGudangText().getText().isEmpty()) {
            JOptionPane.showMessageDialog(pembelianPanel, "Pilih salah satu gudang!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (pembelianPanel.getLokasiLainCheckBox().isSelected() && pembelianPanel.getNamaLokasiText().getText().isEmpty()) {
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

        dataBankModel = dataBankModel.select(supplier.getKodeSupplier()).get(0);
        pembelianBarangPanel.getNoRekeningText().setText(dataBankModel.getNoRekening());
        pembelianBarangPanel.getNamaBankText().setText(dataBankModel.getNamaBank());
        pembelianBarangPanel.getAtasNamaText().setText(dataBankModel.getAtasNama());

    }

    public void validasiAngka(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }

    public void hitungTotalHarga(PembelianBarangPanel pembelianBarangPanel) {
        if (!pembelianBarangPanel.getjPembelian().getText().isEmpty()) {
            if (!pembelianBarangPanel.getHarga().getText().isEmpty()) {
                int jumlahPembelian = Integer.parseInt(pembelianBarangPanel.getjPembelian().getText());
                int harga = Integer.parseInt(pembelianBarangPanel.getHarga().getText());
                int jumlahHarga = jumlahPembelian * harga;
                int ppn = (int) (jumlahHarga * 0.1);
                int totalHarga = jumlahHarga + ppn;
                pembelianBarangPanel.getJumlahHargaText().setText(jumlahHarga + "");
                pembelianBarangPanel.getPpnText().setText(ppn + "");
                pembelianBarangPanel.getTotalText().setText(totalHarga + "");
            }
        }
    }

    public void listenerTextField(JTextField textField, PembelianBarangPanel pembelianBarangPanel) {
        textField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                hitungTotalHarga(pembelianBarangPanel);
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                hitungTotalHarga(pembelianBarangPanel);
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                hitungTotalHarga(pembelianBarangPanel);
            }
        });
    }

    public void penyimpanan(JCheckBox checkBox, PembelianBarangPanel pembelianBarangPanel) {
        checkBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (pembelianBarangPanel.getGudangCheckBox().isSelected()) {
                    pembelianBarangPanel.getPilihGudangButton().setEnabled(true);
                    pembelianBarangPanel.getNamaLokasiText().setEnabled(false);
                    pembelianBarangPanel.getNamaLokasiText().setText("");
                } else if (pembelianBarangPanel.getLokasiLainCheckBox().isSelected()) {
                    pembelianBarangPanel.getNamaLokasiText().setEnabled(true);
                    pembelianBarangPanel.getPilihGudangButton().setEnabled(false);
                }
            }
        });
    }

    public void disable(PembelianBarangPanel pembelianBarangPanel) {
        pembelianBarangPanel.getPilihGudangButton().setEnabled(false);
        pembelianBarangPanel.getNamaLokasiText().setEnabled(false);
    }
}
