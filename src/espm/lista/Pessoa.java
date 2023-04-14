package espm.lista;

public class Pessoa {
    
    String cpf = "";
    String nome = "";

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Pessoa) && ((Pessoa) obj).cpf == cpf;
    }

    @Override
    public String toString() {
        return "[" + cpf + ": " + nome + "] ";
    }

}
