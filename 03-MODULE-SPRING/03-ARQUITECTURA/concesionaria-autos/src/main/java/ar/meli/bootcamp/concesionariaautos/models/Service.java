package ar.meli.bootcamp.concesionariaautos.models;

import java.time.LocalDate;

import ar.meli.bootcamp.concesionariaautos.dtos.requests.ServiceRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    private LocalDate date;

    private Integer kilometers;

    private String descriptions;

    public static Service toEntity(ServiceRequest request) {
        return Service.builder()
            .date(request.date())
            .kilometers(request.kilometers())
            .descriptions(request.descriptions())
            .build();
    }
    
}
