import java.util.Scanner;

public class AumentoSueldo {

    public static void main(String[] args) {
        
        System.out.println("\n" + "=".repeat(60) + "\nCÁLCULO DE SUELDO\n" + "=".repeat(60));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo base del empleado: $");
        double sueldo = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el DNI del empleado: ");
        String dni = scanner.nextLine();
        
        scanner.close();

        double sueldoConAumento = 0.0;
        
        if (sueldo <= 20000) {
            sueldoConAumento = sueldo * 1.2;
        }
        
        if (sueldo > 20000 && sueldo <= 45000) {
            sueldoConAumento = sueldo * 1.1;
        }
        
        if (sueldo > 45000) {
            sueldoConAumento = sueldo * 1.05;
        }
        
        System.out.println("-".repeat(60));
        System.out.println(String.format("El nuevo sueldo del empleado (DNI: %s) es de: $%s", dni, Math.round(sueldoConAumento)));
        System.out.println("=".repeat(60));
        
    }
    
}
