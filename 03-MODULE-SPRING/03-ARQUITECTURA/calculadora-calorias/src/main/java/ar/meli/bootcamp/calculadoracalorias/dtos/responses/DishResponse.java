package ar.meli.bootcamp.calculadoracalorias.dtos.responses;

import ar.meli.bootcamp.calculadoracalorias.models.Dish;
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
public class DishResponse {

    private Integer code;

    private String name;

    public static DishResponse toResponse(Dish entity) {
        return DishResponse.builder()
            .code(entity.getCode())
            .name(entity.getName())
            .build();
    }
    
}
