package org.example.exerciciosAula36;

public class Aula_Phone {

    private String tipo;
    private String ddd;
    private String numero;

    public Aula_Phone() {
    }

    public Aula_Phone(String tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void mostrarFone(){
        System.out.println(getTipo());
        System.out.println(getDdd() + " " + getNumero());
    }
}
