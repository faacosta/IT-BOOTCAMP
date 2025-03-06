package ar.meli.bootcamp.romanos.controllers;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private String romanConverterUtil(Integer number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder romanNumber = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (number >= entry.getKey()) {
                number -= entry.getKey();
                romanNumber.append(entry.getValue());
            }
        }

        return romanNumber.toString();
    }

    @GetMapping("/{number}")
    public String romanConverter(@PathVariable Integer number) {
        try {
            return this.romanConverterUtil(number);
        } catch (IllegalArgumentException exception) {
            return HttpStatus.BAD_REQUEST.getReasonPhrase();
        }
    }
    
}
