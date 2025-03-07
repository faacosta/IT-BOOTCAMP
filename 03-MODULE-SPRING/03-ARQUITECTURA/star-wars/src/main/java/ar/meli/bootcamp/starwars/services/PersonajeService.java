package ar.meli.bootcamp.starwars.services;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.meli.bootcamp.starwars.dtos.responses.PersonajeResponse;
import ar.meli.bootcamp.starwars.repositories.PersonajeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonajeService {

    private final PersonajeRepository personajeRepository;

    public List<PersonajeResponse> findByNameLike(String name) {
        return this.personajeRepository.findByNameLike(name)
            .stream()
            .map(PersonajeResponse::toResponse)
            .toList();
    }
    
}
