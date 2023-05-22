package org.example.ExerciciosAula17;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Exs1a20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX1
        //"Nota Inválida, digite novamente"
        /*boolean notaValida = false;

        do {
            System.out.println("Digite uma nota entre 0 e 10");
            int nota = scanner.nextInt();
            if (nota >=0 && nota<=10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota Inválida, digite novamente: ");
            }

        }while (!notaValida);*/

        //EX1 - do meu jeito
        /*System.out.println("Digite uma nota entre 0 e 10");
        int nota = scanner.nextInt();

        while (nota<0 | nota>10){
            System.out.println("Nota Inválida, digite novamente: ");
            nota = scanner.nextInt();
        }
        System.out.println("Nota: " + nota);*/

        //EX2
        /*System.out.println("Digite o nome de Usuário: ");
        String nome = scanner.next();
        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        while (nome.equalsIgnoreCase(senha)){
            System.out.println("Erro, digite novamente: ");
            System.out.println("Nome de Usuário: ");
            nome = scanner.next();
            System.out.println("Digite a senha: ");
            senha = scanner.next();
        }
        System.out.println("Senha e usuário válidos");*/

        //EX3
        /*String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil = null;

        boolean infoValida = false;


        do {
            System.out.println("Digite o nome: ");
            nome = scanner.next();

            if (nome.length()<3){
                System.out.println("Nome Inválido, deve ter mais de 3 caracteres.");
                infoValida = false;
            }else {
                infoValida = true;
            }

        }while (!infoValida);

        do {
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();

            if (idade<0 || idade>150){
                System.out.println("Idade Inválida, deve ser entre 0 e 150. ");
                infoValida = false;
            }else {
                infoValida = true;
            }

        }while (!infoValida);

        do {
            System.out.println("Digite o salário: ");
            salario = scanner.nextDouble();

            if (salario<=0){
                System.out.println("Salário Inválido, deve ser maior que 0.");
                infoValida = false;
            }else {
                infoValida = true;
            }

        }while (!infoValida);

        do {
            System.out.println("Digite o sexo: ");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            }else {
                System.out.println("Sexo Inválido, deve se 'f' ou 'm'. ");
                infoValida = false;
            }

        }while (!infoValida);

        do {
            System.out.println("Digite o estado civil: ");
            estadoCivil = scanner.next();

            if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") ||
            estadoCivil.equalsIgnoreCase("v")|| estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            }else {
                System.out.println("Estado Civil Inválido, deve ser 's', 'c', 'v' ou 'd'. ");
                infoValida = false;
            }

        }while (!infoValida);

        System.out.println("Informações adquiridas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);*/

        //EX 4
        /*int habA = 80000;
        int habB = 200000;

        int count = 0;

        while (habA<=habB) {

            habA += (habA*0.03);
            habB += (habB*0.015);
            count++;
        }

        System.out.println("População A: " + habA);
        System.out.println("População B: " + habB);
        System.out.println("Qtd anos: " + count);*/

        //EX6
        /*for (int i =1;i <= 20; i++ ){
            System.out.print(i + " ");
        }*/

        //EX7
        /*int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i<=5; i++){
            System.out.println("Entre com um número: ");
            num = scanner.nextInt();
            if (num>maior){
                maior = num;
            }
        }

        System.out.println("O maior número foi: " + maior);*/

        //EX8
        /*int num;
        int soma=0;
        double media;

        for (int i =1; i<=5; i++){
            System.out.println("Digite um número: ");
            num = scanner.nextInt();

            soma += num;
        }
        media = soma/5;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média é: " + media);*/

        //EX9
        /*for (int i = 1; i<=50; i++){
           if (i%2 != 0) {
               System.out.print(i + " ");
           }
        }*/

        //EX10 e 11
        /*int num1;
        int num2;
        int soma = 0;

        System.out.println("Digite o 1º número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        num2 = scanner.nextInt();

        System.out.println("Os números que estão no intervalo entre esses dois números são: ");
        for (int i = num1 + 1 ; i < num2 ; i++){
            soma += i;
            System.out.print(i + " ");
        }
        System.out.println("A soma desses números é: " + soma);*/

        //EX12
        /*int num;
        System.out.println("Tabuada de: ");
        num = scanner.nextInt();

        System.out.println("Tabuada de " + num + ": ");
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }*/

        //EX13
        /*int numBase;
        int numExpoente;
        int resultado = 1;
        int um = 1;
        System.out.println("Digite a base: ");
        numBase = scanner.nextInt();
        System.out.println("Digite o expoente: ");
        numExpoente = scanner.nextInt();

        System.out.println("O resultado é: ");
        for (int i = 1; i <= numExpoente; i++){
            System.out.print(numBase + " X ");
            resultado *= numBase;
        }
        System.out.println(" = " + resultado);*/

        //EX14
        /*int num;
        int countPar = 0;
        int countImpar = 0;

        System.out.println("Digite 10 números ");
        for (int i = 0; i<10 ;i++){
            num = scanner.nextInt();
            if (num %2 == 0){
                countPar++;
            }else {
                countImpar++;
            }
        }
        System.out.println("Há " + countPar + " números pares e " + countImpar + " números ímpares");*/

        //EX15
        /*int termo;
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println("Até qual termo? ");
        termo = scanner.nextInt();

        System.out.println("A sequência fica: ");
        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        for (int i = 3; i<=termo; i++){
                proximo = primeiro+segundo;
                primeiro=segundo;
                segundo=proximo;
                System.out.print(proximo + " ");}*/

        //EX16
        /*int primeiro = 1;
        int segundo = 1;
        int proximo=0;

        System.out.print(primeiro+ " ");
        System.out.print(segundo+ " ");

        for (int i = 3; proximo<500 ; i++){
            proximo=primeiro+segundo;
            primeiro=segundo;
            segundo=proximo;
            System.out.print(proximo + " ");
        }*/

        //EX17
        /*int fatorial;
        int num = 1;

        System.out.println("Fatorial de: ");
        fatorial = scanner.nextInt();

        System.out.println("O resultado de " + fatorial + "! é igual a: ");
        for (int i = fatorial; i>0 ; i--){
            num *= i;
            System.out.print(i + ".");
        }

        System.out.println(" = " + num);*/

        //EX18
        /*int num;
        int soma=0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números: ");
        for (int i = 0 ; i<5 ; i++){
            num = scanner.nextInt();
            soma += num;
            if (num>maior) {maior=num;}
            if (num<menor) {menor=num;}
        }
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);*/












    }
}
