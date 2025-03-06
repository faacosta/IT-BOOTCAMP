package meli.bootcamp.models;

import java.util.ArrayList;
import java.util.List;
import meli.bootcamp.models.vehiculos.Auto;
import meli.bootcamp.models.vehiculos.Moto;

public class Carrera {

    private Float distancia;

    private Float premioEnDolares;

    private String nombre;

    private Integer cantidadVehiculosPermitidos;

    private List<Vehiculo> vehiculos;

    public Carrera() {
        this.vehiculos = new ArrayList<>();
    }

    public Carrera(Float distancia, Float premioEnDolares, String nombre, Integer cantidadVehiculosPermitidos) {
        this();
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    }

    public Float getDistancia() {
        return distancia;
    }

    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }

    public Float getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(Float premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadVehiculosPermitidos() {
        return cantidadVehiculosPermitidos;
    }

    public void setCantidadVehiculosPermitidos(Integer cantidadVehiculosPermitidos) {
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (this.vehiculos.size() < this.cantidadVehiculosPermitidos) {
            this.vehiculos.add(vehiculo);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (this.vehiculos.contains(vehiculo)) {
            this.vehiculos.remove(vehiculo);
        }
    }

    public void eliminarVehiculo(String patente) {
        Vehiculo vehiculoEncontrado = this.vehiculos.stream()
            .filter(vehiculo -> vehiculo.getPatente().equalsIgnoreCase(patente))
            .findFirst()
            .orElse(null);

        if (vehiculoEncontrado != null) {
            this.vehiculos.remove(vehiculoEncontrado);
        }
    }

    public Vehiculo definirGanador() {
        return this.vehiculos.stream()
            .sorted((x, y) -> y.calcularRendimiento().compareTo(x.calcularRendimiento()))
            .findFirst()
            .orElse(null);
    }

    public String socorrerAuto(Auto auto) {
        return auto.socorrer();
    }

    public String socorrerMoto(Moto moto) {
        return moto.socorrer();
    }
    
}
