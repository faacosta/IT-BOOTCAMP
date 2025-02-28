package meli.bootcamp.models.documentos;

import meli.bootcamp.models.Documento;

public class Libro implements Documento {

    private Integer cantidadPaginas;

    private String nombreAutor;

    private String titulo;

    private String genero;

    public Libro() {
        // Method Not Implemented
    }

    public Libro(Integer cantidadPaginas, String nombreAutor, String titulo, String genero) {
        this.cantidadPaginas = cantidadPaginas;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Integer getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(Integer cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimirDocumento() {
        StringBuilder builder = new StringBuilder();
        builder.append("\u001B[32m");
        builder.append("=".repeat(60)).append("\nDOCUMENTO: LIBRO\n").append("-".repeat(60));
        builder.append("\n  - Cantidad de Paginas: ").append(this.cantidadPaginas);
        builder.append("\n  - Nombre del Autor: ").append(this.nombreAutor);
        builder.append("\n  - Titulo: ").append(this.titulo);
        builder.append("\n  - Genero: ").append(this.genero);
        builder.append("\n").append("=".repeat(60));
        builder.append("\u001B[0m");
        
        System.out.println(builder.toString());
    }
    
}
