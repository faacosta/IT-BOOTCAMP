package meli.bootcamp.models.transacciones;

import meli.bootcamp.models.Transaccion;

public class ConsultaSaldo implements Transaccion {

    public ConsultaSaldo() {
        // Method Not Implemented
    }

    public String transaccionOk() {
        return "Consulta de saldo realizada con éxito";
    }

    public String transaccionNoOk() {
        return "Ocurrió un error al realizar la consulta de saldo";
    }
    
}
