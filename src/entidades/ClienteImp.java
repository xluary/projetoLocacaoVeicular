package entidades;

public abstract class ClienteImp {
    private String nome;

    public ClienteImp(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
