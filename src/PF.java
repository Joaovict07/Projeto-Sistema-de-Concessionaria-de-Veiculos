public class PF extends Cliente {

    protected String cpf;

    public PF(String nome, String contato, String tipo, String cpf) {
        super(nome, contato, tipo);
        this.cpf = cpf;
    }
    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }
}
