package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private final List<Tarefa> tarefaList;
    // contrutor da classe ListaTarefa
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    // realiza a adição de terafas na lista de tarefas
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    // Para remover os itens/tarefas que se repetem
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
            for (Tarefa itemLista : tarefaList) {
                if (itemLista.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(itemLista);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    // retorna a quantidade de itens dentro da lista
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    // imprimindo a lista de tarefas
//    public void obterDescricoesTarefas() {
//        if (!tarefaList.isEmpty()) {
//            System.out.println(tarefaList);
//        } else {
//            System.out.println("A lista está vazia!");
//        }
//    }
    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.print("Itens da Lista: ");
            for (int i = 0; i < tarefaList.size(); i++) {
                System.out.print(tarefaList.get(i));
                if (i < tarefaList.size() - 1) {
                    System.out.print(", "); // Adiciona vírgula entre as tarefas (exceto a última)
                }
            }
            System.out.println(); // Pula para a próxima linha
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // Rodando e adicionando os elementos em uma lista de tarefas
    // shortcut para criar o metodo main: psvm
    public static void main(String[] args) {
        // instancia a classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("LISTA DE TAREFAS");
        System.out.print("---------------------------------------------");
        // shortcut para duplicar a linha: ctrl+D
        // adiciona tarefas à lista
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.adicionarTarefa("tarefa 3");

        // exibe o numero total de tarefas
        System.out.println("\nO numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // exibe as tarefas inseridas na lista (descrição)
        listaTarefa.obterDescricoesTarefas();

        //remove as tarefas repetidas
        listaTarefa.removerTarefa("tarefa 3");

        // exibindo o numero total de tarefas atualizado
        System.out.println("Agora o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // exibe o total de tarefas atualizadas
        listaTarefa.obterNumeroTotalTarefas();

        // remove uma tarefa quando a lista está vazia
        listaTarefa.removerTarefa("tarefa 1");

        // exibi o numero de tarefas atualizada
        System.out.println("Agora o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // tenta remover um item da lista quando a lista está vazia
        listaTarefa.removerTarefa("tarefa 4");
    }
}
