package espm.aula01;

public class Exemplo4 {

    public static void main(String[] args) {

        Professor p1 = new Professor();
        p1.nome = "Humberto";
        p1.id = "4466";

        Professor p2 = new Professor();
        p2.nome = "Doisberto";
        p2.id = "4466";

        Professor p3 = null;

        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }

        
    }
    
}
