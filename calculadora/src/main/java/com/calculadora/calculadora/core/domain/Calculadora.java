package com.calculadora.calculadora.core.domain;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {


   private long sumar;
   private long restar;
   private long multiplicar;
   private long dividir;
    private long resultado;

    public Calculadora() {
    }

    
   
    public Calculadora(long sumar, long restar, long multiplicar, long dividir, long resultado) {
          this.sumar = sumar;
          this.restar = restar;
          this.multiplicar = multiplicar;
          this.dividir = dividir;
          this.resultado = resultado;
     }

    public long getSumar() {
        return sumar;
    }

    public long getRestar() {
        return restar;
    }

    public long getMultiplicar() {
        return multiplicar;
    }

    public long getDividir() {
        return dividir;
    }

    public long getResultado() {
        return resultado;
    }

    public long setResultado(long resultado) {
        return this.resultado = resultado;
    }

    public long setSumar(long sumar) {
        return this.sumar = sumar;
    }
    public long setRestar(long restar) {
        return this.restar = restar;
    }

    public long setMultiplicar(long multiplicar) {
        return this.multiplicar = multiplicar;
    }

    public long setDividir(long dividir) {
        return this.dividir = dividir;
    }

}

   
