package ar.meli.bootcamp.calculadoracalorias.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dish {

    private Integer code;

    private String name;

    private List<Ingredient> ingredients;

    public Integer calculateCalories() {
        return this.ingredients.stream()
            .mapToInt(Ingredient::getCalories)
            .sum();
    }
    
}
