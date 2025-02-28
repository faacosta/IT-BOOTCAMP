package meli.bootcamp;

import meli.bootcamp.models.Animal;
import meli.bootcamp.models.animales.Gato;
import meli.bootcamp.models.animales.Perro;
import meli.bootcamp.models.animales.Vaca;

public class App {

    public static void alimentar(Animal animal) {
        System.out.print("\u001B[31m");
        animal.comer();
        System.out.print("\u001B[0m");
    }

    public static void main(String[] args) {

        System.out.println("=".repeat(60));
        System.out.println("ANIMALES");
        System.out.println("-".repeat(60));

        Perro perro = new Perro("Firulais");
        perro.emitirSonido();
        perro.comerCarne();
        alimentar(perro);

        System.out.println("-".repeat(60));

        Gato gato = new Gato("Michifus");
        gato.emitirSonido();
        gato.comerCarne();
        alimentar(gato);

        System.out.println("-".repeat(60));

        Vaca vaca = new Vaca("Lola");
        vaca.emitirSonido();
        vaca.comerHierba();
        alimentar(vaca);

        System.out.println("=".repeat(60));

    }
    
}
