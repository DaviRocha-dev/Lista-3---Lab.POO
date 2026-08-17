package Exercicio_5;

public class Main {
    public static void main(String[] args) {
        
        Retangulo retangulo1 = new Retangulo(5, 3);
        Retangulo retangulo2 = new Retangulo(8 , 2);

        retangulo1.exibirDimensoes();
        System.out.println("Area: " +  retangulo1.calcularArea() + " Perimetro: "+ retangulo1.calcularPerimetro());
       
        retangulo2.exibirDimensoes();
        System.out.println("Area: " +  retangulo2.calcularArea() + " Perimetro: "+ retangulo2.calcularPerimetro());


        
    }
}
