package interface_iphone.reprodutorMusical;

public class MP3Player implements ReprodutorMusical{
    @Override
    public void Pausar() {
        System.out.println("Musica Pausada!");
    }

    @Override
    public void Tocar() {
        System.out.println("Tovando de MP3 Player!");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Musica Selecionada!");
    }
}
