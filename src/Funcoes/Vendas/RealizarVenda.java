package Funcoes.Vendas;
import Cliente.*;
import Funcoes.Veiculos.*;
import Vendas.*;
import java.util.Scanner;
import java.util.Date;

public class RealizarVenda {
    public RealizarVenda(PF pf, PJ pj, Venda venda, CadastroVeiculo cadastro){
        Scanner sc = new Scanner(System.in);
        Date dataAtual = new Date();
        if(cadastro.getVeiculos().size()!=0){
            System.out.println("Selecione o tipo do cliente:");
            System.out.println("1. PF \n2. PJ");
            String tipoCliente =  sc.nextLine();
            if(tipoCliente.equals("1") || tipoCliente.toUpperCase().equals("PF")){
                System.out.println("Digite o CPF do cliente:");
                String cpf = sc.nextLine();
                String nome = "";
                boolean clienteCadastrado = false;
                for(int i = 0; i < pf.getlistacpf().size() ; i++){
                    if(pf.getlistacpf().get(i).equals(cpf)){
                        System.out.println("Cliente encontrado!");
                        clienteCadastrado = true;
                        nome = pf.getListaNome().get(i);
                        i = pf.getlistacpf().size();
                    }
                }
                if(clienteCadastrado){
                    String data = dataAtual.toString();
                    cadastro.mostrarVeiculos();
                    System.out.println("Digite o índice do veiculo: ");
                    int veiculo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Confirme a venda:");
                    System.out.println("Modelo: " + cadastro.getVeiculos().get(veiculo).getModelo()
                                        +"\nValor do veículo: " + cadastro.getVeiculos().get(veiculo).getPreco() + "\nNome do Cliente: " + nome +
                                                "\nCPF do Cliente: " + cpf + "\nData da compra: " + data);
                    System.out.println("Deseja prosseguir? (Sim/Não)");
                    String confirm = sc.nextLine();
                    if(confirm.toUpperCase().equals("SIM") && cadastro.getVeiculos().get(veiculo).getStatus().equals("disponível")){
                        venda.setValorVeiculo(cadastro.getVeiculos().get(veiculo).getPreco());
                        venda.setNomeVeiculo(cadastro.getVeiculos().get(veiculo).getModelo());
                        cadastro.getVeiculos().get(veiculo).setStatus("Indisponível");
                        venda.setDataVenda(data);
                        venda.setCodigoCliente(cpf);
                        System.out.println("Venda cadastrada com sucesso!");
                    }else{
                        System.out.println("Venda interrompida");
                    }
                }
                else{
                    System.out.println("Cliente não encontrado!");
                }
            }
            else if(tipoCliente.equals("2") || tipoCliente.toUpperCase().equals("PJ")){
                System.out.println("Digite o CNPJ do cliente:");
                String cnpj = sc.nextLine();
                String nome = "";
                boolean clienteCadastrado = false;
                for(int i = 0; i < pj.getListaCNPJ().size() ; i++){
                    if(pj.getListaCNPJ().get(i).equals(cnpj)){
                        System.out.println("Cliente encontrado!");
                        nome = pj.getListaNome().get(i);
                        clienteCadastrado = true;
                        i = pj.getListaCNPJ().size();
                    }
                }
                if(clienteCadastrado){
                    String data = dataAtual.toString();
                    cadastro.mostrarVeiculos();
                    System.out.println("Digite o índice do veiculo: ");
                    int veiculo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Confirme a venda:");
                    System.out.println("Modelo: " + cadastro.getVeiculos().get(veiculo).getModelo()
                            + "\nNome do Empreendimento: " + nome + "\nCNPJ do Cliente: " + cnpj + "\nData da compra: " + data);
                    System.out.println("Deseja prosseguir? (Sim/Não)");
                    String confirm = sc.nextLine();
                    if(confirm.toUpperCase().equals("SIM")){
                        //                  venda.setValorVeiculo(cadastro.getVeiculos().get(veiculo).getPreco());
                        venda.setNomeVeiculo(cadastro.getVeiculos().get(veiculo).getModelo());
                        venda.setDataVenda(data);
                        venda.setCodigoCliente(cnpj);
                        System.out.println("Venda cadastrada com sucesso!");
                    }else{
                        System.out.println("Venda interrompida");
                    }
                }
                else{
                    System.out.println("Cliente não encontrado!");
                }
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        else{
            System.out.println("Nenhum veículo cadastrado!");
        }
    }
}
