package System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maneesha
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
    public static Statement getStatement(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mySql://localhost:3306/hospital","root","");
            Statement stat = con.createStatement();
            return stat;
            }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
    

    
    

