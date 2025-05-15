public class PJ extends Cliente {

    protected String cnpj;

    public PJ(String nome, String contato, String tipo, String cnpj) {
        super(nome, contato, tipo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}