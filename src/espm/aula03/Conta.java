package espm.aula03;

public abstract class Conta {

    private String id;
    private String agencia;
    private String numero;

    private double saldo = 0;

    public String getId() {
        return id;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        if (valor < 0) {
            throw new RuntimeException("Tentativa de deposito negativo: " + valor);
        } else if (valor == 0) {
            throw new RuntimeException("Tentativa de deposito zerado: " + valor);
        } else {
            this.saldo += valor;
        }
    }
    
}
