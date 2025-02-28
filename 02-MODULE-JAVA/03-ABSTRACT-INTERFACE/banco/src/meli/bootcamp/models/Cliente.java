package meli.bootcamp.models;

public interface Cliente {

    default void realizarDeposito() {
        System.out.println("Transacción no permitida");
    }

    default void realizarTransferencia() {
        System.out.println("Transacción no permitida");
    }

    default void realizarConsultaSaldo() {
        System.out.println("Transacción no permitida");
    }

    default void realizarPagoServicio() {
        System.out.println("Transacción no permitida");
    }

    default void realizarRetiroEfectivo() {
        System.out.println("Transacción no permitida");
    }
    
}
