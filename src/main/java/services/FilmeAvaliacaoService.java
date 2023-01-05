package services;

import Repositories.FilmeAvaliacaoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FilmeAvaliacaoService {

    private FilmeAvaliacaoService filmeAvaliacaoRepository;

    public FilmeAvaliacaoService (FilmeAvaliacaoRepository filmeAvaliacaoRepository) {
       this.filmeAvaliacaoRepository = (FilmeAvaliacaoService) filmeAvaliacaoRepository;
    }

    private Mono<FilmeAvaliacaoService> save(FilmeAvaliacaoService filmeAvaliacaoRepository) {
        return filmeAvaliacaoRepository.save(filmeAvaliacaoRepository);
    }

    public Mono<FilmeAvaliacaoService> findById(String id) {
        return filmeAvaliacaoRepository.findById(id);
    }

    public Flux<FilmeAvaliacaoService> findall(){
        return filmeAvaliacaoRepository.findall();
    }
}
