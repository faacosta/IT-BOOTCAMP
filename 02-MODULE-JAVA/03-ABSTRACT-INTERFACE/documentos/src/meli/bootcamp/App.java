package meli.bootcamp;

import java.util.List;
import meli.bootcamp.models.Documento;
import meli.bootcamp.models.Habilidad;
import meli.bootcamp.models.Persona;
import meli.bootcamp.models.documentos.Curriculum;
import meli.bootcamp.models.documentos.Informe;
import meli.bootcamp.models.documentos.Libro;

public class App {

    private static List<Habilidad> habilidades = List.of(
        new Habilidad("Java"),
        new Habilidad("Gestión de Servidores"),
        new Habilidad("Spring Framework"),
        new Habilidad("Docker"),
        new Habilidad("Pipelines GitLab"),
        new Habilidad("Jasper Reports")
    );

    public static void main(String[] args) {

        Persona juanPerez = new Persona("Juan", "Perez", "20365147");
        juanPerez.agregarHabilidad(habilidades.get(0));
        juanPerez.agregarHabilidad(habilidades.get(4));
        juanPerez.agregarHabilidad(habilidades.get(2));

        Documento curriculumVitae = new Curriculum(juanPerez);
        curriculumVitae.imprimirDocumento();

        System.out.print("\n");

        Documento libro = new Libro(150, "Juan Perez", "Buenas Prácticas en Java", "Programación");
        libro.imprimirDocumento();

        System.out.print("\n");

        Documento informe = new Informe("Contenido del Informe", 2, "Juan Perez", "Laura Achad");
        informe.imprimirDocumento();

    }
    
}
