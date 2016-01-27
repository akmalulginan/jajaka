/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.GudangModel;
import model.ItemModel;
import view.KategoriPanel;
import view.LaporanGudangPanel;

/**
 *
 * @author akmal
 */
public class LaporanGudangControl {
    
    private GudangModel gudangModel = new GudangModel();
    
    public boolean populateTable(JTable table, String cari) {
        ArrayList<GudangModel> gudangList = gudangModel.select(cari);
        DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setRowCount(0);

        for (GudangModel gudang : gudangList) {
            String sifat = "";
            if (gudang.getPenyimpanan() && gudang.getProduksi()) {
                sifat = "Penyimpanan, Produksi";
            } else if (gudang.getPenyimpanan()) {
                sifat = "Penyimpanan";
            } else if (gudang.getProduksi()) {
                sifat = "Produksi";
            }
            defaultTableModel.addRow(
                    new Object[]{
                        gudang.getKodeGudang(), 
                        gudang.getKategoriGudang(), 
                        gudang.getAlamat(), 
                        gudang.getKota(),
                        gudang.getKodePos(), 
                        gudang.getNoTelp(), 
                        gudang.getNoFax(), 
                        gudang.getEmail(), 
                        gudang.getCatatan(), 
                        sifat
                    }
            );
        }

        table.setModel(defaultTableModel);
        return defaultTableModel.getRowCount() != 0;
    }

    public void refresh(LaporanGudangPanel laporanGudangPanel) {
        laporanGudangPanel.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) {
                populateTable(laporanGudangPanel.getGudangTable(), "");
            }

            public void componentHidden(ComponentEvent e) {
                System.out.println("Component hidden");
            }
        });
    }
    
    public void clear(LaporanGudangPanel laporanGudangPanel){
        laporanGudangPanel.getCariText().setText("");
    }
    
    public void cari(LaporanGudangPanel laporanGudangPanel){
        if (populateTable(laporanGudangPanel.getGudangTable(), laporanGudangPanel.getCariText().getText())) {
            JOptionPane.showMessageDialog(laporanGudangPanel, "ditemukan "+laporanGudangPanel.getGudangTable().getRowCount()+" gudang");
            clear(laporanGudangPanel);
        } else {
            JOptionPane.showMessageDialog(laporanGudangPanel, "gudang tidak ditemukan");
            clear(laporanGudangPanel);
        }
    }
}
