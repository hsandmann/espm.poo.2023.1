package espm.aula01;

public class Exemplo1 {

    public static void main(String[] args) {
        System.out.println("Hello ESPM");

        String x = "Bom dia";
        String y = "Bom ";
        y = y + "dia";

        if (x.equals(y)) {
            System.out.println(x + " == " + y);
        } else {
            System.out.println(x + " != " + y);
        }

    }

}