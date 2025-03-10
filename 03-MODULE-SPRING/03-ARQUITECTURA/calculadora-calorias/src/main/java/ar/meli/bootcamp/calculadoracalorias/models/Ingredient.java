package ar.meli.bootcamp.calculadoracalorias.models;

import ar.meli.bootcamp.calculadoracalorias.dtos.requests.IngredientRequest;
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
public class Ingredient {

    private String name;

    private Integer calories;

    public static Ingredient toEntity(IngredientRequest request) {
        return Ingredient.builder()
            .name(request.getName())
            .calories(request.getCalories())
            .build();
    }
    
}
