package meli.bootcamp.models;

public class Cliente {

    private String documento;

    private String nombre;

    private String apellido;

    public Cliente() {
        // Constructor Not Implemented
    }

    public Cliente(String documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return new StringBuilder("  - ")
            .append(this.nombre)
            .append(" ")
            .append(this.apellido)
            .append(String.format(" [DNI: %s]", this.documento))
            .toString();
    }
    
}
