package meli.bootcamp;

import meli.bootcamp.models.Persona;

public class App {

    public static void main(String[] args) {

        // Persona nn = new Persona();
        // Persona juan = new Persona("Juan", 25, "41256321");
        Persona maria = new Persona("Maria", 32, "95123641", 85.5, 1.74);

        // The constructor Persona(String, int) is undefined
        // Persona error = new Persona("Pedro", 22);

        System.out.println("=".repeat(100));
        System.out.println("INDICE DE MASA CORPORAL");
        System.out.println("=".repeat(100));

        try {
            Integer imc = maria.calcularIndiceMasaCorporal();

            switch (imc) {
                case -1:
                    System.out.println("Nivel de peso: bajo peso");
                    break;
                
                case 0:
                    System.out.println("Nivel de peso: peso saludable");
                    break;

                case 1:
                    System.out.println("Nivel de peso: sobrepeso");
                    break;

                default:
                    break;
            }
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("-".repeat(100));

        System.out.println(maria.getNombre() + " es " + (Boolean.TRUE.equals(maria.esMayorDeEdad()) ? "mayor" : "menor") + " de edad");

        System.out.println("-".repeat(100));

        System.out.println(maria);

        System.out.println("=".repeat(100));

    }

}
