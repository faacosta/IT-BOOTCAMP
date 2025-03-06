package ar.meli.bootcamp.deportistas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Deporte {

    private String nombre;

    private Integer nivel;
    
}
