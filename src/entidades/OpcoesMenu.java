package entidades;

public enum OpcoesMenu {
    SAIR(0, "Encerrar sistema"),
    CADASTRO(1, "Cadastrar novo cliente"),
    ALUGUEL(2, "Alugar veículo"),

    BUSCARALUGUELCLIENTE(3, "Buscar aluguéis realizados pelo cliente");



    private int opcao;
    private String label;

    OpcoesMenu(int opcao, String label) {
        this.opcao = opcao;
        this.label = label;
    }

    public static OpcoesMenu fromOpcao(int opcao){
        for (OpcoesMenu opcaoMenu: OpcoesMenu.values()) {
            if(opcao == opcaoMenu.getOpcao()){
               return opcaoMenu;
            }
        }
        throw new RuntimeException("Opção inválida");
    }

    public int getOpcao() {
        return opcao;
    }

    public String getLabel() {
        return label;
    }
}
