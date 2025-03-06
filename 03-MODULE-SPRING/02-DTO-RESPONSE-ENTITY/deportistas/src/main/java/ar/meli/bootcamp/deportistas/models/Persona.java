package ar.meli.bootcamp.deportistas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private String nombre;

    private String apellido;

    private Integer edad;

    private Deporte deporte;

}
