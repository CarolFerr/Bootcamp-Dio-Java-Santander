package interface_iphone.usuario;


import interface_iphone.iphone.Iphone;
import interface_iphone.navegadorInternet.NavegadorInternet;
import interface_iphone.aparelhoTelefonico.AparelhoTelefonico;
import interface_iphone.reprodutorMusical.ReprodutorMusical;


public class IphoneUsuario {
    public static void main(String[] args) {

        NavegadorInternet navegador = new Iphone();
        AparelhoTelefonico telefone = new Iphone();
        ReprodutorMusical ipod = new Iphone();

        navegador.AdicionarNovaAba();
        navegador.AtualizarPagina();
        navegador.ExibirPagina("www.google.com.br");
        System.out.print("\n------------------------------------------");
        telefone.Atender();
        telefone.Ligar("123456");
        telefone.CorreioVoz();
        System.out.println("------------------------------------------");
        ipod.Pausar();
        ipod.Tocar();
        ipod.SelecionarMusica("You don't break my soul");
    }

}
