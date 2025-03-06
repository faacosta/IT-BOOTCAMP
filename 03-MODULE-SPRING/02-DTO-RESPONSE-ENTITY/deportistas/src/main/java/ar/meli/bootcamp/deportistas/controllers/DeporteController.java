package ar.meli.bootcamp.deportistas.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.meli.bootcamp.deportistas.dtos.responses.PersonaDeportistaResponse;
import ar.meli.bootcamp.deportistas.models.Deporte;
import ar.meli.bootcamp.deportistas.repositories.DeporteRepository;
import ar.meli.bootcamp.deportistas.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sports")
public class DeporteController {

    private final DeporteRepository deporteRepository;

    private final PersonaRepository personaRepository;

    @GetMapping("/findSports")
    public ResponseEntity<List<Deporte>> findAll() {
        return ResponseEntity.ok(this.deporteRepository.findAll());
    }

    @GetMapping("/findSport/{name}")
    public ResponseEntity<Deporte> findByName(@PathVariable String name) {
        return this.deporteRepository.findByNombre(name)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/findSportsPersons")
    public ResponseEntity<List<PersonaDeportistaResponse>> findAllDeportistas() {
        return ResponseEntity.ok(
            this.personaRepository.findAllDeportistas()
                .stream()
                .map(PersonaDeportistaResponse::toResponse)
                .toList()
        );
    }
    
}
