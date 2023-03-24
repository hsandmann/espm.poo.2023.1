package espm.aula03;

public class ContaPoupanca extends Conta {

    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            throw new RuntimeException("Tentativa de saque negativo: " + valor);
        } else if (valor == 0) {
            throw new RuntimeException("Tentativa de saque zero: " + valor);
        } else if (valor > this.getSaldo()) {
            throw new RuntimeException("Saldo da conta excedido: " + valor);
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    
}
