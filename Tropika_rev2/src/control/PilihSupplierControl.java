/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.SupplierModel;
import view.PembelianBarangPanel;
import view.PilihItemDialog;
import view.PilihSupplierDialog;

/**
 *
 * @author hendar
 */
public class PilihSupplierControl {

//    PilihSupplierDialog pilihSupplierDialog = new PilihSupplierDialog(null, true);
    SupplierModel supplierModel = new SupplierModel();

    public void poputalteTable(PilihSupplierDialog pilihSupplierDialog) {
        String cariText = pilihSupplierDialog.getCariText().getText();
        ArrayList<SupplierModel> supplierList = supplierModel.select(cariText);
        DefaultTableModel defaultTableModel = (DefaultTableModel) pilihSupplierDialog.getSupplierTable().getModel();
        defaultTableModel.setRowCount(0);
        for (SupplierModel supplier : supplierList) {
            defaultTableModel.addRow(new Object[]{
                supplier.getKodeSupplier(),
                supplier.getNamaSupplier()
            });
        }
        pilihSupplierDialog.getSupplierTable().setModel(defaultTableModel);
    }

    public SupplierModel getDataSupplierDialog(PilihSupplierDialog suplierDialog) {
        int row = suplierDialog.getSupplierTable().getSelectedRow();
        String cari = suplierDialog.getSupplierTable().getValueAt(row, 0).toString();

        suplierDialog.dispose();

        return supplierModel.select(cari).get(0);
    }

}
