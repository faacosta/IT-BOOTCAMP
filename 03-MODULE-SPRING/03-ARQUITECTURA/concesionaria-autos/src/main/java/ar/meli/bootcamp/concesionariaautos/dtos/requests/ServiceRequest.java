package ar.meli.bootcamp.concesionariaautos.dtos.requests;

import java.time.LocalDate;

public record ServiceRequest(
    LocalDate date,
    Integer kilometers,
    String descriptions
) {}
