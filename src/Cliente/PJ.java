package Cliente;

import java.util.ArrayList;

public class PJ extends Cliente {

    protected ArrayList<String> listaCNPJ =  new ArrayList<String>();

    public ArrayList<String> getListaCNPJ() {
        return listaCNPJ;
    }

    public void setListaCNPJ(String cnpj) {
        int id = 0;
        if(listaID.size()==0){
            id = 0;
        }else{
            id = listaID.size()+1;
        }
        listaID.add(id);
        listaCNPJ.add(cnpj);
    }

    public PJ(String nome, String contato, String tipo, String cnpj) {
        super(nome, contato, tipo);
        listaCNPJ.add(cnpj);
    }

}