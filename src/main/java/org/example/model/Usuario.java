package org.example.model;

public class Usuario {

    private int id_usuario;
    private String correo_electronico;
    private String contrasena;

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "ID USUARIO " + id_usuario +" CORREO ELECTRONICO: " + correo_electronico + " CONTRASEÑA " + contrasena;
    }
}
