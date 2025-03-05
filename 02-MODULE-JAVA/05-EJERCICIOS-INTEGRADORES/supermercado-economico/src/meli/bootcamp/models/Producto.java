package meli.bootcamp.models;

public class Producto {

    private String codigo;

    private String nombre;

    private Integer cantidadComprada;

    private Double costoUnitario;

    public Producto() {
        // Contructor Not Implemented
    }

    public Producto(String codigo, String nombre, Integer cantidadComprada, Double costoUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
        this.costoUnitario = costoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(Integer cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    @Override
    public String toString() {
        return String.format("  # %s (%s) - %s - $%s", this.codigo, this.nombre, this.cantidadComprada, this.costoUnitario);
    }
    
}
