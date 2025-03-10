package ar.meli.bootcamp.calculadoracalorias.services;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.meli.bootcamp.calculadoracalorias.dtos.requests.IngredientRequest;
import ar.meli.bootcamp.calculadoracalorias.models.Ingredient;
import ar.meli.bootcamp.calculadoracalorias.repositories.IngredientRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public Boolean postAll(List<IngredientRequest> requests) {
        return this.ingredientRepository.addAll(
            requests.stream()
                .map(Ingredient::toEntity)
                .toList()
        );
    }
    
}
