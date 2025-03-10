package ar.meli.bootcamp.covid.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sintoma {

    private String codigo;

    private String nombre;

    private Integer nivelGravedad;

}
