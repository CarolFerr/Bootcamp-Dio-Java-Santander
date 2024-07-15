package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller é um proxy e não se aplica regras de negocio
@RestController
// centraliza um prefixo para todas as rquisições
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    // por que como há dois getmapping na aplicação o spring não sabe
    // identificar qual é por isso é necessário passar a URI
    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    // sem a necessidade de um client HTTP
    // como parametro da aplicação
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    // vai necessitar de um client HTTP para realizar o delete, pois realiza get
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
//    @PutMapping(){
//        public void putUser(@RequestBody Usuario usuario) {
//            repository.save(usuario);
//        }
//    }

}
