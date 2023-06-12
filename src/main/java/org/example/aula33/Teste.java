package org.example.aula33;

public class Teste {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();

        double soma1 = calc.somar(2.5, 5.6);
        int soma2 = calc.somar(5,3,4);

        System.out.println(soma1);
        System.out.println(soma2);

    }
}
