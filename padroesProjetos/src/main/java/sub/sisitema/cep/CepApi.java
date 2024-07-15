package sub.sisitema.cep;

public class CepApi {
    private static final CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    // instancia diretamente para quando for devolver sem verificação
    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "São Paulo";
    }
}
