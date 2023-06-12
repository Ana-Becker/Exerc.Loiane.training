package org.example.exerciciosAula28a33;

import java.util.Scanner;

public class JogoVelha {

    Scanner scan = new Scanner(System.in);
    private char [][] jogoDaVelha = new char [3][3];
    private int jogada;
    private boolean ganhou;
    private char sinal;
    private int linha, coluna;

    public JogoVelha() {
    }

    public JogoVelha(char[][] jogoDaVelha, int jogada, boolean ganhou,
                     char sinal, int linha, int coluna) {
        this.jogoDaVelha = jogoDaVelha;
        this.jogada = jogada;
        this.ganhou = ganhou;
        this.sinal = sinal;
        this.linha = linha;
        this.coluna = coluna;
    }

    public char[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(char[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public char getSinal() {
        return sinal;
    }

    public void setSinal(char sinal) {
        this.sinal = sinal;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void jogar () {
        while (!ganhou){
            if (getJogada() % 2 == 0){
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3) ");
                setSinal('O');
            } else {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3) ");
                setSinal('X');
            }

            boolean linhaValida = false;
            while (!linhaValida){
                System.out.println("Entre com a linha (1-3)");
                setLinha(scan.nextInt());
                if (getLinha() >=1 && getLinha() <=3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada Inválida. Tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println("Entre com a coluna");
                setColuna(scan.nextInt());
                if (getColuna() >=1 && getColuna() <= 3) {
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

