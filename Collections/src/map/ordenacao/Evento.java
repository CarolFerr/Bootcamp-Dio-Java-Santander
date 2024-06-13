package map.ordenacao;

public class Evento {
    //atributos
    private String nome;
    // poderia ser uma colletion, um set, ou uma list
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao=" + atracao +
                '}';
    }
}
