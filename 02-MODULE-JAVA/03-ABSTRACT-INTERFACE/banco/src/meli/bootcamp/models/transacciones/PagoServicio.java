package meli.bootcamp.models.transacciones;

import meli.bootcamp.models.Transaccion;

public class PagoServicio implements Transaccion {

    public PagoServicio() {
        // Method Not Implemented
    }

    public String transaccionOk() {
        return "Pago de servicio realizado con éxito";
    }

    public String transaccionNoOk() {
        return "Ocurrió un error al realizar el pago de servicio";
    }
    
}
