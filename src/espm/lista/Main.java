package espm.lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.cpf = "123.123";
        p1.nome = "1berto";

        Pessoa p2 = new Pessoa();
        p2.cpf = "123.123";
        p2.nome = "1berto";

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);

        pessoas.forEach(p -> System.out.print(p));

        Pessoa apagar = new Pessoa();
        apagar.cpf = "123.123";
        
        pessoas.remove(apagar);
        System.out.println();
        pessoas.forEach(p -> System.out.print(p));

    }

}
