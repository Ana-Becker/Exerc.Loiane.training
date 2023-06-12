package org.example.exerciciosAula24;

public class Ex6 {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.telefones = new String[4];

        contato1.nomeContato = "João Ninguem";
        contato1.telefones[1] = "(11)998543215";
        contato1.telefones[0] = "(11)39214876";
        contato1.email = "joao@email.com";

        System.out.println("Nome: " + contato1.nomeContato);
        System.out.println("Celular: " + contato1.telefones[1]);
        System.out.println("Telefone: " + contato1.telefones[0]);
        System.out.println("E-mail: " + contato1.email);
    }
}
