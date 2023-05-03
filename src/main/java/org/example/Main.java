package org.example;

import org.example.DAO.ImplementacionUsuarioDAO;
import org.example.DAO.UsuarioDAO;
import org.example.HTTP.ServidorLPET;

public class Main {
    public static void main(String[] args) {
        ServidorLPET servidor = new ServidorLPET();
        servidor.crearServidorHTTP();
    }
}