/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hieu
 */
public class TestJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-05-many-to-many?useSSL=false";
        String userName = "hbstudent";
        String pass = "hbstudent";
        
        try{
            System.out.println("Connecting to database...");
            Connection cnn = DriverManager.getConnection(jdbcUrl, userName, pass);
            System.out.println("Connect Successfully!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
