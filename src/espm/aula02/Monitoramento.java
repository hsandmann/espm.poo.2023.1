package espm.aula02;

public class Monitoramento {

    private static double jurosDiario = 0.00378476705;

    public void cobraJurosDiario(Conta c) {
        if (c.getSaldo() < 0) {
            double juros = c.getSaldo() * jurosDiario;
            c.sacar(-juros);
        }
    }

    public void cobraJurosMensal(Conta c) {
        if (c.getSaldo() < 0) {
            double juros = c.getSaldo() * (Math.pow(1 + jurosDiario, 30) - 1);
            c.sacar(-juros);
        }
    }

}
