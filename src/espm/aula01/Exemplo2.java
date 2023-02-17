package espm.aula01;

public class Exemplo2 {

    public static void main(String[] args) {
        System.out.println("Hello ESPM");

        String x = "Bom dia";
        String y = "Bom ";
        y = y + "dia";

        // ternario
        System.out.println(x + (x.equals(y) ? " == " : "!=") + y);

    }

}