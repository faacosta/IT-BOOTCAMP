package ar.meli.bootcamp.deportistas.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import ar.meli.bootcamp.deportistas.models.Deporte;
import ar.meli.bootcamp.deportistas.models.Persona;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PersonaRepository {

    private final DeporteRepository deporteRepository;

    private final List<Persona> repository = new ArrayList<>();

    @PostConstruct
    public void initData() {
        Deporte futbol = this.deporteRepository.findByNombre("Futbol")
            .orElseThrow(() -> new RuntimeException("Deporte No Encontrado"));

        Deporte basquet = this.deporteRepository.findByNombre("Basquet")
            .orElseThrow(() -> new RuntimeException("Deporte No Encontrado"));

        this.repository.add(new Persona("Juan", "Perez", 27, futbol));
        this.repository.add(new Persona("Pedro", "Esteban", 22, null));
        this.repository.add(new Persona("Lorena", "Gomez", 29, basquet));
        this.repository.add(new Persona("Sebastian", "López", 35, null));
        this.repository.add(new Persona("Gerardo", "Casilda", 32, null));
    }

    public List<Persona> findAllDeportistas() {
        return this.repository.stream()
            .filter(persona -> persona.getDeporte() != null)
            .toList();
    }
    
}
