package meli.bootcamp.models;

public abstract class Vehiculo {

    protected Float velocidad;

    protected Float aceleracion;

    protected Float anguloDeGiro;

    protected String patente;

    protected Float peso;

    protected Integer ruedas;

    protected Vehiculo() {
        // Constructor Not Implemented
    }

    protected Vehiculo(Float velocidad, Float aceleracion, Float anguloDeGiro, String patente, Float peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public Float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }

    public Float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Float getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Float anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public Float calcularRendimiento() {
        Float numerador = this.velocidad * 0.5F * this.aceleracion;
        Float denominador = this.anguloDeGiro * (this.peso - (this.ruedas * 100));

        if (denominador == 0) {
            throw new ArithmeticException("Error: División por cero en el cálculo de rendimiento");
        }

        return numerador / denominador;
    }

}
