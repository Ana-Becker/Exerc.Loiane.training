package org.example.exerciciosAula19;

import java.util.Scanner;

public class Ex12_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[5];
        int soma=0;

        System.out.println("Insira os números do vetor: ");
        for (int i=0;i< vetorA.length; i++ ){
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Vetor A: ");
        for (int i=0;i< vetorA.length; i++ ){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Soma dos valores do Vetor: ");
        for (int n:vetorA
             ) { soma += n;

        }
        System.out.println(soma);
    }
}
