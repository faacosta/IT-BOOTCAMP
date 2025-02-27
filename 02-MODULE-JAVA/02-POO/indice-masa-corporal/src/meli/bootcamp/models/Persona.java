package meli.bootcamp.models;

public class Persona {

    private String nombre;
    
    private Integer edad;

    private String documento;

    private Double peso;

    private Double altura;

    public Persona() {
        // Method Not Implemented
    }

    public Persona(String nombre, Integer edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public Persona(String nombre, Integer edad, String documento, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer calcularIndiceMasaCorporal() {
        if (this.altura == 0.0) {
            throw new ArithmeticException("La altura debería ser distinto de cero");
        }

        Double imc = this.peso / Math.pow(this.altura, 2);

        if (imc < 20.0) {
            return -1;
        } else if (imc >= 20.0 && imc <= 25.0) {
            return 0;
        } else {
            return 1;
        }
    }

    public Boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nombre: ").append(this.nombre).append(" | ");
        builder.append("Edad: ").append(this.edad).append(" | ");
        builder.append("Documento: ").append(this.documento).append(" | ");
        builder.append("Peso: ").append(this.peso).append(" KG | ");
        builder.append("Altura: ").append(this.altura).append(" M");

        return builder.toString();
    }

}
