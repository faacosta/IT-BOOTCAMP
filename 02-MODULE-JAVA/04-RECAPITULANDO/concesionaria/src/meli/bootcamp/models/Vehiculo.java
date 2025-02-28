package meli.bootcamp.models;

public class Vehiculo {

    private String marca;

    private String modelo;

    private Double costo;

    public Vehiculo() {
        
    }

    public Vehiculo(String marca, String modelo, Double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("  - ").append(this.marca).append(" ").append(this.modelo).append(": $").append(this.costo);

        return builder.toString();
    }
    
}
