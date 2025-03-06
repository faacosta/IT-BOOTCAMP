package ar.meli.bootcamp.covid.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import ar.meli.bootcamp.covid.models.Sintoma;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SintomaRepository {

    private final List<Sintoma> sintomas;

    @PostConstruct
    public void init() {
        this.sintomas.add(new Sintoma("SIN001", "Fiebre", 3));
        this.sintomas.add(new Sintoma("SIN002", "Tos seca", 2));
        this.sintomas.add(new Sintoma("SIN003", "Dificultad para respirar", 5));
        this.sintomas.add(new Sintoma("SIN004", "Pérdida del gusto y olfato", 2));
        this.sintomas.add(new Sintoma("SIN005", "Fatiga", 3));
    }

    public List<Sintoma> findAll() {
        return this.sintomas;
    }

    public Optional<Sintoma> findByCodigo(String codigo) {
        return this.sintomas.stream()
            .filter(sintoma -> sintoma.getCodigo().equalsIgnoreCase(codigo))
            .findFirst();
    }
    
}
