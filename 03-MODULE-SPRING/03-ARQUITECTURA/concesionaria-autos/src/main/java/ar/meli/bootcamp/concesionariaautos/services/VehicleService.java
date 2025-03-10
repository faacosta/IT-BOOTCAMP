package ar.meli.bootcamp.concesionariaautos.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.meli.bootcamp.concesionariaautos.dtos.requests.VehicleRequest;
import ar.meli.bootcamp.concesionariaautos.dtos.responses.VehicleResponse;
import ar.meli.bootcamp.concesionariaautos.exceptions.EntityNotFoundException;
import ar.meli.bootcamp.concesionariaautos.models.Vehicle;
import ar.meli.bootcamp.concesionariaautos.repositories.VehicleRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public Boolean addOne(VehicleRequest request) {
        return this.vehicleRepository.addOne(Vehicle.toEntity(request));
    }

    public List<VehicleResponse> findAll() {
        return this.vehicleRepository.findAll()
            .stream()
            .map(VehicleResponse::toResponse)
            .toList();
    }

    public List<VehicleResponse> findByManufacturingDate(LocalDate since, LocalDate to) {
        return this.vehicleRepository.findByManufacturingDate(since, to)
            .stream()
            .map(VehicleResponse::toResponse)
            .toList();
    }

    public List<VehicleResponse> findByPrice(Integer since, Integer to) {
        return this.vehicleRepository.findByPrices(since, to)
            .stream()
            .map(VehicleResponse::toResponse)
            .toList();
    }

    public VehicleResponse findById(Integer id) {
        Vehicle vehicle = this.vehicleRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException(String.format("vehicle id %s, not found", id)));

        return VehicleResponse.toResponse(vehicle);
    }
    
}
