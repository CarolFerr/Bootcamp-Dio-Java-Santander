package src.test.java.one.digital.innovation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.asserts.Assertion;
import src.main.java.one.digital.innovation.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {
    // construção base

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa ana = new Pessoa("Ana", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        // espera-se que tenha 22 anos (o que espera - lado esquerdo, o que vai chamar - lado direito)
        Assertions.assertEquals(22, ana.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorIdade() {
        // cria um cenário
        Pessoa ana = new Pessoa("Ana", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(ana.ehMaiorDeIdade());
        // pode ser feita mais de uma asserção no método
    }
}
