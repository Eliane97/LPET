package org.example;

import org.example.DAO.ImplementacionUsuarioDAO;
import org.example.HTTP.ServidorLPET;
import org.example.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServidorLPET servidor = new ServidorLPET();
        servidor.crearServidorHTTP();
    }
}