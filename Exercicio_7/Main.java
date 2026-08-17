package Exercicio_7;

public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();

        livro2.emprestar();


        livro1.exibirDados();
        livro2.exibirDados();
        livro3.exibirDados();
    }
}
