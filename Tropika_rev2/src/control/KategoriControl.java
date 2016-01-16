/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ItemModel;

/**
 *
 * @author akmal
 */
public class KategoriControl {

    private ItemModel itemModel = new ItemModel();

    public boolean populateTable(JTable table, String cari) {
        ArrayList<ItemModel> itemList = itemModel.selectItem();
        DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setRowCount(0);

        for (ItemModel item : itemList) {

            defaultTableModel.addRow(
                    new Object[]{
                        item.getKodeItem(),
                        item.getBarcode(),
                        item.getNamaItem(),
                        item.getSatuan(),
                        item.isDapatDibeli(),
                        item.isDapatDijual(),
                        item.isDapatDiproduksi(),
                        item.isDipakaiUntukProduksi(),
                        item.isDapatDibongkar(),
                        item.isStatusItem(),
                        item.getKeterangan()
                    }
            );
        }

        table.setModel(defaultTableModel);
        return defaultTableModel.getRowCount() != 0;
    }
}
