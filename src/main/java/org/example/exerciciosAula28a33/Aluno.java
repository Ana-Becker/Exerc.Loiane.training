package org.example.exerciciosAula28a33;

public class Aluno {
    private String nomeAluno;
    private int matricula;
    private String cursoMatriculado;
    private String[] disciplinasCursando;
    private double[][] notas;

    public Aluno() {
        disciplinasCursando = new String[3];
        notas = new double[3][4];
    }

    public Aluno(String nomeAluno, int matricula, String cursoMatriculado) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.cursoMatriculado = cursoMatriculado;
        this.disciplinasCursando = new String[3];
        this.notas = new double[3][4];
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public String[] getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNomeAluno());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome do curso: " + getCursoMatriculado());
        for (int i = 0; i < getDisciplinasCursando().length; i ++){
            System.out.println("\n" + getDisciplinasCursando()[i]);
            for (int j = 0; j < getNotas()[i].length; j ++){
                System.out.print(getNotas()[i][j] + " ");
            }
        }
    }

    public void verificarAprovacao1(){
        if ((getNotas()[0][0] + getNotas()[0][1] + getNotas()[0][2]+ getNotas()[0][3])/4 < 7){
            System.out.println("Reprovado em " + getDisciplinasCursando()[0]);

        } else {
            System.out.println("Aprovado em " + getDisciplinasCursando()[0]);
        }
    }

    public void verificarAprovacao2(){
        if ((getNotas()[1][0] + getNotas()[1][1] + getNotas()[1][2]+ getNotas()[1][3])/4 < 7){
            System.out.println("Reprovado em " + getDisciplinasCursando()[1]);

        } else {
            System.out.println("Aprovado em " + getDisciplinasCursando()[1]);
        }
    }

    public void verificarAprovacao3(){
        if ((getNotas()[2][0] + getNotas()[2][1] + getNotas()[2][2]+ getNotas()[2][3])/4 < 7){
            System.out.println("Reprovado em " + getDisciplinasCursando()[2]);

        } else {
            System.out.println("Aprovado em " + getDisciplinasCursando()[2]);
        }
    }

    public void setNomeDisciplinaPos (int pos, String disciplina){
        this.disciplinasCursando[pos] = disciplina;
    }

    public void setNotasPosIJ (int posI, int posJ, double nota ){
        this.notas[posI][posJ] = nota;
    }

}
