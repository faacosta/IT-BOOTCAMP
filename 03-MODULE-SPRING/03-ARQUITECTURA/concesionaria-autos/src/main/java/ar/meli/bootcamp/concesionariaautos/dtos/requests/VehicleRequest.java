package ar.meli.bootcamp.concesionariaautos.dtos.requests;

import java.time.LocalDate;
import java.util.List;

public record VehicleRequest(
    String brand,
    String model,
    LocalDate manufacturingDate,
    Integer numberOfKilometers,
    Integer doors,
    Integer price,
    String currency,
    Integer countOfOwners,
    List<ServiceRequest> services
) {}
