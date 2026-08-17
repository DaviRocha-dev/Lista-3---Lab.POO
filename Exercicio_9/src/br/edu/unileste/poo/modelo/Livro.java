package Exercicio_9.src.br.edu.unileste.poo.modelo;

public class Livro {
     private String titulo;
    private String autor;
    private int anoPublicado;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, int anoPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this. anoPublicado = anoPublicado;
    }

    public void emprestar(){
        if (disponivel) {
            disponivel = !disponivel;
        } else {
            System.out.println("Livro emprestado.");
        }
        
    }

    public void devolver(){
        disponivel = true;
    }

    public void exibirDados(){
        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacao: " + anoPublicado);
        System.out.println("Disponivel: " + disponivel);
    }
}
