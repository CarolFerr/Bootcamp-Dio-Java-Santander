package list.operacoesBasicas;

public class Tarefa {
    // Atributo
    private String descricao;
    // Método Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    // Método get que faz o retorno do atributo descrição
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString(){
        return descricao;
    }
}
