package Funcoes;
import Veiculo.*;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastroVeiculo {
    public CadastroVeiculo() {
        ArrayList<Veiculo> listaCarros = new ArrayList<>();
        ArrayList<Veiculo> listaMotos = new ArrayList<>();
        ArrayList<Veiculo> listaUtilitarios = new ArrayList<>();
        Scanner veiculo = new Scanner(System.in);
        System.out.println("Digite o tipo de veículo ex(carro, moto, utilitário, etc...): ");
        String tipo = veiculo.next();
        System.out.println("Digite o modelo do veículo : ");
        String modelo = veiculo.next();
        System.out.println("Digite o fabricante : ");
        String fabricante = veiculo.next();
        System.out.println("Digite o ano de fabricação : ");
        int ano = veiculo.nextInt();

        veiculo.Close();

        switch (tipo.toUpperCase()) {
            case "CARRO":
                Carro carro1 = new Carro();
                carro1.setModelo(modelo);
                carro1.setFabricante(fabricante);
                carro1.setAno_fabricacao(ano);
                listaCarros.add(carro1);
            case "MOTO":
                Veiculo moto1 = new Moto();
                moto1.modelo = modelo;
                moto1.fabricante = fabricante;
                moto1.ano_fabricacao = ano;
                listaMotos.add(moto1);
            case "UTILITÁRIO", "UTILITARIO":
                Veiculo utilitario1 = new Utilitario();
                utilitario1.modelo = modelo;
                utilitario1.fabricante = fabricante;
                utilitario1.ano_fabricacao = ano;
                listaUtilitarios.add(utilitario1);
            default:
                System.out.println("O tipo digitado não existe!");
                break;
        }
        System.out.println("Veículo cadastrado com sucesso!!");
    }
}
