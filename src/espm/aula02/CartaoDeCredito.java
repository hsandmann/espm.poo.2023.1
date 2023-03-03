package espm.aula02;

import java.util.UUID;

public class CartaoDeCredito {
    
    private final String id;
    private double saldo;

    public CartaoDeCredito() {
        // gera um identificar único
        this.id = UUID.randomUUID().toString();
    }

    public CartaoDeCredito(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

}
