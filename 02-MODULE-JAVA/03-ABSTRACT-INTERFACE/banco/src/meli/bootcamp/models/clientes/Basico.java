package meli.bootcamp.models.clientes;

import meli.bootcamp.models.Cliente;
import meli.bootcamp.models.Transaccion;
import meli.bootcamp.models.transacciones.ConsultaSaldo;
import meli.bootcamp.models.transacciones.PagoServicio;
import meli.bootcamp.models.transacciones.RetiroEfectivo;

public class Basico implements Cliente {

    private Transaccion consultaSaldo;

    private Transaccion pagoServicio;

    private Transaccion retiroEfectivo;

    private String nameClass = this.getClass().getSimpleName();

    public Basico() {
        this.consultaSaldo = new ConsultaSaldo();
        this.pagoServicio = new PagoServicio();
        this.retiroEfectivo = new RetiroEfectivo();
    }

    @Override
    public void realizarConsultaSaldo() {
        System.out.println(String.format("%s: %s", this.nameClass, this.consultaSaldo.transaccionOk()));
    }

    @Override
    public void realizarPagoServicio() {
        System.out.println(String.format("%s: %s", this.nameClass, this.pagoServicio.transaccionOk()));
    }

    @Override
    public void realizarRetiroEfectivo() {
        System.out.println(String.format("%s: %s", this.nameClass, this.retiroEfectivo.transaccionNoOk()));
    }
    
}
