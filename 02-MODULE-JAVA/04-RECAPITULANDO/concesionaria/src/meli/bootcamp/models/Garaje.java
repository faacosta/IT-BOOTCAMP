package meli.bootcamp.models;

import java.util.ArrayList;
import java.util.List;

public class Garaje {

    private Integer id;

    private List<Vehiculo> vehiculos;

    public Garaje() {
        this.vehiculos = new ArrayList<>();
    }

    public Garaje(Integer id) {
        this();
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
