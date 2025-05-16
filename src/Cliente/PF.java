package Cliente;

import java.util.ArrayList;

public class PF extends Cliente {
    protected ArrayList<String> listacpf = new ArrayList<String>();
    protected ArrayList<Integer> listaidade = new ArrayList<Integer>();
    protected ArrayList<String> listaendereco = new ArrayList<String>();

    public PF(String nome, String contato, String tipo, String cpf, int idade, String endereco) {
        super(nome, contato, tipo);
        listacpf.add(cpf);
    }

    public ArrayList<String> getlistacpf() {
        return listacpf;
    }

    public void setlistacpf(String cpf) {listacpf.add(cpf);}

    public ArrayList<Integer> getlistaidade() {return listaidade;}

    public void setlistaidade(int idade) {listaidade.add(idade);}

    public ArrayList<String> getEndereco() {
        return listaendereco;
    }

    public void setlistaendereco(String endereco) {listaendereco.add(endereco);}

}
