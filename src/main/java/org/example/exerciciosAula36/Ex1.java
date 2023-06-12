package org.example.exerciciosAula36;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();
        System.out.println("Digite o nome da agenda: ");
        agenda.setNome(scan.next());

        Contato36 contato1 = new Contato36();

        System.out.println("Digite o Nome do Contato 1:");
        contato1.setNome(scan.next());
        System.out.println("Digite o tel: ");
        contato1.setTelefone(scan.next());
        System.out.println("Digite o email:");
        contato1.setEmail(scan.next());


        Contato36 contato2 = new Contato36();
        System.out.println("Digite o Nome do Contato 2:");
        contato2.setNome(scan.next());
        System.out.println("Digite o tel: ");
        contato2.setTelefone(scan.next());
        System.out.println("Digite o email:");
        contato2.setEmail(scan.next());

        agenda.mostrarNome();
        System.out.println();
        contato1.mostrarContato();
        System.out.println();
        contato2.mostrarContato();


    }
}
