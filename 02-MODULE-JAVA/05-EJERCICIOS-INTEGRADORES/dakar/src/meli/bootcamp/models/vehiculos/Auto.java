package meli.bootcamp.models.vehiculos;

import meli.bootcamp.models.Socorrista;
import meli.bootcamp.models.Vehiculo;

public class Auto extends Vehiculo implements Socorrista {

    public Auto(Float velocidad, Float aceleracion, Float anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000.0F, 4);
    }

    @Override
    public String socorrer() {
        return String.format("SOCORRIENDO AUTO (%s)", this.patente);
    }
    
}
