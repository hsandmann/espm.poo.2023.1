package espm.aula07;

public class Main {
    
    public static void main(String[] args) {

        try {
            // tenta esse bloco de codigo, se houver erro, então, para o bloco
            // e desvia para o catch (captura)
            System.out.println("comecou");

            int x = 200;
            int y = 0;

            float r = x/y;
            System.out.println("r: " + r);

            System.out.println("chegou");

        } catch(ArithmeticException e) {
            System.out.println("deu erro: " + e.getMessage());
        } finally {
            System.out.println("tenta novamente");
        }
        System.out.println("terminou");
    }

}
