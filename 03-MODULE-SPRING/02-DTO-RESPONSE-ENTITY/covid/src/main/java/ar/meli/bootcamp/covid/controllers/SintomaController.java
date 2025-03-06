package ar.meli.bootcamp.covid.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ar.meli.bootcamp.covid.dtos.responses.PersonaRiesgoResponse;
import ar.meli.bootcamp.covid.models.Sintoma;
import ar.meli.bootcamp.covid.repositories.PersonaRepository;
import ar.meli.bootcamp.covid.repositories.SintomaRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SintomaController {

    private final SintomaRepository sintomaRepository;

    private final PersonaRepository personaRepository;

    @GetMapping("/findSymptom")
    public ResponseEntity<List<Sintoma>> findAllSintomas() {
        return ResponseEntity.ok(this.sintomaRepository.findAll());
    }

    @GetMapping("/findSymptom/{codigo}")
    public ResponseEntity<Integer> findByCodigo(@PathVariable String codigo) {
        return this.sintomaRepository.findByCodigo(codigo)
            .map(Sintoma::getNivelGravedad)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PersonaRiesgoResponse>> findAllPersonasRiesgo() {
        return ResponseEntity.ok(
            this.personaRepository.findAllPersonasRiesgo()
                .stream()
                .map(PersonaRiesgoResponse::toResponse)
                .toList()
        );
    }
    
}
