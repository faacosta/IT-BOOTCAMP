package ar.meli.bootcamp.starwars.dtos.responses;

import ar.meli.bootcamp.starwars.models.Personaje;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonajeResponse {

    private String name;

    private Integer height;

    private Integer mass;

    private String gender;

    private String homeworld;

    private String species;

    public static PersonajeResponse toResponse(Personaje entity) {
        return PersonajeResponse.builder()
            .name(entity.getName())
            .height(entity.getHeight())
            .mass(entity.getMass())
            .gender(entity.getGender())
            .homeworld(entity.getHomeworld())
            .species(entity.getSpecies())
            .build();
    }
    
}
