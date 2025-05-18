package Cliente;

import java.util.ArrayList;

public class PJ extends Cliente {

    protected ArrayList<String> listaCNPJ =  new ArrayList<String>();

    public ArrayList<String> getListaCNPJ() {
        return listaCNPJ;
    }

    public void setListaCNPJ(String cnpj) {
        listaCNPJ.add(cnpj);
    }

}