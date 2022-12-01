package com.example.chongoapp.ui.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {

    public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://night-life1.cunfqbeskhwn.us-east-1.rds.amazonaws.com:3306/CHONGOAPP","admin","Latano123");
            System.out.println("Si se conecto ");
        }
        catch(SQLException se){
            System.out.println("oops! No se puede conectar. Error: " + se.toString());
        }
        catch(ClassNotFoundException e){
            System.out.println("oops! No se encuentra la clase. Error: " + e.getMessage());
        }
    }
}
