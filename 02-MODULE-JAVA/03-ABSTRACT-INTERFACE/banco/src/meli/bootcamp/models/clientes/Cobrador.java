package meli.bootcamp.models.clientes;

import meli.bootcamp.models.Cliente;
import meli.bootcamp.models.Transaccion;
import meli.bootcamp.models.transacciones.ConsultaSaldo;
import meli.bootcamp.models.transacciones.RetiroEfectivo;

public class Cobrador implements Cliente {

    private Transaccion retiroEfectivo;

    private Transaccion consultaSaldo;

    private String nameClass = this.getClass().getSimpleName();

    public Cobrador() {
        this.retiroEfectivo = new RetiroEfectivo();
        this.consultaSaldo = new ConsultaSaldo();
    }

    @Override
    public void realizarRetiroEfectivo() {
        System.out.println(String.format("%s: %s", this.nameClass, this.retiroEfectivo.transaccionOk()));
    }

    @Override
    public void realizarConsultaSaldo() {
        System.out.println(String.format("%s: %s", this.nameClass, this.consultaSaldo.transaccionNoOk()));
    }
    
}
