package Exercicio_10.src.aplicacao;

import Exercicio_10.src.modelo.Equipamento;

public class Main {
    public static void main(String[] args) {
        
        Equipamento item1 = new Equipamento("Microscópio óptico", "Craltech MICB-10", 10032);
        Equipamento item2 = new Equipamento("Projetor", "HY300 PRO  PLUS", 90982);
        Equipamento item3 = new Equipamento("Notebook", "Galaxy Book 4", 37128);

        item1.emprestar();
        item1.emprestar();
        item1.devolver();

        item2.emprestar();

        item3.verificarDisponibilidade();
        item3.emprestar();

        item1.exibirDados();
        item2.exibirDados();
        item3.exibirDados();

    }
}
