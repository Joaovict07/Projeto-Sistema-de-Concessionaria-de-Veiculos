package Funcoes;
import Veiculo.Veiculo;
import java.util.Map;
import java.util.Scanner;

public class RemoverVeiculo {

    public void remover(Map<Integer, Veiculo> veiculos) {
        Scanner sc = new Scanner(System.in);

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado para remover.");
            return;
        }

        System.out.println("\n=== Veículos disponíveis para remoção ===");
        System.out.printf("%-10s %-15s %-20s %-25s\n", "ÍNDICE", "MODELO", "FABRICANTE", "ANO");
        System.out.println("------------------------------------------------");

        for (Map.Entry<Integer, Veiculo> entry : veiculos.entrySet()) {
            int indice = entry.getKey();
            Veiculo v = entry.getValue();
            System.out.printf("%-10d %-15s %-20s %-25s\n", indice, v.getModelo(), v.getFabricante(), v.getAno_fabricacao());
        }

        System.out.print("\nDigite o índice do veículo que deseja remover: ");
        String input = sc.nextLine();

        int indice;
        try {
            indice = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Índice inválido. Digite um número.");
            return;
        }

        if (veiculos.containsKey(indice)) {
            veiculos.remove(indice);
            System.out.println("Veículo removido com sucesso.");
        } else {
            System.out.println("Índice não encontrado@");
        }
    }
}