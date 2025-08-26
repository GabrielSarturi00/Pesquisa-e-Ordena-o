import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Utilidades {
    private static Random gerador = new Random();

    /**
     * Método de classe que popula lista com números aleatórios ou de forma sequencial dentro de uma faixa
     * @param lista Lista a ser populada
     * @param quantidadeNumeros Quantidade de números a serem inseridos
     * @param inicio Valor inicial da faixa
     * @param fim Valor final da faixa
     * @param aleatorio Se true os números devem ser aleatórios
     */
    public static void popularLista(List<Integer> lista, long quantidadeNumeros, int inicio, int fim, boolean aleatorio) {
        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(gerador.nextInt(inicio, fim + 1));
            }
        } else {
            for (long i = inicio; i < quantidadeNumeros + inicio; i++) {
                lista.add((int)i);
            }
        }
    }

    /**
     * Método de classe que exibe conteúdo de uma lista de inteiros
     * @param lista Lista a ser exibida
     * @param frase Frase para exibir no início do método
     */
    public static void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);
        for (Integer item : lista) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }
}

/**
 * Construir um programa que popule 2 listas: uma com números aleatórios e outra com números sequenciais... temporizando cada rotina
 */
public class MedicaoTempo {
    public static void main(String[] args) {
        long tempoInicio, tempoFim;  
        List<Integer> listaAleatoria = new ArrayList<>();
        List<Integer> listaSequencial = new ArrayList<>();

        // Rotina 1 - popular uma lista com 100000 aleatórios na faixa 100 a 100000
        tempoInicio = System.nanoTime();
        Utilidades.popularLista(listaAleatoria, 100000, 100, 100000, true);
        // Utilidades.exibirLista(listaAleatoria, "Lista aleatoria");
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio) / 1_000_000);

        // Rotina 2 - popular uma lista com 100000 de forma crescente 1 na posição 0, 2 na posição 1, e assim por diante
        tempoInicio = System.nanoTime();
        Utilidades.popularLista(listaSequencial, 100000, 1, 100000, false);
        // Utilidades.exibirLista(listaSequencial, "Lista sequencial");
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio) / 1_000_000);
    }
}