package org.example.aula25a27;

public class Carro {

    double capcombustivel;
    double consumoCombustivel;
    String marca;
    String modelo;

    void exibirAutonomia (){
        System.out.println("A autonomia do carro é: " + capcombustivel *  consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado. ");
        return capcombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
