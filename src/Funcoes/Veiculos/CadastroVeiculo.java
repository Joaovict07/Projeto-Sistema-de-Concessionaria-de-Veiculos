package Funcoes.Veiculos;

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

            int ano;
            while (true) {
            System.out.print("Informe o ano do veículo: ");
            ano = scanner.nextInt();
            try {
                if (ano > 2025) {
                    System.out.println("Erro: o ano deve ser no máximo 2025");
                }else {
                    break;
                }
            } catch(NumberFormatException e) {
                System.out.println("Erro: digite apenas números válidos!");
            }

            }
            String status = "disponível";
            scanner.nextLine();

            Veiculo v = null;
            try {
            if (categoria.toUpperCase().equals("CARRO")) {
                v = new Carro(modelo, fabricante, ano, categoria, status);
            }else if (categoria.toUpperCase().equals("MOTO")) {
                v = new Moto(modelo, fabricante, ano, categoria, status);
            }else if (categoria.toUpperCase().equals("UTILITARIO") || categoria.toUpperCase().equals("UTILITÁRIO")) {
                v = new Utilitario(modelo, fabricante, ano, categoria, status);
            }else {
                System.out.println("A categoria de veículo fornecida é inválida!");
                break;
            }

            }catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                break;
            }
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
