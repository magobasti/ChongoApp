package com.example.chongoapp.ui.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {

    public void conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banca1","root","Latano123");
            System.out.println("Si se conecto ");
        }
        catch(SQLException se){
            System.out.println("oops! No se puede conectar. Error: " + se.toString());
        }
        catch(ClassNotFoundException e) {
            System.out.println("oops! No se encuentra la clase. Error: " + e.getMessage());
        }
    }
}
