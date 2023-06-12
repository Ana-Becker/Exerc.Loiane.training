package org.example.exerciciosAula24;

public class Ex2 {
    public static void main(String[] args) {

    Livro livro = new Livro();
        livro.anoPublicacao=2006;
        livro.assunto = "Aprenda a enriquer";
        livro.nomeAutor = "Eker, T.Harv, Junior";
        livro.qtdPaginas = 176;
        livro.titulo = "Os segredos da mente milionária";
        livro.edicao = 1;
        livro.editora = "Sextante";
        livro.formato = "Impresso";


        System.out.println(livro.titulo);
        System.out.println(livro.assunto);
        System.out.println(livro.nomeAutor);

}}
