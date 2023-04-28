package org.example;

import org.example.DAO.ImplementacionUsuarioDAO;
import org.example.model.Usuario;

import java.sql.*;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {

        ImplementacionUsuarioDAO daoImplementado = new ImplementacionUsuarioDAO();

        List<Usuario> guardadoListaUsuario = daoImplementado.mostrarUsuarios();

        for (int i = 0; i < guardadoListaUsuario.size(); i++) {
            System.out.println(guardadoListaUsuario.get(i));
        }


    }
}