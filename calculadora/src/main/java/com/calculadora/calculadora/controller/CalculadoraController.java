package com.calculadora.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.calculadora.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    //ruta para sumar
    @GetMapping("/sumar")
    public long sumar(@RequestParam long a, @RequestParam long b) {
        return calculadoraService.sumar(a, b);
    }

    //ruta para restar
    @GetMapping("/restar")
    public long restar(@RequestParam long a, @RequestParam long b) {
        return calculadoraService.restar(a, b);
    }
    

    //ruta para multiplicar
    @GetMapping("/multiplicar")
    public long multiplicar(@RequestParam long a, @RequestParam long b) {
        return calculadoraService.multiplicar(a, b);
    }
    //ruta para dividir
    @GetMapping("/dividir")
    public long dividir(@RequestParam long a, @RequestParam long b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return calculadoraService.dividir(a, b);
       
    }

}
