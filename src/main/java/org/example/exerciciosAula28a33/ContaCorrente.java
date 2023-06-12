package org.example.exerciciosAula28a33;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean especial;
    private int limite;

    public ContaCorrente(String numero, double saldo, boolean especial, int limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public ContaCorrente() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void realizarSaque(double saque){

        if (saque > saldo){
            System.out.println("Tentativa de saque de R$ " + saque);
            System.out.println("Não pode sacar. Saldo Insuficiente");

        } else {
            System.out.println("Saque de R$ " + saque);
            saldo -= saque;
        }
    }

    public void depositarDinheiro(double deposito){
        System.out.println("Depósito de R$ " + deposito);
        saldo += deposito;
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$ " + getSaldo());
    }

    public void verificarEspecial(){
        if (isEspecial()){
            System.out.println("Está no especial");
        } else {
            System.out.println("Não está no especial");
        }
    }
}
