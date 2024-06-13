package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return  valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1234, "Cadeira", 12, 87.50d);
        estoqueProdutos.adicionarProduto(1235, "Jardineira", 1, 50.00d);
        estoqueProdutos.adicionarProduto(12, "Poltronas", 2, 1520.50d);
        estoqueProdutos.adicionarProduto(123, "Cabeceiras", 2, 120.80d);
        estoqueProdutos.adicionarProduto(1, "Fones de Ouvido", 4, 80.50d);

        estoqueProdutos.exibirProduto();

        System.out.println("Valor Total do estoque(R$): " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto(s) mais caro(s): " + estoqueProdutos.obterProdutoMaisCaro());

    }
}
