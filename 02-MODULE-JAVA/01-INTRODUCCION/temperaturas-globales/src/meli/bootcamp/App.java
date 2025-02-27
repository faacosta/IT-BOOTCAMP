package meli.bootcamp;

public class App {

    public static void main(String[] args) {
        
        String[] ciudades = {
            "Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
            "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };

        int[][] temperaturas = {
            {-2, 33},
            {-3, 32},
            {-8, 27},
            {4, 37},
            {6, 42},
            {5, 43},
            {0, 39},
            {-7, 26},
            {-1, 31},
            {-10, 35}
        };

        int indexTemperaturaMinima = 0;
        int indexTemperaturaMaxima = 0;

        for (int index = 0; index < temperaturas.length; index++) {
            if (temperaturas[index][0] < temperaturas[indexTemperaturaMinima][0]) {
                indexTemperaturaMinima = index;
            }

            if (temperaturas[index][1] > temperaturas[indexTemperaturaMaxima][1]) {
                indexTemperaturaMaxima = index;
            }
        }

        System.out.println("=".repeat(60));
        System.out.println(String.format("CIUDAD CON MENOR TEMPERATURA: %s (%s°C)", ciudades[indexTemperaturaMinima], temperaturas[indexTemperaturaMinima][0]));
        System.out.println(String.format("CIUDAD CON MAYOR TEMPERATURA: %s (%s°C)", ciudades[indexTemperaturaMaxima], temperaturas[indexTemperaturaMaxima][1]));
        System.out.println("=".repeat(60));

    }
    
}
