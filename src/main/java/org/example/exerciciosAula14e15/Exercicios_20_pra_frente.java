package org.example.exerciciosAula14e15;

import java.util.Scanner;

public class Exercicios_20_pra_frente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX24 - Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
        // O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
        //par ou ímpar;
        //positivo ou negativo;
        /*System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Qual operação quer realizar? (-, +, * ou /)");

        String operador = scanner.next();

        int resultado=0;

        switch (operador){
            case "-":
                resultado = num1 - num2;break;
            case "+":
                resultado = num1 + num2;break;
            case "*":
                resultado = num1 * num2;break;
            case "/":
                resultado = num1 / num2;break;
        }
        System.out.println("Resultado = " + resultado);


        if (resultado>=0){
            System.out.println("Positivo");
        } else if (resultado<0) {
            System.out.println("Negativo");
        }

        if (resultado % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }*/

        //EX25 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        //"Telefonou para a vítima?"
        //"Esteve no local do crime?"
        //"Mora perto da vítima?"
        //"Devia para a vítima?"
        //"Já trabalhou com a vítima?"
        // O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
        // Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
        // entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
        // Caso contrário, ele será classificado como "Inocente".
        /*System.out.println("Responda as perguntas com S (sim) ou N (não)");
        System.out.println("Telefonou para a vítima?");
        String telefonou = scanner.next();
        System.out.println("Esteve no local do crime?");
        String esteve = scanner.next();
        System.out.println("Mora perto da vítima?");
        String mora = scanner.next();
        System.out.println("Devia para a vítima?");
        String devia = scanner.next();
        System.out.println("Já trabalhou com a vítima?");
        String trabalhou = scanner.next();

        int count = 0;

        if (telefonou.equalsIgnoreCase("s")){
            count++;
        }if (esteve.equalsIgnoreCase("s")){
            count++;
        }if (mora.equalsIgnoreCase("s")){
            count++;
        }if (devia.equalsIgnoreCase("s")){
            count++;
        }if (trabalhou.equalsIgnoreCase("s")){
            count++;
        }

        if (count == 2) {
            System.out.println("Suspeita");
        }if (count == 3 | count==4){
            System.out.println("Cúmplice");
        }if (count == 5) {
            System.out.println("Assassino");
        } if (count<2){
            System.out.println("Inocente");
        }*/

        //EX26
        /*System.out.println("Qual o tipo de combustível? (A - alcool e G - gasolina)");
        String combustivel = scanner.next();
        System.out.println("Quantos litros vendidos?");
        double litros = scanner.nextDouble();

        double valorGasolina = 2.5;
        double valorAlcool = 1.9;
        double a = valorAlcool*litros;
        double b = valorGasolina*litros;

        if (combustivel.equalsIgnoreCase("a") && litros>20){
            System.out.println("Valor a ser pago pelo cliente: R$ " + (a - (0.05*a)) );
        }
        if (combustivel.equalsIgnoreCase("a") && litros<=20){
            System.out.println("Valor a ser pago pelo cliente: R$ " + (a - (0.03*a)) );
        }
        if (combustivel.equalsIgnoreCase("g") && litros>20){
            System.out.println("Valor a ser pago pelo cliente: R$ " + (b - (b/100*6)) );
        }
        if (combustivel.equalsIgnoreCase("g") && litros<=20){
            System.out.println("Valor a ser pago pelo cliente: R$ " + (b - (b/100*4)) );
        }*/

        //EX27

        /*System.out.println("Entre com a qtd em kgs de morango ");
        double qtdMorango = scanner.nextDouble();
        System.out.println("Entre com a qtd em kgs de maçã: ");
        double qtdMaca = scanner.nextDouble();

        double quilos = qtdMaca+qtdMorango;
        double precoKgMorango = 0;

        if (qtdMorango <=5){
            precoKgMorango = 2.5;
        }else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <=5){
            precoKgMaca = 1.8;
        }else {
            precoKgMaca = 1.5;
        }

        double total = (qtdMorango*precoKgMorango + qtdMaca*precoKgMaca);

        if (total>25 | quilos>8){
            System.out.println("Valor Total = R$ " + (total - (total*0.1)));
        }else {
            System.out.println("Valor Total = R$ " + total);
        }*/

        //EX28
        /*System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = scanner.nextInt();

        System.out.println("Quantidade em kg de carne: ");
        double quilos = scanner.nextDouble();

        System.out.println("Possui o cartão Tabajara? ");
        String cartao = scanner.next();

        double precoCarne = 0;
        if (tipo == 1 && quilos<=5){
            precoCarne = 4.9;
        }
        if (tipo==1 && quilos>5){precoCarne = 5.8;}

        if (tipo==2 && quilos<=5){
            precoCarne = 5.9;}
        if (tipo==2 && quilos>5){precoCarne = 6.8;}
        if (tipo==3 && quilos<=5){precoCarne = 6.9;}
        if (tipo==3 && quilos>5){precoCarne = 7.8;}

        double total;
        if (cartao.equalsIgnoreCase("sim")){
            total = (precoCarne*quilos) - ((precoCarne*quilos)*0.05);
        } else {
            total = precoCarne*quilos;
        }

        System.out.println("Cupom Fiscal \nTipo de carne: " + tipo + "\nQuantidade de carne: " + quilos
        + "kg" + "\nTotal= R$ " + total);*/


    }
}
