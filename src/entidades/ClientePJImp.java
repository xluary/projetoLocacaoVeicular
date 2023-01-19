package entidades;

import interfaces.ClientePJ;

public class ClientePJImp extends ClienteImp implements ClientePJ {

    private String CNPJ;
    private double desconto;
    private int quantDiariaDesconto;

    public ClientePJImp(String nome, String CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
        this.desconto = 0.1 ;
        this.quantDiariaDesconto = 3;
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
    public String getCNPJ() {
        return this.CNPJ;
    }
}
