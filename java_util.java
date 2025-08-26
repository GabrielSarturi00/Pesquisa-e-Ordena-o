import java.util.List;
import java.util.Random;

public class Util {
    private static final Random random = new Random();

    public static void popularListaAleatoria(List<Integer> lista, int quantidade, int inicio, int fim) {
        for (int i = 0; i < quantidade; i++) {
            lista.add(random.nextInt(fim - inicio + 1) + inicio);
        }
    }

    public static void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);
        for (Integer item : lista) {
            System.out.println(item);
        }
    }
}