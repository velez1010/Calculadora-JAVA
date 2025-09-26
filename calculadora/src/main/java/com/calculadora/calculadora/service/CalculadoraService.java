package com.calculadora.calculadora.service;

import org.springframework.stereotype.Service;

@Service

public class CalculadoraService {

    public CalculadoraService() {
    }


    //metodo para sumar
    public long sumar(long a, long b) {
        return a + b;
    }
    //metodo para restar
    public long restar(long a, long b) {
        return a - b;
    }   
    //metodo para multiplicar
    public long multiplicar(long a, long b) {
        return a * b;
    }
    //metodo para dividir
    public long dividir(long a, long b) {   
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return a / b;
    }



    

}
