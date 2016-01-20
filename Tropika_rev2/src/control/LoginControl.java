/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import model.UserLoginModel;
import model.UserModel;
import view.Login;

/**
 *
 * @author akmal
 */
public class LoginControl {

    private UserModel userModel = new UserModel();
//    private UserLoginModel userLoginModel = new UserLoginModel();

    public void login(Login login) {
        setUser(login);
        userModel = userModel.select();
//        userLoginModel.setUsername(userModel.getUsername());
//        System.out.println(userLoginModel.getUsername());
    }

    public void setUser(Login login) {
        userModel.setUsername(login.getUsernameText().getText());
        userModel.setPassword(login.getPasswordText().getText());
        
    }

    public void hakAkses() {

    }
}
