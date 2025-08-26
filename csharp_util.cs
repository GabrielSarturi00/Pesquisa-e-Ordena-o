using System;
using System.Collections.Generic;

namespace AlgoritmosOrdenacao
{
    public static class Util
    {
        private static Random random = new Random();

        public static void PopularListaAleatoria(List<int> lista, int quantidade, int inicio, int fim)
        {
            for (int i = 0; i < quantidade; i++)
            {
                lista.Add(random.Next(inicio, fim + 1));
            }
        }

        public static void ExibirLista(List<int> lista, string frase)
        {
            Console.WriteLine(frase);
            foreach (int item in lista)
            {
                Console.WriteLine(item);
            }
        }
    }
}