package espm.aula03;

public final class PessoaJuridica extends Cliente {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return super.getNome() + " LTDA";
    }
    
}
