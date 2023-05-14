package espm.aula07;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        try {
            final int portNumber = 4100;
            System.out.println("Subindo o servidor");
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Servindo on port: " + portNumber);

            Socket cliente = server.accept();
            System.out.println("Cliente IP " + cliente.getInetAddress().getHostAddress() + ":" + cliente.getPort());
            BufferedReader bis = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            String entrada = "";
            do {
                entrada = new String(bis.readLine());
                System.out.println(entrada);
            } while (!"shutdown".equals(entrada));
            bis.close();
            server.close();
            System.out.println("Terminou o Servidor");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
