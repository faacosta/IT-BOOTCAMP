package meli.bootcamp;

public class App {

    public static void main(String[] args) {
        
        System.out.println("=".repeat(100));

        ExcepcionControlada excepcionControlada = new ExcepcionControlada();
        excepcionControlada.calcularCociente();

        System.out.println("-".repeat(100));

        ExcepcionNoControlada excepcionNoControlada = new ExcepcionNoControlada();
        excepcionNoControlada.calcularCociente();

        System.out.println("=".repeat(100));

    }

}
