/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author akmal
 */
public class Model {

    public Connection conn = DbConnect.ConnectDb();
    public Statement st;
    public PreparedStatement pst;
    public ResultSet rs;

//    public void insert(){}
}
