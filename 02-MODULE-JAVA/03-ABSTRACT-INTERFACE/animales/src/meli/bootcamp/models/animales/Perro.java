package meli.bootcamp.models.animales;

import meli.bootcamp.models.Animal;
import meli.bootcamp.models.Carnivoro;

public class Perro extends Animal implements Carnivoro {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("GUAU");
    }

    @Override
    public void comerCarne() {
        System.out.println("ESTOY COMIENDO CARNE");
    }

    @Override
    public void comer() {
        this.comerCarne();
    }
    
}
