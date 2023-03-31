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
 
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"id\": \"" + getId() + "\", ");
        sb.append("\"nome\": \"" + getNome() + "\", ");
        sb.append("\"cnpj\": \"" + getCnpj() + "\"");
        sb.append("}");
        return sb.toString();
    }

}
