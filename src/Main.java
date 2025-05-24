/*
Integrantes:
Beatriz de Oliveira Sanches Eusebio RA: 923115417
Christian Ribeiro Gama Franco RA: 923115584
Douglas de Almeida Nascimento RA: 923111247
João Victor Silva Bulcão RA: 923116778
Lucas Tiago Silva Oliveira RA: 423103124
 */
import Funcoes.Veiculos.*;
import Funcoes.Vendas.*;
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
                        ListarVendas listarVendas = new ListarVendas(venda);

                    break;
                }

            }
            if(opcao.equals("4")){
                System.out.println("Volte sempre!");
                system = false;
            }
        }
    }
}