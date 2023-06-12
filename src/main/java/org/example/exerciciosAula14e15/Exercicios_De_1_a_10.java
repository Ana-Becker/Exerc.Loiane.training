package org.example.exerciciosAula14e15;

import java.util.Scanner;

public class Exercicios_De_1_a_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX 1
        /*System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1>numero2) System.out.println("O número 1 é maior: " + numero1);
        if (numero2>numero1) System.out.println("O número 2 é maior: "+numero2);*/

        //EX2
        /*System.out.println(
                "Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor>=0){
            System.out.println("O valor é positivo");
        } else {
            System.out.println("O valor é negativo");
        }*/

        //EX3
        /*System.out.println("Digite o sexo: ");
        String sexo = scanner.next();


        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Feminino");
        }
        else if (sexo.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        } else {
            System.out.println("Inválido");
        }*/

        //EX4
        /*System.out.println("Digite uma letra");
        String letra = scanner.next();

        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")| letra.equalsIgnoreCase("o")|
        letra.equalsIgnoreCase("u")) {
            System.out.println("A letra digitada é uma vogal");
        }else{
            System.out.println("A letra digitada é uma consoante");
        }*/

        //EX5
        /*System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = ((nota1+nota2)/2);

        if (media>=7 && media<10){
            System.out.println("Aprovado");
        } if (media<7) {
            System.out.println("Reprovado");
        } if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }*/

        //EX6
        /*System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        System.out.println("O maior dentre os três número é o número: ");
        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }else if (num3 > num1 && num3 > num2){
            System.out.println(num3);
        }*/

        //EX7
        /*System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        System.out.print("O maior dentre os três número é o número: ");
        if (num1 > num2 && num1 > num3){
            System.out.print(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print(num2);
        }else if (num3 > num1 && num3 > num2){
            System.out.print(num3);}

        System.out.println();

        System.out.print("O menor dentre os três número é o número: ");
        if (num1 < num2 && num1 < num3){
            System.out.print(num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.print(num2);
        }else if (num3 < num1 && num3 < num2){
            System.out.print(num3);}*/

        //ex8
        /*System.out.println("Digite o preço do primeiro produto");
        double prod1 = scanner.nextDouble();
        System.out.println("Digite o preço do segundo produto");
        double prod2 = scanner.nextDouble();
        System.out.println("Digite o preço do terceiro produto");
        double prod3 = scanner.nextDouble();

        if (prod1<prod2 && prod1<prod3) {
            System.out.println("Você deve comprar o produto 1");
        } else if (prod2<prod1 && prod2<prod3) {
            System.out.println("Você deve comprar o produto 2");
        } else if (prod3<prod2 && prod3<prod1) {
            System.out.println("Você deve comprar o produto 3");
        }*/

        //ex9
        /*System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3 && num2>num3){
            System.out.println(num1 + "," + num2 + "," + num3);
        } else if (num2>num3 && num2>num1 && num1>num3) {
            System.out.println(num2 + "," + num1 + "," + num3);

        } else if (num3>num1 && num3>num2 && num2>num1) {
            System.out.println(num3 + "," + num2 + "," + num1);

        }*/

        //ex10
        /*System.out.println("Em que turno você estuda? (digite m para matutino, v para vespertino ou " +
                "n para noturno)");
        String turno = scanner.next();

        switch (turno){
            case "m":
            case "M":
                System.out.println("Bom Dia!"); break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!");break;
            case "n":
            case "N":
                System.out.println("Boa Noite!");break;
            default:
                System.out.println("Valor Inválido");
        }*/

    }
}
