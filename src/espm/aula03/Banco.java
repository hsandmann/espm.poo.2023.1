package espm.aula03;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private String nome;
    private Map<String, Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }
    
}
