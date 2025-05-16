package Cliente;

import java.util.ArrayList;
public class Cliente {
    protected ArrayList<Integer> listaID = new ArrayList<Integer>();
    protected ArrayList<String> listaNome = new ArrayList<String>();
    protected ArrayList<String> listaContato = new ArrayList<String>();
    protected ArrayList<String> listaTipo = new ArrayList<String>();
    public ArrayList<Integer> getListaID() {
        return listaID;
    }
    public Cliente(String nome, String contato, String tipo) {
        listaNome.add(nome);
        listaContato.add(contato);
        listaTipo.add(tipo);
    }
    public ArrayList<String> getListaNome() {
        return listaNome;
    }
    public void setListaNome(String nome) {
        listaNome.add(nome);
    }
    public ArrayList<String> getListaContato() {
        return listaContato;
    }
    public void setListaContato(String contato) {
        listaContato.add(contato);
    }
    public ArrayList<String> getListaTipo() {
        return listaTipo;
    }
    public void setListaTipo(String tipo) {
        listaTipo.add(tipo);
    }
}