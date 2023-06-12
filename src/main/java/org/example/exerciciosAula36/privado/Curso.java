package org.example.exerciciosAula36.privado;

public class Curso {
    private String nome;
    private Aluno aluno;

    public Curso() {
    }

    public Curso(String nome, Aluno aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
