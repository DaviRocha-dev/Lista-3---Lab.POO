package code;
public class Equipamento {
    private String codigo;
    private boolean disponivel;

    public Equipamento(String codigo) {
        this.codigo = codigo;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public void exibirSituacao() {
        System.out.println(codigo + " | " + disponivel);
    }
}