package org.example.exerciciosAula35;

public class Calculadora35 {

    public static int calcularFibonacci(int n){
        if (n == 1 ) {
            return 0;
        } if (n == 2){
            return 1;
        } else {
        return calcularFibonacci(n-1) + calcularFibonacci(n-2);}
        //Ex, se n for 7, retorna o 6º + o 5º,
        // é a posição - 1 e não o termo!! E para descobrir o 7º, 6º, etc.
        // ele faz o loop de recursão até o 2 ou 1, que já sabemos que é 1 ou 0.


    }

    public static int somatorio (int n){
        if (n == 1){
            return 1;
        } else {
            return n + somatorio(n-1);
        }
    }
}
