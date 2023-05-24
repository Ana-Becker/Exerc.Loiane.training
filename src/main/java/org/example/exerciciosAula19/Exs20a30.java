package org.example.exerciciosAula19;

import java.util.Scanner;

public class Exs20a30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX22
        /*int[] vetorA = new int[10];
        int quantZero=0;
        int quantUm=0;

        for (int i=0;i< vetorA.length;i++){
            vetorA[i]=(int)Math.round(Math.random()*1);
            System.out.print(vetorA[i]+" ");
        }

        for (int a:vetorA
             ) {
            if (a==0) {
                quantZero++;
            }else {quantUm++;}
        }

        System.out.println("\nPercentual de zero: " + quantZero*10 + " % ");
        System.out.println("Percentual de um: " + quantUm*10 + " % ");*/

        //EX23
        /*int[] vetorA = new int[10];

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i);
            vetorA[i]= scanner.nextInt();
            if (vetorA[i] %2 != 0){break;}
        }*/

        //EX24
        /*int[] vetorA = new int[10];

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i);
            vetorA[i]= scanner.nextInt();

        }

        System.out.println("Vetor A: ");
        for (int a:vetorA
             ) {
            System.out.print(a + " ");
        }

        if (vetorA[0]==vetorA[9] | vetorA[1]==vetorA[8]|
                vetorA[2]==vetorA[7]|vetorA[3]==vetorA[6]| vetorA[4]==vetorA[5]){
            System.out.println("\nO vetor é palíndromo");} else {
            System.out.println("\nO vetor não é palíndromo");
        }*/

        //EX25
        /*int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o número de posição " + i);
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }}

            System.out.println("Vetor A: ");
            for (int a : vetorA
            ) {
                System.out.print(a + " ");
            }
            System.out.println("\nVetor B: ");
            for (int b : vetorB
            ) {
                System.out.print(b + " ");
            }*/

        //EX26
        /*int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int par = 0;
        int impar = 0;

        for (int i = 0; i< vetorA.length;i++){
            System.out.println("Digite o número de posição " + i + " do vetor A: ");
            vetorA[i]= scanner.nextInt();
            System.out.println("Digite o número de posição " + i + " do vetor B:");
            vetorB[i]= scanner.nextInt();
            if (vetorA[i]>vetorB[i]){
                vetorC[i]=1;
            } else if (vetorA[i]==vetorB[i]) {
                vetorC[i]= 0;
            }else {vetorC[i] = -1;}
        }

        System.out.println("Vetor A: ");
        for (int c:vetorA
        ){
            System.out.print(c + " ");
        }

        System.out.println("\nVetor B: ");
        for (int c:vetorB
        ){
            System.out.print(c + " ");
        }

        System.out.println("\nVetor C: ");
        for (int c:vetorC
        ){
            System.out.print(c + " ");
        }*/

        //EX28
        /*int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i< vetorA.length; i ++){
            System.out.println("Digite o número da posição " + i);
            vetorA[i]= scanner.nextInt();
            vetorB[vetorA.length - (i+1)] = vetorA[i];
        }

        System.out.println("Vetor A: ");
        for (int a :vetorA
             ) {
            System.out.print(a + " ");
        }

        System.out.println("\nVetor B: ");
        for (int a :vetorB
             ) {System.out.print(a + " ");
        }*/

        //EX29
        /*int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[vetorB.length*2];

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i + " do vetor A");
            vetorA[i]= scanner.nextInt();
            vetorC[i]= vetorA[i] ;
        }
        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i + " do vetor B");
            vetorB[i]= scanner.nextInt();
            vetorC[vetorB.length + (i)]= (vetorB[i]) ;
        }

        System.out.println("Vetor A: ");
        for (int c:vetorA
        ) {
            System.out.print(c + " ");
        }

        System.out.println("\nVetor B: ");
        for (int c:vetorB
        ) {
            System.out.print(c + " ");
        }

        System.out.println("\nVetor C: ");
        for (int c:vetorC
             ) {
            System.out.print(c + " ");
        }*/

        //EX30
        /*int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int posB=0;
        int posC=0;

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o número de posição " + i + " do vetor A");
            vetorA[i]= scanner.nextInt();
        }

        for (int i = 0; i< vetorA.length; i++){
            if (vetorA[i] % 2 == 0 ){
                vetorB[posB]=vetorA[i];
                posB++;
            }else {
                vetorC[posC]=vetorA[i];
                posC++;
            }
        }

        System.out.println("Vetor A: ");
        for (int c:vetorA
        ) {
            System.out.print(c + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i = 0; i<posB;i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C: ");
        for (int i = 0; i<posC;i++){
            System.out.print(vetorC[i] + " ");
        }*/


    }
}