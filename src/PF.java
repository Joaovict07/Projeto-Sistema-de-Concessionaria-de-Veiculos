public class PF extends Cliente {
    protected String cpf;
    protected int idade;
    protected String endereco;

    public PF(String nome, String contato, String tipo, String cpf, int idade, String endereco) {
        super(nome, contato, tipo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
