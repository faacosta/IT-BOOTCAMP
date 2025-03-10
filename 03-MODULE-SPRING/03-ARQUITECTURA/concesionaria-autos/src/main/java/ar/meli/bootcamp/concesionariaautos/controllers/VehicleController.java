package ar.meli.bootcamp.concesionariaautos.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.meli.bootcamp.concesionariaautos.dtos.requests.VehicleRequest;
import ar.meli.bootcamp.concesionariaautos.dtos.responses.VehicleResponse;
import ar.meli.bootcamp.concesionariaautos.exceptions.EntityNotFoundException;
import ar.meli.bootcamp.concesionariaautos.services.VehicleService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Boolean> postOne(@RequestBody VehicleRequest request) {
        return ResponseEntity.ok(this.vehicleService.addOne(request));
    }

    @GetMapping
    public ResponseEntity<List<VehicleResponse>> getAll() {
        return ResponseEntity.ok(this.vehicleService.findAll());
    }

    @GetMapping("/dates")
    public ResponseEntity<List<VehicleResponse>> getByManufacturingDate(@RequestParam LocalDate since, @RequestParam LocalDate to) {
        return ResponseEntity.ok(this.vehicleService.findByManufacturingDate(since, to));
    }

    @GetMapping("/prices")
    public ResponseEntity<List<VehicleResponse>> getByPrice(@RequestParam Integer since, @RequestParam Integer to) {
        return ResponseEntity.ok(this.vehicleService.findByPrice(since, to));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleResponse> getById(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(this.vehicleService.findById(id));
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }
    
}
