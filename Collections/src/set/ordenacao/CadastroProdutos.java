package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        // permite organizar o set, porque o treeset consegue organizar assim como o sort
        // porém o sort só funciona com List
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }

    public Set<Produto> exibirPorPreco() {
        // diz a forma como o treeset vai ficar organizado
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 1", 11, 15d, 5);
        cadastroProdutos.adicionarProduto("Produto 0", 2, 12d, 2);
        cadastroProdutos.adicionarProduto("Produto 5", 45, 8d, 6);
        cadastroProdutos.adicionarProduto("Produto 2", 2, 40d, 12);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());
    }


}
