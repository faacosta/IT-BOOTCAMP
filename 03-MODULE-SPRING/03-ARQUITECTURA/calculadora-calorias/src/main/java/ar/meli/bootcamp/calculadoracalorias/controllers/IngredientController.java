package ar.meli.bootcamp.calculadoracalorias.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.meli.bootcamp.calculadoracalorias.dtos.requests.IngredientRequest;
import ar.meli.bootcamp.calculadoracalorias.services.IngredientService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    @PostMapping
    public ResponseEntity<Boolean> postAll(@RequestBody List<IngredientRequest> requests) {
        return ResponseEntity.ok(this.ingredientService.postAll(requests));
    }
    
}
