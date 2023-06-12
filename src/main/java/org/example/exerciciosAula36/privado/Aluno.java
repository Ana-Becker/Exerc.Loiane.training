package org.example.exerciciosAula36.privado;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String mosrtar(){
       String info = "Nome: " + getNome() +"\nMatricula: " +  getMatricula() + "\nNotas: ";
       if (notas != null){
           for (double n:getNotas()
                ) {
               info += n + " | ";

           }
       }
       return info;
    }
}
