package Veiculo;

public class Carro extends Veiculo {
    public Carro(String modelo, String fabricante, int ano_fabricacao, float preco, String tipo, String status) {
        super(modelo, fabricante, ano_fabricacao, preco, tipo, status);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo() + "\nFabricante: " + getFabricante() + "\nAno-Fabricação: " + getAno_fabricacao() + "\nPreço: " + getPreco() + "\nTipo: Carro" + "\nStatus: " + getStatus());
    }
}