package espm.aula01;

public class Exemplo3 {

    public static void main(String[] args) {

        Sala sala = new Sala();
        sala.nome = "3semestre";

        Professor p1 = new Professor();
        p1.nome = "Humberto";
        p1.id = "4466";

        Professor p2 = new Professor();
        p2.nome = "Doisberto";
        p2.id = "4466";

        // a variavel p1 passa a apontar para p2
        p1 = p2;
        System.gc();

        sala.professor = p1;

        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }

        
    }
    
}
