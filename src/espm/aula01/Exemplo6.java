package espm.aula01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exemplo6 {

    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        System.out.println(numeros);

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        System.out.println(lista);

        Set objs = new HashSet<>();
        objs.add("Humberto");
        objs.add(1);
        System.out.println(objs);

        List list = new ArrayList<>();
        list.add("Humberto");
        list.add(1);
        System.out.println(list);

    }
    
}
