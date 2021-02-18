/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet.jdbc;

/**
 *
 * @author aakashthakur-work
 */ 

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
public class JDBCConnection { 
  
    private static Connection con = null; 
  
    static
    { 
        String url = "jdbc:mysql://localhost:3306/SRM?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false"; 
        String user = "root"; 
        String pass = "idrunkh2o"; 
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(url, user, pass); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            System.out.println("Exception Found!" + e.toString());
        } 
    } 
    public static Connection getConnection() 
    { 
        return con; 
    } 
} 
