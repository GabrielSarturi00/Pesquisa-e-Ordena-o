import java.util.List;

public class Ordenacao {
    
    public static Resultado bolha(List<Integer> lista) {
        boolean houveTroca = true;
        int qtdComparacoes = 0;
        int qtdTrocas = 0;

        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                qtdComparacoes++;
                if (lista.get(i) > lista.get(i + 1)) {
                    qtdTrocas++;
                    houveTroca = true;
                    int tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                }
            }
        }

        return new Resultado(qtdComparacoes, qtdTrocas);
    }

    public static Resultado selecao(List<Integer> lista) {
        int qtdComparacoes = 0;
        int qtdTrocas = 0;

        for (int i = 0; i < lista.size() - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < lista.size(); j++) {
                qtdComparacoes++;
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }

            if (i != posMenor) {
                qtdTrocas++;
                int tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }

        return new Resultado(qtdComparacoes, qtdTrocas);
    }

    public static Resultado insercao(List<Integer> lista) {
        int qtdComparacoes = 0;
        int qtdTrocas = 0;

        for (int i = 1; i < lista.size(); i++) {
            int tmp = lista.get(i);
            int j;
            for (j = i - 1; j >= 0; j--) {
                qtdComparacoes++;
                if (tmp < lista.get(j)) {
                    lista.set(j + 1, lista.get(j));
                    qtdTrocas++;
                } else {
                    break;
                }
            }
            lista.set(j + 1, tmp);
            qtdTrocas++;
        }

        return new Resultado(qtdComparacoes, qtdTrocas);
    }
}