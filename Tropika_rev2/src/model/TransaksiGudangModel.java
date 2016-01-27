/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author akmal
 */
public class TransaksiGudangModel extends Model {
    private int kodePenyimpanan;
    private ItemModel item;
    private GudangModel gudang;
    
    
//    Date waktu

    public void select(String sql, JTable table) {
        try {
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getImage(String kode, JLabel gambarLabel) {
        String sql = "SELECT gambar FROM item WHERE kodeItem=?";

        try {
//            conn = DbConnect.ConnectDb();
            pst = conn.prepareStatement(sql);
            pst.setString(1, kode);
            rs = pst.executeQuery();
            while (rs.next()) {
                byte[] photo = rs.getBytes("gambar");
                ImageIcon poto = new ImageIcon(photo);
                Image img = poto.getImage().getScaledInstance(gambarLabel.getWidth(), (gambarLabel.getWidth() * poto.getIconHeight()) / poto.getIconWidth(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon i = new ImageIcon(img);
                gambarLabel.setIcon(i);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
