package espm.aula09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {

    public interface Processamento {

        public double sum(double a, double b);

    }

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Guilherme");
        nomes.add("Caue");
        nomes.add("Rafael");
        nomes.add("Caue");

        nomes
            .stream()
            .distinct()
            .forEach(n -> System.out.println(n));

        List<String> notas = new ArrayList<>(Arrays.asList(new String[] {
            "1.", "5.", "3.", "7."
        }));
        
        // Converte os string para double
        notas.stream()
            .map(item -> "value: " + String.valueOf(item))
            .forEach(x -> System.out.println(x));

        // soma os doubles 
        System.out.println("soma: " +
            notas.stream()
                .mapToDouble(s -> Double.parseDouble(s))
                .sum()
        );

        System.out.println("média: " +
            Arrays.asList(new String[] {}).stream()
                .mapToDouble(Double::parseDouble)
                .average()
                .orElse(0)
        );
    }

    // public static double proc(Processamento p) {
    //     return p.sum(a, b);
    // }

}
