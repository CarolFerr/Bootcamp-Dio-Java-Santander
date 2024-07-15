package dio.web_security_api.repository;

import dio.web_security_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
// extende e informa <qual classe, e tipo de atributo>
public interface UserRepository extends JpaRepository<User, Integer> {
    // consulta de usuario com seus respectivos perfis de usários
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param("username") String username);
}
