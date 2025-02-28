package meli.bootcamp.models.transacciones;

import meli.bootcamp.models.Transaccion;

public class Transferencia implements Transaccion {

    public Transferencia() {
        // Method Not Implemented
    }

    public String transaccionOk() {
        return "Transferencia realizada con éxito";
    }

    public String transaccionNoOk() {
        return "Ocurrió un error al realizar la transferencia";
    }
    
}
