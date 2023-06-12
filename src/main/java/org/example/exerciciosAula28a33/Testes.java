package org.example.exerciciosAula28a33;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ex 1
        /*Lampada lampada = new Lampada();

        lampada.setMarca("Lola");
        lampada.setModelo("Bulbo branca");

        System.out.println(lampada.getMarca());
        System.out.println(lampada.getModelo());

        lampada.mostrarEstado();
        lampada.ligarLampada();
        System.out.println("Ligou");
        lampada.mostrarEstado();
        lampada.desligarLampada();
        System.out.println("Desligou");
        lampada.mostrarEstado();*/

        //Ex2

        /*ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero("12354687");
        contaCorrente.setEspecial(true);
        contaCorrente.setLimite(5000);
        contaCorrente.setSaldo(-10);

        System.out.println("Número da conta: " + contaCorrente.getNumero());
        contaCorrente.verificarEspecial();
        contaCorrente.consultarSaldo();
        contaCorrente.depositarDinheiro(200);
        contaCorrente.consultarSaldo();
        contaCorrente.realizarSaque(30);
        contaCorrente.consultarSaldo();*/

        //Ex 3

        /*Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.setNomeAluno(scanner.next());
        System.out.println("Entre com o nome do curso: ");
        aluno.setCursoMatriculado(scanner.next());
        System.out.println("Entre com a matrícula do aluno: ");
        aluno.setMatricula(scanner.nextInt());

        for (int i = 0; i < aluno.getDisciplinasCursando().length; i ++){
            System.out.println("Entre com a Disciplina " + (i+1));
            aluno.getDisciplinasCursando()[i] = scanner.next();
        }

        for (int i = 0; i < aluno.getDisciplinasCursando().length; i ++){
            for (int j = 0; j < aluno.getNotas()[i].length; j ++){
                System.out.println("Digite as notas de " + aluno.getDisciplinasCursando()[i] );
                aluno.getNotas()[i][j] = scanner.nextDouble();

            }
        }


        aluno.mostrarInfo();
        System.out.println();
        aluno.verificarAprovacao1();
        aluno.verificarAprovacao2();
        aluno.verificarAprovacao3();*/

        //Ex 4

        JogoVelha jogo = new JogoVelha();

        jogo.setJogada(1);
        jogo.setColuna(0);
        jogo.setLinha(0);
        jogo.setGanhou(false);

        jogo.jogar();



    }
}
