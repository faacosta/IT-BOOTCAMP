package meli.bootcamp.models;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;

    private String apellido;

    private String documento;

    private List<Habilidad> habilidades;

    public Persona() {
        this.habilidades = new ArrayList<>();
    }

    public Persona(String nombre, String apellido, String documento) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Nombre: ").append(this.nombre).append("\n");
        builder.append(" - Apellido: ").append(this.apellido).append("\n");
        builder.append(" - Documento: ").append(this.documento).append("\n");
        builder.append(" - Habilidades:");
        
        this.habilidades.stream()
            .forEach(habilidad -> builder.append("\n    # ").append(habilidad));

        return builder.toString();
    }

    public void agregarHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
    }
    
}
