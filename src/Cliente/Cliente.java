package Cliente;

import java.util.ArrayList;
public class Cliente {

    protected String nome;
    protected String contato;
    protected String tipo;

    public Cliente(String nome, String contato, String tipo) {
        this.nome = nome;
        this.contato = contato;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}