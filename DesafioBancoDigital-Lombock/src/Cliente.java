import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

}
