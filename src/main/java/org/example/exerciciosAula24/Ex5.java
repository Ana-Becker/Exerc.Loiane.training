package org.example.exerciciosAula24;

public class Ex5 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = "864.654.751.544.000";
        contaCorrente.saldo = 200;
        contaCorrente.especial = true;
        contaCorrente.limite = 300;

        System.out.println("CC: " + contaCorrente.numero);
        System.out.println("Saldo: R$ " + contaCorrente.saldo);
        System.out.println("Especial: " + contaCorrente.especial);
        System.out.println("Limite: R$ " + contaCorrente.limite);


    }
}
