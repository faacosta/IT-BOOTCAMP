package ar.meli.bootcamp.covid.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private Integer id;

    private String nombre;

    private String apellido;

    private Integer edad;

    private List<Sintoma> sintomas;

    public Boolean addSintoma(Sintoma sintoma) {
        return this.sintomas.add(sintoma);
    }

    public Boolean tieneRiesgo() {
        return this.edad > 60 && !this.sintomas.isEmpty();
    }
    
}
