using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace MedicaoTempo
{
    public static class Utilidades
    {
        private static Random gerador = new Random();

        /// <summary>
        /// Método de classe que popula lista com números aleatórios ou de forma sequencial dentro de uma faixa
        /// </summary>
        /// <param name="lista">Lista a ser populada</param>
        /// <param name="quantidadeNumeros">Quantidade de números a serem inseridos</param>
        /// <param name="inicio">Valor inicial da faixa</param>
        /// <param name="fim">Valor final da faixa</param>
        /// <param name="aleatorio">Se true os números devem ser aleatórios</param>
        public static void PopularLista(List<int> lista, long quantidadeNumeros, int inicio, int fim, bool aleatorio)
        {
            if (aleatorio)
            {
                for (long i = 0; i < quantidadeNumeros; i++)
                {
                    lista.Add(gerador.Next(inicio, fim + 1));
                }
            }
            else
            {
                for (long i = inicio; i < quantidadeNumeros + inicio; i++)
                {
                    lista.Add((int)i);
                }
            }
        }

        /// <summary>
        /// Método de classe que exibe conteúdo de uma lista de inteiros
        /// </summary>
        /// <param name="lista">Lista a ser exibida</param>
        /// <param name="frase">Frase para exibir no início do método</param>
        public static void ExibirLista(List<int> lista, string frase)
        {
            Console.WriteLine(frase);
            foreach (int item in lista)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine("--------------------------");
            Console.WriteLine($"Total de registros: {lista.Count}");
        }
    }

    /// <summary>
    /// Construir um programa que popule 2 listas: uma com números aleatórios e outra com números sequenciais... temporizando cada rotina
    /// </summary>
    class MedicaoTempo
    {
        static void Main(string[] args)
        {
            Stopwatch stopwatch = new Stopwatch();
            List<int> listaAleatoria = new List<int>();
            List<int> listaSequencial = new List<int>();

            // Rotina 1 - popular uma lista com 100000 aleatórios na faixa 100 a 100000
            stopwatch.Start();
            Utilidades.PopularLista(listaAleatoria, 100000, 100, 100000, true);
            // Utilidades.ExibirLista(listaAleatoria, "Lista aleatoria");
            stopwatch.Stop();
            Console.WriteLine($"Tempo (ms) rotina 1: {stopwatch.ElapsedMilliseconds}");

            // Rotina 2 - popular uma lista com 100000 de forma crescente 1 na posição 0, 2 na posição 1, e assim por diante
            stopwatch.Restart();
            Utilidades.PopularLista(listaSequencial, 100000, 1, 100000, false);
            // Utilidades.ExibirLista(listaSequencial, "Lista sequencial");
            stopwatch.Stop();
            Console.WriteLine($"Tempo (ms) rotina 2: {stopwatch.ElapsedMilliseconds}");

            Console.WriteLine("\nPressione qualquer tecla para sair...");
            Console.ReadKey();
        }
    }
}