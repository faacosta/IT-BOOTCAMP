package meli.bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import meli.bootcamp.models.Cliente;

public class App {

    private static final String SEPARADOR_IGUAL = "=".repeat(60);
    
    private static final String SEPARADOR_GUION = "-".repeat(60);

    private static final String RESET = "\u001B[0m";

    private static final String BLUE = "\u001B[34m";

    private static final String MAGENTA = "\u001B[35m";

    private static List<Cliente> clientes = new ArrayList<>(List.of(
        new Cliente("10234978", "Juan", "Perez"),
        new Cliente("63102418", "Maria", "Paz"),
        new Cliente("20354178", "Lorena", "Juarez"),
        new Cliente("51243310", "Jazmin", "Carrizo"),
        new Cliente("41230051", "Pedro", "Capdevilla")
    ));

    private static void mostrarClientes() {
        System.out.println(BLUE + String.format("%s%n%s", "LISTADO DE CLIENTES", SEPARADOR_GUION));
        clientes.stream().forEach(System.out::println);
    }

    private static void buscarCliente(String documento) {
        clientes.stream()
            .filter(cliente -> cliente.getDocumento().equalsIgnoreCase(documento))
            .findFirst()
            .ifPresentOrElse(
                cliente -> System.out.println(String.format("CLIENTE LOCALIZADO%n%s", cliente)),
                () -> System.out.println("CLIENTE NO LOCALIZADO")
            );
    }

    public static void main(String[] args) {
        
        System.out.println(String.format("%s%n%s%n%s", SEPARADOR_IGUAL, "SUPERMERCADO EL ECONÓMICO", SEPARADOR_IGUAL));

        mostrarClientes();

        System.out.println(RESET + SEPARADOR_IGUAL);

        clientes.removeFirst();
        mostrarClientes();

        System.out.println(RESET + SEPARADOR_IGUAL);

        System.out.println(MAGENTA + String.format("%s%n%s", "BUSCAR CLIENTE", SEPARADOR_GUION));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("INGRESE UN DOCUMENTO: ");
            String documento = scanner.nextLine();
            System.out.println(SEPARADOR_GUION);
            buscarCliente(documento);
        }

        System.out.println(RESET + SEPARADOR_IGUAL);

    }

}
