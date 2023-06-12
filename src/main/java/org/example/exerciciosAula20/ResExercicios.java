package org.example.exerciciosAula20;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class ResExercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ex 1
        /*double [][] matrizM = new double[4][4];
        Random r = new Random();
        double maior=0;
        int linha=0;
        int col=0;

        for (int i = 0; i < matrizM.length; i++){

            for (int j = 0; j< matrizM[i].length; j++){
                matrizM[i][j] = r.nextInt(9);
            }

        }

        System.out.println("Matriz M: ");
        for (int i = 0; i < matrizM.length; i++){

            for (int j = 0; j< matrizM[i].length; j++){
                System.out.print(matrizM[i][j] + "  ");
                if (matrizM[i][j] > maior){
                    maior = matrizM[i][j];
                    linha=i;
                    col=j;
                }
            }
            System.out.println();

        }

        System.out.println("O maior número é " + maior + " e está na linha " + linha + " e na coluna " + col);*/

        //Ex 2
        /*double[][] matrizM = new double[10][10];
        Random r = new Random();
        int linha=0;
        int coluna=0;
        double maior5=Integer.MIN_VALUE;
        double menor5=Integer.MAX_VALUE;
        double maior7=Integer.MIN_VALUE;
        double menor7=Integer.MAX_VALUE;

        for (int i = 0 ; i < matrizM.length ; i++ ) {
            for (int j=0 ;j < matrizM[i].length; j++){
                matrizM[i][j] = r.nextInt(10);
            }
        }

        System.out.println("Matriz M: ");
        for (int i = 0 ; i < matrizM.length ; i++ ) {
            for (int j=0 ;j < matrizM[i].length; j++){
                System.out.print(matrizM[i][j] + " ");
                if (matrizM[5][j] > maior5){
                    maior5 = matrizM[5][j];
                } else if (matrizM[i][7] < menor7) {
                    menor7 = matrizM[i][7];
                }else if (matrizM[5][j] < menor5){
                    menor5 = matrizM[5][j];
                }else if (matrizM[i][7] > maior7) {
                    maior7 = matrizM[i][7];
                }
            }
            System.out.println();
        }

        System.out.println("O maior valor da linha 5 é: " + maior5);
        System.out.println("O menor valor da linha 5 é: " + menor5);
        System.out.println("O maior valor da coluna 7 é: " + maior7);
        System.out.println("O menor valor da coluna 7 é: " + menor7);*/

        //Ex 2
        /*double[][] matrizM = new double[3][3];
        int qtdpares = 0;
        int qtdimpares = 0;

        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j <matrizM[i].length; j++){
                System.out.println("Digite o número de posição [" + i + "," + j + "] ");
                matrizM[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Matriz M: ");
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j <matrizM[i].length; j ++){
                System.out.print(matrizM[i][j] + " ");
                if (matrizM[i][j] % 2 == 0){
                    qtdpares ++;
                } else {
                    qtdimpares ++;
                }
            }
            System.out.println();
        }
        System.out.println("Há " + qtdpares + " números pares e " + qtdimpares + " números ímpares na Matriz.");*/

        //Ex 4
        /*String[][] compromissos= new String[32][25];

        boolean sair = false;
        int num;
        int dia;
        int hora;

        while (!sair) {
            System.out.println("Digite 1 para acrescentar o compromisso");
            System.out.println("Digite 2 para verificar um compromisso");
            System.out.println("Digite 0 para sair");
            num = scanner.nextInt();

            if (num < 0 | num > 2) {
                    System.out.println("Número Inválido. Digite novamente.");
                }

                if (num == 1) {
                    System.out.println("Qual o dia?");
                    dia = scanner.nextInt();
                    do {
                        System.out.println("Dia inválido. Digite novamente");
                        dia = scanner.nextInt();
                    } while (dia < 0 | dia > 31);

                    System.out.println("Qual o horário?");
                    hora = scanner.nextInt();
                    do {
                        System.out.println("Horário inválido. Digite novamente");
                        hora = scanner.nextInt();
                    } while (hora < 0 | hora > 24);

                    System.out.println("Qual o compromisso?");
                    compromissos[dia][hora] = scanner.next();
                }

                 if (num == 2) {
                    System.out.println("Qual o dia?");
                    dia = scanner.nextInt();
                     do {
                         System.out.println("Dia inválido. Digite novamente");
                         dia = scanner.nextInt();
                     } while (dia < 0 | dia > 31);

                    System.out.println("Qual o horário?");
                    hora = scanner.nextInt();
                     do {
                         System.out.println("Horário inválido. Digite novamente");
                         hora = scanner.nextInt();
                     } while (hora < 0 | hora > 24);

                    System.out.println("O compromisso é: ");
                    System.out.println(compromissos[dia][hora]);
                    System.out.println();
                }
                 if (num == 0) {
                    sair = true;
                }

            }*/

        //Ex 5

        /*String[][][] compromissos = new String[13][32][9];

        boolean sair = false;
        int num;
        int mes;
        int dia;
        int hora;

        while (!sair){
            System.out.println("Digite 1 para acrescentar um compromisso");
            System.out.println("Digite 2 para verificar um compromisso");
            System.out.println("Digite 0 para sair");
            num = scanner.nextInt();

            if (num<0 | num > 2){
                System.out.println("Número Inválido. Digite novamente:");
            }
            if (num == 1){

                System.out.println("Digite o mês:");
                mes = scanner.nextInt();

                while (mes < 0 | mes > 12) {
                    System.out.println("Mês Inválido. Digite novamente:");
                    mes = scanner.nextInt();
                }

                System.out.println("Digite o dia:");
                dia = scanner.nextInt();

                while (dia < 0 | dia > 31) {
                    System.out.println("Dia inválido. Digite novamente:");
                    dia = scanner.nextInt();
                }

                System.out.println("Digite o horário:");
                hora = scanner.nextInt();

                while (hora < 0 | hora > 8) {
                    System.out.println("Horário inválido. Deve ser entre 0 e 8. Digite novamente:");
                    hora = scanner.nextInt();
                }

                System.out.println("Digite o compromisso:");
                compromissos[mes][dia][hora] = scanner.next();

            } else if (num == 2) {
                System.out.println("Digite o mês:");
                mes = scanner.nextInt();

                while (mes < 0 | mes > 12){
                    System.out.println("Mês inválido. Digite novamente");
                    mes = scanner.nextInt();
                }

                System.out.println("Digite o dia:");
                dia = scanner.nextInt();

                while (dia < 0 | dia > 31){
                    System.out.println("Dia inválido. Digite novamente:");
                    dia = scanner.nextInt();
                }

                System.out.println("Digite o horário:");
                hora = scanner.nextInt();

                while (hora < 0 | hora > 8){
                    System.out.println("Horário inválido. Deve ser entre 0 e 8. Digite novamente:");
                    hora = scanner.nextInt();
                }

                System.out.println("O compromisso é:");
                System.out.println(compromissos[mes][dia][hora]);

            } else if (num == 0) {
                sair = true;
            }
        }*/

        //A prof fez de um jeito diferente. Achei importante o fato de ela colocar mes-- e dia--
        // etc pois aí o 0 vira 1 e não se perde as posições 0 como eu fiz.

        /*String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        byte opcao;

        while (!sair){
            System.out.println("Digite 1 para acrescentar um compromisso");
            System.out.println("Digite 2 para verificar um compromisso");
            System.out.println("Digite 0 para sair");

            opcao = scanner.nextByte();

            if (opcao == 1){

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Entre com o mês");
                    mes = scanner.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido. Digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido. Digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do dia");
                    hora = scanner.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida. Digite novamente");
                    }
                }

                mes--;
                dia--;
                hora--;
                System.out.println("Digite o compromisso");
                compromissos[mes][dia][hora] = scanner.next();
            }

            if (opcao == 2){

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Entre com o mês");
                    mes = scanner.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido. Digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido. Digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do dia");
                    hora = scanner.nextInt() ;
                    if (hora >= 0 && hora <=8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida. Digite novamente");
                    }
                }

                mes--;
                dia--;
                hora--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[mes][dia][hora]);
            }
        }*/

        //Ex 6
        char [][] jogoDaVelha = new char [3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        int jogada = 1;
        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou){
            if (jogada % 2 == 0){
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3) ");
                sinal = 'O';
            } else {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3) ");
                sinal = 'X';
            }

            boolean linhaValida = false;
            while (!linhaValida){
                System.out.println("Entre com a linha (1-3)");
                linha = scanner.nextInt();
                if (linha >=1 && linha <=3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada Inválida. Tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println("Entre com a coluna");
                coluna = scanner.nextInt();
                if (coluna >=1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada Inválida. Tente novamente");
                }
            }

            linha --;
            coluna --;

            if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada. Tente novamente");
            }else {
                jogoDaVelha[linha][coluna] = sinal;
                jogada ++;
            }

            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0 ;j < jogoDaVelha[i].length; j++){
                    System.out.print(jogoDaVelha[i][j] + " | ");
                }
                System.out.println();
            }

            if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||
            (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X')||
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[0][2] == 'X')) {
                System.out.println("Jogador 1 venceu!");
                ganhou = true;


            } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||
                    (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O')||
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
                    (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[0][2] == 'O')) {
                System.out.println("Jogador 2 venceu!");
                ganhou = true;

            } else if (jogada > 9) {
                System.out.println("Empatou!");
                ganhou = true;
            }


        }


    }
}