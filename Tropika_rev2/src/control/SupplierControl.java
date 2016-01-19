/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.SupplierModel;
import view.SupplierPanel;

/**
 *
 * @author akmal
 */
public class SupplierControl {

    SupplierModel supplierModel = new SupplierModel();
 
    public void setSupplier(SupplierPanel supplierPanel){
        
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
        
        if (supplierModel.insert()) {
            JOptionPane.showMessageDialog(null, "Anggota berhasil ditambahkan !");
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan anggota !");
        }
    }
    public void clear(SupplierPanel supplierPanel){
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
