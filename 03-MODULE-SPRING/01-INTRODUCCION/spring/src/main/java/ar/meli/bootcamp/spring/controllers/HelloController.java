package ar.meli.bootcamp.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String sayHelloName(@PathVariable String name) {
        return String.format("Hello %s", name);
    }
    
}
