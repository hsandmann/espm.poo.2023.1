package espm.aula03;

public class ContaCorrente extends Conta implements ContaComLimite {

    private double limite;

    @Override
    public double getLimite() {
        return limite;
    }

    @Override
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            throw new RuntimeException("Tentativa de saque negativo: " + valor);
        } else if (valor == 0) {
            throw new RuntimeException("Tentativa de saque zero: " + valor);
        } else if (valor > this.getSaldo() + this.getLimite()) {
            throw new RuntimeException("Limite da conta excedido: " + valor);
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    
}
