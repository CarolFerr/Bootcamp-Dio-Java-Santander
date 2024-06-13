package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        // método put em map serve tanto para adicionar como para atualizar
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Maria", 12345678);
        agenda.adicionarContato("Maria Angelica", 98765432);
        agenda.adicionarContato("Flavia", 12309876);

        agenda.exibirContatos();

        agenda.pesquisarPorNome("Maria");

        agenda.removerContato("Maria");
        agenda.exibirContatos();

        System.out.println("O numero é: " + agenda.pesquisarPorNome("Flavia"));
    }
}
