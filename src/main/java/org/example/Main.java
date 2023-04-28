package org.example;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Conexion con mi base de datos en Postgres llamada lpet_bbdd
        String url="jdbc:postgresql://localhost:5432/lpet_bbdd";
        Properties prop= new Properties();
        prop.setProperty("user","postgres");
        prop.setProperty("password","admin");

        Connection conexion= DriverManager.getConnection(url,prop);

        Statement consulta= conexion.createStatement();
        ResultSet respuesta= consulta.executeQuery("select * from Usuarios");

     while (respuesta.next()){
         Integer id= respuesta.getInt("id_usuario");
         String e_mail = respuesta.getString("correo_electronico");
         String contrasena = respuesta.getString("contrasena");
         System.out.println("ID: " + id + " Email: " + e_mail + " Contraseña:" + contrasena);
     }
     conexion.close();





    }
}