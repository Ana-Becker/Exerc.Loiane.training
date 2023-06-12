package org.example.exerciciosAula34;

public class Contador {

    public static int num1;

    public Contador() {
        num1 ++;
    }

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        Contador.num1 = num1;
    }

    void zerar (){
        setNum1(0);
    }

    void incrementar(){
        num1 ++;
    }

    void mostrarNum (){
        System.out.println(num1);
    }
}
