package Funcoes;
import Cliente.*;

public class RemoverCliente {

    public RemoverCliente(Cliente usuario){
        System.out.println("Lista de Clientes: ");
        for(String cliente: usuario.getListaClientes()){
            System.out.println(cliente);
        }
    }


}
