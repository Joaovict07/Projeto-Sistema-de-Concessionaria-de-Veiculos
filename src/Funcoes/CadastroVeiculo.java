package Funcoes;

import java.util.*;
import Veiculo.*;

public class CadastroVeiculo {
    private Map<Integer, Veiculo> veiculos = new HashMap<>();
    int proximoIndice = 0;
    private Scanner scanner = new Scanner(System.in);

    public CadastroVeiculo() {
    }

    public void iniciarCadastro() {
        System.out.println("=== Cadastro de Veículos ===");
        System.out.print("Quantos veículos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nVeículo " + (i + 1));
            System.out.print("Informe a categoria (ex: Carros, Motos, Utilitário): ");
            String categoria = scanner.nextLine();

            System.out.print("Informe o modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Informe o fabricante: ");
            String fabricante = scanner.nextLine();

            System.out.print("Informe o ano do veículo: ");
            int ano = scanner.nextInt();
            String status = "disponível";
            scanner.nextLine();
            Veiculo v = new Veiculo(modelo, fabricante, ano, categoria, status);
            adicionarVeiculo(proximoIndice, v);
            proximoIndice++;
        }

        System.out.println("\nCadastro finalizado!");
        System.out.println("DEBUG: Total de modelos cadastrados: " + veiculos.size());
    }

    public void adicionarVeiculo(int ind, Veiculo v) {
        veiculos.put(ind, v);
    }

    public Map<Integer, Veiculo> getVeiculos() {
        return veiculos;
    }

    public void mostrarVeiculos() {
        if(veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado!");
            return;
        }

        System.out.println("\n=== Veículos Cadastrados ===");
        for (Map.Entry<Integer, Veiculo> entry : veiculos.entrySet()) {
            System.out.println("[" + entry.getKey() + "] " + entry.getValue());
        }
        }
}
