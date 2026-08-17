package Exercicio_8;

public class Main {
    public static void main(String[] args) {

        Produto caneta =  new Produto("Caneta", 2.50, 36);
        Produto lapis =  new Produto("Lapis", 1.30,  43);
        Produto borracha =  new Produto("Borracha", 2.90, 27);


        caneta.adicionarEstoque(0);
        caneta.retirarEstoque(37);
    
        lapis.adicionarEstoque(10);
        lapis.retirarEstoque(-2);

        borracha.retirarEstoque(7);
        

        caneta.exibirResumo();
        lapis.exibirResumo();
        borracha.exibirResumo();
    }    
}
