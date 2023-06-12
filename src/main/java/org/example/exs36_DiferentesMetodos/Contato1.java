package org.example.exs36_DiferentesMetodos;

public class Contato1 {

    private String nome;
    private String telefone;
    private String email;

    public Contato1(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato1() {
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
        return "Nome: " + getNome() + ", " + "Tel: " + getTelefone()+ ", " + "Email: " + getEmail();

    }
}
