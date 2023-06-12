package org.example.exerciciosAula34;

public class Calculadora {

    static double somar (double num1, double num2){
        return num1 + num2;
    }

    static double subtrair (double num1, double num2){
        return num1 - num2;
    }

    static double multiplicar (double num1, double num2){
        return num1 * num2;
    }

    static double dividir(double num1, double num2){
        return num1 / num2;
    }

    static double potencia (double num1, double num2){
        int total = 1;
        for (int i = 1; i<=num2; i++){
           total *= num1;
        }
        return total;
    }

    static double calcularFatorial(int num1){
        int fatorial = 1;
        for (int i = num1; i > 0 ; i --){
            fatorial *= i;
        }
        return fatorial;
    }

}
