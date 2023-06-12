package org.example.exerciciosAula26e27;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        aluno.nomeAluno = scanner.next();
        System.out.println("Qual a matrícula?");
        aluno.matricula = scanner.nextInt();
        System.out.println("Qual o curso em que está matriculado?");
        aluno.cursoMatriculado = scanner.next();
        System.out.println("Quais as três disciplinas que está cursando?");
        for (int i = 0; i < aluno.disciplinasCursando.length; i ++){
            System.out.print(i+1 + " ");
            aluno.disciplinasCursando[i] = scanner.next();
        }

        System.out.println("Notas: ");
        for (int i = 0; i < aluno.notas.length; i ++){
            for (int j = 0; j < aluno.notas[i].length; j++){
                System.out.print(aluno.disciplinasCursando[i] + " = ");
                aluno.notas[i][j] = scanner.nextDouble();

            }
        }

        System.out.println();
        System.out.println("Aluno: " + aluno.nomeAluno);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Curso Matriculado: " + aluno.cursoMatriculado);

        System.out.println("Notas: ");
        for (int i = 0; i < aluno.disciplinasCursando.length; i ++){
            System.out.println("- " + aluno.disciplinasCursando[i] + ":");
            for (int j = 0; j < aluno.notas[i].length; j ++){
                System.out.print(aluno.notas[i][j] + " ");

            }
            System.out.println();
        }

        aluno.verificarAprovacao1();
        aluno.verificarAprovacao2();
        aluno.verificarAprovacao3();








    }
}
