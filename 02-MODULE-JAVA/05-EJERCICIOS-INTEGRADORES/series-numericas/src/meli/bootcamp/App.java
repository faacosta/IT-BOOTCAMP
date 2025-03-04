package meli.bootcamp;

import meli.bootcamp.models.series.IntegerSerieProgresiva;

public class App {

    private static final String RESET = "\u001B[0m";

    private static final String BLUE = "\u001B[34m";
    
    private static final String MAGENTA = "\u001B[35m";
    
    private static final String CYAN = "\u001B[36m";

    private static final String SEPARADOR = "=".repeat(60);

    private static void imprimirSerie(String titulo, String color, IntegerSerieProgresiva serie) {
        System.out.println(color + titulo);

        for (int i = 0; i < 4; i++) {
            System.out.println(String.format("  - %s", serie.valorSiguiente()));
        }
    }

    public static void main(String[] args) {

        System.out.println(String.format("%s%n%s%n%s", SEPARADOR, "SERIES PROGRESIVAS", SEPARADOR));

        IntegerSerieProgresiva integerSerieProgresiva = new IntegerSerieProgresiva(2, 2);
        imprimirSerie("SERIE PROGRESIVA INTEGER (VALOR INICIAL 2, PASO 2)", BLUE, integerSerieProgresiva);

        System.out.println(RESET + "-".repeat(60));

        integerSerieProgresiva.setValorInicial(1);
        imprimirSerie("SERIE PROGRESIVA INTEGER (VALOR INICIAL 1, PASO 2)", MAGENTA, integerSerieProgresiva);

        System.out.println(RESET + "-".repeat(60));

        integerSerieProgresiva = new IntegerSerieProgresiva(3, 3);
        imprimirSerie("SERIE PROGRESIVA INTEGER (VALOR INICIAL 3, PASO 3)", CYAN, integerSerieProgresiva);

        System.out.println(RESET + "=".repeat(60));

    }

}
