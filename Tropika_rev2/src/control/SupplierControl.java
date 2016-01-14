/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.SupplierModel;

/**
 *
 * @author akmal
 */
public class SupplierControl {

    public void setSupplier(
            String kodeSupplier,
            String namaSupplier,
            String kategoriSupplier,
            String alamat,
            String kota,
            String kodePos,
            String noTelp,
            String noFax,
            String email,
            String catatan,
            String contactPerson,
            String noTelpCs,
            String emailCs
    ) {
        SupplierModel sM = new SupplierModel();
        sM.setKodeSupplier(kodeSupplier);
        sM.setNamaSupplier(namaSupplier);
        sM.setKategoriSupplier(kategoriSupplier);
        sM.setAlamat(alamat);
        sM.setKota(kota);
        sM.setKodePos(kodePos);
        sM.setNoTelp(noTelp);
        sM.setNoFax(noFax);
        sM.setEmail(email);
        sM.setCatatan(catatan);
        sM.setContactPerson(contactPerson);
        sM.setNoTelpCs(noTelpCs);
        sM.setEmailCs(emailCs);
        
        sM.insert();
    }
}
