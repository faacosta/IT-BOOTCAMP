package meli.bootcamp;

import meli.bootcamp.models.series.IntegerSerieProgresiva;

public class App {

    public static void main(String[] args) {

        System.out.println("=".repeat(60));
        System.out.println("SERIES PROGRESIVAS");
        System.out.println("=".repeat(60));

        System.out.print("\u001B[34m");
        System.out.println("SERIE PROGRESIVA INTEGER (VALOR INICIAL 2, PASO 2)");

        IntegerSerieProgresiva integer = new IntegerSerieProgresiva(2, 2);
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 2
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 4
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 6
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 8

        System.out.print("\u001B[0m");
        System.out.println("-".repeat(60));
        
        System.out.print("\u001B[35m");
        System.out.println("SERIE PROGRESIVA INTEGER (VALOR INICIAL 1, PASO 2)");

        integer.setValorInicial(1);
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 3
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 5
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 7
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 9

        System.out.print("\u001B[0m");
        System.out.println("-".repeat(60));

        System.out.print("\u001B[36m");
        System.out.println("SERIE PROGRESIVA INTEGER (VALOR INICIAL 3, PASO 3)");

        integer = new IntegerSerieProgresiva(3, 3);
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 3
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 6
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 9
        System.out.println(String.format("  - %s", integer.valorSiguiente())); // - 12

        System.out.print("\u001B[0m");
        System.out.println("=".repeat(60));

    }

}
