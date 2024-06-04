package interface_iphone.aparelhoTelefonico;

public class Fixo implements AparelhoTelefonico {
    @Override
    public void Ligar(String numeroTelefone) {
        System.out.println("Ligando do telefone fixo....");
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo do telefone fixo....");
    }

    @Override
    public void CorreioVoz() {
        System.out.println("Fazendo correio de voz a parir do telefone fixo");
    }
}
