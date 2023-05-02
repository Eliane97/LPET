package org.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Conexion con mi base de datos en Postgres llamada lpet_bbdd
    private final String URL_BBDD = "jdbc:postgresql://localhost:5432/lpet_bbdd";
    private final String USUARIO_POSTGRES = "postgres";
    private final String CLAVE_POSTGRES = "admin";

    protected Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection(URL_BBDD, USUARIO_POSTGRES, CLAVE_POSTGRES);
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
