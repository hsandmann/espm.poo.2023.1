package espm.aula02;

public class Conta {
    
    private final String id;
    private double saldo = 0;

    public Conta(String id) {
        this.id = id;
        this.saldo = 0;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo - valor;
        }
    }

    public void sacar(String svalor) {
        double valor = Double.parseDouble(svalor);
        this.sacar(valor);
    }

    public void depositar(double valor) {
        if (valor > 0) this.saldo = this.saldo + valor;
    }

}
