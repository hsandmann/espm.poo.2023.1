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

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setId("312");
        pj1.setNome("Pizza Planet");
        pj1.setCnpj("12.123.123/0001-23");

        listaClientes.add(pf1);
        listaClientes.add(pj1);

        System.out.println(listaClientes); // So imprime a lista de clientes, com o tipo e endereco de memoria

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.getId() + " -> " + cliente.getNome());
        }

    }
}
