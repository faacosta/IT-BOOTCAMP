package ar.meli.bootcamp.deportistas.dtos.responses;

import ar.meli.bootcamp.deportistas.models.Persona;
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
public class PersonaDeportistaResponse {

    private String nombre;

    private String apellido;

    private String deporte;

    public static PersonaDeportistaResponse toResponse(Persona entity) {
        return PersonaDeportistaResponse.builder()
            .nombre(entity.getNombre())
            .apellido(entity.getApellido())
            .deporte(entity.getDeporte().getNombre())
            .build();
    }
    
}
