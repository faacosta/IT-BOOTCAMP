package ar.meli.bootcamp.codigomorse.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private Map<String, String> morseCode = new HashMap<>();
    
    public ConverterController() {
        this.morseCode.put(".-", "A");
        this.morseCode.put("-...", "B");
        this.morseCode.put("-.-.", "C");
        this.morseCode.put("-..", "D");
        this.morseCode.put(".", "E");
        this.morseCode.put("..-.", "F");
        this.morseCode.put("--.", "G");
        this.morseCode.put("....", "H");
        this.morseCode.put("..", "I");
        this.morseCode.put(".---", "J");
        this.morseCode.put("-.-", "K");
        this.morseCode.put(".-..", "L");
        this.morseCode.put("--", "M");
        this.morseCode.put("-.", "N");
        this.morseCode.put("---", "O");
        this.morseCode.put(".--.", "P");
        this.morseCode.put("--.-", "Q");
        this.morseCode.put(".-.", "R");
        this.morseCode.put("...", "S");
        this.morseCode.put("-", "T");
        this.morseCode.put("..-", "U");
        this.morseCode.put("...-", "V");
        this.morseCode.put(".--", "W");
        this.morseCode.put("-..-", "X");
        this.morseCode.put("-.--", "Y");
        this.morseCode.put("--..", "Z");

        this.morseCode.put(".----", "1");
        this.morseCode.put("..---", "2");
        this.morseCode.put("...--", "3");
        this.morseCode.put("....-", "4");
        this.morseCode.put(".....", "5");
        this.morseCode.put("-....", "6");
        this.morseCode.put("--...", "7");
        this.morseCode.put("---..", "8");
        this.morseCode.put("----.", "9");
        this.morseCode.put("-----", "0");

        this.morseCode.put("..--..", "?");
        this.morseCode.put("-.-.--", "!");
        this.morseCode.put(".-.-.-", ".");
        this.morseCode.put("--..--", ",");
    }

    private String convertWord(String word) {
        return Stream.of(word.split(" "))
            .map(this.morseCode::get)
            .collect(Collectors.joining());
    }

    private String morseConvertUtil(String morse) {
        return Stream.of(morse.split(" {3}"))
            .map(this::convertWord)
            .collect(Collectors.joining(" "));
    }

    @GetMapping("/{morse}")
    public String morseConvert(@PathVariable String morse) {
        return this.morseConvertUtil(morse);
    }
    
}
