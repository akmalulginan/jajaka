/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author akmal
 */
public class KategoriModel extends Model {

    public void Update_Table(String sql, JTable table) {
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
}
