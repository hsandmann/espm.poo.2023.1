package espm.aula03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<>();

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setId("123");
        pf1.setNome("Humberto");
        pf1.setCpf("123.123.123-12");

        PessoaFisica pf2 = new PessoaFisica("321", "Isabela", "534.654.345-23");

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setId("312");
        pj1.setNome("Pizza ESPM");
        pj1.setCnpj("12.123.123/0001-23");

        System.out.println(pf1.getNome());
        System.out.println(pj1.getNome());

        listaClientes.add(pf1);
        listaClientes.add(pj1);

        System.out.println(listaClientes); // So imprime a lista de clientes, com o tipo e endereco de memoria

        print(listaClientes);
    }

    public static void print(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            String str = cliente.getId() + " -> " + cliente.getNome() + " (";
            if (cliente instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) cliente;
                str += pf.getCpf();
            } else if (cliente instanceof PessoaJuridica pj) { // notação > Java 14
                str += pj.getCnpj();
            }
            str += ")";
            System.out.println(str);
        }
    }

}
