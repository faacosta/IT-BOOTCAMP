package ar.meli.bootcamp.concesionariaautos.dtos.responses;

import java.time.LocalDate;

import ar.meli.bootcamp.concesionariaautos.models.Vehicle;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VehicleResponse {

    private Integer id;

    private String brand;

    private String model;

    private LocalDate manufacturingDate;

    private Integer numberOfKilometers;

    private Integer doors;

    private Integer price;

    private String currency;

    private Integer countOfOwners;

    public static VehicleResponse toResponse(Vehicle entity) {
        return VehicleResponse.builder()
            .id(entity.getId())
            .brand(entity.getBrand())
            .model(entity.getModel())
            .manufacturingDate(entity.getManufacturingDate())
            .numberOfKilometers(entity.getNumberOfKilometers())
            .doors(entity.getDoors())
            .price(entity.getPrice())
            .currency(entity.getCurrency())
            .countOfOwners(entity.getCountOfOwners())
            .build();
    }
    
}
