package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro obra : livroList){
                if (obra.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(obra);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
           for (Livro obra : livroList) {
               if (obra.getAnoPublicacao() >= anoInicial && obra.getAnoPublicacao() <= anoFinal) {
                   livrosPorIntervaloAnos.add(obra);
               }
           }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        // porque não tem nenhum objeto do tipo livro a partir desse titulo
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro obra: livroList) {
                if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = obra;
                    break;
                }
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2024);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2019);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 2020);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2019, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
    }
}


