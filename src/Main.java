import Funcoes.Veiculos.CadastroVeiculo;
import Funcoes.Veiculos.EditarVeiculo;
import Funcoes.Veiculos.RemoverVeiculo;
import Funcoes.Vendas.RealizarVenda;
import Vendas.*;
import java.util.*;
import Cliente.*;
import Funcoes.Clientes.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean system = true;
        CadastroVeiculo cadastro = new CadastroVeiculo();
        EditarVeiculo editar = new EditarVeiculo();
        RemoverVeiculo deletar = new RemoverVeiculo();
        Venda venda = new Venda();
        PF pf = new PF();
        PJ pj = new PJ();
        while (system){
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("                     Seja bem-vindo a nossa concessionária!!!");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Selecione abaixo uma opção: ");
            System.out.println("1. Clientes.");
            System.out.println("2. Veículos.");
            System.out.println("3. Vendas");
            System.out.println("4. Finalizar sistema.");
            String opcao = sc.nextLine();
            while(!opcao.equals("1")&&!opcao.equals("2")&&!opcao.equals("3")&&!opcao.equals("4")){
                System.out.println("Opção inválida!");
                System.out.println("1. Clientes.");
                System.out.println("2. Veículos.");
                System.out.println("3. Vendas");
                System.out.println("4. Finalizar sistema.");
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
                            CadastroCliente cadastroCliente = new CadastroCliente(pf, pj);
                            opcao = "0";
                    break;
                    case "2":
                            EditarClientes editarClientes = new EditarClientes(pf, pj);
                            opcao = "0";
                    break;
                    case "3":
                            RemoverCliente removerCliente = new RemoverCliente(pf, pj);
                            opcao = "0";
                    break;
                    case "4":
                            ListarClientes listarClientes = new ListarClientes(pf, pj);
                            opcao = "0";
                    break;
                    default:
                            System.out.println("Opção inválida!");
                }

            }
            if(opcao.equals("2")) {
                System.out.println("Qual função deseja realizar?");
                System.out.println("1. Cadastro de veículo.");
                System.out.println("2. Editar veículo.");
                System.out.println("3. Remover veículo.");
                System.out.println("4. Listar veículos.");
                opcao = sc.nextLine();
                switch(opcao) {
                    case "1":
                        cadastro.iniciarCadastro();
                        opcao = "0";
                        break;
                    case "2":
                        editar.editar(cadastro.getVeiculos());
                        opcao = "0";
                        break;
                    case "3":
                        deletar.remover(cadastro.getVeiculos());
                        opcao = "0";
                        break;
                    case "4":
                        cadastro.mostrarVeiculos();
                        opcao = "0";
                        break;
                }
            }
            if(opcao.equals("3")){
                opcao = "0";
                System.out.println("Qual função deseja realizar?");
                System.out.println("1. Cadastro de venda.");
                System.out.println("2. Listar vendas.");
                opcao = sc.nextLine();
                switch(opcao){
                    case "1":
                        RealizarVenda realizarVenda = new RealizarVenda(pf, pj, venda, cadastro);
                    break;
                    case "2":

                    break;
                }

            }
            if(opcao.equals("4")){
                System.out.println("Volte sempre!");
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