package org.example.exerciciosAula36;

public class Agenda {

    private String nome;
    private Contato36 contato;

    public Agenda() {
    }

    public Agenda(String nome, Contato36 contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato36 getContato() {
        return contato;
    }

    public void setContato(Contato36 contato) {
        this.contato = contato;
    }

    public void mostrarNome(){
        System.out.println(getNome());
    }
}
