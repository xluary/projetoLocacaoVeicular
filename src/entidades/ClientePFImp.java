package entidades;

import interfaces.ClientePF;

public class ClientePFImp implements ClientePF {

    private String nome;
    private String CPF;
    private double desconto;

    private int quantDiariaDesconto;

    public ClientePFImp(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
        this.desconto = 0.05;
        this.quantDiariaDesconto = 5;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public double getDesconto() {
        return this.desconto;
    }

    @Override
    public int getQuantDiariaDesconto() {
        return this.quantDiariaDesconto;
    }

    @Override
    public String getCPF() {
        return this.CPF;
    }
}
