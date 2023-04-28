package org.example.DAO;

import org.example.model.Usuario;

import java.util.List;

public interface UsuarioDAO {


    /* public void eliminar();
     public  void modificar();
     public void registrarUsuario();
     */
    public List<Usuario> mostrarUsuarios();
}
