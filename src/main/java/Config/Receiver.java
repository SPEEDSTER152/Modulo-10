package Config;

import entities.Usuario;
import services.FilmeAvaliacaoService;
import services.UsuarioService;

public class Receiver {

  @JmsListener(destination = "FilmeAvaliacao", containerfactory = "myfactory")
    public void receiveAvaliacao(FilmeAvaliacaoService filmeAvaliacaoService) {
      if (filmeAvaliacaoService.getUsuarioId() == null) {
          throw new RuntimeException("Avaliacao Inexsistente");

          System.out.println("Avaliacao Inexsistente<" + filmeAvaliacaoService + ">");
      }

  }
      @JmsListener(destination = "Usuario", containerfactory = "myfactory")
        public void receiveUsuario(Usuario usuario){
       if(usuario.getNome() == null){
           throw new RuntimeException("Usuario Inexsistente");

           System.out.println("Usuario Inexsistente<" + usuario + ">");
       }
      }
}
