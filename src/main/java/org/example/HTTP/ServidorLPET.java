package org.example.HTTP;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ServidorLPET {
    // Esta clase se encarga de crear un servidor http
   private HttpServer servidor;
   // Metodo para crear servidor
   public void crearServidorHTTP(){


       // la clase InetSocketAddress representa un par de direcciones IP y puerto. En este caso, el puerto es 8000. El 0 significa que el sistema operativo elegirá un puerto disponible.
       try {
           servidor = HttpServer.create( new InetSocketAddress(8000),0);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
      // Manejo de urls
       servidor.createContext("/usuarios", new ManejadorUsuarios());
       servidor.start();
   }

   // Metodo para parar el servidor
   public void pararServidor(){
       servidor.stop(1);
   }
}
