package meli.bootcamp.models.transacciones;

import meli.bootcamp.models.Transaccion;

public class Deposito implements Transaccion {

    public Deposito() {
        // Method Not Implemented
    }

    public String transaccionOk() {
        return "Deposito realizado con éxito";
    }

    public String transaccionNoOk() {
        return "Ocurrió un error al realizar el depósito";
    }
    
}
