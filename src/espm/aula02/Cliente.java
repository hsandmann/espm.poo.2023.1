package espm.aula02;

import java.util.UUID;

public class Cliente {
    
    private String id;
    private String nome;
    private String cpf;
    private CartaoDeCredito cartaoDeCredito = null;

    public Cliente(String nome, String cpf) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String retornarDados() {
        return "#cartao: " + cartaoDeCredito.getId() + " saldo: " + cartaoDeCredito.getSaldo();
    }

    @Override
    public String toString() {
        return
            "{'cpf': '" + cpf + "', " +
            "'nome': '" + nome + "'}";
    }

}
