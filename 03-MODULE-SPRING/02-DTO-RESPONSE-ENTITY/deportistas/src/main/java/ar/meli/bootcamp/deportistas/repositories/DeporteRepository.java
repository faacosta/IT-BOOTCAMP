package ar.meli.bootcamp.deportistas.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import ar.meli.bootcamp.deportistas.models.Deporte;

@Repository
public class DeporteRepository {

    private List<Deporte> repository;

    public DeporteRepository() {
        this.repository = new ArrayList<>();
        this.repository.add(new Deporte("Futbol", 1));
        this.repository.add(new Deporte("Basquet", 1));
        this.repository.add(new Deporte("Tenis", 1));
        this.repository.add(new Deporte("Automovilismo", 2));
        this.repository.add(new Deporte("Voley", 2));
    }

    public List<Deporte> findAll() {
        return this.repository;
    }

    public Optional<Deporte> findByNombre(String nombre) {
        return this.repository.stream()
            .filter(deporte -> deporte.getNombre().equalsIgnoreCase(nombre))
            .findFirst();
    }

}
