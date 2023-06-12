package org.example.exerciciosAula36;

import java.util.Scanner;

public class DolarHoje {
   private double dolar;

    public DolarHoje() {
    }

    public DolarHoje(double dolar) {
        this.dolar = dolar;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double trocarMoeda (){
        return dolar*(4.98);
    }
}
