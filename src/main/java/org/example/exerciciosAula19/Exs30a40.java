package org.example.exerciciosAula19;

import java.util.Random;
import java.util.Scanner;

public class Exs30a40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ex31
        /*int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int posB=0;

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i + " do vetor A");
            vetorA[i]= scanner.nextInt();
        }

        for (int i = 0; i< vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                vetorB[posB]=vetorA[i];
                posB++;
            }
        }

        for (int i = 0; i< vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                vetorB[posB]=vetorA[i];
                posB ++ ;
            }
        }

        System.out.println("Vetor A: ");
        for (int c:vetorA
        ) {
            System.out.print(c + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i = 0; i< vetorB.length;i++){
            System.out.print(vetorB[i] + " ");
        }*/

        //EX 32
        /*int[] vetorA = new int[5];
        int posA=0;
        int num=2;

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i + " do vetor A");
            vetorA[i]= scanner.nextInt();
        }

        System.out.println("Vetor A: ");
        for (int a:vetorA
             ) {
            System.out.print(a+" ");
        }

        for (int i = 2; i<11;i++){
            System.out.println("\nTabuada - X " + i);
            for (int a:vetorA
            ) {
                System.out.print(a*i + " ");
            }*/

        //Ex33
        /*int[] vetorA = new int[10];
        boolean primo;
        String msg;

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i);
            vetorA[i]= scanner.nextInt();
        }

        for (int i = 0; i< vetorA.length;i++){
            primo=true;
            for (int j =2; j<vetorA[i];j++ ){
                if (vetorA[i] % j == 0){
                primo=false;
                break;
                }
            }

            if (primo){
                msg = "primo";}else {
                msg = "não é primo ";
            }
            System.out.println(vetorA[i] + " - " + msg);
        }*/

        //Ex34
        /*int[] vetorA = new int[10];
        boolean par;

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i);
            vetorA[i]= scanner.nextInt();
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nPares: ");
        for (int i = 0; i< vetorA.length; i++){
            if (vetorA[i] % 2 ==0) {
                System.out.print(vetorA[i] + " ");}
        }*/

        //Ex 36
        /*double [] vetorA = new double[11];

        System.out.println("Vetor A: ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println("\n2 elevado a " + i + ": ");
            vetorA[i]= Math.pow(2,i);
            System.out.print(vetorA[i]);
        }*/

        //Ex37
        /*int [] vetorA = new int[11];
        int [] vetorB = new int[vetorA.length];
        int fatorial;
        int num=1;

        for (int i = 0; i < vetorA.length; i ++){
            System.out.println("Digite o número de posição " + i);
            vetorA[i]= scanner.nextInt();
        }

        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i = 0 ; i< vetorA.length; i++){
            vetorB[i]=1;
            for (int j=1; j<=vetorA[i] ; j ++) {
                vetorB[i] *= j;
            }
        }

        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }*/

        //Ex 38
        /*int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        Random r = new Random();

        for (int i = 0; i < vetorA.length; i ++){
            System.out.println("Digite o número de posição " + i);
            vetorA[i]= scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i ++){
           vetorB[i] = (int) (vetorA[i] + r.nextInt(10));
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i ++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorA.length; i ++){
            System.out.print(vetorB[i] + " ");
        }*/

        //Ex 39 - incompleto
        /*int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length*2];
        boolean igual=true;

        for (int i = 0; i < vetorA.length; i ++){
            System.out.println("Digite o número de posição " + i + " do vetor A: ");
            vetorA[i]= scanner.nextInt();
            vetorC[i]=vetorA[i];
        }

        for (int i = 0; i < vetorA.length; i ++){
            System.out.println("Digite o número de posição " + i + " do vetor B: ");
            vetorB[i]= scanner.nextInt();
            for (int a:vetorA){
                if (vetorB[i] != a) {
                    vetorC[vetorB.length + (i)]= (vetorB[i]);
                }else {vetorC[vetorB.length + (i)]= 0; };
            }

        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i ++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorA.length; i ++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i ++){
            System.out.print(vetorC[i] + " ");
        }*/



    }
}

