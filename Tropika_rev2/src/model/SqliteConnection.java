package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author akmal
 */
public class SqliteConnection {

    Connection conn = null;

    public static Connection ConnectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:lib/database.db");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }


    private final String DB_NAME = "database.db";
    private final String URL = "jdbc:sqlite:lib/" + DB_NAME;
    private final String DRIVER = "org.sqlite.JDBC";

    private static SqliteConnection instance;

    public static SqliteConnection getInstance() {
        if (instance == null) {
            instance = new SqliteConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection con = null;
        try {

            Class.forName(DRIVER);
            try {
                con = DriverManager.getConnection(URL);
            } catch (SQLException ex) {
                Logger.getLogger(SqliteConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqliteConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }
}
