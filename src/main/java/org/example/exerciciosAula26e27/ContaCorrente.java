package org.example.exerciciosAula26e27;

public class ContaCorrente {
    String numero;
    double saldo;
    boolean especial;

    void realizarSaque(double saque){
        if (saque >= saldo){
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
        }else {
            saldo = saldo - saque;
        }
    }

    void depositarDinheiro (double deposito){
        saldo = saldo + deposito;
    }

    void consultarSaldo(){
        System.out.print(saldo);
    }

    void verificarEspecial(){
        if (especial = true){
            System.out.println("Sim");
        } if (especial = false){
            System.out.println("Não");
        }
    }


}
