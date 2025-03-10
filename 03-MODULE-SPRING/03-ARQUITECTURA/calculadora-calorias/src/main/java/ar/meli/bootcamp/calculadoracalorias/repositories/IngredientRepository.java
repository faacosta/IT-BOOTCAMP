package ar.meli.bootcamp.calculadoracalorias.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import ar.meli.bootcamp.calculadoracalorias.models.Ingredient;

@Repository
public class IngredientRepository {

    private List<Ingredient> ingredients = new ArrayList<>();

    public Boolean addAll(List<Ingredient> ingredients) {
        return this.ingredients.addAll(ingredients);
    }

    public Optional<Ingredient> findByName(String name) {
        return this.ingredients.stream()
            .filter(ingredient -> ingredient.getName().equalsIgnoreCase(name))
            .findFirst();
    }
    
}
