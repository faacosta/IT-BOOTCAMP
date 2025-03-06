package ar.meli.bootcamp.codigomorse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ar.meli.bootcamp.codigomorse.converters.MorseConverter;
import ar.meli.bootcamp.codigomorse.converters.SpanishConverter;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ConverterController {

    private final MorseConverter morseConverter;

    private final SpanishConverter spanishConverter;

    @GetMapping("/morse/{prayer}")
    public String morseConvert(@PathVariable String prayer) {
        return this.morseConverter.convertPrayer(prayer);
    }

    @GetMapping("/spanish/{prayer}")
    public String spanishConvert(@PathVariable String prayer) {
        return this.spanishConverter.convertPrayer(prayer);
    }
    
}
