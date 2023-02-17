package espm.aula01;

import java.util.Scanner;

public class Exemplo7 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        boolean alive = true;
        Sala sala = new Sala();
        do {
            System.out.print("> ");
            String l = s.nextLine().trim();
            alive = !l.equalsIgnoreCase("exit");
            if (!alive) break;

            if (l.length() == 0) {

            } else if (l.equalsIgnoreCase("help")) {
                System.out.println("add student -> adiciona aluno");
                System.out.println("show -> mostra a sala");
            } else if (l.equalsIgnoreCase("add student")) {
                System.out.print("Digite o nome do aluno: ");
                String nome = s.nextLine().trim();
                Aluno aluno = new Aluno();
                aluno.nome = nome;
                sala.alunos.add(aluno);
            } else if (l.equalsIgnoreCase("show")) {
                System.out.println(sala);
            } else {
                System.err.println("Comando invalido");
            }

        } while (alive);
        System.out.println("bye bye");
    }
    
}
