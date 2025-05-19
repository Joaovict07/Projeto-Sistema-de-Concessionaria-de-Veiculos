package Funcoes.Veiculos;
import Veiculo.Veiculo;

import java.util.Map;
import java.util.Scanner;

public class EditarVeiculo {
    public void editar(Map<Integer, Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo para editar");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== Veículos disponíveis para edição ===");
        System.out.printf("%-10s %-15s %-20s %-25s %-30s", "ÍNDICE", "MODELO", "PREÇO", "FABRICANTE", "ANO");
        System.out.println("-----------------------------------------------------------------\n");

        for (Map.Entry<Integer, Veiculo> entry : veiculos.entrySet()) {
            int indice = entry.getKey();
            Veiculo v = entry.getValue();
            System.out.printf("%-10d %-15s %-20.2f %-25s %-30s\n", indice, v.getModelo(), v.getPreco(), v.getFabricante(), v.getAno_fabricacao());
        }

        System.out.println("Digite o índice do veículo que deseja editar: ");
        int indice = Integer.parseInt(sc.nextLine());

        Veiculo v = veiculos.get(indice);
        if (v == null) {
            System.out.println("Índice inválido.");
            return;
        }

        System.out.println("Editando: " + v.getModelo() + "-" + v.getFabricante());

        System.out.println("Novo modelo: ");
        v.setModelo(sc.nextLine());

        System.out.println("Novo fabricante: ");
        v.setFabricante(sc.nextLine());

        System.out.println("Novo ano de fabricação: ");
        v.setAno_fabricacao(sc.nextInt());
        sc.nextLine();

        System.out.println("Novo preço do veículo: ");
        v.setPreco(sc.nextFloat());
        sc.nextLine();
        System.out.print("Nova categoria: ");
        v.setTipo(sc.nextLine());

        System.out.println("Veículo atualizado com sucesso!");
    }
}
