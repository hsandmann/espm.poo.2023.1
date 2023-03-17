package espm.aula03;

public final class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica() {

    }

    public PessoaFisica(String id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
}
