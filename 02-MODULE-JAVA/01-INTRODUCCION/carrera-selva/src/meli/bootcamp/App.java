package meli.bootcamp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    
    // LIST: [nombre, descripcion]
    private static Map<Integer, List<Object>> categorias = Map.of(
        1, List.of("Circuito Chico", "2 KM por selva y arroyos"),
        2, List.of("Circuito Medio", "5 KM por selva, arroyos y barro"),
        3, List.of("Circuito Avanzado", "10 KM por selva, arroyos, barro y escalada en piedra")
    );

    // LIST: [dni, nombre, apellido, edad, celular, numeroEmergencia, grupoSanguineo]
    private static Map<Integer, List<Object>> participantes = Map.of(
        1, List.of("12451225", "Juan", "Perez", 25, "1245", "8785", "A+"),
        2, List.of("54213698", "Florencia", "Guzmán", 17, "8454", "5687", "AB-"),
        3, List.of("12303647", "Julieta", "Perez", 33, "8548", "1234", "0+"),
        4, List.of("95123456", "Pedro", "Martinez", 23, "1234", "9876", "B+")
    );

    // LIST: [idCategoria, idParticipante, monto]
    private static Map<Integer, List<Object>> inscripciones = new HashMap<>();

    private static Set<Integer> inscripcionesCategoriaUno = new HashSet<>();

    private static Set<Integer> inscripcionesCategoriaDos = new HashSet<>();

    private static Set<Integer> inscripcionesCategoriaTres = new HashSet<>();

    private static Integer contadorInscripciones = 1;

    // UTIL FUNCTION
    private static Integer getKey(Map<Integer, List<Object>> map, String value) {
        for (Map.Entry<Integer, List<Object>> entry : map.entrySet()) {
            if (entry.getValue().get(0).equals(value)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // UTIL FUNCTION
    private static Double calcularMontoAbonar(Integer idCategoria, Integer edad) {
        switch (idCategoria) {
            case 1:
                return edad < 18 ? 1300.0D : 1500.0D;

            case 2:
                return edad < 18 ? 2000.0D : 2300.0D;

            case 3:
                return edad < 18 ? -1.0D : 2800.0D;

            default:
                return -1.0D;
        }
    }

    // UTIL FUNCTION
    private static void crearInscripcion(Integer idCategoria, Integer idParticipante) {
        Double montoAbonar = calcularMontoAbonar(idCategoria, (Integer) participantes.get(idParticipante).get(3));
        
        inscripciones.put(
            contadorInscripciones++,
            List.of(idCategoria, idParticipante, montoAbonar)
        );
    }

    // UTIL FUNCTION
    private static void mostrarInscripciones(String nombreCategoria) {
        Integer idCategoria = getKey(categorias, nombreCategoria);

        System.out.println("\n" + "=".repeat(60));
        System.out.println("INSCRIPCIONES DE LA CATEGORÍA " + nombreCategoria.toUpperCase());
        System.out.println("-".repeat(60));

        for (Map.Entry<Integer, List<Object>> inscripcion : inscripciones.entrySet()) {
            if (inscripcion.getValue().get(0).equals(idCategoria)) {
                List<Object> participante = participantes.get(inscripcion.getValue().get(1));
                String datosInscripcion = String.format("Inscripción N°%s: %s %s", inscripcion.getKey(), participante.get(1), participante.get(2));
                System.out.println(datosInscripcion);
            }
        }

        System.out.println("=".repeat(60));
    }

    // UTIL FUNCTION
    private static void eliminarInscripcion(Integer idInscripcion) {
        Integer idCategoria = (Integer) inscripciones.get(idInscripcion).get(0);
        Integer idParticipante = (Integer) inscripciones.get(idInscripcion).get(1);

        switch (idCategoria) {
            case 1:
                inscripcionesCategoriaUno.remove(idParticipante);
                break;
            
            case 2:
                inscripcionesCategoriaDos.remove(idParticipante);
                break;

            case 3:
                inscripcionesCategoriaTres.remove(idParticipante);
                break;
        
            default:
                break;
        }

        inscripciones.remove(idInscripcion);
    }

    // UTIL FUNCTION
    private static void calcularMontosTotalesPorCategoria() {
        Double[] montosTotalesPorCategoria = {0.0D, 0.0D, 0.0D};

        for (Map.Entry<Integer, List<Object>> inscripcion : inscripciones.entrySet()) {
            Integer idCategoria = (Integer) inscripcion.getValue().get(0);
            Double monto = (Double) inscripcion.getValue().get(2);

            montosTotalesPorCategoria[idCategoria - 1] += monto;
        }

        System.out.println("\n" + "=".repeat(60));

        for (Integer indexCategoria = 0; indexCategoria < montosTotalesPorCategoria.length; indexCategoria++) {
            System.out.println(String.format("MONTO TOTAL DE LA CATEGORIA %s: $%s", indexCategoria + 1, montosTotalesPorCategoria[indexCategoria]));
        }

        System.out.println("=".repeat(60));
    }

    // UTIL FUNCTION
    private static void calcularMontoTotalCarrera() {
        Double montoTotal = 0.0D;

        for (Map.Entry<Integer, List<Object>> inscripcion : inscripciones.entrySet()) {
            montoTotal += (Double) inscripcion.getValue().get(2);
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.println(String.format("MONTO TOTAL DE TODA LA CARRERA: $%s", montoTotal));
        System.out.println("=".repeat(60));
    }

    public static void main(String[] args) {
        Integer idJuanPerez = getKey(participantes, "12451225");

        if (inscripcionesCategoriaUno.add(idJuanPerez)) {
            crearInscripcion(getKey(categorias, "Circuito Chico"), idJuanPerez);
        }

        Integer idFlorenciaGuzman = getKey(participantes, "54213698");

        if (inscripcionesCategoriaDos.add(idFlorenciaGuzman)) {
            crearInscripcion(getKey(categorias, "Circuito Medio"), idFlorenciaGuzman);
        }

        Integer idPedroMartinez = getKey(participantes, "95123456");

        if (inscripcionesCategoriaDos.add(idPedroMartinez)) {
            crearInscripcion(getKey(categorias, "Circuito Medio"), idPedroMartinez);
        }

        Integer idJulietaPerez = getKey(participantes, "12303647");

        if (inscripcionesCategoriaTres.add(idJulietaPerez)) {
            crearInscripcion(getKey(categorias, "Circuito Avanzado"), idJulietaPerez);
        }

        mostrarInscripciones("Circuito Medio");
        eliminarInscripcion(3);
        mostrarInscripciones("Circuito Medio");
        calcularMontosTotalesPorCategoria();
        calcularMontoTotalCarrera();
    }

}
