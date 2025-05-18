package Funcoes.Clientes;

import Cliente.*;
import java.util.*;

public class CadastroCliente {
    public CadastroCliente(PF pf, PJ pj){
        //Inicializando variáveis
        String tipo = "";
        String cnpj = "";
        String cpf = "";
        String nome = "";
        String contato = "";
        String endereco = "";
        int idade = 0;
        Scanner cadastro = new Scanner(System.in);

        System.out.println("Qual o tipo do cliente?(PF OU PJ)");
        tipo = cadastro.nextLine();

        while(!tipo.toUpperCase().equals("PF")&&!tipo.toUpperCase().equals("PJ")){
            System.out.println("Tipo inválido! Digite novamente, qual o tipo do cliente?(PF ou PJ)");
            tipo = cadastro.nextLine();
        }
        if(tipo.toUpperCase().contains("PJ")){
            System.out.println("Digite o CNPJ: ");
            cnpj = cadastro.nextLine();
            while(cnpj.replace("-","").replace("/","").replace(".", "").length()!=14){
                System.out.println("Formato inválido, digite o CNPJ novamente: ");
                cnpj = cadastro.nextLine();
            }
            System.out.println("Digite o nome do empreendimento: ");
            nome = cadastro.nextLine();
            System.out.println("Digite uma forma de contato: ");
            contato = cadastro.nextLine();
            System.out.println("Cliente cadastrado com sucesso!");

            pj.setListaNome(nome);
            pj.setListaContato(contato);
            pj.setListaTipo(tipo);
            pj.setListaCNPJ(cnpj);
        }
        else if(tipo.toUpperCase().contains("PF")){
            System.out.println("Digite o CPF: ");
            cpf = cadastro.nextLine();
            while(cpf.replace("-","").replace("/","").replace(".", "").length()!=11){
                System.out.println("Formato inválido, digite o CPF novamente: ");
                cpf = cadastro.nextLine();
            }
            System.out.println("Digite o seu nome: ");
            nome = cadastro.nextLine();
            System.out.println("Digite sua idade: ");
            idade = cadastro.nextInt();
            while(idade>=110){
                System.out.println("Idade inválida, digite novamente: ");
                idade = cadastro.nextInt();
            }
            cadastro.nextLine();
            System.out.println("Digite uma forma de contato: ");
            contato = cadastro.nextLine();
            System.out.println("Digite o seu endereço: ");
            endereco = cadastro.nextLine();
            System.out.println("Cliente cadastrado com sucesso!");

            pf.setListaNome(nome);
            pf.setListaContato(contato);
            pf.setListaTipo(tipo);
            pf.setlistacpf(cpf);
            pf.setlistaidade(idade);
            pf.setlistaendereco(endereco);
        }
    }
}
