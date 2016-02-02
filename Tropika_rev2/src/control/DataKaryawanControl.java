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
import model.KaryawanModel;
import view.DataKaryawanPanel;

/**
 *
 * @author akmal
 */
public class DataKaryawanControl {

//    Mengambil data darin karyawan model
    private KaryawanModel karyawanModel = new KaryawanModel();

    public boolean populateTable(JTable table, String cari) {
        ArrayList<KaryawanModel> karyawanList = karyawanModel.select(cari);
        DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setRowCount(0);

        for (KaryawanModel karyawan : karyawanList) {
             
            defaultTableModel.addRow(
                    new Object[]{
                        karyawan.getKodeKaryawan(),
                        karyawan.getNamaLengkap(),
                        karyawan.getNamaPanggilan(),
                        karyawan.getJenisKelamin(),
                        karyawan.getTanggalMasuk(),
                        karyawan.getTempatLahir() + ", " + karyawan.getTanggalLahir(),
                        karyawan.getAlamat(),
                        karyawan.getKota(),
                        karyawan.getKodePos(),
                        karyawan.getNoHp(),
                        karyawan.getEmail(),
                        karyawan.getCatatan(),
                        karyawan.getStatus()
                    }
            );
        }

        table.setModel(defaultTableModel);
        return defaultTableModel.getRowCount() != 0;
    }

    public void refresh(DataKaryawanPanel karyawanPanel) {
        karyawanPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                populateTable(karyawanPanel.getKaryawanTable(), "");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Component hidden");
            }
        });
    }

}
