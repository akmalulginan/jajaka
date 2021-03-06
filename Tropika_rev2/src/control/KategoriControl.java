/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ItemModel;
import view.KategoriPanel;

/**
 *
 * @author akmal
 */
public class KategoriControl {

    private ItemModel itemModel = new ItemModel();

    public boolean populateTable(JTable table, String cari) {
        ArrayList<ItemModel> itemList = itemModel.select(cari);
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

    public void refresh(KategoriPanel kategoriPanel) {
        kategoriPanel.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) {
                populateTable(kategoriPanel.getDataTable(), "");
            }

            public void componentHidden(ComponentEvent e) {
                System.out.println("Component hidden");
            }
        });
    }
}
