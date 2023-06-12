package org.example.exerciciosAula26e27;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
    }
}
