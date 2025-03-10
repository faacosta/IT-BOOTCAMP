package ar.meli.bootcamp.calculadoracalorias.dtos.responses;

import ar.meli.bootcamp.calculadoracalorias.models.Ingredient;
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
public class IngredientResponse {

    private String name;

    private Integer calories;

    public static IngredientResponse toResponse(Ingredient entity) {
        return IngredientResponse.builder()
            .name(entity.getName())
            .calories(entity.getCalories())
            .build();
    }
    
}
