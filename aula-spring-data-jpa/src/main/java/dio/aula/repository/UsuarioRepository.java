package dio.aula.repository;


import dio.aula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

// Agora não é preciso implementação
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {



}
