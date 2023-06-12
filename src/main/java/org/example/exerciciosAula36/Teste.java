package org.example.exerciciosAula36;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        curso.setNome("Arquitetura");

        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setDepartamento("Projeto");
        professor.setEmail("Mariaamelia@gmail.com");
        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[2];
        for (int i = 0; i < alunos.length; i ++){
            System.out.println("Digite o nome do aluno " + (i+1));
            String nomeAluno = scan.next();
            System.out.println("Digite a matrícula do aluno " + (i+1));
            String matricula = scan.next();

            double[] notas = new double[2];
            for (int j = 0; j < notas.length; j ++){
                System.out.println("Digite a nota " + (j+1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }

        curso.setAlunos(alunos);

        System.out.println(curso.mostrarInfo());
        System.out.println("Média da turma: " + curso.imprimirMedia());
    }
}
