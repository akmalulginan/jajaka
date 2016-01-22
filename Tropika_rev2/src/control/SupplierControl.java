/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.DataBankModel;
import model.SupplierModel;
import view.SupplierPanel;

/**
 *
 * @author akmal
 */
public class SupplierControl {

    private SupplierModel supplierModel = new SupplierModel();
    private DataBankModel dataBankModel = new DataBankModel();

    public void setSupplier(SupplierPanel supplierPanel) {

        supplierModel.setKodeSupplier(supplierPanel.getKodeSupplier().getText());
        supplierModel.setNamaSupplier(supplierPanel.getNamaSupplier().getText());
        supplierModel.setKategoriSupplier(supplierPanel.getKategori().getText());
        supplierModel.setAlamat(supplierPanel.getAlamat().getText());
        supplierModel.setKota(supplierPanel.getKota().getText());
        supplierModel.setKodePos(supplierPanel.getKodePos().getText());
        supplierModel.setNoTelp(supplierPanel.getNoTelp().getText());
        supplierModel.setNoFax(supplierPanel.getNoFax().getText());
        supplierModel.setEmail(supplierPanel.getEmail().getText());
        supplierModel.setCatatan(supplierPanel.getCatatan().getText());
        supplierModel.setContactPerson(supplierPanel.getContactPerson().getText());
        supplierModel.setNoTelpCs(supplierPanel.getNoTelpCs().getText());
        supplierModel.setEmailCs(supplierPanel.getEmailCs().getText());
    }

    public void setDataBank(SupplierPanel supplierPanel) {

        dataBankModel.setNoRekening(supplierPanel.getNoRek().getText());
        dataBankModel.setAtasNama(supplierPanel.getAtasNama().getText());
        dataBankModel.setNamaBank(supplierPanel.getNamaBank().getText());
        dataBankModel.setIdPemilik(supplierPanel.getKodeSupplier().getText());

    }

    public void simpanSupplier(SupplierPanel supplierPanel) {

        setSupplier(supplierPanel);
        setDataBank(supplierPanel);

        if (validasi(supplierPanel)) {
            if (supplierModel.insert()) {
                if (dataBankModel.insert()) {
                    JOptionPane.showMessageDialog(supplierPanel, "Supplier berhasil ditambahkan !");
                    clear(supplierPanel);
                } else {
                    JOptionPane.showMessageDialog(supplierPanel, "Data Bank gagal disimpan !");
                }
            } else {
                JOptionPane.showMessageDialog(supplierPanel, "Gagal menyimpan Supplier !");
            }
        }
    }

    public boolean validasi(SupplierPanel supplierPanel) {
        boolean toReturn = false;
        if (supplierPanel.getKodeSupplier().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
            supplierPanel.getKodeSupplier().requestFocus();
            
        } else if (supplierPanel.getNamaSupplier().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Nama supplier harus diisi");
            supplierPanel.getNamaSupplier().requestFocus();
            
        } else if (supplierPanel.getKategori().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kategori supplier harus diisi");
            supplierPanel.getKategori().requestFocus();
            
        } else if (supplierPanel.getAlamat().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Alamat supplier harus diisi");
            supplierPanel.getAlamat().requestFocus();
        } else if (supplierPanel.getKota().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kota supplier harus diisi");
            supplierPanel.getKota().requestFocus();
        } else if (supplierPanel.getKodePos().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode pos supplier harus diisi");
            supplierPanel.getKodePos().requestFocus();
        } else if (supplierPanel.getNoTelp().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "No Telp supplier harus diisi");
            supplierPanel.getNoTelp().requestFocus();
        } else if (supplierPanel.getNoFax().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "No Fax supplier harus diisi");
            supplierPanel.getNoFax().requestFocus();
        } else if (supplierPanel.getEmail().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Email supplier harus diisi");
            supplierPanel.getEmail().requestFocus();
        } else if (supplierPanel.getCatatan().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Catatan supplier harus diisi");
            supplierPanel.getCatatan().requestFocus();
        } else if (supplierPanel.getNamaBank().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Nama bank supplier harus diisi");
            supplierPanel.getNamaBank().requestFocus();
        } else if (supplierPanel.getNoRek().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "No rekening supplier harus diisi");
            supplierPanel.getNoRek().requestFocus();
        } else if (supplierPanel.getAtasNama().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Atas nama rekening supplier harus diisi");
            supplierPanel.getAtasNama().requestFocus();
        } else if (supplierPanel.getContactPerson().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Contact Person supplier harus diisi");
            supplierPanel.getContactPerson().requestFocus();
        } else if (supplierPanel.getNoTelpCs().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "No Telp Contact Person supplier harus diisi");
            supplierPanel.getNoTelpCs().requestFocus();
        } else if (supplierPanel.getEmailCs().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Email Contact Person supplier harus diisi");
            supplierPanel.getEmailCs().requestFocus();
        } else {
            toReturn = true;
        }

        return toReturn;
    }

    public void clear(SupplierPanel supplierPanel) {
        supplierPanel.getKodeSupplier().setText("");
        supplierPanel.getNamaSupplier().setText("");
        supplierPanel.getKategori().setText("");
        supplierPanel.getAlamat().setText("");
        supplierPanel.getKota().setText("");
        supplierPanel.getKodePos().setText("");
        supplierPanel.getNoTelp().setText("");
        supplierPanel.getNoFax().setText("");
        supplierPanel.getEmail().setText("");
        supplierPanel.getCatatan().setText("");
        supplierPanel.getContactPerson().setText("");
        supplierPanel.getNoTelpCs().setText("");
        supplierPanel.getEmailCs().setText("");
        supplierPanel.getNoRek().setText("");
        supplierPanel.getAtasNama().setText("");
        supplierPanel.getNamaBank().setText("");
    }

}
