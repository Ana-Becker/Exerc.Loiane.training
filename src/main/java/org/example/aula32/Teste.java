package org.example.aula32;

public class Teste {

    public static void main(String[] args) {

        Computador alien = new Computador();
        alien.setMarca("Dell");
        alien.setModelo("Alienware");
        alien.setProcessador("Intel Core");
        alien.setTamanhoTela(15);
        alien.setPreco(15299);

        System.out.println(alien.getMarca());
        System.out.println(alien.getModelo());
        System.out.println(alien.getProcessador());
        System.out.println(alien.getTamanhoTela());
        System.out.println(alien.getPreco());

    }
}
