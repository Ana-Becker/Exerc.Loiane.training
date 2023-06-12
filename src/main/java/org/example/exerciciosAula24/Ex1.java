package org.example.exerciciosAula24;

public class Ex1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "Bulbo A60";
        lampada.preco = 5.48;
        lampada.cor = "branca";
        lampada.tipo = "LED";
        lampada.potencia = 9;


        System.out.println(lampada.modelo);
        System.out.println(lampada.preco);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipo);
        System.out.println(lampada.potencia);


    }
}
