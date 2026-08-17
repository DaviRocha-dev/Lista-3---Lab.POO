package Exercicio_6;

public class Main {
    public static void main(String[] args) {
        
        Lampada lamp1 = new Lampada("Lampada 1");
        Lampada lamp2 = new Lampada("Lampada 2");

        lamp2.alterarEstado();
        lamp2.exibirEstado();

        lamp1.exibirEstado();
       
    }
}
