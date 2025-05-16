import Funcoes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean system = true;
        while (system){
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("                     Seja bem-vindo a nossa concessionária!!!");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Selecione abaixo uma opção: ");
            System.out.println("1. Clientes.");
            System.out.println("2. Veículos.");
            System.out.println("3. Finalizar sistema.");
            String opcao = sc.nextLine();
            while(!opcao.equals("1")&&!opcao.equals("2")&&!opcao.equals("3")){
                System.out.println("Opção inválida!");
                System.out.println("1. Clientes.");
                System.out.println("2. Veículos.");
                opcao = sc.nextLine();
            }
            if(opcao.equals("1")){
                System.out.println("Qual função deseja realizar?");
                System.out.println("1. Cadastro de cliente.");
                System.out.println("2. Editar cliente.");
                System.out.println("3. Remover cliente.");
                System.out.println("4. Listar clientes.");
                opcao = sc.nextLine();
                switch(opcao){
                    case "1":
                        CadastroCliente cadastroCliente = new CadastroCliente();
                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    case "4":

                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            }
            if(opcao.equals("3")){
                system = false;
            }
        }
//                "Selecione a opção que vc deseja seguir: \n" +
//                "1 - Cadastrar Veículo  \n" +
//                "2 - Cadastrar Cliente (Pessoa Física / Jurídica)  \n" +
//                "3 - Editar Veículo  \n" +
//                "4 - Editar Cliente  \n" +
//                "5 - Deletar Veículo  \n" +
//                "6 - Deletar Cliente  \n" +
//                "7 - Listar Veículos  \n" +
//                "8 - Listar Clientes  \n" +
//                "9 - Realizar Venda (opcional)  \n" +
//                "10 - Ver Histórico de Vendas (opcional)  \n" +
//                "11 - Sair  ");


    }
}