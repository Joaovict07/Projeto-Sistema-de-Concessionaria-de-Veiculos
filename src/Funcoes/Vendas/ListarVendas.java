package Funcoes.Vendas;
import Vendas.*;

public class ListarVendas {
    public ListarVendas(Venda venda){
      if(venda.getCodigoCliente().size()!=0){
          System.out.println("Lita de Vendas:");
          for(int i=0; i<venda.getCodigoCliente().size(); i++){
              System.out.println("Data da venda realizada: "+ venda.getDataVenda().get(i) + "\nNome do veículo: " + venda.getNomeVeiculo().get(i) +
                      "\nValor do veículo: " + venda.getValorVeiculo().get(i) + "\nCódigo do cliente: " + venda.getCodigoCliente().get(i));
          }
      }else{
          System.out.println("Não há nenhuma venda cadastrada");
      }

    }
}
