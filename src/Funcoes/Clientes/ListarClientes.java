package Funcoes.Clientes;
import Cliente.*;
public class ListarClientes {
    public ListarClientes(PF pf, PJ pj){
        if(pf.getlistacpf().size()!=0){
            System.out.println("Lista de Clientes PF: ");
            for(int i = 0; i < pf.getlistacpf().size(); i++){
                System.out.println("ID: " + i + ", Nome: " + pf.getListaNome().get(i) + ", Contato: " + pf.getListaContato().get(i) + ", CPF: " +
                        pf.getlistacpf().get(i) + ", Idade: " + pf.getlistaidade().get(i) + ", Endereço: " + pf.getEndereco().get(i));
            }
        }
        if(pj.getListaCNPJ().size()!=0){
            System.out.println("Lista de Clientes PJ: ");
            for(int i = 0; i< pj.getListaNome().size(); i++){
                System.out.println("ID: " + i + ", Nome: " + pj.getListaNome().get(i) + ", Contato: " + pj.getListaContato().get(i) + ", CNPJ: " +
                        pj.getListaCNPJ().get(i));
            }
        }
        if(pj.getListaCNPJ().size() == 0 && pf.getlistacpf().size() == 00){
            System.out.println("Nenhum cliente cadastrado");
        }
    }
}
