package org.example.exs36_DiferentesMetodos;

import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda1 agenda = new Agenda1();
        System.out.println("Entre com o nome da agenda: ");
        agenda.setNome(scan.nextLine());

        Contato1 [] contatos = new Contato1[3];

        for (int i = 0; i<3; i ++){
            System.out.println("Entre com as infos do Contato" + (i+1));
            Contato1 c = new Contato1();
            System.out.println("Nome: ");
            c.setNome(scan.nextLine());
            System.out.println("Telefone: ");
            c.setTelefone(scan.nextLine());
            System.out.println("Email: ");
            c.setEmail(scan.nextLine());

            contatos[i]=c;
        }
        agenda.setContatos(contatos);

        if (agenda != null){
        System.out.println(agenda.mostrarInfo());
        }

    }
}
