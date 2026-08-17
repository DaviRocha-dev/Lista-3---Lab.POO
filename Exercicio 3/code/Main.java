package code;
public class Main {
    public static void main(String[] args) {
        
        Equipamento proj1 = new Equipamento("Projetor1");
        Equipamento note1 = new Equipamento("Notebook1");

        proj1.emprestar();

        proj1.exibirSituacao();
        note1.exibirSituacao();

    }
}
