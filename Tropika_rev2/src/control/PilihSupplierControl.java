/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.SupplierModel;
import view.PilihSupplierDialog;

/**
 *
 * @author hendar
 */
public class PilihSupplierControl {

//    PilihSupplierDialog pilihSupplierDialog = new PilihSupplierDialog(null, true);
    SupplierModel supplierModel = new SupplierModel();
    
    public void poputalteTableItem(PilihSupplierDialog pilihSupplierDialog) {
        ArrayList<SupplierModel> supplierList = supplierModel.select();
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
}
