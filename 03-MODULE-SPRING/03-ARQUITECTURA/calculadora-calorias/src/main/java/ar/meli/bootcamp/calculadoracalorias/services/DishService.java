package ar.meli.bootcamp.calculadoracalorias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.meli.bootcamp.calculadoracalorias.dtos.responses.IngredientResponse;
import ar.meli.bootcamp.calculadoracalorias.dtos.responses.DishResponse;
import ar.meli.bootcamp.calculadoracalorias.exceptions.EntityNotFoundException;
import ar.meli.bootcamp.calculadoracalorias.models.Dish;
import ar.meli.bootcamp.calculadoracalorias.repositories.DishRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishRepository dishRepository;

    public Boolean generate() {
        return this.dishRepository.addAll();
    }

    public List<DishResponse> getAll() {
        return this.dishRepository.findAll()
            .stream()
            .map(DishResponse::toResponse)
            .toList();
    }

    public Integer calculateCalories(String name) {
        return this.dishRepository.findByName(name)
            .orElseThrow(() -> new EntityNotFoundException(String.format("dish \"%s\" not found", name)))
            .calculateCalories();
    }

    public List<IngredientResponse> getIngredientsDish(String name) {
        return this.dishRepository.findByName(name)
            .orElseThrow(() -> new EntityNotFoundException(String.format("dish \"%s\" not found", name)))
            .getIngredients()
            .stream()
            .map(IngredientResponse::toResponse)
            .toList();
    }

    public IngredientResponse getHighestCalorieIngredient(String name) {
        Dish dish = this.dishRepository.findByName(name)
            .orElseThrow(() -> new EntityNotFoundException(String.format("dish \"%s\" not found", name)));

        return dish.getIngredients()
            .stream()
            .sorted((x, y) -> y.getCalories().compareTo(x.getCalories()))
            .findFirst()
            .map(IngredientResponse::toResponse)
            .orElseThrow(() -> new IllegalStateException(String.format("the dish \"%s\" must contain ingredients", name)));
    }
    
}
