package org.example.aula25a27;

import org.example.aula25a27.Carro;

public class Van {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Mercedez";
        van.modelo = "413";
        van.capcombustivel = 75;
        van.consumoCombustivel = 10.5;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtd de combustivel para 10 km = " + qtdCombustivel10);
        System.out.println("qtd de combustível para 15 km = " + qtdCombustivel15);

    }
}
