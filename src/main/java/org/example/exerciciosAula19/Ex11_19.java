package org.example.exerciciosAula19;

import java.util.Scanner;

public class Ex11_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[4];
        int quantPar = 0;

        for (int i = 0; i < vetorA.length; i++){
        System.out.println("Entre com o valor da posição " + i);
        vetorA[i] = scanner.nextInt();
        }

        System.out.print("Vetor A= ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Números pares= ");
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 == 0) System.out.print(vetorA[i]+ " ");;

        }
        System.out.println();

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 == 0) {
                quantPar++;
            }
        }
        System.out.println("Quantidade de pares: " + quantPar);




    }}

