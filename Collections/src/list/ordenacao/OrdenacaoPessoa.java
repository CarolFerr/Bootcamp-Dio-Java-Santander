package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        // aqui a lista não esta ordenada
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        // o metodo sort vai verificar por meio do metodo sort para ordenar atraves do metodo Comparable
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        //forma mais simples de entender
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        //forma mais complexa de entender
//        pessoasPorAltura.sort(new ComparatorPorAltura());
//        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.58);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.48);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.55);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.70);

        // Realiza a impressão da lista por ordem numerica
        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
