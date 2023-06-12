package org.example.exs36_DiferentesMetodos;

public class Agenda1 {

    private String nome;
    private Contato1[] contatos;

    public Agenda1() {
    }

    public Agenda1(String nome) {
        this.nome = nome;
    }

    public Agenda1(Contato1[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato1[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato1[] contatos) {
        this.contatos = contatos;
    }

    public String mostrarInfo(){
        String info = "Nome: " + getNome() + "\n";
        
        if (contatos != null){
            for (Contato1 c : getContatos())
            {info += c.mostrarInfo() + "\n";
                
            }
        }
        return info;
    }
}
