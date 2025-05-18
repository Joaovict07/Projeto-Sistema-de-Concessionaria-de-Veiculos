package Funcoes;

import Cliente.*;

import java.util.Scanner;

public class EditarClientes {
    public EditarClientes(PF pf, PJ pj) {
        Scanner scanner = new Scanner(System.in);
        if (pj.getListaCNPJ().size() == 0 && pf.getlistacpf().size() == 0) {
            System.out.println("Nenhum cliente cadastrado");
        } else {
            System.out.println("Deseja editar um cliente PJ ou PF?");
            String opcao = scanner.nextLine();

            if (opcao.toUpperCase().equals("PF")) {
                if (pf.getlistacpf().size() != 0) {
                    System.out.println("Lista de Clientes PF: ");
                    for (int i = 0; i < pf.getlistacpf().size(); i++) {
                        System.out.println("ID: " + i + ", Nome: " + pf.getListaNome().get(i) + ", Contato: " + pf.getListaContato().get(i) + ", CPF: " +
                                pf.getlistacpf().get(i) + ", Idade: " + pf.getlistaidade().get(i) + ", Endereço: " + pf.getEndereco().get(i));
                    }
                    System.out.println("Digite o ID do cliente que deseja editar: ");
                    int id = scanner.nextInt();

                    if (id > pf.getlistacpf().size() || id < 0) {
                        System.out.println("ID inválido");
                    } else {
                        System.out.println("Digite o novo nome (nome antigo: " + pf.getListaNome().get(id) + "):");
                        scanner.nextLine();
                        String nomeAlterado = scanner.nextLine();
                        System.out.println("Digite o novo contato (contato antigo: " + pf.getListaContato().get(id) + "):");
                        String contatoAlterado = scanner.nextLine();
                        System.out.println("Digite o novo cpf (cpf antigo: " + pf.getlistacpf().get(id) + "):");
                        String cpfAlterado = scanner.nextLine();
                        System.out.println("Digite a nova idade (idade antiga: " + pf.getlistaidade().get(id) + "):");
                        int idadeAlterada = scanner.nextInt();
                        System.out.println("Digite o novo endereço (endereço antigo: " + pf.getEndereco().get(id) + "):");
                        scanner.nextLine();
                        String enderecoAlterado = scanner.nextLine();

                        System.out.println("Confirme a alteração: ");
                        System.out.println("De: \n" + "Nome: " + pf.getListaNome().get(id) + ", Contato: " + pf.getListaContato().get(id) + ", CPF: " +
                                pf.getlistacpf().get(id) + ", Idade: " + pf.getlistaidade().get(id) + ", Endereço: " + pf.getEndereco().get(id));
                        System.out.println("Para: \n" + "Nome: " + nomeAlterado + ", Contato: " + contatoAlterado + ", CPF: " +
                                cpfAlterado + ", Idade: " + idadeAlterada + ", Endereço: " + enderecoAlterado);
                        System.out.println("Confirma alteração? (Sim/Não):");
                        String confirm = scanner.nextLine();
                        if (confirm.toUpperCase().equals("SIM")) {
                            pf.getListaNome().set(id, nomeAlterado);
                            pf.getListaContato().set(id, contatoAlterado);
                            pf.getlistacpf().set(id, cpfAlterado);
                            pf.getlistaidade().set(id, idadeAlterada);
                            pf.getEndereco().set(id, enderecoAlterado);
                            System.out.println("Cliente alterado com sucesso!");
                        } else {
                            System.out.println("Alteração cancelada");
                        }
                    }
                } else {
                    System.out.println("Nenhum cliente PF cadastrado!");
                }
            } else if (opcao.toUpperCase().equals("PJ")) {
                if (pj.getListaCNPJ().size() != 0) {
                    System.out.println("Lista de Clientes PJ: ");
                    for (int i = 0; i < pj.getListaNome().size(); i++) {
                        System.out.println("ID: " + i + ", Nome: " + pj.getListaNome().get(i) + ", Contato: " + pj.getListaContato().get(i) + ", CNPJ: " +
                                pj.getListaCNPJ().get(i));
                    }
                    int id = scanner.nextInt();

                    if (id > pj.getListaCNPJ().size() || id < 0) {
                        System.out.println("ID inválido");
                    } else {
                        System.out.println("Digite o novo nome (nome antigo: " + pj.getListaNome().get(id) + "):");
                        scanner.nextLine();
                        String nomeAlterado = scanner.nextLine();
                        System.out.println("Digite o novo contato (contato antigo: " + pj.getListaContato().get(id) + "):");
                        String contatoAlterado = scanner.nextLine();
                        System.out.println("Digite o novo cnpj (cnpj antigo: " + pj.getListaCNPJ().get(id) + "):");
                        String cnpjAlterado = scanner.nextLine();

                        System.out.println("Confirme a alteração: ");
                        System.out.println("De: \n" + "Nome: " + pj.getListaNome().get(id) + ", Contato: " + pj.getListaContato().get(id) + ", CNPJ: " +
                                pj.getListaCNPJ().get(id));
                        System.out.println("Para: \n" + "Nome: " + nomeAlterado + ", Contato: " + contatoAlterado + ", CNPJ: " +
                                cnpjAlterado);
                        System.out.println("Confirma alteração? (Sim/Não):");
                        String confirm = scanner.nextLine();
                        if (confirm.toUpperCase().equals("SIM")) {
                            pj.getListaNome().set(id, nomeAlterado);
                            pj.getListaContato().set(id, contatoAlterado);
                            pj.getListaCNPJ().set(id, cnpjAlterado);
                            System.out.println("Cliente alterado com sucesso!");
                        } else {
                            System.out.println("Alteração cancelada");
                        }
                    }
                } else {
                    System.out.println("Nenhum cliente PJ cadastrado!");
                }
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
    }
}
