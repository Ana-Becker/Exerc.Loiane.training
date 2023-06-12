package org.example.exerciciosAula26e27;

public class Aluno {
    String nomeAluno;
    int matricula;
    String cursoMatriculado;
    String[] disciplinasCursando = new String[3];
    double[][] notas = new double[3][4];

    void verificarAprovacao1(){
        if ((notas[0][0] + notas[0][1] + notas[0][2]+ notas[0][3])/4 < 7){
            System.out.println("Reprovado em " + disciplinasCursando[0]);

        } else {
            System.out.println("Aprovado em " + disciplinasCursando[0]);
        }
    }

    void verificarAprovacao2(){
        if ((notas[1][0] + notas[1][1] + notas[1][2]+ notas[1][3])/4 < 7){
            System.out.println("Reprovado em " + disciplinasCursando[1]);

        } else {
            System.out.println("Aprovado em " + disciplinasCursando[1]);
        }
    }

    void verificarAprovacao3(){
        if ((notas[2][0] + notas[2][1] + notas[2][2]+ notas[2][3])/4 < 7){
            System.out.println("Reprovado em " + disciplinasCursando[2]);

        } else {
            System.out.println("Aprovado em " + disciplinasCursando[2]);
        }
    }



}
