/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JLabel;
import javax.swing.JTable;
import model.TransaksiGudangModel;

/**
 *
 * @author akmal
 */
public class TransaksiGudangControl {

    public void update_table(String jenis, JTable table) {
        String sql = "SELECT "
                + "kodeGudang AS 'Kode Gudang', "
                + "alamat AS 'Alamat', "
                + "kota AS 'Kota', "
                + "noTelp AS 'Telp', "
                + "email AS 'Email', "
                + "contactPerson AS 'CS' "
                + "FROM gudang";
        if (jenis.equals("barang")) {
            sql = "SELECT "
                    + "kodeBarang AS 'Kode Item', "
                    + "namaBarang AS Nama, "
                    + "gambar AS Gambar "
                    + "FROM barang";
        }

        new TransaksiGudangModel().select(sql, table);

    }

    public void getImage(String kode, JLabel gambarLabel) {
        new TransaksiGudangModel().getImage(kode, gambarLabel);
    }
}
