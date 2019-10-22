/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;

/**
 *
 * @author Nguyen Van Dien
 */
public class ListConfig implements Serializable{
    String hos,user,pass;
    public ListConfig(){}

    public ListConfig(String hos, String user, String pass) {
        this.hos = hos;
        this.user = user;
        this.pass = pass;
    }

    public String getHos() {
        return hos;
    }

    public void setHos(String hos) {
        this.hos = hos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
