/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.DataBankModel;

/**
 *
 * @author akmal
 */
public class DataBankControl {
    public void setDataBank(String noRekening, String atasNama, String namaBank) {
        DataBankModel dB = new DataBankModel();
        dB.setNoRekening(noRekening);
        dB.setAtasNama(atasNama);
        dB.setNamaBank(namaBank);
        
        dB.insertDataBank();
    }
}
