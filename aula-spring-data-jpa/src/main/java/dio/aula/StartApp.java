package dio.aula;

import dio.aula.model.Usuario;
import dio.aula.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
// Objeto gerenciado pelo spring framework
@Component
// faz a implementação do método runner que é semelhante ao main
public class StartApp implements CommandLineRunner {
    // executa a injeção de dependência
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setName("Ana");
        usuario.setUsername("Maria");
        usuario.setPassword("dio321");

        repository.save(usuario);


        // para comfirmar se o usuário está sendo salvo
        // dentro do meu for eu vou buscar atraves do repository todos os usuarios
        for (Usuario u: repository.findAll()) {
            System.out.println(u);
        }



    }
}
