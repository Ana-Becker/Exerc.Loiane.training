package org.example.exerciciosAula36;

import java.util.Scanner;

public class Testesssss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dolar;
        double real;

        for (int i = 0; i<100; i++){

            System.out.println("Digite o valor em dólares: ");
            dolar= scan.nextDouble();
            real = dolar * 4.90;
            System.out.println("U$ " + dolar + " -> " + "R$ = " + real);
            System.out.println("Com taxa: " + (real + (0.0638 * real)));
            if (dolar == 0){
                break;
            }
        }
    }
}
