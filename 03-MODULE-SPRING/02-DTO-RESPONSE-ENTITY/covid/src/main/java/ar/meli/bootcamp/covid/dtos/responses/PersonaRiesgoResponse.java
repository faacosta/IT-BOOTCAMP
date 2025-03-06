package ar.meli.bootcamp.covid.dtos.responses;

import ar.meli.bootcamp.covid.models.Persona;
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
public class PersonaRiesgoResponse {

    private String nombre;

    private String apellido;

    public static PersonaRiesgoResponse toResponse(Persona entity) {
        return PersonaRiesgoResponse.builder()
            .nombre(entity.getNombre())
            .apellido(entity.getApellido())
            .build();
    }
    
}
