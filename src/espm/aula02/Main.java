package espm.aula02;

public class Main {

    public static void main(String[] args) {

        Monitoramento monitoramento = new Monitoramento();

        Conta c1 = new Conta("PF004");

        c1.sacar(1000);
        c1.depositar(0);
        c1.sacar("20");

        System.out.println(c1.getSaldo());

        monitoramento.cobraJurosMensal(c1);

        System.out.println(c1.getSaldo());
        
    }
}
