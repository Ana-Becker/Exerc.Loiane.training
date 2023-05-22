package org.example.exerciciosAula19;

import java.util.Scanner;

public class Ex3_Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[4];

        for (int i =0; i<vetorA.length; i++){

            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i];

        }

        System.out.print("Vetor A: ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i< vetorB.length; i++){
            System.out.print(vetorA[i]*vetorA[i] + " ");
        }
    }
}
