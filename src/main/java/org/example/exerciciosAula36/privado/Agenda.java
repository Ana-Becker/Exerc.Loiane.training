package org.example.exerciciosAula36.privado;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String mostrarInfo(){
        String info = getNome() + "\n";
        if (getContatos() != null){
            for (Contato c:contatos
                 ) {
                info += c.mostrarInfo();
            }
        }
        return info;
    }
}
