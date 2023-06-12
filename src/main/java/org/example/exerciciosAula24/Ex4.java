package org.example.exerciciosAula24;

import java.util.Date;

public class Ex4 {
    public static void main(String[] args) {
        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();

        livroDeBiblioteca.titulo = "Mindset. A nova psicologia do sucesso";
        livroDeBiblioteca.leitor = "Ana Clara Becker" ;
        livroDeBiblioteca.dataEmprestimo = new Date();
        livroDeBiblioteca.tempoEmprestimo = 12;

        System.out.println("Título: " + livroDeBiblioteca.titulo);
        System.out.println("Leitor: " + livroDeBiblioteca.leitor);
        System.out.println("Data do Empréstimo: " + livroDeBiblioteca.dataEmprestimo);
        System.out.println("Tempo de Empréstimo: " + livroDeBiblioteca.tempoEmprestimo + " dias");
    }
}
