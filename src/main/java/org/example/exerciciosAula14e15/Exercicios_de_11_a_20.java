package org.example.exerciciosAula14e15;

import java.util.Scanner;

public class Exercicios_de_11_a_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX11
        //Conferir a da prof, ficou bem mais curto.
        /*System.out.println("Digite o salário atual do colaborador:");
        double salarioAtual = scanner.nextDouble();
        double porc20 = (salarioAtual*0.2);
        double porc15 = (salarioAtual*0.15);
        double porc10 = (salarioAtual*0.1);
        double porc5 = (salarioAtual*0.05);

        System.out.println("Salário antes do reajuste: R$" + salarioAtual);

        if (salarioAtual<=280) {
            double novoSalario = salarioAtual+porc20;
            System.out.println("Percentual aumentado: 20%");
            System.out.println("Valor do aumento: R$" + porc20);
            System.out.println("Novo Salário após o aumento: R$" + novoSalario);
        } else if (salarioAtual>280 && salarioAtual<=700) {
            double novoSal = salarioAtual+porc15;
            System.out.println("Percentual aumentado: 15%");
            System.out.println("Valor do aumento: R$" + porc15);
            System.out.println("Novo Salário após o aumento: R$" + novoSal);
        } else if (salarioAtual>700 && salarioAtual<=1500) {
            double novoS = salarioAtual+porc10;
            System.out.println("Percentual aumentado: 10%");
            System.out.println("Valor do aumento: R$" + porc10);
            System.out.println("Novo Salário após o aumento: R$" + novoS);
        }else {
            double na = salarioAtual+porc5;
            System.out.println("Percentual aumentado: 5%");
            System.out.println("Valor do aumento: R$" + porc5);
            System.out.println("Novo Salário após o aumento: R$" + na);
        }*/

        //ex12
        /*System.out.println("Digite quanto ganha por hora: ");
        int salarioHora = scanner.nextInt();
        System.out.println("Digite quantas horas trabalha no mês: ");
        int horasMes = scanner.nextInt();

        double salariobruto = (salarioHora*horasMes);

        double porcIr;
        double porc;

        if (salariobruto <=900) {porcIr = 0;
         porc = 0;}
        else if (salariobruto<=1500 && salariobruto>900) {
            porcIr = (0.05*salariobruto);
             porc = 5;
        } else if (salariobruto<=2500 && salariobruto>1500) {
            porcIr = (0.1*salariobruto);
             porc = 10;
        }else {porcIr=(0.2*salariobruto);
         porc = 20;}


        double porcSind = (0.03*salariobruto);
        double porcinss = (0.1*salariobruto);
        double pocfgts = (0.11*salariobruto);
        double descontos = (porcIr+porcinss);
        double salarioLiquido = (salariobruto-descontos);


        System.out.println("Salário Bruto: " + "(" + " " + salarioHora + " "+"*"+" " + horasMes + ")      " + ": R$ " + salariobruto);

        System.out.println("( - ) IR  ( " + porc + "% )            " + ": R$ " + porcIr);

        System.out.println("( - ) INSS  " + "( 10 %)            : R$ " + porcinss);
        System.out.println("FGTS  (11%)                    : R$ " + pocfgts);
        System.out.println("Total de descontos             : R$ " + descontos);

        System.out.println("Salário Líquido                : R$ " + salarioLiquido );*/

        //ex13 - Faça um programa que leia um nº e exiba o dia correspondente da semana.
        // (1-domingo, 2- segunda, etc.), se digitar outro valor deve aparecer valor inválido.
        /*System.out.println("Digite o número");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");break;
            case 2:
                System.out.println("Segunda");break;
            case 3:
                System.out.println("Terça");break;
            case 4:
                System.out.println("Quarta");break;
            case 5:
                System.out.println("Quinta");break;
            case 6:
                System.out.println("Sexta");break;
            case 7:
                System.out.println("Sábado");break;
            default:
                System.out.println("Valor Inválido");
        }*/

        /*EX14 - Faça um programa que lê as 2 notas parciais obtidas por um aluno numa disciplina
        ao longo de 1 semestre e calcule a sua média. O algoritmo deve mostrar na tela as notas, a média,
        o conceito correspondente e a mensagem "APROVADO" ou "REPROVADO" */
        /*System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1+nota2)/2;
        System.out.println("A média foi " + media);

        if (media <= 10 && media >= 9){
            System.out.println("Conceito A  \nAprovado");
        } else if (media <9 && media >= 7.5) {
            System.out.println("Conceito B  \nAprovado");
        } else if (media >= 6 && media <7.5) {
            System.out.println("Conceito C  \nAprovado");
        } else if (media >= 4 && media <6) {
            System.out.println("Conceito D  \nReprovado");
        } else if (media > 4 && media <=0) {
            System.out.println("Conceito E  \nReprovado");
        }else {
            System.out.println("Valor Inválido");
        }*/


        /*Ex19 - Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas,
        dezenas e unidades do mesmo.
        Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
        326 = 3 centenas, 2 dezenas e 6 unidades
        12 = 1 dezena e 2 unidades
        Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
         */
        /*System.out.println("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();*/





    }
}
