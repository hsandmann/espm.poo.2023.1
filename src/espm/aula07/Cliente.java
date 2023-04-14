package espm.aula07;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 4100);
            Scanner scanner = new Scanner(System.in);

            BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String linha = "";
            do {
                System.out.print("> ");
                linha = scanner.nextLine();
                bos.write(linha + System.lineSeparator());
                bos.flush();
            } while (!"fim".equalsIgnoreCase(linha));
            bos.write("shutdown" + System.lineSeparator());
            bos.flush();

            bos.close();
            scanner.close();
            socket.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }

}
