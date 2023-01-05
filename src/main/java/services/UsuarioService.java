package services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UsuarioService {

    private UsuarioService usuarioService;

     public UsuarioService(UsuarioService usuarioService){
         this.usuarioService = usuarioService;
     }

     private Mono<UsuarioService> save(UsuarioService usuarioService){
         return usuarioService.save(usuarioService);
     }

     public Mono<UsuarioService>  findByid(String id){
         return usuarioService.findByid(id);
     }

     public Flux<UsuarioService> findall(){
         return usuarioService.findall();
     }
}
