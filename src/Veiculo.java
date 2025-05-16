import javax.swing.*;

public class Veiculo {
    String modelo;
    String fabricante;
    int ano_fabricacao;
    String tipo;
    String status = "disponível";

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
        System.out.println("Modelo: " + getModelo() + "\n" + "Fabricante: " + getFabricante() + "\n" + "Ano-Fabricação: " + getAno_fabricacao() + "\n" + "Tipo: " + getTipo() + "\n" + "Status: " + getStatus());
    }
}

class Carro extends Veiculo {
    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo() + "\n" + "Fabricante: " + getFabricante() + "\n" + "Ano-Fabricação: " + getAno_fabricacao() + "\n" + "Tipo: Carro" + "\n" + "Status: " + getStatus());
    }
}

class Moto extends Veiculo {
    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo() + "\n" + "Fabricante: " + getFabricante() + "\n" + "Ano-Fabricação: " + getAno_fabricacao() + "\n" + "Tipo: Moto" + "\n" + "Status: " + getStatus());
    }
}

class Utilitario extends Veiculo {
    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo() + "\n" + "Fabricante: " + getFabricante() + "\n" + "Ano-Fabricação: " + getAno_fabricacao() + "\n" + "Tipo: Utilitário" + "\n" + "Status: " + getStatus());
    }
}