package org.example.exerciciosAula36;

public class Aula_Contacts {

    private String nome;

    private Aula_Endereco endereco;

    private Aula_Phone[] fone;

    public Aula_Contacts() {
    }

    public Aula_Contacts(String nome, Aula_Endereco endereco, Aula_Phone[] fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula_Endereco endereco) {
        this.endereco = endereco;
    }

    public Aula_Phone[] getFone() {
        return fone;
    }

    public void setFone(Aula_Phone[] fone) {
        this.fone = fone;
    }

    public void mostrarInfos(){
        System.out.println("Nome: " + getNome());
    }
}
