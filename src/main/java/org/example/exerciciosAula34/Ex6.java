package org.example.exerciciosAula34;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número para conversão:");
        ConversaoUnidadesTempo.num = scan.nextInt();
        ConversaoUnidadesTempo.mostrarInfos();
    }
}
