package Funcoes;

import Cliente.*;
import java.util.*;

public class CadastroCliente {
    public CadastroCliente(){
        String tipo = "";
        String cnpj = "";
        String nome = "";
        String contato = "";
        int idade = 0;
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Qual o tipo do cliente?");
        tipo = cadastro.nextLine();
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

        }
    }
}
