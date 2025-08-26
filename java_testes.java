import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaSort = new ArrayList<>();

        Util.popularListaAleatoria(lista, 5000, 100, 200);
        Util.popularListaAleatoria(listaSort, 5000, 100, 200);

        // Bolha
        long tempoInicio = System.nanoTime();
        Resultado resultado = Ordenacao.bolha(lista);
        long tempoFim = System.nanoTime();
        double tempoBolha = (tempoFim - tempoInicio) / 1_000_000_000.0;
        System.out.printf("Tempo da rotina ordenar por bolha: %.6fs%n", tempoBolha);
        System.out.println("Comparacoes: " + resultado.getComparacoes());
        System.out.println("Trocas: " + resultado.getTrocas());

        // Sort nativo
        tempoInicio = System.nanoTime();
        Collections.sort(listaSort);
        tempoFim = System.nanoTime();
        double tempoSort = (tempoFim - tempoInicio) / 1_000_000_000.0;
        System.out.printf("Tempo da rotina ordenar por sort nativo: %.6fs%n", tempoSort);
    }
}