package org.example.exerciciosAula36;

public class Aula_Testes {

    public static void main(String[] args) {

        Aula_Contacts contacts = new Aula_Contacts();

        contacts.setNome("João");

        Aula_Endereco adress = new Aula_Endereco();
        adress.setNomeRua("Penny Lane");
        adress.setNumero("123");
        adress.setComplemento("apto 235");
        adress.setCidade("Vancouver");
        adress.setEstado("British Columbia");

        contacts.mostrarInfos();
        contacts.setEndereco(adress);

        if (contacts != null && contacts.getEndereco() != null){
            adress.mostrarEnd();
        }

        Aula_Phone fone1 = new Aula_Phone();
        fone1.setTipo("Celular");
        fone1.setDdd("01");
        fone1.setNumero("54688454");

        Aula_Phone fone2 = new Aula_Phone();
        fone2.setTipo("Casa");
        fone2.setDdd("01");
        fone2.setNumero("3698755458");

        Aula_Phone fone3 = new Aula_Phone();
        fone3.setTipo("Trabalho");
        fone3.setDdd("01");
        fone3.setNumero("8776514");

        System.out.println("Telefones:");
        fone1.mostrarFone();
        fone2.mostrarFone();
        fone3.mostrarFone();

    }
}
