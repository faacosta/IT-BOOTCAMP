package ar.meli.bootcamp.starwars.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ar.meli.bootcamp.starwars.dtos.responses.PersonajeResponse;
import ar.meli.bootcamp.starwars.services.PersonajeService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/personajes")
public class PersonajeController {

    private final PersonajeService personajeService;

    @GetMapping("/findByNameLike")
    public ResponseEntity<List<PersonajeResponse>> findByNameLike(@RequestParam String name) {
        return ResponseEntity.ok(this.personajeService.findByNameLike(name));
    }
    
}
