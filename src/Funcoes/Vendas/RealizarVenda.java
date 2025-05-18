package Funcoes.Vendas;
import Cliente.*;
import Funcoes.*;
import Vendas.*;
import java.util.Scanner;
import java.util.Date;

public class RealizarVenda {
    public RealizarVenda(PF pf, PJ pj, Venda venda, CadastroVeiculo cadastro){
        Scanner sc = new Scanner(System.in);
        Date dataAtual = new Date();

        System.out.println("Selecione o tipo do cliente:");
        System.out.println("1. PF \n2. PJ");
        String tipoCliente =  sc.nextLine();
        if(tipoCliente.equals("PF")){
            System.out.println("Digite o CPF do cliente:");
            String cpf = sc.nextLine();
            boolean clienteCadastrado = false;
            for(int i = 0; i < pf.getlistacpf().size() ; i++){
                if(pf.getlistacpf().get(i).equals(cpf)){
                    System.out.println("Cliente encontrado!");
                    clienteCadastrado = true;
                    i = pf.getlistacpf().size();
                }
            }
            if(clienteCadastrado){
                //Lista de veiculos
//                cadastro.mostrarVeiculo();
                String data = dataAtual.toString();
                System.out.println("Digite o índice do veiculo: ");
                int veiculo = sc.nextInt();
                venda.setDataVenda(data);
                venda.setCodigoCliente(cpf);
            }
            else{
                System.out.println("Cliente não encontrado!");
            }
        }
        else if(tipoCliente.equals("PJ")){

        }
        else{
            System.out.println("Cliente inválido!");
        }
    }
}
