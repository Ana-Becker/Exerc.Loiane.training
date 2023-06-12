package org.example.exerciciosAula34;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número para conversão");
        double num = scan.nextDouble();

        System.out.println(num + " m = " + ConversaoUnidadesArea.metroQuadPPesQuad(num) + " Pés Quadrados");
        System.out.println(num + " Pé Quadrados = " + ConversaoUnidadesArea.peQuadPCentQuad(num) + " cm2");
        System.out.println(num + " milhas2 = " + ConversaoUnidadesArea.milhaQuadPAcres(num) + " Acres");
        System.out.println(num + " Acres = " + ConversaoUnidadesArea.acrePPeQuad(num) + " Pés Quadrados");

    }
}
