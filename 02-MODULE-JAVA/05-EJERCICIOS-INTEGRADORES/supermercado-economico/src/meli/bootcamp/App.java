package meli.bootcamp;

import java.util.List;
import java.util.Scanner;
import meli.bootcamp.core.Repository;
import meli.bootcamp.models.Cliente;
import meli.bootcamp.models.Factura;
import meli.bootcamp.models.Producto;
import meli.bootcamp.repositories.ClienteRepository;
import meli.bootcamp.repositories.FacturaRepository;

public class App {

    private static final String SEPARADOR_IGUAL = "=".repeat(60);
    
    private static final String SEPARADOR_GUION = "-".repeat(60);

    private static final String RESET = "\u001B[0m";

    private static final String BLUE = "\u001B[34m";

    private static final String MAGENTA = "\u001B[35m";

    private static final String CYAN = "\u001B[36m";

    private static final Scanner scanner = new Scanner(System.in);

    private static final Repository<String, Cliente> clienteRepository = new ClienteRepository();

    private static final Repository<Integer, Factura> facturaRepository = new FacturaRepository();

    private static void mostrarClientes() {
        System.out.println(BLUE + String.format("%s%n%s", "LISTADO DE CLIENTES", SEPARADOR_GUION));
        
        clienteRepository.findAll()
            .stream()
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        
        System.out.println(String.format("%s%n%s%n%s", SEPARADOR_IGUAL, "SUPERMERCADO EL ECONÓMICO", SEPARADOR_IGUAL));

        mostrarClientes();

        System.out.println(RESET + SEPARADOR_IGUAL);

        clienteRepository.remove("10234978");
        mostrarClientes();

        System.out.println(RESET + SEPARADOR_IGUAL);

        System.out.println(MAGENTA + String.format("%s%n%s", "BUSCAR CLIENTE", SEPARADOR_GUION));

        System.out.print("INGRESE UN DOCUMENTO: ");
        String documento = scanner.nextLine();
        System.out.println(SEPARADOR_GUION);
            
        Cliente clienteBuscado = clienteRepository.findByKey(documento);
        if (clienteBuscado != null) {
            System.out.println(String.format("CLIENTE LOCALIZADO%n%s", clienteBuscado));
        } else {
            System.out.println("CLIENTE NO LOCALIZADO");
        }

        System.out.println(RESET + SEPARADOR_IGUAL);

        System.out.println(CYAN + String.format("%s%n%s", "CREACIÓN DE NUEVA FACTURA", SEPARADOR_GUION));

        System.out.print("INGRESE UN DOCUMENTO: ");
        String documentoCliente = scanner.nextLine();
        System.out.println(SEPARADOR_GUION);
        
        Cliente clienteFactura = clienteRepository.findByKey(documentoCliente);

        if (clienteFactura == null) {
            System.out.println("CLIENTE NO EXISTENTE, REGISTRELO A CONTINUACIÓN");
                
            System.out.print("  - NOMBRE: ");
            String nombreCliente = scanner.nextLine();

            System.out.print("  - APELLIDO: ");
            String apellidoCliente = scanner.nextLine();

            clienteFactura = new Cliente(documentoCliente, nombreCliente, apellidoCliente);
            clienteRepository.save(clienteFactura);

            System.out.println(SEPARADOR_IGUAL);
        }

        List<Producto> productos = List.of(
            new Producto("PRO001", "TELEVISOR NOBLEX", 2, 9856.9D),
            new Producto("PRO002", "PARLANTE THONET & VANDER", 1, 6857.4D),
            new Producto("PRO003", "MACKBOOK PRO M3", 1, 98894.3D),
            new Producto("PRO004", "TECLADO LOGITECH", 1, 1543.9D),
            new Producto("PRO005", "MOUSE LOGITECH", 1, 2432.0D)
        );

        Factura factura = new Factura(clienteFactura);
        productos.stream().forEach(factura::addProducto);
        facturaRepository.save(factura);

        System.out.println(factura);

        System.out.println(RESET + SEPARADOR_IGUAL);

    }

}
