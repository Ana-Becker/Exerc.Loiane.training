package org.example.exerciciosAula26e27;

public class Ex2 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.saldo = 2000;
        contaCorrente.especial = false;

        System.out.println("Saldo da Conta: R$ " + contaCorrente.saldo);
        contaCorrente.depositarDinheiro(50);
        System.out.println("Depósito: R$ " + contaCorrente.saldo);
        contaCorrente.realizarSaque(100);
        System.out.println("Saque: R$ " + contaCorrente.saldo);
        System.out.print("Está no especial? ");
        contaCorrente.verificarEspecial();
        System.out.print("Novo saldo: R$ ");
        contaCorrente.consultarSaldo();
    }
}
