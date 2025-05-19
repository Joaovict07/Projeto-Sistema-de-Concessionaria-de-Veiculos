package Veiculo;

public class Veiculo {
    private String modelo;
    private String fabricante;
    private int ano_fabricacao;
    private String tipo = "";
    private String status = "disponível";
    private float preco;

    public Veiculo(String modelo, String fabricante, int ano_fabricacao, float preco,  String tipo, String status) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano_fabricacao = ano_fabricacao;
        this.preco = preco;
        this.tipo = tipo;
        this.status = status;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno_fabricacao() {
        return this.ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
            if (ano_fabricacao <= 2025) {
                this.ano_fabricacao = ano_fabricacao;
            }else {
                throw new IllegalArgumentException("Ano de fabricação inválido!");
            }
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo()  + "\nFabricante: " + getFabricante() + "\nAno-Fabricação: " + getAno_fabricacao() + "\nTipo: " + getTipo() + "\nStatus: " + getStatus());
    }

    public String toString() {
        return "Modelo: " + getModelo()  + "\nFabricante: " + getFabricante() + "\nAno-Fabricação: " + getAno_fabricacao() + "\nTipo: " + getTipo() + "\nStatus: " + getStatus();
    }
}