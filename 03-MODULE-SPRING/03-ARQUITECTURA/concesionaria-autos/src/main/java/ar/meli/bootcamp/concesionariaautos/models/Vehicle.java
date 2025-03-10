package ar.meli.bootcamp.concesionariaautos.models;

import java.time.LocalDate;
import java.util.List;

import ar.meli.bootcamp.concesionariaautos.dtos.requests.VehicleRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Vehicle {

    private static Integer sequenceId = 0;
    
    private Integer id;

    private String brand;

    private String model;

    private LocalDate manufacturingDate;

    private Integer numberOfKilometers;

    private Integer doors;

    private Integer price;

    private String currency;

    private Integer countOfOwners;

    private List<Service> services;

    public Vehicle() {
        this.id = ++sequenceId;
    }

    public Vehicle(String brand, String model, LocalDate manufacturingDate, Integer numberOfKilometers,
        Integer doors, Integer price, String currency, Integer countOfOwners) {

        this();
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.numberOfKilometers = numberOfKilometers;
        this.doors = doors;
        this.price = price;
        this.currency = currency;
        this.countOfOwners = countOfOwners;

    }

    public static Vehicle toEntity(VehicleRequest request) {
        List<Service> services = request.services()
            .stream()
            .map(Service::toEntity)
            .toList();
        
        return Vehicle.builder()
            .id(++sequenceId)
            .brand(request.brand())
            .model(request.model())
            .manufacturingDate(request.manufacturingDate())
            .numberOfKilometers(request.numberOfKilometers())
            .doors(request.doors())
            .price(request.price())
            .currency(request.currency())
            .countOfOwners(request.countOfOwners())
            .services(services)
            .build();
    }

}
