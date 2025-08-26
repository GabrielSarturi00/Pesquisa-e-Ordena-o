using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace AlgoritmosOrdenacao
{
    class Testes
    {
        static void Main(string[] args)
        {
            List<int> lista = new List<int>();
            List<int> listaSort = new List<int>();

            Util.PopularListaAleatoria(lista, 5000, 100, 200);
            Util.PopularListaAleatoria(listaSort, 5000, 100, 200);

            // Bolha
            Stopwatch stopwatch = Stopwatch.StartNew();
            var (qtdComparacoes, qtdTrocas) = Ordenacao.Bolha(lista);
            stopwatch.Stop();
            Console.WriteLine($"Tempo da rotina ordenar por bolha: {stopwatch.Elapsed.TotalSeconds:F6}s");
            Console.WriteLine($"Comparacoes: {qtdComparacoes}");
            Console.WriteLine($"Trocas: {qtdTrocas}");

            // Sort nativo
            stopwatch.Restart();
            listaSort.Sort();
            stopwatch.Stop();
            Console.WriteLine($"Tempo da rotina ordenar por sort nativo: {stopwatch.Elapsed.TotalSeconds:F6}s");

            Console.WriteLine("\nPressione qualquer tecla para sair...");
            Console.ReadKey();
        }
    }
}