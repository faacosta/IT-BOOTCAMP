public class ServiciosAdquiridos {

    public static void main(String[] args) {
        
        int[] serviciosAdquiridos = {1, 1, 2, 2, 2, 1, 2};
        
        for (int index = 0; index < serviciosAdquiridos.length; index++) {
            if (serviciosAdquiridos[index] == 1) {
                System.out.println("Tipo de Servicio: Seguridad con Cámaras | Monto: $1.500,00");
            } else {
                System.out.println("Tipo de Servicio: Seguridad con Cámaras + Patrullaje | Monto: $2.200,00");
            }
        }
        
    }
    
}
