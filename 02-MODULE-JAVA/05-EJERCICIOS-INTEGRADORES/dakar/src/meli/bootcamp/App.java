package meli.bootcamp;

import java.util.List;
import meli.bootcamp.models.Carrera;
import meli.bootcamp.models.Vehiculo;
import meli.bootcamp.models.vehiculos.Auto;
import meli.bootcamp.models.vehiculos.Moto;

public class App {

    private static final String SEPARADOR_IGUAL = "=".repeat(60);

    private static final String SEPARADOR_GUION = "-".repeat(60);

    private static final List<Vehiculo> VEHICULOS = List.of(
        new Auto(156.0F, 35.4F, 60.0F, "ABC123"),
        new Auto(180.5F, 32.0F, 45.0F, "DEF456"),
        new Auto(200.0F, 38.5F, 50.0F, "GHI789"),
        new Auto(145.5F, 30.0F, 55.0F, "JKL012"),
        new Auto(160.0F, 36.0F, 52.0F, "MNO345"),
        new Moto(120.0F, 20.0F, 30.0F, "PQR678"),
        new Moto(125.5F, 22.0F, 28.0F, "STU901"),
        new Moto(110.0F, 18.5F, 40.0F, "VWX234"),
        new Moto(130.0F, 21.0F, 35.0F, "YZA567"),
        new Moto(140.0F, 19.0F, 42.0F, "BCD890")
    );

    public static void main(String[] args) {
        
        Carrera carrera = new Carrera(48.5F, 1385.0F, "Altas Cumbres", 14);

        System.out.println(String.format("%s%n%s%n%s", SEPARADOR_IGUAL, "DAKAR", SEPARADOR_IGUAL));

        VEHICULOS.stream().forEach(carrera::agregarVehiculo);
        System.out.println("CANTIDAD DE VEHÍCULOS HABILITADOS: " + carrera.getVehiculos().size());

        System.out.println(SEPARADOR_GUION);

        carrera.eliminarVehiculo("PQR678");
        System.out.println("CANTIDAD DE VEHÍCULOS HABILITADOS: " + carrera.getVehiculos().size());

        System.out.println(SEPARADOR_GUION);

        Vehiculo vehiculoGanador = carrera.definirGanador();
        System.out.println(String.format("VEHÍCULO GANADOR: %s (RENDIMIENTO: %s) ", vehiculoGanador.getPatente(), vehiculoGanador.calcularRendimiento()));

        System.out.println(SEPARADOR_IGUAL);
        
    }
    
}
