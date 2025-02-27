package meli.bootcamp;

import meli.bootcamp.models.NoPerecedero;
import meli.bootcamp.models.Perecedero;
import meli.bootcamp.models.Producto;

public class Distribuidora {

    public static void main(String[] args) {
        
        Producto[] productos = {
            new Producto("Blem", 2600.0),
            new Perecedero("Costeletas de Cerdo", 9800.0, 4),
            new Perecedero("Acelga", 1600.0, 2),
            new NoPerecedero("Lata de Atun", 4300.0, "Enlatado"),
            new NoPerecedero("Lata de Picadillo", 600.0, "Enlatado")
        };

        System.out.println("=".repeat(70));
        System.out.println("Distribuidora de Productos");
        System.out.println("-".repeat(70));

        for (Producto producto : productos) {
            System.out.println("Importe total para el producto \"" + producto.getNombre() + "\": $" + producto.calcular(5));
        }

        System.out.println("=".repeat(70));

    }
    
}
