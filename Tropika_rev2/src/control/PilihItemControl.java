/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ItemModel;
import model.UserModel;
import view.PembelianBarangPanel;
import view.PilihItemDialog;

/**
 *
 * @author akmal
 */
public class PilihItemControl {

    private ItemModel itemModel = new ItemModel();

    public void populateTable(PilihItemDialog itemDialog) {
        ArrayList<ItemModel> itemList = itemModel.select("");
        DefaultTableModel defaultTableModel = (DefaultTableModel) itemDialog.getItemTable().getModel();
        defaultTableModel.setRowCount(0);
        for (ItemModel item : itemList) {
            defaultTableModel.addRow(new Object[]{
                item.getKodeItem(),
                item.getNamaItem()
            });
        }
        itemDialog.getItemTable().setModel(defaultTableModel);
    }

    public ItemModel getDataItemDialog(PilihItemDialog itemDialog) {
        int row = itemDialog.getItemTable().getSelectedRow();
        String cari = itemDialog.getItemTable().getValueAt(row, 0).toString();

//        loadItem(itemDialog);
        itemDialog.dispose();

        return itemModel.select(cari).get(0);

    }

//    public ItemModel loadItem(PilihItemDialog pilihItemDialog) {
////        ArrayList<ItemModel> itemList = itemModel.select(pilihItemDialog.getCariText().getText());
////        PembelianBarangPanel pembelianBarang = pilihItemDialog.getPembelianItemPanel();
////        for (ItemModel item : itemList) {
////           pembelianBarang.getKodeItem().setText(item.getKodeItem());
////           pembelianBarang.getNamaItem().setText(item.getNamaItem());
////        }
//        return itemModel.select(pilihItemDialog.getCariText().getText()).get(0);
//    }
}
