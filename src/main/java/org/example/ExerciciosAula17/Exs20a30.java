package org.example.ExerciciosAula17;

import java.util.Scanner;

public class Exs20a30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EX 21 e 22
        /*int numero;
        boolean primo = true;

        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();

        for (int i = 2; i<numero;i++){
            if (numero % i == 0 ){
                System.out.println("Não é primo, divisível por  "+ i);
                primo = false;
            }
        }
        if (primo){
            System.out.println("é primo");
        }*/

        //EX24
        /*double notas;
        int quantNota;
        double soma=0;

        System.out.println("Quantas notas? ");
        quantNota = scanner.nextInt();

        System.out.println("Digite as notas: ");

        for (int i = 0; i <quantNota ; i++){
            notas = scanner.nextDouble();
            soma += notas;
        }
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + (soma/quantNota));*/

        //EX 25
        /*int pessoas;
        int idade;
        int soma = 0;
        int media;

        System.out.println("Quantas pessoas há na turma? ");
        pessoas = scanner.nextInt();

        for (int i = 1; i<=pessoas; i++){
        System.out.println("Qual a idade da " + i + "ª pessoa?");
        idade = scanner.nextInt();
        soma += idade;
        }

        media = soma/pessoas;

        System.out.print("A média das idades é " + media + ", portanto");
        if (media <=25){
            System.out.print(" a turma é jovem.");
        }if (media <=60 && media>25){
            System.out.print(" a turma é adulta.");
        }if (media >60){
            System.out.print(" a turma é idosa.");
        }*/

        //EX 27
        /*int turmas;
        int alunos;
        int soma=0;
        int media;
        boolean invalido;

        System.out.println("São quantas turmas? ");
        turmas = scanner.nextInt();

        for (int i = 0; i<turmas ; i++){
            invalido = true;
            do {
                System.out.println("Quantos alunos há na " + (i+1) + "ª turma?");
                alunos = scanner.nextInt();
                if (alunos<=40){invalido = false;
                }else { System.out.println("Número Inválido");}

            }while (invalido);
            soma += alunos;
        }
        media =soma/turmas;

        System.out.println("O número médio de alunos por turma é: " + media);*/

        //EX28
        /*int quantCds;
        double valor;
        double soma = 0;
        double media;

        System.out.println("Quantos CDs foram comprados? ");
        quantCds = scanner.nextInt();

        for (int i = 1; i<=quantCds; i++){
            System.out.println("Qual o preço do " + i + "º CD?");
            valor = scanner.nextDouble();
            soma += valor;
        }

        media = soma/quantCds;

        System.out.println("O total gasto foi de R$ "+soma);
        System.out.println("O valor médio gasto por CD foi de R$ "+media);*/

        //EX29
        /*System.out.println("Lojas Quase Dois - Tabela de Preços");
        for (int i =1;i<=50;i++){
            System.out.println(i + " - R$ " + (i*1.99));
        }*/

        //EX 32
        /*int fatorial;
        int multiplica=1;

        System.out.println("Fatorial de ");
        fatorial = scanner.nextInt();

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i>1 ; i--){
            System.out.print(i + " . ");
            multiplica *= i;
        }
        System.out.print("1 = " + multiplica);*/

        //EX36
        /*int tabuada, comeco, fim;
        boolean certo;

        System.out.println("Montar a tabuada de: ");
        tabuada = scanner.nextInt();

        System.out.println("Começar por: ");
        comeco = scanner.nextInt();
        System.out.println("Terminar em: ");
        fim = scanner.nextInt();


        if (comeco>fim){ System.out.println("Você digitou errado, o primeiro deve ser menor que o final");
        }else {
            System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + comeco + " e terminando em " +
                    fim + ":");
            for (int i = comeco; i<=fim; i++ ){
                System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
            }
        }*/

        //EX36-PROF
        /*int tabuada, comeco, fim;
        boolean invalido = true;

        System.out.println("Montar a tabuada de: ");
        tabuada = scanner.nextInt();

        do {

            System.out.println("Começar por: ");
            comeco = scanner.nextInt();
            System.out.println("Terminar em: ");
            fim = scanner.nextInt();

            if (fim>comeco){
                invalido = false;
            }

        }while (invalido);


        System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + comeco + " e terminando em " +
                fim + ":");
        for (int i = comeco; i<=fim; i++ ){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
        //Explicação: Ficar pedindo o que está dentro do "do" enquanto o queremos está inválido,
        //que é o número final menor que o inicial. Agora, se colocarmos o número final maior
        //que o inicial, o laço fica válido e aí não precisa mais repetí-lo e vai para montar a tabuada.*/













    }
}
