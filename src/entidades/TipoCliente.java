package entidades;

public enum TipoCliente {
    PF(1, "Pessoa Física"),
    PJ(2, "Pessoa Jurídica");
    private int opcao;
    private String label;

    TipoCliente(int opcao, String label) {
        this.opcao = opcao;
        this.label = label;
    }

    public static TipoCliente fromOpcao(int opcao){
        for(TipoCliente tipo: TipoCliente.values()){
            if(tipo.getOpcao() == opcao){
                return tipo;
            }
        }
        throw new RuntimeException("Opção inválida");
    }
    public int getOpcao(){
        return opcao;
    }

    public String getLabel(){
        return label;
    }
}
