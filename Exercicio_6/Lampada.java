package Exercicio_6;

public class Lampada {
    private String identificacao;
    private boolean ligada = false;

    public Lampada(String identificacao){
        this.identificacao = identificacao;
    }

    public boolean ligar(){
        return ligada = true;
    }
    public boolean desligar(){
        return ligada = false;
    }

    public void alterarEstado(){
        ligada = !ligada;
    }

    public void exibirEstado(){
        System.out.println("ID: "+ identificacao + " | ligada? " + ligada);
    }
}
