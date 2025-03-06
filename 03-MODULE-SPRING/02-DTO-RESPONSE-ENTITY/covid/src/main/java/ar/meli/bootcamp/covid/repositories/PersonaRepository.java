package ar.meli.bootcamp.covid.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import ar.meli.bootcamp.covid.models.Persona;
import ar.meli.bootcamp.covid.models.Sintoma;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PersonaRepository {

    private final SintomaRepository sintomaRepository;

    private final List<Persona> personas;

    private Sintoma getSintoma(List<Sintoma> sintomas, String codigo) {
        return sintomas.stream()
            .filter(sintoma -> sintoma.getCodigo().equalsIgnoreCase(codigo))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Síntoma No Encontrado"));
    }

    @PostConstruct
    public void init() {
        List<Sintoma> sintomas = this.sintomaRepository.findAll();

        this.personas.add(new Persona(1, "Carlos", "Gómez", 72, List.of(
            this.getSintoma(sintomas, "SIN001"),
            this.getSintoma(sintomas, "SIN003")
        )));

        this.personas.add(new Persona(2, "Marta", "López", 65, List.of(
            this.getSintoma(sintomas, "SIN002"),
            this.getSintoma(sintomas, "SIN005")
        )));

        this.personas.add(new Persona(3, "Lucía", "Fernández", 45, List.of(
            this.getSintoma(sintomas, "SIN004")
        )));

        this.personas.add(new Persona(4, "Javier", "Martínez", 38, List.of()));

        this.personas.add(new Persona(5, "Roberto", "Suárez", 68, List.of()));
    }

    public List<Persona> findAllPersonasRiesgo() {
        return this.personas.stream()
            .filter(Persona::tieneRiesgo)
            .toList();
    }
    
}
