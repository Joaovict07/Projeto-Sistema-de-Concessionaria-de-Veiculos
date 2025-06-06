package Vendas;
import java.util.ArrayList;
public class Venda {
    protected ArrayList<String> dataVenda = new ArrayList<String>();
    protected ArrayList<String> nomeVeiculo = new ArrayList<String>();
    protected ArrayList<Float> valorVeiculo = new ArrayList<Float>();
    protected ArrayList<String> codigoCliente = new ArrayList<String>();

    public ArrayList<String> getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String data) {
        dataVenda.add(data);
    }
    public ArrayList<String> getNomeVeiculo() {
        return nomeVeiculo;
    }
    public void setNomeVeiculo(String veiculo) {
        nomeVeiculo.add(veiculo);
    }
    public ArrayList<Float> getValorVeiculo() {
        return valorVeiculo;
    }
    public void setValorVeiculo(Float valor) {
        valorVeiculo.add(valor);
    }
    public ArrayList<String> getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(String codigo) {
        codigoCliente.add(codigo);
    }
}
