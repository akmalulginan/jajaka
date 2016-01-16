/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class DataBankModel extends Model {

    String noRekening;
    String atasNama;
    String namaBank;

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getAtasNama() {
        return atasNama;
    }

    public void setAtasNama(String atasNama) {
        this.atasNama = atasNama;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public void insertDataBank() {
        try {
            String sql = "INSERT INTO dataBank (noRekening, atasNama, namaBank) VALUES (?,?,?)";
//            conn = SqliteConnect.ConnectDb();
//            conn = DbConnect.ConnectDb();
            pst = conn.prepareStatement(sql);
            pst.setString(1, noRekening);
            pst.setString(2, atasNama);
            pst.setString(3, namaBank);

            pst.execute();

            JOptionPane.showMessageDialog(null, "SUKSES");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean updateDataBank() {
        Boolean toReturn = false;

        try {
            String query = "UPDATE databank "
                    + "SET "
                    + "noRekening = ? "
                    + "atasNama = ? "
                    + "namaBank = ? ";

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, noRekening);
                pst.setString(2, atasNama);
                pst.setString(3, namaBank);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public boolean deleteDataBank() {
        Boolean toReturn = false;
        
        try{
            String query = "DELETE";
        }catch(Exception e){
            
        }
        
        return toReturn;
    }
}
