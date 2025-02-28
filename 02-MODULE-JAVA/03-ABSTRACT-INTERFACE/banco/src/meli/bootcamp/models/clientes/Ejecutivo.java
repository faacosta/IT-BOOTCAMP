package meli.bootcamp.models.clientes;

import meli.bootcamp.models.Cliente;
import meli.bootcamp.models.Transaccion;
import meli.bootcamp.models.transacciones.Deposito;
import meli.bootcamp.models.transacciones.Transferencia;

public class Ejecutivo implements Cliente {

    private Transaccion deposito;

    private Transaccion transferencia;

    private String nameClass = this.getClass().getSimpleName();

    public Ejecutivo() {
        this.deposito = new Deposito();
        this.transferencia = new Transferencia();
    }

    @Override
    public void realizarDeposito() {
        System.out.println(String.format("%s: %s", this.nameClass, this.deposito.transaccionOk()));
    }

    @Override
    public void realizarTransferencia() {
        System.out.println(String.format("%s: %s", this.nameClass, this.transferencia.transaccionNoOk()));
    }
    
}
