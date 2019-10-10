/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class connectionDB {
      public static Connection ketnoi(){
        Connection cn=null;
        String userName="sa";
        String passWord="123";
        String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection(url, userName, passWord);           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
}