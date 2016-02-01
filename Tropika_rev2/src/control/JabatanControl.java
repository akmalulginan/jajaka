/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JComboBox;
import model.JabatanModel;

/**
 *
 * @author hendar
 */

public class JabatanControl {
    
    
    JabatanModel jabatanModel;
    
    public void setJabatan(String kodeJabatan, String namaJabatan){
        JabatanModel sM = new JabatanModel(kodeJabatan, namaJabatan);
        sM.insertJabatan();
    }

}
