package org.example.ExerciciosAula13;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int numero;

        System.out.println("Hello World");

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);*/

        /*int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2= scanner.nextInt();

        System.out.println("A soma dos dois é: " + (numero1+numero2));*/


        /*System.out.println("Digite a primeira nota bimestral: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota bimestral: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota bimestral: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota bimestral: ");
        double nota4 = scanner.nextDouble();

        System.out.println("A média  bimestral é: "+ (nota1+nota2+nota3+nota4)/4);*/


        /* EX5.System.out.println("Digite o número em metros: ");
        double metros = scanner.nextDouble();



        System.out.println("O número em centrímetros é igual a: " + (metros*100) + " cm");
         */

        //EX6
        /*System.out.println("Dê o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é " + area);
         */

        //EX 7
        /*System.out.println("Escreva um lado do quadrado em metros: ");
        double ladoQuadrado = scanner.nextDouble();

        double areaQuadrado = Math.pow(ladoQuadrado,2);
        double dobroDaArea = areaQuadrado*2;

        System.out.println("Área do quadrado = " + areaQuadrado + " m");
        System.out.println("O dobro da área é = "+ dobroDaArea+ " m");
         */

        //EX11
        /*System.out.println("Escreva um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Escreva um outro número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Escreva um número real: ");
        double numero3 = scanner.nextDouble();

        double dobroPrimeiro = numero1*2;
        double metadeSegundo = (numero2/2);
        double triploPrimeiro = (numero1*3);
        double terceiroAoCubo = Math.pow(numero3,3);

        System.out.println("a. Produto do dobro do primeiro com metade do segundo = " + dobroPrimeiro*metadeSegundo);
        System.out.println("b. Soma do triplo do primeiro com o terceiro = " + (triploPrimeiro + numero3));
        System.out.println("c. Terceiro elevado ao cubo = " + terceiroAoCubo);
         */

        //EX 13
        /*System.out.println("Altura= ");
        double altura = scanner.nextDouble();

        System.out.println("Sexo= ");




        System.out.println("O peso ideal é: ");*/

        //EX 14
        /*System.out.println("Digite o peso dos peixes: ");
        double pesoPeixes = scanner.nextDouble();

        double multa;

        if (pesoPeixes>50){
            multa = ((pesoPeixes - 50)*4);
            System.out.println("Há multa de R$ " + multa);
        } else System.out.println("Não há multa");*/

        //EX 15
        /*System.out.println("Digite quanto ganha por hora: ");
        int salarioHora = scanner.nextInt();
        System.out.println("Digite quantas horas trabalha no mês: ");
        int horasMes = scanner.nextInt();

        double salariobruto = (salarioHora*horasMes);
        double porcInss = (0.08*salariobruto);
        double porcIr = (0.11*salariobruto);
        double porcSind = (0.05*salariobruto);
        double descontos = (porcIr+porcInss+porcSind);
        double salarioLiquido = (salariobruto-descontos);

        System.out.println("Salário bruto ao mês = R$ " + salariobruto);

        System.out.println("Valor pago ao INSS = R$ " + porcInss);

        System.out.println("Valor pago ao Imposto de Renda = R$ " + porcIr);

        System.out.println("Valor pago ao Sindicato = R$ " + porcSind);

        System.out.println("Salário Líquido = R$ " + salarioLiquido );*/

        //EX18

        /*System.out.println("Digite o tamanho do arquivo em MB: ");
        double tamArquivo = scanner.nextDouble();
        System.out.println("Digite a velocidade do link de internet em Mbps: ");
        double velocLink = scanner.nextDouble();

        double tempoMbps = (0.125*velocLink);
        System.out.println(tempoMbps);

        double tempoSeg = (tamArquivo/tempoMbps);
        System.out.println("Tempo para download do arquivo em segundos: " + tempoSeg);

        double tempoMinutos = (tempoSeg/60);
        System.out.println("Tempo para download em minutos: " + tempoMinutos);*/


















    }
}
