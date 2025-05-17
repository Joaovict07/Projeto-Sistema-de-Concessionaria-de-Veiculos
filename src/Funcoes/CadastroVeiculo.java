package Funcoes;
import Veiculo.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class CadastroVeiculo {
    private Map<String, ArrayList<Veiculo>> listas = new HashMap<>();

    public CadastroVeiculo() {
        listas.put("Carros", new ArrayList<>());
        listas.put("Motos", new ArrayList<>());
        listas.put("Utilitários", new ArrayList<>());
    }

    public void menuCadastro(Scanner scanner) {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("1 Cadastrar Veículo");
            System.out.println("2 Voltar");
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o tipo de veículo ex(carro, moto, utilitário, etc...): ");
                String tipo = scanner.next();
                System.out.println("Digite o modelo do veículo : ");
                String modelo = scanner.next();
                System.out.println("Digite o fabricante : ");
                String fabricante = scanner.next();
                System.out.println("Digite o ano de fabricação : ");
                int ano = scanner.nextInt();

                switch (tipo.toUpperCase()) {
                    case "CARRO":
                        adicionarCarro(modelo, fabricante, "Carro", ano, "disponível");
                        System.out.println("Veículo cadastrado com sucesso!!");
                        break;
                    case "MOTO":
                        adicionarMoto(modelo, fabricante, "Moto", ano, "disponível");
                        System.out.println("Veículo cadastrado com sucesso!!");
                        break;
                    case "UTILITÁRIO", "UTILITARIO":
                        adicionarUtilitario(modelo, fabricante, "Utilitário", ano, "disponível");
                        System.out.println("Veículo cadastrado com sucesso!!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }else if (opcao == 2) {
                voltar = true;
            }else {
                System.out.println("Opção inválida!!");
            }
        }
    }

    public void adicionarCarro (String modelo, String fabricante, String tipo, int ano, String status) {
        listas.get("Carros").add(new Carro(modelo, fabricante, ano, status, tipo));
    }

    public void adicionarMoto (String modelo, String fabricante, String tipo, int ano, String status) {
        listas.get("Motos").add(new Moto(modelo, fabricante, ano, status, tipo));
    }

    public void adicionarUtilitario (String modelo, String fabricante, String tipo, int ano, String status) {
        listas.get("Utilitários").add(new Utilitario(modelo, fabricante, ano, status, tipo));
    }

    public Map<String, ArrayList<Veiculo>> getListas() {
        return listas;
    }

}
