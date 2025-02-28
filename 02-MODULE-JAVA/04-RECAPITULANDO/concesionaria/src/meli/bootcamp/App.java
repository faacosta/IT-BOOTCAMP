package meli.bootcamp;

import java.util.List;
import meli.bootcamp.models.Garaje;
import meli.bootcamp.models.Vehiculo;

public class App {

    private static List<Vehiculo> vehiculos = List.of(
        new Vehiculo("Ford", "Fiesta", 1000.0),
        new Vehiculo("Ford", "Focus", 1200.0),
        new Vehiculo("Ford", "Explorer", 2500.0),
        new Vehiculo("Fiat", "Uno", 500.0),
        new Vehiculo("Fiat", "Cronos", 1000.0),
        new Vehiculo("Fiat", "Torino", 1250.0),
        new Vehiculo("Chevrolet", "Aveo", 1250.0),
        new Vehiculo("Chevrolet", "Spin", 2500.0),
        new Vehiculo("Toyota", "Corola", 1200.0),
        new Vehiculo("Toyota", "Fortuner", 3000.0),
        new Vehiculo("Renault", "Logan", 950.0)
    );

    private static void orderByCosto(Garaje garaje) {
        System.out.print("\u001B[31m");
        System.out.println("VEHICULOS ORDENADOS POR COSTO");
        System.out.println("-".repeat(60));

        garaje.getVehiculos()
            .stream()
            .sorted((x, y) -> x.getCosto().compareTo(y.getCosto()))
            .forEach(System.out::println);
        
        System.out.print("\u001B[0m");
    }

    private static void orderByMarcaAndCosto(Garaje garaje) {
        System.out.print("\u001B[32m");
        System.out.println("VEHICULOS ORDENADOS POR MARCA Y COSTO");
        System.out.println("-".repeat(60));

        garaje.getVehiculos()
            .stream()
            .sorted((x, y) -> x.getMarca().compareTo(y.getMarca()))
            .sorted((x, y) -> x.getCosto().compareTo(y.getCosto()))
            .forEach(System.out::println);
        
        System.out.print("\u001B[0m");
    }

    private static void mostrarMenoresIgualesMil(Garaje garaje) {
        System.out.print("\u001B[33m");
        System.out.println("VEHICULOS CON COSTO NO MAYORES A $1.000,00");
        System.out.println("-".repeat(60));

        garaje.getVehiculos()
            .stream()
            .filter(vehiculo -> vehiculo.getCosto() <= 1000.0)
            .forEach(System.out::println);

        System.out.print("\u001B[0m");
    }

    private static void mostrarMayoresIgualesMil(Garaje garaje) {
        System.out.print("\u001B[34m");
        System.out.println("VEHICULOS CON COSTO MAYORES E IGUALES A $1.000,00");
        System.out.println("-".repeat(60));

        garaje.getVehiculos()
            .stream()
            .filter(vehiculo -> vehiculo.getCosto() >= 1000.0)
            .forEach(System.out::println);

        System.out.print("\u001B[0m");
    }

    private static void calcularPromedioCostos(Garaje garaje) {
        System.out.print("\u001B[35m");
        System.out.println("PROMEDIO TOTAL DE COSTOS DE VEHÍCULOS");
        System.out.println("-".repeat(60));

        Double promedio = garaje.getVehiculos()
            .stream()
            .mapToDouble(Vehiculo::getCosto)
            .average()
            .orElse(0.0);
        
        System.out.println("PROMEDIO: $" + Math.round(promedio));
        System.out.print("\u001B[0m");
    }

    public static void main(String[] args) {
        
        Garaje garaje = new Garaje(1);
        garaje.setVehiculos(vehiculos);

        System.out.println("=".repeat(60));
        System.out.println("CONCESIONARIA");
        System.out.println("=".repeat(60));

        orderByCosto(garaje);
        
        System.out.println("=".repeat(60));

        orderByMarcaAndCosto(garaje);

        System.out.println("=".repeat(60));

        mostrarMenoresIgualesMil(garaje);

        System.out.println("=".repeat(60));

        mostrarMayoresIgualesMil(garaje);

        System.out.println("=".repeat(60));

        calcularPromedioCostos(garaje);

        System.out.println("=".repeat(60));

    }

}
