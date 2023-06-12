package org.example.exerciciosAula34;

public class Ex1 {
    public static void main(String[] args) {

        Contador.setNum1(5);

        Contador contador = new Contador();
        contador.mostrarNum();

        contador.zerar();
        contador.mostrarNum();

        contador.incrementar();
        contador.mostrarNum();

        Contador cont1 = new Contador();
        Contador cont2 = new Contador();
        Contador cont3 = new Contador();
        contador.mostrarNum();

    }
}
