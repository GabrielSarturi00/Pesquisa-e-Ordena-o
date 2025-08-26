using System;
using System.Collections.Generic;

namespace AlgoritmosOrdenacao
{
    public static class Ordenacao
    {
        public static (int comparacoes, int trocas) Bolha(List<int> lista)
        {
            bool houveTroca = true;
            int qtdComparacoes = 0;
            int qtdTrocas = 0;

            while (houveTroca)
            {
                houveTroca = false;
                for (int i = 0; i < lista.Count - 1; i++)
                {
                    qtdComparacoes++;
                    if (lista[i] > lista[i + 1])
                    {
                        qtdTrocas++;
                        houveTroca = true;
                        int tmp = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = tmp;
                    }
                }
            }

            return (qtdComparacoes, qtdTrocas);
        }

        public static (int comparacoes, int trocas) Selecao(List<int> lista)
        {
            int qtdComparacoes = 0;
            int qtdTrocas = 0;

            for (int i = 0; i < lista.Count - 1; i++)
            {
                int posMenor = i;
                for (int j = i + 1; j < lista.Count; j++)
                {
                    qtdComparacoes++;
                    if (lista[j] < lista[posMenor])
                    {
                        posMenor = j;
                    }
                }

                if (i != posMenor)
                {
                    qtdTrocas++;
                    int tmp = lista[i];
                    lista[i] = lista[posMenor];
                    lista[posMenor] = tmp;
                }
            }

            return (qtdComparacoes, qtdTrocas);
        }

        public static (int comparacoes, int trocas) Insercao(List<int> lista)
        {
            int qtdComparacoes = 0;
            int qtdTrocas = 0;

            for (int i = 1; i < lista.Count; i++)
            {
                int tmp = lista[i];
                int j;
                for (j = i - 1; j >= 0; j--)
                {
                    qtdComparacoes++;
                    if (tmp < lista[j])
                    {
                        lista[j + 1] = lista[j];
                        qtdTrocas++;
                    }
                    else
                    {
                        break;
                    }
                }
                lista[j + 1] = tmp;
                qtdTrocas++;
            }

            return (qtdComparacoes, qtdTrocas);
        }
    }
}