package Funcoes;

import Cliente.*;
import java.util.*;

public class CadastroCliente {
    public CadastroCliente(){
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
            PJ pj = new PJ(nome, contato, tipo,cnpj);
            PF pf = new PF("","","","",0,"");
        }
        else if(tipo.toUpperCase().contains("PF")){
            System.out.println("Digite o CPF: ");
            cpf = cadastro.nextLine();
            while(cpf.replace("-","").replace("/","").replace(".", "").length()!=11){
                System.out.println("Formato inválido, digite o CPF novamente: ");
                cpf = cadastro.nextLine();
            }
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

            PF pf = new PF(nome,contato, tipo, cpf, idade, endereco);
            PJ pj = new PJ("","","","");
        }

    }
}
