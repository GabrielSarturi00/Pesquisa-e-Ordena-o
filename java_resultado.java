public class Resultado {
    private int comparacoes;
    private int trocas;

    public Resultado(int comparacoes, int trocas) {
        this.comparacoes = comparacoes;
        this.trocas = trocas;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getTrocas() {
        return trocas;
    }
}