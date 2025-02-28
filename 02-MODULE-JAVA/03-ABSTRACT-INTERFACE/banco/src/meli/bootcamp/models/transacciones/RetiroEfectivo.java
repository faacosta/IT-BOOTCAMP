package meli.bootcamp.models.transacciones;

import meli.bootcamp.models.Transaccion;

public class RetiroEfectivo implements Transaccion {

    public RetiroEfectivo() {
        // Method Not Implemented
    }

    public String transaccionOk() {
        return "Retiro de efectivo realizado con éxito";
    }

    public String transaccionNoOk() {
        return "Ocurrió un error al realizar un retiro de efectivo";
    }
    
}
