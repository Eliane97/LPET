package org.example.HTTP;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.example.DAO.ImplementacionUsuarioDAO;
import org.example.DAO.UsuarioDAO;

import java.io.IOException;
import java.io.OutputStream;

public class ManejadorUsuarios implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) {
        // Extraigo la informacion si es un get o post o etc de la peticion
        String peticion = exchange.getRequestMethod();
        switch (peticion.toLowerCase()) {// toLowerCase: pasa a minuscula los datos
            case "get" -> manejadorPeticionGET(exchange);//obtener
            case "post" -> manejadorPeticionPOST(exchange);//establecer
            case "put" -> manejadorPeticionPUT(exchange);//modificar
            case "delete" -> manejadorPeticionDELETE(exchange);//eliminar
            default -> manejadorError(exchange);
        }
    }

    public void manejadorPeticionGET(HttpExchange exchange) {
        UsuarioDAO usuarioDAO = new ImplementacionUsuarioDAO();
        String respuesta = usuarioDAO.mostrarUsuarios().toString();

        try {
            exchange.sendResponseHeaders(200, respuesta.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(respuesta.getBytes());
            os.close();
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
