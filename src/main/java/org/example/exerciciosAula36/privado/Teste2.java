package org.example.exerciciosAula36.privado;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        aluno.setNome("Maria ");
        aluno.setMatricula("1234");

        double [] notas = new double[4];
        System.out.println("Digite as 2 notas: ");
        for (int i = 0; i< notas.length; i++){
            notas[i]= scan.nextDouble();
        }
        aluno.setNotas(notas);

        System.out.println(aluno.mosrtar());
    }
}
