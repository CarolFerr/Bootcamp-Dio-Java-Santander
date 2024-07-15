package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
// cria um componente calculadora que terá como dependencia outro objeto
//calculadora que executa o método run
@Component
public class MyApp implements CommandLineRunner {
    // injetando a dependicia de um componente a outro
    @Autowired
    // Beans do spring
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O Resultado é " + calculadora.somar(2,7));

    }
}
