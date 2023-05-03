package org.example.HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.example.DAO.ImplementacionUsuarioDAO;
import org.example.DAO.UsuarioDAO;
import org.example.model.Usuario;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;

public class ManejadorUsuarios implements HttpHandler {
    String respuesta;

    @Override
    public void handle(HttpExchange exchange) {
        // Extraigo la informacion si es un get o post o etc de la peticion
        String peticion = exchange.getRequestMethod();
        switch (peticion.toLowerCase()) {// toLowerCase: pasa a minuscula los datos
            case "get":
                manejadorPeticionGET(exchange);//obtener
                break;
            case "post":
                manejadorPeticionPOST(exchange);//establecer
                break;
            case "put":
                manejadorPeticionPUT(exchange);//modificar
                break;
            case "delete":
                manejadorPeticionDELETE(exchange);//eliminar
                break;
            default:
                manejadorError(exchange);
        }
    }

    public void manejadorPeticionGET(HttpExchange exchange) {
        UsuarioDAO usuarioDAO = new ImplementacionUsuarioDAO();
        respuesta = usuarioDAO.mostrarUsuarios().toString();

        try {
            exchange.sendResponseHeaders(200, respuesta.length());
            OutputStream os = exchange.getResponseBody();
            os.write(respuesta.getBytes());
            exchange.setAttribute("body",os);
            os.close();
            exchange.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void manejadorError(HttpExchange exchange) {
    }

    private void manejadorPeticionDELETE(HttpExchange exchange) {
    }

    private void manejadorPeticionPUT(HttpExchange exchange) {
    }

    private void manejadorPeticionPOST(HttpExchange exchange) {
    }


}
