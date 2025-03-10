package ar.meli.bootcamp.calculadoracalorias.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import ar.meli.bootcamp.calculadoracalorias.exceptions.EntityNotFoundException;
import ar.meli.bootcamp.calculadoracalorias.models.Dish;
import ar.meli.bootcamp.calculadoracalorias.models.Ingredient;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class DishRepository {

    public final List<Dish> dishes = new ArrayList<>();

    private final IngredientRepository ingredienteRepository;

    private Ingredient findIngredientByName(String name) {
        return this.ingredienteRepository.findByName(name)
            .orElseThrow(() -> new EntityNotFoundException(String.format("ingredient \"%s\" not found", name)));
    }

    public Boolean addAll() {
        dishes.add(new Dish(1, "Ensalada Mediterránea", List.of(
            this.findIngredientByName("Aceitunas negras"),
            this.findIngredientByName("Aceitunas verdes"),
            this.findIngredientByName("Brócoli")
        )));
        
        dishes.add(new Dish(2, "Pollo al Horno", List.of(
            this.findIngredientByName("Pollo"),
            this.findIngredientByName("Pimiento"),
            this.findIngredientByName("Salsa de tomate en conserva")
        )));
        
        dishes.add(new Dish(3, "Sopa de Espinaca", List.of(
            this.findIngredientByName("Espinaca"),
            this.findIngredientByName("Ajos"),
            this.findIngredientByName("Zanahoria")
        )));
        
        dishes.add(new Dish(4, "Tortilla de Verduras", List.of(
            this.findIngredientByName("Queso mozzarella"),
            this.findIngredientByName("Brócoli"),
            this.findIngredientByName("Pimiento")
        )));
        
        dishes.add(new Dish(5, "Pasta con Salsa de Tomate", List.of(
            this.findIngredientByName("Brócoli"),
            this.findIngredientByName("Salsa de tomate en conserva"),
            this.findIngredientByName("Pollo")
        )));
        
        dishes.add(new Dish(6, "Ensalada de Pollo", List.of(
            this.findIngredientByName("Pollo"),
            this.findIngredientByName("Aceitunas negras"),
            this.findIngredientByName("Aceitunas verdes")
        )));
        
        dishes.add(new Dish(7, "Brócoli al Vapor", List.of(
            this.findIngredientByName("Brócoli")
        )));
        
        dishes.add(new Dish(8, "Pimientos Rellenos", List.of(
            this.findIngredientByName("Pimiento"),
            this.findIngredientByName("Aceitunas negras"),
            this.findIngredientByName("Pollo")
        )));
        
        dishes.add(new Dish(9, "Zanahorias Glaseadas", List.of(
            this.findIngredientByName("Zanahoria"),
            this.findIngredientByName("Ajos")
        )));
        
        dishes.add(new Dish(10, "Pizza Vegetariana", List.of(
            this.findIngredientByName("Aceitunas negras"),
            this.findIngredientByName("Brócoli"),
            this.findIngredientByName("Pimiento"),
            this.findIngredientByName("Salsa de tomate en conserva")
        )));

        return Boolean.TRUE;
    }

    public List<Dish> findAll() {
        return this.dishes;
    }

    public Optional<Dish> findByName(String name) {
        return this.dishes.stream()
            .filter(dish -> dish.getName().equalsIgnoreCase(name))
            .findFirst();
    }
    
}
