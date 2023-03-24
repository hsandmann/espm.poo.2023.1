package espm.aula03;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import java.util.Map.Entry;

public class Terminal {

    public static void main(String[] args) {
        
        Banco banco = new Banco("ESPM Inusitation Bank");
        Cliente atualCliente = null;

        System.out.println("Welcome to " + banco.getNome());

        Scanner s = new Scanner(System.in);
        boolean alive = true;
        do {
            try {

                String pre = "";
                if (atualCliente != null) {
                    pre += atualCliente.getNome();
                }

                System.out.print(pre + "> ");
                String l = s.nextLine().trim();
                alive = !"exit".equalsIgnoreCase(l);
                if (!alive) break;
                else if ("new customer".equalsIgnoreCase(l)) {
                    Cliente c = addCustomer();
                    banco.getClientes().put(c.getId(), c);
                } else if ("list customers".equalsIgnoreCase(l)) {
                    listCustomers(banco.getClientes());
                } else if ("use customer".equalsIgnoreCase(l)) {
                    System.out.print("Digite o id do cliente: ");
                    String idCliente = s.nextLine().trim();
                    if (banco.getClientes().containsKey(idCliente)) {
                        atualCliente = banco.getClientes().get(idCliente);
                    } else {
                        throw new RuntimeException("id do cliente inexistente: " + idCliente);
                    }
                }

            } catch(Exception e) {
                e.printStackTrace();
            }
        } while (alive);

        System.out.println("See you soon!");
    }

    private static Cliente addCustomer() {
        System.out.print("Novo Cliente [F/J]: ");
        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        Cliente cliente = null;
        switch (l.trim().toLowerCase()) {
            case "f":
                PessoaFisica pf = new PessoaFisica();
                System.out.print("CPF: ");
                String cpf = s.nextLine();
                pf.setCpf(cpf);
                cliente = pf;
                break;
            case "j":
                PessoaJuridica pj = new PessoaJuridica();
                System.out.print("CNPJ: ");
                String cnpj = s.nextLine();
                pj.setCnpj(cnpj);
                cliente = pj;
                break;
            default:
                throw new RuntimeException("Entrada de dado invalida: " + l);
        }
        System.out.print("Nome: ");
        String nome = s.nextLine();
        cliente.setNome(nome);
        cliente.setId(UUID.randomUUID().toString());
        return cliente;
    }
    
    private static void listCustomers(Map<String, Cliente> clientes) {
        clientes.forEach((id, cliente) -> {
            String str = id + " -> " + cliente.getNome() + " (";
            if (cliente instanceof PessoaFisica pf) {
                str += pf.getCpf();
            } else if (cliente instanceof PessoaJuridica pj) { // notação > Java 14
                str += pj.getCnpj();
            }
            str += ")";
            System.out.println(str);
        });
    }

}
