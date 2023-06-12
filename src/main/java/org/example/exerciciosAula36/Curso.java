package org.example.exerciciosAula36;

public class Curso {
    private String nome;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }

    public Curso(String nome, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String mostrarInfo(){
        String info = "\nNome: " + getNome() + "\n";
        if (professor!= null){
            info += professor.mostrarInfo() + "\n";
        }
        if (alunos!= null){
            for (Aluno a:getAlunos()
                 ) {
                info += a.mostrarInfo() + "\n";
            }

        }
        return info;
    }

    public double imprimirMedia(){
        double soma = 0;

        for (Aluno aluno:alunos
             ) {
            if (aluno != null){
                soma += aluno.obterMedia();
            }
        }

        return soma/alunos.length;
    }
}
