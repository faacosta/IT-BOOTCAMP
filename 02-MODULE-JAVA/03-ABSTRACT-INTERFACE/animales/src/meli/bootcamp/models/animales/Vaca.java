package meli.bootcamp.models.animales;

import meli.bootcamp.models.Animal;
import meli.bootcamp.models.Herviboro;

public class Vaca extends Animal implements Herviboro {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("MUUU");
    }

    @Override
    public void comerHierba() {
        System.out.println("ESTOY COMIENDO HIERBA");
    }

    @Override
    public void comer() {
        this.comerHierba();
    }
    
}
