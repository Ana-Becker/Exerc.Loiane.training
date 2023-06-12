package org.example.exerciciosAula26e27;

public class Lampada {

    String modelo;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
