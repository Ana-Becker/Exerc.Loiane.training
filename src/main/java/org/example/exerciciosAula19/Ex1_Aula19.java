package org.example.exerciciosAula19;

public class Ex1_Aula19 {
    public static void main(String[] args) {
        int [] A = new int[5];
        int [] B = {5, 4, 8, 9, 11};

        A = B;

        System.out.print("Vetor A: ");
        for (int i: A ) {
            System.out.print(i + " ");
        }

        System.out.print("\nVetor B: ");
        for (int a:B ) {
            System.out.print(a+ " ");
        }

    }
}
