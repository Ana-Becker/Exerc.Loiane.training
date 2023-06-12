package org.example.exerciciosAula28a33;

public class Lampada {

    private boolean ligar;
    private String marca;
    private String modelo;

    public Lampada(boolean ligar, String marca, String modelo) {
        this.ligar = ligar;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Lampada() {

    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligarLampada (){
        setLigar(true);
    }
    public void desligarLampada(){
        setLigar(false);
    }

    public void mostrarEstado(){
       if (isLigar()){
           System.out.println("Lampada está ligada");
       }else {
           System.out.println("Lampada está desligada");
       }
    }
}
