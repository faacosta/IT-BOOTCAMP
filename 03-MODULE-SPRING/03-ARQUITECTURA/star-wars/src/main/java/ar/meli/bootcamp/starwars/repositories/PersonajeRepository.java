package ar.meli.bootcamp.starwars.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import ar.meli.bootcamp.starwars.models.Personaje;
import jakarta.annotation.PostConstruct;

@Repository
public class PersonajeRepository {

    private List<Personaje> repository = new ArrayList<>();

    @PostConstruct
    public void init() {
        repository.add(new Personaje("Darth Vader", 202, 136, "none", "white", "yellow", "41.9BBY", "male", "Tatooine", "Human"));
        repository.add(new Personaje("Luke Skywalker", 172, 77, "blond", "fair", "blue", "19BBY", "male", "Tatooine", "Human"));
        repository.add(new Personaje("Leia Organa", 150, 49, "brown", "light", "brown", "19BBY", "female", "Alderaan", "Human"));
        repository.add(new Personaje("Han Solo", 180, 80, "brown", "light", "brown", "29BBY", "male", "Corellia", "Human"));
        repository.add(new Personaje("Chewbacca", 228, 112, "brown", "brown", "blue", "200BBY", "male", "Kashyyyk", "Wookiee"));
        repository.add(new Personaje("Yoda", 66, 17, "gray", "green", "brown", "896BBY", "male", "Dagobah", "Yoda's species"));
        repository.add(new Personaje("R2-D2", 96, 32, "none", "white", "blue", "unknown", "male", "Naboo", "Droid"));
        repository.add(new Personaje("C-3PO", 175, 75, "none", "gold", "yellow", "112BBY", "male", "Tatooine", "Droid"));
        repository.add(new Personaje("Padmé Amidala", 165, 45, "brown", "light", "brown", "46BBY", "female", "Naboo", "Human"));
        repository.add(new Personaje("Obi-Wan Kenobi", 182, 77, "brown", "fair", "blue", "57BBY", "male", "Stewjon", "Human"));
        repository.add(new Personaje("Boba Fett", 183, 78, "black", "fair", "brown", "31BBY", "male", "Kamino", "Human"));
        repository.add(new Personaje("Mace Windu", 180, 80, "black", "dark", "brown", "72BBY", "male", "Haruun Kal", "Human"));
        repository.add(new Personaje("Jango Fett", 183, 79, "black", "fair", "brown", "66BBY", "male", "Concord Dawn", "Human"));
        repository.add(new Personaje("Ahsoka Tano", 169, 55, "none", "orange", "green", "36BBY", "female", "Shili", "Togruta"));
        repository.add(new Personaje("Finn", 180, 74, "black", "dark", "brown", "1999", "male", "unknown", "Human"));
        repository.add(new Personaje("Rey", 170, 54, "brown", "light", "hazel", "15ABY", "female", "Jakku", "Human"));
        repository.add(new Personaje("Kylo Ren", 180, 77, "black", "light", "brown", "5ABY", "male", "Chandrila", "Human"));
        repository.add(new Personaje("Poe Dameron", 180, 77, "black", "fair", "brown", "unknown", "male", "Yavin 4", "Human"));
        repository.add(new Personaje("Rose Tico", 152, 54, "black", "light", "brown", "unknown", "female", "Hoth", "Human"));
        repository.add(new Personaje("BB-8", 67, 9, "none", "white", "orange", "unknown", "male", "unknown", "Droid"));
        repository.add(new Personaje("Darth Maul", 175, 65, "none", "red", "yellow", "54BBY", "male", "Dathomir", "Zabrak"));
    }

    public List<Personaje> findByNameLike(String nombre) {
        return this.repository.stream()
            .filter(personaje -> personaje.getName().toLowerCase().contains(nombre.toLowerCase()))
            .toList();
    }
    
}
