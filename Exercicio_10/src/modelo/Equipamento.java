package Exercicio_10.src.modelo;

public class Equipamento {
    private String nome;
    private String modelo;
    private int codigo;
    private boolean disponivel = true;

    public Equipamento(String nome, String modelo, int codigo){
        this.nome = nome;
        this.modelo = modelo;
        this.codigo = codigo;
    }

    public void emprestar(){
        if (disponivel) {
            disponivel = !disponivel;
        } else {
            System.out.println("Produto indisponivel no momento(emprestado)");
        }
    }

    public void devolver(){
        disponivel = true;
    }

    public void verificarDisponibilidade(){
        System.out.println("Disponivel? " + disponivel);
    }

    public void exibirDados(){
        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("Produto: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Codigo: " + codigo);
        System.out.println("Disponivel: " + disponivel);
    }
}
