/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class DataBankModel extends Model {

    private String noRekening;
    private String atasNama;
    private String namaBank;
    private String idPemilik;

    public String getIdPemilik() {
        return idPemilik;
    }

    public void setIdPemilik(String idPemilik) {
        this.idPemilik = idPemilik;
    }

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

    public boolean insert() {
        try {
            String sql = "INSERT INTO dataBank (noRekening, atasNama, namaBank, idPemilik) VALUES (?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, noRekening);
            pst.setString(2, atasNama);
            pst.setString(3, namaBank);
            pst.setString(4, idPemilik);

            pst.execute();

            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean update() {
        Boolean toReturn = false;

        try {
            String query = "UPDATE databank "
                    + "SET "
                    + "noRekening = ? "
                    + "atasNama = ? "
                    + "namaBank = ? "
                    + "idPemilik = ?";

            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, noRekening);
                pst.setString(2, atasNama);
                pst.setString(3, namaBank);
                pst.setString(4, idPemilik);

                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return toReturn;
    }

    public boolean delete() {
        Boolean toReturn = false;

        try {
            String query = "DELETE FROM databank WHERE noRekening = ?";
            if (conn != null) {
                pst = conn.prepareStatement(query);
                pst.setString(1, noRekening);
                pst.execute();
                conn.close();
                toReturn = true;
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }

        return toReturn;
    }

    public ArrayList<DataBankModel> select() {
        ArrayList<DataBankModel> List = new ArrayList<>();
        try {
            pst = conn.prepareStatement("SELECT * FROM databank");
            rs = pst.executeQuery();
            while (rs.next()) {
                this.setNoRekening(rs.getString("noRekening"));
                this.setAtasNama(rs.getString("atasNama"));
                this.setNamaBank(rs.getString("namaBank"));
                this.setIdPemilik(rs.getString("idPemilik"));
                List.add(this);
            }
            return List;
        } catch (Exception e) {
            System.out.println("e : " + e);
            return null;
        }
    }

    public static void main(String[] args) {
        new DataBankModel().select();
    }
}
