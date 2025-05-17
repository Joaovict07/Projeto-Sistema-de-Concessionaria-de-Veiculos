package Funcoes;
import Cliente.*;

public class RemoverCliente {

    public RemoverCliente(){
        Cliente usuario = new Cliente ("","","");
        System.out.println("Lista de Clientes: ");
        System.out.println(usuario.getListaClientes());
        for(String cliente: usuario.getListaClientes()){
            System.out.println(cliente);
        }
    }


}
