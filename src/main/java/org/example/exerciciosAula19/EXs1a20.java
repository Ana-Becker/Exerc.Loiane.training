package org.example.exerciciosAula19;

import java.util.Scanner;

public class EXs1a20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX1

        /*int [] idades = new int[5];
        int [] vetorB = idades;

        for (int i = 0; i<idades.length; i++){
            System.out.println("Digite o valor da posição "+i);
            idades[i]= scanner.nextInt();
        }
        System.out.print("Vetor A: ");
        for (int a:idades
             ) {
            System.out.print( a + " ");}

        System.out.println();
        System.out.print("Vetor B: ");

        for (int b:vetorB
             ) {
            System.out.print(b + " ");
        }*/

        //EX2
        /*int[] idades = new int[8];
        int[] vetorB = new int[8];

        for (int i =0; i< idades.length;i++){
            System.out.println("Digite o elemento da posição "+i);
            idades[i]= scanner.nextInt();
            vetorB[i]=idades[i]*2;
        }

        System.out.print("Vetor A: ");
        for (int a:idades
             ) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int b:vetorB
             ) {
            System.out.print(b+" ");
        }*/

        //EX3
        /*int[] idades = new int[5];
        double[] vetorB = new double[idades.length];

        for (int i =0; i< idades.length;i++){
            System.out.println("Digite o elemento da posição "+i);
            idades[i]= scanner.nextInt();
            vetorB[i]= Math.sqrt(idades[i]);
        }

        System.out.print("Vetor A: ");
        for (int a:idades
        ) {
            System.out.print(a + " ");
        }

        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println();
        System.out.print("Vetor B: ");
        for (double b:vetorB
        ) {
            System.out.print(df.format(b)+" ");
        }*/

        //EX6
        /*int[] idades = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[idades.length];

        for (int i=0; i< idades.length;i++){
            System.out.println("Digite o elemento da posição " + i + " do vetor A");
            idades[i]= scanner.nextInt();
        }

        for (int i=0; i< vetorB.length;i++){
            System.out.println("Digite o elemento da posição " + i + " do vetor B");
            vetorB[i]= scanner.nextInt();
            vetorC[i]=vetorB[i]+idades[i];
        }

        System.out.print("Vetor A: ");
        for (int a:idades
             ) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int b:vetorB
             ) {
            System.out.print(b + " ");
        }

        System.out.println();
        System.out.print("Vetor C: ");
        for (int c:vetorC
             ) {
            System.out.print(c + " ");
        }*/

        //EX 9
        /*double[] vetA = new double[5];
        double[] vetB = new double[vetA.length];
        double[] vetC = new double[vetB.length];

        for (int i = 0; i< vetA.length;i++){
            System.out.println("Digite o elemento da posição " + i + " do vetor A");
            vetA[i]= scanner.nextDouble();
        }

        for (int i = 0; i< vetA.length;i++){
            System.out.println("Digite o elemento da posição " + i + " do vetor B");
            vetB[i]= scanner.nextDouble();
            vetC[i]= vetA[i]/vetB[i];
        }

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor A: ");
        for (double a :vetA
             ) {
            System.out.print(a + " ");
        }

        System.out.print("\nVetor B: ");
        for (double b :vetB
        ) {
            System.out.print(b + " ");
        }

        System.out.print("\nVetor C: ");
        for (double c :vetC
        ) {
            System.out.print(c + " ");
        }*/

        //EX11
        /*int[] idades = new int[10];
        int quantPares = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.println("Digite o elemento da posição " + i);
            idades[i] = scanner.nextInt();

        }

        System.out.println("Números pares: ");
        for (int a:idades
             ) {
            if (a %2 ==0){
                quantPares ++;
                System.out.print(a + " ");
            }
        }
        System.out.println("\nHá " + quantPares + " números pares");*/

        //EX12
        /*int[] idades = new int[5];
        int soma = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.println("Digite o elemento da posição " + i);
            idades[i] = scanner.nextInt();
        }

        System.out.println("Vetor: ");
        for (int a:idades
             ) {soma += a;
            System.out.print(a + " ");
        }
        System.out.println("\nA soma de todos os elementos no vetor é: " + soma);*/

        //EX13
        /*int[] idades = new int[5];
        int soma = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.println("Digite o elemento da posição " + i);
            idades[i] = scanner.nextInt();
        }

        System.out.print("Múltiplos de 5 no Vetor: ");
        for (int a:idades
        ) {if (a % 5 == 0 ){
            soma += a;
            System.out.print(a + " ");}
        }
        System.out.println("\nA soma de todos os elementos múltiplos de 5 no vetor é: " + soma);*/

        //EX14
        /*int[] idades = new int[5];
        int soma = 0;
        int media =0;

        for (int i = 0; i < idades.length; i++){
            System.out.println("Digite o elemento da posição " + i);
            idades[i] = scanner.nextInt();
        }

        System.out.print("Números ímpares no Vetor: ");
        for (int a:idades
        ) {if (a % 2 != 0 ){
            soma += a;
            media ++;
            System.out.print(a + " ");}
        }
        System.out.println("\nA soma de todos os elementos ímpares no vetor é: " + soma);
        System.out.println("\nA média dos elementos ímpares no vetor é: " + soma/ media);*/

        //EX15
        /*int[] idades = new int[10];
        int quantPares=0;
        int quantImpares=0;

        for (int i = 0; i< idades.length;i++){
            System.out.println("Digite o elemento de posição " + i);
            idades[i]= scanner.nextInt();
        }

        System.out.print("Vetor A: ");
        for (int a:idades
             ) {
            System.out.print(a + " ");
            if (a%2 == 0){
                quantPares++;
            }   else {
                   quantImpares++;
                }
        }

        System.out.println("\nPercentual de Pares: " + (quantPares*100)/ idades.length + " %");
        System.out.println("Percentual de ímpares: " + (quantImpares*100)/ idades.length + " %");*/

        //EX 16
        /*int[] idades = new int[10];
        int soma=0;
        int quantQuinze=0;
        int somaMaiores=0;
        int quantMaiores=0;

        for (int i = 0; i< idades.length;i++){
            System.out.println("Digite o elemento de posição " + i);
            idades[i]= scanner.nextInt();
        }

        System.out.print("Vetor A: ");
        for (int a:idades
        ) {
            System.out.print(a + " ");
            if (a < 15){
                soma += a;
            } else if (a == 15) {
                quantQuinze ++;
            } else {
                somaMaiores += a;
                quantMaiores ++;
            }
        }

        System.out.println("\nSoma dos elementos do vetor que são menores que 15: "
                + soma);
        System.out.println("Quantidade de elementos igual a 15: " +
                quantQuinze);
        System.out.println("Média dos elementos maiores que 15 no vetor: " + somaMaiores/quantMaiores);*/

        //EX 18
        /*int[] idades = new int[6];
        int menor=Integer.MAX_VALUE;
        int indexMenor = 0;
        int maior=Integer.MIN_VALUE;
        int indexMaior=0;


        for (int i = 1; i < idades.length; i++){
            System.out.println("Digite a " + i + "ª idade: ");
            idades[i]= scanner.nextInt();
        }

        System.out.println("Idades: ");
        for (int i = 1; i< idades.length; i++){
            System.out.print(idades[i] + " ");
            if (idades[i]>maior){
                maior = idades[i];
                indexMaior = i;
            }if (idades[i]<menor){
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.println("\nA menor idade é: " + menor + " e está na posição " + indexMenor);
        System.out.println("A maior idade é: " + maior + " e está na posição " + indexMaior);*/

        //EX 19
        /*double [] notas1 = new double[11];
        double [] notas2 = new double[11];
        double [] results = new double[notas2.length];

        for (int i = 1;i< notas1.length ;i++){
            System.out.println("Digite a nota 1 do " + i + " º aluno: ");
            notas1[i]= scanner.nextDouble();
        }

        for (int i = 1;i< notas1.length ;i++){
            System.out.println("Digite a nota 2 do " + i + " º aluno: ");
            notas2[i]= scanner.nextDouble();
        }

        System.out.print("Notas 1: ");
        for (int i = 1;i< notas1.length ;i++){
            System.out.print(notas1[i] + " ");
        }
        System.out.print("\nNotas 2: ");
        for (int i = 1;i< notas1.length ;i++){
            System.out.print(notas2[i] + " ");
        }

        System.out.println("\nResult: ");
        for (int i = 1;i< notas1.length ;i++){
            results[i]= (notas1[i]+notas2[i])/2;

            if (results[i]>=7){
                System.out.println("Aluno " + i + " - " + results[i] + " - Aprovado");;
            }else {
                System.out.println("Aluno " + i + " - " + results[i] + " - Reprovado");
            }
        }*/

        //EX 20
        /*double cotacaoDolar;
        double[] valores = new double[20];

        System.out.println("Cotação dólar hoje: ");
        cotacaoDolar = scanner.nextDouble();

        for (int i = 0;i< valores.length;i++){
                valores[i]= cotacaoDolar * (i+1);

        }

        System.out.println("Vetor A: ");
        for (double a:valores
             ) {
            System.out.print(a+" ");
        }*/


    }
}
