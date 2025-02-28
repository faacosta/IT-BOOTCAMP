package meli.bootcamp.models.documentos;

import meli.bootcamp.models.Documento;
import meli.bootcamp.models.Persona;

public class Curriculum implements Documento {

    private Persona persona;

    public Curriculum() {
        // Method Not Implemented
    }

    public Curriculum(Persona persona) {
        this.persona = persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void imprimirDocumento() {
        StringBuilder builder = new StringBuilder();
        builder.append("\u001B[31m");
        builder.append("=".repeat(60)).append("\nDOCUMENTO: CURRICULUM VITAE\n").append("-".repeat(60));
        builder.append("\n").append(this.persona.toString());
        builder.append("\n").append("=".repeat(60));
        builder.append("\u001B[0m");

        System.out.println(builder.toString());
    }
    
}
