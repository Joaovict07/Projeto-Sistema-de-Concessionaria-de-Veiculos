public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro();
        carro1.setModelo("Civic");
        carro1.setFabricante("Toyota");
        carro1.setAno_fabricacao(2026);

        carro1.exibirInformacoes();

    }
}