package Exercicio_8;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            qtdEstoque += quantidade;
        } else {
           System.out.println("Insira um valor positivo");
        }
    }

    public void retirarEstoque(int quantidade){
        if (quantidade > 0 && qtdEstoque > 0 && quantidade <= qtdEstoque){
            qtdEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente");
        }
        
    }

    public double calcularValorTotal(){
        return preco * qtdEstoque;
    }

    public void exibirResumo(){
        System.out.println( "======= Dados do produto =========");
        System.out.println("Nome: " + nome);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + qtdEstoque + " uni.");
        System.out.printf("Valor TOTAL em estoque: R$ %.2f%n", calcularValorTotal());
    }


}
