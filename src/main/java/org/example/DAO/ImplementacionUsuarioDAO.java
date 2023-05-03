package org.example.DAO;

import org.example.model.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionUsuarioDAO extends Conexion implements UsuarioDAO {

    @Override
    public List<Usuario> mostrarUsuarios() {
        List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
        try {
            conectar();
            Statement consulta = conexion.createStatement();
            ResultSet respuesta = consulta.executeQuery("select * from usuarios");

            while (respuesta.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(respuesta.getInt("id_usuario"));
                usuario.setCorreo_electronico(respuesta.getString("correo_electronico"));
                usuario.setContrasena(respuesta.getString("contrasena"));
                listaDeUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaDeUsuarios;
    }
}
