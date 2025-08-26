import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> listaBolha = new ArrayList<>();
        List<Integer> listaNormal = new ArrayList<>();
        List<Integer> listaSelecao = new ArrayList<>();
        List<Integer> listaInsercao = new ArrayList<>();

        Util.popularListaAleatoria(listaBolha, 10000, 100, 20000);
        Util.popularListaAleatoria(listaNormal, 10000, 100, 20000);
        Util.popularListaAleatoria(listaSelecao, 10000, 100, 20000);
        Util.popularListaAleatoria(listaInsercao, 10000, 100, 20000);

        // Sort nativo
        long tempoInicio = System.nanoTime();
        Collections.sort(listaNormal);
        long tempoFim = System.nanoTime();
        double tempoSort = (tempoFim - tempoInicio) / 1_000_000_000.0;
        System.out.printf("Tempo da rotina ordenar por sort nativo: %.6fs%n", tempoSort);

        // Bolha
        tempoInicio = System.nanoTime();
        Resultado resultadoBolha = Ordenacao.bolha(listaBolha);
        tempoFim = System.nanoTime();
        double tempoBolha = (tempoFim - tempoInicio) / 1_000_000_000.0;
        System.out.printf("Tempo da rotina ordenar por bolha: %.6fs%n", tempoBolha);
        System.out.println("Comparacoes: " + resultadoBolha.getComparacoes());
        System.out.println("Trocas: " + resultadoBolha.getTrocas());

        // Seleção
        tempoInicio = System.nanoTime();
        Resultado resultadoSelecao = Ordenacao.selecao(listaSelecao);
        tempoFim = System.nanoTime();
        double tempoSelecao = (tempoFim - tempoInicio) / 1_000_000_000.0;
        System.out.printf("Tempo da rotina ordenar por selecao: %.6fs%n", tempoSelecao);
        System.out.println("Comparacoes: " + resultadoSelecao.getComparacoes());
        System.out.println("Trocas: " + resultadoSelecao.getTrocas());

        // Inserção
        tempoInicio = System.nanoTime();
        Resultado resultadoInsercao = Ordenacao.insercao(listaInsercao);
        tempoFim = System.nanoTime();
        double tempoInsercao = (tempoFim - tempoInicio) / 1_000_000_000.0;
        System.out.printf("Tempo da rotina ordenar por insercao: %.6fs%n", tempoInsercao);
        System.out.println("Comparacoes: " + resultadoInsercao.getComparacoes());
        System.out.println("Trocas: " + resultadoInsercao.getTrocas());
    }
}