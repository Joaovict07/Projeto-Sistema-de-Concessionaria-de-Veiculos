package Funcoes;
import Cliente.*;

import java.util.Scanner;

public class RemoverCliente {

    public RemoverCliente(Cliente usuario){
        System.out.println("Lista de Clientes: ");
        for(int i = 0; i< usuario.getListaClientes().size(); i++){
            System.out.println("ID: " + i + ", " + usuario.getListaClientes().get(i));
        }
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Qual o ID do cliente que deseja remover?");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        usuario.getListaClientes().remove(id);
        System.out.println("Cliente removido com sucesso!");
    }
}
