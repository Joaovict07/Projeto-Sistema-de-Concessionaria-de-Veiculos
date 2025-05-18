package Funcoes;
import Cliente.*;
public class ListarClientes {
    public ListarClientes(Cliente clientes){
        System.out.println("Lista de Clientes: ");
        for(String cliente: clientes.getListaClientes()){
            System.out.println(cliente);
        }
    }
}
