package ar.meli.bootcamp.edadpersona.controllers;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/age/{day}/{month}/{year}")
    public Integer ageCalculator(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year) {
        String fecha = String.format("%02d/%02d/%s", day, month, year);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();

        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
    
}
