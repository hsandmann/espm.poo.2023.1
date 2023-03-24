package espm.aula03;

public class MainConta {

    public static void main(String[] args) {

        Conta c1 = new ContaCorrente();
        ((ContaComLimite) c1).setLimite(1000);

        c1.sacar(500);
        c1.depositar(1200);
        c1.sacar(3000);
        System.out.println(c1.getSaldo());

        Conta cp1 = new ContaPoupanca();
        cp1.depositar(100);
        cp1.sacar(20);
        System.out.println(cp1.getSaldo());
        
    }
    
}
