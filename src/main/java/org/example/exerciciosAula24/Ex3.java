package org.example.exerciciosAula24;

public class Ex3 {
    public static void main(String[] args) {
        LivroDeLivraria livroDeLivraria = new LivroDeLivraria();

        livroDeLivraria.titulo = "Os 7 hábitos das Pessoas Altamente Eficazes";
        livroDeLivraria.nomeAutor = "Stephen R. Covey";
        livroDeLivraria.preco = 43.55;
        livroDeLivraria.garantiaMeses = 3;

        System.out.println(livroDeLivraria.titulo);
        System.out.println(livroDeLivraria.nomeAutor);
        System.out.println("R$ " + livroDeLivraria.preco);
        System.out.println("Garantia de: " + livroDeLivraria.garantiaMeses + " meses");
    }

}
