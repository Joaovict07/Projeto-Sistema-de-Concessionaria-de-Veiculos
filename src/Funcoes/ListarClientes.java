package Funcoes;
import Cliente.*;
public class ListarClientes {
    public ListarClientes(Cliente clientes){
        System.out.println("Lista de Clientes: ");
        for(int i = 0; i< clientes.getListaClientes().size(); i++){
            System.out.println("ID: " + i + ", " + clientes.getListaClientes().get(i));
        }
    }
}
