package org.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    // Conexion con mi base de datos en Postgres llamada lpet_bbdd
    String url = "jdbc:postgresql://localhost:5432/lpet_bbdd";
    private String usuario = "postgres";
    private String contrasena = "admin";

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
