package meli.bootcamp.models.vehiculos;

import meli.bootcamp.models.Socorrista;
import meli.bootcamp.models.Vehiculo;

public class Moto extends Vehiculo implements Socorrista {

    public Moto(Float velocidad, Float aceleracion, Float anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 300.0F, 2);
    }

    @Override
    public String socorrer() {
        return String.format("SOCORRIENDO MOTO (%s)", this.patente);
    }
    
}
