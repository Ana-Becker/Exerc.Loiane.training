package org.example.exerciciosAula36;

import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DolarHoje dolarHoje = new DolarHoje();

        for (int i = 0; i< 100; i++){

            System.out.println("Digite o valor em dólares: ");
            dolarHoje.setDolar(scan.nextDouble());
            System.out.println("U$ " + dolarHoje.getDolar() + " -> " + "R$ = " + dolarHoje.trocarMoeda());
            if (dolarHoje.getDolar() == 0){
                break;
            }
        }

    }
}
