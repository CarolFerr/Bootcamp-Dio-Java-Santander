package interface_iphone.iphone;

import interface_iphone.navegadorInternet.NavegadorInternet;
import interface_iphone.aparelhoTelefonico.AparelhoTelefonico;
import interface_iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void Tocar() {
        System.out.println("Tocando via Iphone");
    }

    @Override
    public void Pausar() {
        System.out.println("Pausando MP3 Player via Iphone");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.printf("Selecionando a musica %s da Beyonce via Iphone", musica);
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando página via Iphone");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Nova Pagina via Iphone");

    }

    @Override
    public void ExibirPagina(String url) {
        System.out.printf("Navegando no %s via Iphone ", url);
    }

    @Override
    public void Ligar(String numeroTelefone) {
        System.out.printf("Ligando para %s via Iphone", numeroTelefone);
        System.out.println();

    }

    @Override
    public void Atender() {
        System.out.println();
        System.out.println("Atendendo via Iphone");
    }

    @Override
    public void CorreioVoz() {
        System.out.println("Realizando correio de voz via Iphone");

    }
}