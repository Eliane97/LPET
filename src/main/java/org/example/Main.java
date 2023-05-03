package org.example;

import org.example.DAO.ImplementacionUsuarioDAO;
import org.example.DAO.UsuarioDAO;
import org.example.model.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO daoImplementado = new ImplementacionUsuarioDAO();
        List<Usuario> guardadoListaUsuario = daoImplementado.mostrarUsuarios();

        for (int i = 0; i < guardadoListaUsuario.size(); i++) {
            System.out.println(guardadoListaUsuario.get(i));
        }
    }
}