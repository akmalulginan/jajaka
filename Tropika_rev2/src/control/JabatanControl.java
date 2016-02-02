/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.JabatanModel;
import view.JabatanDialog;

/**
 *
 * @author hendar
 */
public class JabatanControl {

    JabatanModel jabatanModel = new JabatanModel();

    public void simpanJabatan(JabatanDialog jabatanDialog) {
        setJabatan(jabatanDialog);
        jabatanModel.insert();
    }

    public void setJabatan(JabatanDialog jabatanDialog) {
        jabatanModel.setKodeJabatan(jabatanDialog.getKodeJabatanText().getText());
        jabatanModel.setNamaJabatan(jabatanDialog.getNamaJabatanText().getText());
    }

}
