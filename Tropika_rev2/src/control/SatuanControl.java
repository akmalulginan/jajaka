/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.SatuanModel;

/**
 *
 * @author akmal
 */
public class SatuanControl {
    public void set(String kodeSatuan, String namaSatuan){
        SatuanModel sM = new SatuanModel(kodeSatuan, namaSatuan);
//        System.out.println(kodeSatuan);
//        System.out.println(namaSatuan);
//        System.out.println(sM.getKodeSatuan());
//        System.out.println(sM.getNamaSatuan());
        sM.insert();
    }
}
