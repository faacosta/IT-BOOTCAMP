package meli.bootcamp.models;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private Integer codigo;

    private Cliente cliente;

    private List<Producto> productos;

    public Factura() {
        this.productos = new ArrayList<>();
    }

    public Factura(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return this.codigo;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(String.format("FACTURA N°%s", this.codigo));
        builder.append("\n").append("-".repeat(60));
        builder.append("\nDATOS DEL CLIENTE:").append("\n").append(this.cliente);
        builder.append("\n").append("-".repeat(60));
        builder.append("\nDATOS DE LA FACTURA:");
        builder.append("\n - CÓDIGO: ").append(this.codigo);
        builder.append("\n - PRODUCTOS: \n");

        for (Integer index = 0; index < this.productos.size(); index++) {
            builder.append(this.productos.get(index));

            if (index < this.productos.size() - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }
    
}
