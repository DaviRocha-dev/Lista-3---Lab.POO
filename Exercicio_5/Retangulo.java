package Exercicio_5;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return largura*altura;
    }
    public double calcularPerimetro(){
        return 2*(largura+altura);
    }

    public void exibirDimensoes(){
        System.out.println(" -----Dimensoes:-----");
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("---------------------");
    }
}
