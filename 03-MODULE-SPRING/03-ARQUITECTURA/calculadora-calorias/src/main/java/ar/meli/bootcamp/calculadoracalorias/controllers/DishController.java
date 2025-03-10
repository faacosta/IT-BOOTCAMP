package ar.meli.bootcamp.calculadoracalorias.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.meli.bootcamp.calculadoracalorias.dtos.responses.IngredientResponse;
import ar.meli.bootcamp.calculadoracalorias.dtos.responses.DishResponse;
import ar.meli.bootcamp.calculadoracalorias.exceptions.EntityNotFoundException;
import ar.meli.bootcamp.calculadoracalorias.services.DishService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dishes")
public class DishController {

    private final DishService dishService;

    @PostMapping
    public ResponseEntity<Boolean> generate() {
        try {
            return ResponseEntity.ok(this.dishService.generate());
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping
    public ResponseEntity<List<DishResponse>> getAll() {
        return ResponseEntity.ok(this.dishService.getAll());
    }

    @GetMapping("/calculate-calories")
    public ResponseEntity<Integer> calculateCalories(@RequestParam String name) {
        try {
            return ResponseEntity.ok(this.dishService.calculateCalories(name));
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/ingredients-dish")
    public ResponseEntity<List<IngredientResponse>> getIngredientsDish(@RequestParam String name) {
        try {
            return ResponseEntity.ok(this.dishService.getIngredientsDish(name));
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/highest-calorie-ingredient")
    public ResponseEntity<IngredientResponse> getHighestCalorieIngredient(@RequestParam String name) {
        try {
            return ResponseEntity.ok(this.dishService.getHighestCalorieIngredient(name));
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }
    
}
