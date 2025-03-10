package ar.meli.bootcamp.concesionariaautos.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import ar.meli.bootcamp.concesionariaautos.models.Vehicle;

@Repository
public class VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    public Boolean addOne(Vehicle vehicle) {
        return this.vehicles.add(vehicle);
    }

    public List<Vehicle> findAll() {
        return this.vehicles;
    }

    public List<Vehicle> findByManufacturingDate(LocalDate since, LocalDate to) {
        return this.vehicles.stream()
            .filter(vehicle -> !vehicle.getManufacturingDate().isBefore(since) && !vehicle.getManufacturingDate().isAfter(to))
            .toList();
    }

    public List<Vehicle> findByPrices(Integer since, Integer to) {
        return this.vehicles.stream()
            .filter(vehicle -> vehicle.getPrice() >= since && vehicle.getPrice() <= to)
            .toList();
    }

    public Optional<Vehicle> findById(Integer id) {
        return this.vehicles.stream()
            .filter(vehicle -> vehicle.getId().equals(id))
            .findFirst();
    }
    
}
