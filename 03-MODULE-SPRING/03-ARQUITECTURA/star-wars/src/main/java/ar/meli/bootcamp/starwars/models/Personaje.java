package ar.meli.bootcamp.starwars.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personaje {

    private String name;

    private Integer height;

    private Integer mass;

    private String hairColor;

    private String skinColor;

    private String eyeColor;

    private String birthYear;

    private String gender;

    private String homeworld;

    private String species;
    
}
