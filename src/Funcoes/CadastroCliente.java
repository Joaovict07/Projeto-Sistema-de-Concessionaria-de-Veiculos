package Funcoes;

import Cliente.*;
import java.util.*;

public class CadastroCliente {
    public CadastroCliente(){
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Qual o tipo do cliente?");
        String tipo = cadastro.nextLine();
        System.out.println(tipo);

    }
}
