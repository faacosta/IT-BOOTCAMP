package ar.meli.bootcamp.codigomorse.converters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class SpanishConverter {

    private Map<String, String> morseCode = new HashMap<>();

    @PostConstruct
    private void init() {
        this.morseCode.put("A", ".-");
        this.morseCode.put("B", "-...");
        this.morseCode.put("C", "-.-.");
        this.morseCode.put("D", "-..");
        this.morseCode.put("E", ".");
        this.morseCode.put("F", "..-.");
        this.morseCode.put("G", "--.");
        this.morseCode.put("H", "....");
        this.morseCode.put("I", "..");
        this.morseCode.put("J", ".---");
        this.morseCode.put("K", "-.-");
        this.morseCode.put("L", ".-..");
        this.morseCode.put("M", "--");
        this.morseCode.put("N", "-.");
        this.morseCode.put("O", "---");
        this.morseCode.put("P", ".--.");
        this.morseCode.put("Q", "--.-");
        this.morseCode.put("R", ".-.");
        this.morseCode.put("S", "...");
        this.morseCode.put("T", "-");
        this.morseCode.put("U", "..-");
        this.morseCode.put("V", "...-");
        this.morseCode.put("W", ".--");
        this.morseCode.put("X", "-..-");
        this.morseCode.put("Y", "-.--");
        this.morseCode.put("Z", "--..");

        this.morseCode.put("1", ".----");
        this.morseCode.put("2", "..---");
        this.morseCode.put("3", "...--");
        this.morseCode.put("4", "....-");
        this.morseCode.put("5", ".....");
        this.morseCode.put("6", "-....");
        this.morseCode.put("7", "--...");
        this.morseCode.put("8", "---..");
        this.morseCode.put("9", "----.");
        this.morseCode.put("0", "-----");

        this.morseCode.put("?", "..--..");
        this.morseCode.put("!", "-.-.--");
        this.morseCode.put(".", ".-.-.-");
        this.morseCode.put(",", "--..--");
    }

    private String convertWord(String word) {
        return Stream.of(word.split(""))
            .map(letter -> this.morseCode.get(letter.toUpperCase()))
            .collect(Collectors.joining(" "));
    }

    public String convertPrayer(String prayer) {
        return Stream.of(prayer.split(" "))
            .map(this::convertWord)
            .collect(Collectors.joining("   "));
    }
    
}
