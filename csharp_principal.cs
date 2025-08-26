using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace AlgoritmosOrdenacao
{
    class Principal
    {
        static void Main(string[] args)
        {
            List<int> listaBolha = new List<int>();
            List<int> listaNormal = new List<int>();
            List<int> listaSelecao = new List<int>();
            List<int> listaInsercao = new List<int>();

            Util.PopularListaAleatoria(listaBolha, 10000, 100, 20000);
            Util.PopularListaAleatoria(listaNormal, 10000, 100, 20000);
            Util.PopularListaAleatoria(listaSelecao, 10000, 100, 20000);
            Util.PopularListaAleatoria(listaInsercao, 10000, 100, 20000);

            // Sort nativo
            Stopwatch stopwatch = Stopwatch.StartNew();
            listaNormal.Sort();
            stopwatch.Stop();
            Console.WriteLine($"Tempo da rotina ordenar por sort nativo: {stopwatch.Elapsed.TotalSeconds:F6}s");

            // Bolha
            stopwatch.Restart();
            var (qtdComparacoesBolha, qtdTrocasBolha) = Ordenacao.Bolha(listaBolha);
            stopwatch.Stop();
            Console.WriteLine($"Tempo da rotina ordenar por bolha: {stopwatch.Elapsed.TotalSeconds:F6}s");
            Console.WriteLine($"Comparacoes: {qtdComparacoesBolha}");
            Console.WriteLine($"Trocas: {qtdTrocasBolha}");

            // Seleção
            stopwatch.Restart();
            var (qtdComparacoesSelecao, qtdTrocasSelecao) = Ordenacao.Selecao(listaSelecao);
            stopwatch.Stop();
            Console.WriteLine($"Tempo da rotina ordenar por selecao: {stopwatch.Elapsed.TotalSeconds:F6}s");
            Console.WriteLine($"Comparacoes: {qtdComparacoesSelecao}");
            Console.WriteLine($"Trocas: {qtdTrocasSelecao}");

            // Inserção
            stopwatch.Restart();
            var (qtdComparacoesInsercao, qtdTrocasInsercao) = Ordenacao.Insercao(listaInsercao);
            stopwatch.Stop();
            Console.WriteLine($"Tempo da rotina ordenar por insercao: {stopwatch.Elapsed.TotalSeconds:F6}s");
            Console.WriteLine($"Comparacoes: {qtdComparacoesInsercao}");
            Console.WriteLine($"Trocas: {qtdTrocasInsercao}");

            Console.WriteLine("\nPressione qualquer tecla para sair...");
            Console.ReadKey();
        }
    }
}