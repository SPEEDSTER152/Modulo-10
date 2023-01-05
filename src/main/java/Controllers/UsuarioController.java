package Controllers;

import entities.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import services.UsuarioService;

@RestController
@RequestMapping("/filme")
public class UsuarioController {

 private UsuarioService usuarioService;

 private JmsTemplate jmsTemplate;

 public UsuarioController(UsuarioService usuarioService, JmsTemplate jmsTemplate){
     this.usuarioService = usuarioService;
     this.jmsTemplate = jmsTemplate;
 }

 @PostMapping
    public Mono<ResponseEntity<Void>> create(@RequestBody Usuario usuario){
     jmsTemplate.convertAndSend("Usuario", usuario);
     System.out.println("Cadastrado");
     return UsuarioService.create(usuario).map(user -> new ResponseEntity<Void>(HttpStatus.CREATED));
 }

 @GetMapping
    public Flux<UsuarioService> findall(){
     return usuarioService.findall();
 }

 @GetMapping("{id}")
    public Mono<ResponseEntity<Usuario>> findbyId(@PathVariable("id") String id){
     return UsuarioService.findbyId(id)
     .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
             .defaultIsEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
 }
}