package org.example.exerciciosAula36.privado;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String mostrarInfo(){
        return "Nome: " + getNome() + "\n Email: " + getEmail() + "\n Tel: " + getTelefone() + "\n";
    }
}
