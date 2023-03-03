package espm.aula02;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        HashMap<String, Cliente> clientePorId = new HashMap<>();
        HashMap<String, Cliente> clientePorCPF = new HashMap<>();
    
        boolean alive = true;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("> ");
            String linha = s.nextLine().trim();

            if (linha.equals("exit")) { 
                alive = false;
            } else if (linha.equals("add customer")) {
                Cliente c = addCliente(s);
                clientePorId.put(c.getId(), c);
                clientePorCPF.put(c.getCpf(), c);
            } else if (linha.equals("list customers")) {
                clientePorId.forEach((k, v) -> System.out.println(k + " -> " + v));
            } else if (linha.equals("find cpf")) {
                String cpf = s.next();
                if (clientePorCPF.containsKey(cpf)) {
                    System.out.print("CPF: ");
                    System.out.println(clientePorCPF.get(cpf));
                } else {
                    System.out.println("CPF não encontrado!");
                }                
            }
        } while (alive);
        System.out.println("bye, bye!");
            
    }

    private static Cliente addCliente(Scanner s) {
        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("CPF: ");
        String cpf = s.nextLine();
        return new Cliente(nome, cpf);
    }
    
}
