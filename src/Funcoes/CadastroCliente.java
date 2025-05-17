package Funcoes;

import Cliente.*;
import java.util.*;

public class CadastroCliente {
    public CadastroCliente(Cliente cliente){
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
            cliente.setListaClientes(nome+", "+contato+", "+tipo+", "+ cnpj);
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

            PF pf = new PF(nome,contato, tipo, cpf, idade, endereco);
            cliente.setListaClientes(nome+", "+contato+", "+tipo+", "+ cpf+", " + idade + ", "+endereco);
        }

    }
}
/*
    Clientes(ID, NOME, CONTATO, TIPO, CODIGO, IDADE, ENDERECO)
    PFNomes: (0. JOSÉ,"", 2. JOÃO, 3. MARIA,"")
    PJNomes: ("",1. LANCHONETE,"", "", 4. HOSPITAL)
    PJCPNJ: ("")
    PFCPF: ("3895438245")
    ID: (0,1,2,3,4)
    for(int i= 0;i < listaIDS;i++){
        PFnome.get(i)
        if(pfnome == "0"){
            pjnome.get(i)
        }
        System.out.print.ln(
    }
 */