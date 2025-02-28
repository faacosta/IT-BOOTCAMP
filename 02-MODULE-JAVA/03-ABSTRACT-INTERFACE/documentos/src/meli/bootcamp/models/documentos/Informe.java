package meli.bootcamp.models.documentos;

import meli.bootcamp.models.Documento;

public class Informe implements Documento {

    private String texto;

    private Integer cantidadPaginas;

    private String autor;

    private String revisor;

    public Informe() {
        // Method Not Implemented
    }

    public Informe(String texto, Integer cantidadPaginas, String autor, String revisor) {
        this.texto = texto;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(Integer cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public void imprimirDocumento() {
        StringBuilder builder = new StringBuilder();
        builder.append("\u001B[34m");
        builder.append("=".repeat(60)).append("\nDOCUMENTO: INFORME\n").append("-".repeat(60));
        builder.append("\n  - Texto: ").append(this.texto);
        builder.append("\n  - Cantidad de Páginas: ").append(this.cantidadPaginas);
        builder.append("\n  - Autor: ").append(this.autor);
        builder.append("\n  - Revisor: ").append(this.revisor);
        builder.append("\n").append("=".repeat(60));
        builder.append("\u001B[0m");
        
        System.out.println(builder.toString());
    }
    
}
