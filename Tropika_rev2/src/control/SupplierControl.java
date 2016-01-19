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

        if (supplierModel.insert()) {
            if (dataBankModel.insert()) {
                JOptionPane.showMessageDialog(supplierPanel, "Supplier berhasil ditambahkan !");
            } else {
                JOptionPane.showMessageDialog(supplierPanel, "Data Bank gagal disimpan !");
            }
        } else {
            JOptionPane.showMessageDialog(supplierPanel, "Gagal menyimpan Supplier !");
        }
    }

    public boolean validasi(SupplierPanel supplierPanel) {
        boolean toReturn = false;
        if (supplierPanel.getKodeSupplier().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        } else if (supplierPanel.getNamaSupplier().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        } else if (supplierPanel.getKategori().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        } else if (supplierPanel.getAlamat().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        } else if (supplierPanel.getKota().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        } else if (supplierPanel.getKodePos().getText().isEmpty()) {//
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        } else if (supplierPanel.getNamaSupplier().getText().isEmpty()) {
            JOptionPane.showMessageDialog(supplierPanel, "Kode supplier harus diisi");
        }
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
