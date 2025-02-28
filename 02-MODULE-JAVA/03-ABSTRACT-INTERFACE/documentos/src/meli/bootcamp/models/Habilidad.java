package meli.bootcamp.models;

public class Habilidad {

    private String descripcion;

    public Habilidad() {
        // Method Not Implemented
    }

    public Habilidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
    
}
