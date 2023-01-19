package entidades;

import interfaces.ClientePF;

public class ClientePFImp extends ClienteImp implements ClientePF {

    private String CPF;
    private double desconto;

    private int quantDiariaDesconto;

    public ClientePFImp(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
        this.desconto = 0.05;
        this.quantDiariaDesconto = 5;
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
