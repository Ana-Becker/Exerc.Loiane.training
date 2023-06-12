package org.example.exerciciosAula36;

public class Contato36 {

    private String nome;
    private String telefone;
    private String email;

    public Contato36() {
    }

    public Contato36(String nome, String telefone, String email) {
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

    public void mostrarContato(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tel: " + getTelefone());
        System.out.println("Email: " + getEmail());
    }
}
