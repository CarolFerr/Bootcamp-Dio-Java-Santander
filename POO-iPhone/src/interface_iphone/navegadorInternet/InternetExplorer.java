package interface_iphone.navegadorInternet;

public class InternetExplorer implements NavegadorInternet {
    public void AtualizarPagina() {
        System.out.println("Página Atualizada!");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Nova Aba Adicionada!");
    }

    @Override
    public void ExibirPagina(String url) {
        System.out.printf("Acessando...%s", url);
    }
}
