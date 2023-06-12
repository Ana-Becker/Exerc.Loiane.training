package org.example.exerciciosAula36.privado;

public class Teste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.setNome("Trabalho");

        Contato [] contatos = new Contato[3];
        contatos[0] = new Contato();
        contatos[0].setNome("João");
        contatos[0].setTelefone("12 997786542");
        contatos[0].setEmail("joao@email.com");
        contatos[1] = new Contato();
        contatos[1].setNome("José");
        contatos[1].setTelefone("12 995424657");
        contatos[1].setEmail("josé@email.com");
        contatos[2] = new Contato();
        contatos[2].setNome("Maria");
        contatos[2].setTelefone("11 987564821");
        contatos[2].setEmail("maria@email.com");
        agenda.setContatos(contatos);

        System.out.println(agenda.mostrarInfo());

    }
}
