package Funcoes.Clientes;
import Cliente.*;
import java.util.Scanner;

public class RemoverCliente {

    public RemoverCliente(PF pf, PJ pj){
        Scanner scanner = new Scanner(System.in);
        if(pj.getListaCNPJ().size() == 0 && pf.getlistacpf().size() == 00){
            System.out.println("Nenhum cliente cadastrado");
        }
        System.out.println("Deseja remover um cliente PJ ou PF?");
        String opcao = scanner.nextLine();
        if(opcao.toUpperCase().equals("PF")){
            if(pf.getlistacpf().size()!=0){
                System.out.println("Lista de Clientes PF: ");
                for(int i = 0; i < pf.getlistacpf().size(); i++){
                    System.out.println("ID: " + i + ", Nome: " + pf.getListaNome().get(i) + ", Contato: " + pf.getListaContato().get(i) + ", CPF: " +
                            pf.getlistacpf().get(i) + ", Idade: " + pf.getlistaidade().get(i) + ", Endereço: " + pf.getEndereco().get(i));
                }
                System.out.println("Digite o ID do cliente que deseja remover: ");
                int id = scanner.nextInt();
                pf.getListaNome().remove(id);
                pf.getListaTipo().remove(id);
                pf.getListaContato().remove(id);
                pf.getlistacpf().remove(id);
                pf.getlistaidade().remove(id);
                pf.getEndereco().remove(id);
                System.out.println("Cliente removido com sucesso!");
            }
            else{
                System.out.println("Nenhum cliente PF cadastrado!");
            }
        }
        else if(opcao.toUpperCase().equals("PJ")){
            if(pj.getListaCNPJ().size()!=0){
                System.out.println("Lista de Clientes PJ: ");
                for(int i = 0; i< pj.getListaNome().size(); i++){
                    System.out.println("ID: " + i + ", Nome: " + pj.getListaNome().get(i) + ", Contato: " + pj.getListaContato().get(i) + ", CNPJ: " +
                            pj.getListaCNPJ().get(i));
                }
                System.out.println("Digite o ID do cliente que deseja remover: ");
                int id = scanner.nextInt();
                pj.getListaNome().remove(id);
                pj.getListaTipo().remove(id);
                pj.getListaContato().remove(id);
                pj.getListaCNPJ().remove(id);
                System.out.println("Cliente removido com sucesso!");
            }
            else{
                System.out.println("Nenhum cliente PJ cadastrado!");
            }
        }
        else{
            System.out.println("Opção inválida");
        }
    }
}