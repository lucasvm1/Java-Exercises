public class Relatorio implements Imprimivel {

    private String conteudo;

    // Construtor
    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    // Override
    @Override
    public void imprimir() {
        System.out.println("Relatório: " + conteudo);
    }
}