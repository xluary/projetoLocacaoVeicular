package entidades;

public enum TipoVeiculo {
    PEQUENO(1, "Pequeno"),
    GRANDE(2, "Grande"),
    SUV(3, "SUV");

    private int opcao;
    private String label;

    TipoVeiculo(int opcao, String label) {
        this.opcao = opcao;
        this.label = label;
    }

    public static TipoVeiculo fromOpcao(int opcao){
        for(TipoVeiculo tipo : TipoVeiculo.values()){
            if(tipo.getOpcao() == opcao){
                return tipo;
            }
        }
        throw new RuntimeException("Opcao Inválida");
    }

    public int getOpcao() {
        return opcao;
    }

    public String getLabel() {
        return label;
    }
}
