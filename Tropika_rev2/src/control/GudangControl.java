/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.GudangModel;

/**
 *
 * @author akmal
 */
public class GudangControl {

    public void setGudang(
            String kodeGudang,
            String alamat,
            String kota,
            String kodePos,
            String noTelp,
            String noFax,
            String email, 
            String catatan, 
            String contactPerson, 
            Boolean penyimpanan, 
            Boolean produksi
    ) {
        GudangModel gM = new GudangModel();
        gM.setKodeGudang(kodeGudang);
        gM.setAlamat(alamat);
        gM.setKota(kota);
        gM.setKodePos(kodePos);
        gM.setNoTelp(noTelp);
        gM.setNoFax(noFax);
        gM.setEmail(email);
        gM.setCatatan(catatan);
        gM.setContactPerson(contactPerson);
        gM.setPenyimpanan(penyimpanan);
        gM.setProduksi(produksi);
        
        gM.insert();
    }
}
