package meli.bootcamp.models;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private Cliente cliente;

    private List<Producto> productos;

    public Factura() {
        this.productos = new ArrayList<>();
    }

    public Factura(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
        }
    }

    public Double calcularTotal() {
        return this.productos.stream()
            .mapToDouble(producto -> producto.getCostoUnitario() * producto.getCantidadComprada())
            .sum();
    }
    
}
