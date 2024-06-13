package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contact : contatoSet) {
            // todo contato começar com o nome, por exemplo, camila dio, camila cavalcante vai ser possivel colocar nesse lista
            if (contact.getNome().startsWith(nome)) {
                contatosPorNome.add(contact);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contact : contatoSet) {
            if (contact.getNome().equalsIgnoreCase(nome)) {
                contact.setNumero(novoNumero);
                contatoAtualizado = contact;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Ana", 12345678);
        agenda.adicionarContato("Ana", 0);
        agenda.adicionarContato("Ana Prates", 11111111);
        agenda.adicionarContato("Patricia Santos", 98745612);

        agenda.exibirContato();

        System.out.println(agenda.pesquisarPorNome("Ana"));

        System.out.println("Contato Atualizado: " + agenda.atualizarNumeroContato("Ana Prates", 12356980));

        agenda.exibirContato();
    }

}
