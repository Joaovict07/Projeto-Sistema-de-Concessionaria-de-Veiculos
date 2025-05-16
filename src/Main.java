import Funcoes.CadastroVeiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo a nossa concessionária!!!\n" +
                "Selecione a opção que vc deseja seguir: \n" +
                "1 - Cadastrar Veículo  \n" +
                "2 - Cadastrar Cliente (Pessoa Física / Jurídica)  \n" +
                "3 - Editar Veículo  \n" +
                "4 - Editar Cliente  \n" +
                "5 - Deletar Veículo  \n" +
                "6 - Deletar Cliente  \n" +
                "7 - Listar Veículos  \n" +
                "8 - Listar Clientes  \n" +
                "9 - Realizar Venda (opcional)  \n" +
                "10 - Ver Histórico de Vendas (opcional)  \n" +
                "11 - Sair  ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    CadastroVeiculo cadastro = new CadastroVeiculo();

            }
        }

    }
}