package meli.bootcamp.models.animales;

import meli.bootcamp.models.Animal;
import meli.bootcamp.models.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("MIAU");
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
