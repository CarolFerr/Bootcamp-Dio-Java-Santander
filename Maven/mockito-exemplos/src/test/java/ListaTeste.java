import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {
    // Mockito mocka para mim essa lista
    @Mock
    private List<String> letras;

    @Test
    void adicionarItemNaLista() {
        // qundo chamar a lista de letras e verificar a primeira posição retorna a letra B
        Mockito.when(letras.getFirst()).thenReturn("B");
        // está sendo mackado se está fazendo o que quer com o objeto
        Assertions.assertEquals("B", letras.getFirst());

    }
}
