package meli.bootcamp;

import meli.bootcamp.models.Cliente;
import meli.bootcamp.models.clientes.Basico;
import meli.bootcamp.models.clientes.Cobrador;
import meli.bootcamp.models.clientes.Ejecutivo;

public class Banco {

    public static void main(String[] args) {

        Cliente cobrador = new Cobrador();

        Cliente ejecutivo = new Ejecutivo();

        Cliente basico = new Basico();

        System.out.println("=".repeat(80));
        System.out.println("Banco MeLi");
        System.out.println("-".repeat(80));

        cobrador.realizarRetiroEfectivo();
        cobrador.realizarConsultaSaldo();
        cobrador.realizarDeposito(); // Operación No Permitida

        System.out.print("\n");

        ejecutivo.realizarDeposito();
        ejecutivo.realizarTransferencia();
        ejecutivo.realizarPagoServicio(); // Operación No Permitida

        System.out.print("\n");

        basico.realizarConsultaSaldo();
        basico.realizarPagoServicio();
        basico.realizarRetiroEfectivo();
        basico.realizarTransferencia(); // Operación No Permitida

        System.out.println("=".repeat(80));

    }

}
