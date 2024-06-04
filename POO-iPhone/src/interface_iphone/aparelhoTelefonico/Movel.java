package interface_iphone.aparelhoTelefonico;

public class Movel implements AparelhoTelefonico {
    @Override
    public void Ligar(String numeroTelefone) {
        System.out.println("Ligando do telefone movel....");
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo do telefone movel....");
    }

    @Override
    public void CorreioVoz() {
        System.out.println("Fazendo correio de voz a partir do telefone movel");
    }
}
