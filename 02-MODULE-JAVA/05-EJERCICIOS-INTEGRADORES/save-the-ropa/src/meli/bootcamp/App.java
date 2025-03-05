package meli.bootcamp;

import java.util.List;
import meli.bootcamp.models.GuardaRopa;
import meli.bootcamp.models.Prenda;

public class App {

    private static final String SEPARADOR_IGUAL = "=".repeat(60);

    private static final String SEPARADOR_GUION = "-".repeat(60);

    public static final String RESET_COLOR = "\u001B[0m";

    public static final String RED_COLOR = "\u001B[31m";

    public static final String GREEN_COLOR = "\u001B[32m";

    public static final String YELLOW_COLOR = "\u001B[33m";

    public static void main(String[] args) {

        GuardaRopa guardaRopa = new GuardaRopa();

        System.out.println(String.format("%s%n%s%n%s", SEPARADOR_IGUAL, "SAVE THE ROPA", SEPARADOR_IGUAL));

        System.out.println(RED_COLOR + String.format("%s%n%s", "GUARDADO DE PRENDAS", SEPARADOR_GUION));

        List<Prenda> prendas = List.of(
            new Prenda("Levi's", "Classic Fit Shirt"),
            new Prenda("Lee", "Modern Series Straight"),
            new Prenda("North Face", "Apex Bionic 2 Jacket"),
            new Prenda("Nike", "Air Max 270"),
            new Prenda("Zara", "Floral Midi Dress")
        );

        Integer numeroLocker = guardaRopa.guardarPrendas(prendas);

        System.out.println(String.format("SE GUARDARON %s PRENDAS EN EL LOCKER N°%s", prendas.size(), numeroLocker));

        System.out.println(RESET_COLOR + SEPARADOR_IGUAL);

        System.out.println(GREEN_COLOR + String.format("PRENDAS ALMACENADAS%n%s", SEPARADOR_GUION));

        System.out.println(guardaRopa.mostrarPrendas());

        System.out.println(RESET_COLOR + SEPARADOR_IGUAL);

        System.out.println(YELLOW_COLOR + String.format("%s%n%s", "ENTREGA DE PRENDAS", SEPARADOR_GUION));

        List<Prenda> prendasEntregadas = guardaRopa.devolverPrendas(numeroLocker);

        System.out.println(YELLOW_COLOR + String.format("SE ENTREGARON %s PRENDAS DEL LOCKER N°%s", prendasEntregadas.size(), numeroLocker));

        System.out.println(RESET_COLOR + SEPARADOR_IGUAL);

    }
    
}
