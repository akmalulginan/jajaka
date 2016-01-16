/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JTable;
import model.KategoriModel;

/**
 *
 * @author akmal
 */
public class KategoriControl {
    public void Update_Table(JTable table) {
        String sql = "SELECT "
                + "kodeItem AS 'Kode Item', "
                + "barcode AS Barcode, "
                + "namaItem AS Nama, "
                + "satuan AS Satuan, "
                + "dapatDibeli AS 'Dapat Dibeli', "
                + "dapatDijual AS 'Dapat Dijual', "
                + "dapatDiproduksi AS 'Dapat Diproduksi', "
                + "dipakaiUntukProduksi AS 'Dipakai Untuk Produksi', "
                + "dapatDibongkar AS 'Dapat Dibongkar', "
                + "statusItem AS Status, "
//                + "gambar AS Gambar, "
                + "keterangan AS Keterangan "
                + "FROM item";
        new KategoriModel().Update_Table(sql, table);
    }
}
