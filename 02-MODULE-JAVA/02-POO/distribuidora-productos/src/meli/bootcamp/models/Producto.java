package meli.bootcamp.models;

public class Producto {

    protected String nombre;

    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nombre: ").append(this.nombre).append(" | ");
        builder.append("Precio: $").append(this.precio);

        return builder.toString();
    }

    public Double calcular(Integer cantidadProductos) {
        return this.precio * cantidadProductos;
    }
    
}
