package Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import services.FilmeAvaliacaoService;

@RestController
@RequestMapping("/filme")
public class FilmeAvaliacaoController {

    private FilmeAvaliacaoService filmeAvaliacaoService;
    private JmsTemplate jsmTemplate;

    public FilmeAvaliacaoController (FilmeAvaliacaoController filmeAvaliacaoController
    JmsTemplate jmsTemplate) {
    this.filmeAvaliacaoService = filmeAvaliacaoService;
    this.jsmTemplate = jsmTemplate;
    }
    @PostMapping
    public Mono<ResponseEntity<Void>> create(@RequestBody FilmeAvaliacaoService filmeAvaliacaoService){
        jmsTemplate.convertAndSend("filmeavaliacao", filmeAvaliacaoService);
        System.out.println("Avaliacao enviada");
        return filmeAvaliacaoService.create(filmeAvaliacaoService).map(
                filme -> new ResponseEntity<Void>(HttpStatus.CREATED));
    }

    @GetMapping
    public Flux<FilmeAvaliacaoService> findall(){
        return filmeAvaliacaoService.findall();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity <FilmeAvaliacaoService>> findById(@PathVariable("id") String id){
        return filmeAvaliacaoService.findById(id)
                .map(filme -> new ResponseEntity<>(filme, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
}
