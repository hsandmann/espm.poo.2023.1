package espm.aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class Cliente {

    private String id;
    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public Cliente() {

    }

    public Cliente(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
    }

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }

    public void addContas(Conta conta) {
        this.contas.add(conta);
    }
    
}
