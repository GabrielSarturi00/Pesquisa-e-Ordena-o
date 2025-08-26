import random
import time

class Utilidades:
    @staticmethod
    def popular_lista(lista, quantidade_numeros, inicio, fim, aleatorio):
        """
        Método de classe que popula lista com números aleatórios ou de forma sequencial dentro de uma faixa
        
        Args:
            lista: Lista a ser populada
            quantidade_numeros: Quantidade de números a serem inseridos
            inicio: Valor inicial da faixa
            fim: Valor final da faixa
            aleatorio: Se True os números devem ser aleatórios
        """
        if aleatorio:
            for _ in range(quantidade_numeros):
                lista.append(random.randint(inicio, fim))
        else:
            for i in range(inicio, quantidade_numeros + inicio):
                lista.append(i)
    
    @staticmethod
    def exibir_lista(lista, frase):
        """
        Método de classe que exibe conteúdo de uma lista de inteiros
        
        Args:
            lista: Lista a ser exibida
            frase: Frase para exibir no início do método
        """
        print(frase)
        for item in lista:
            print(item)
        print("-" * 26)
        print(f"Total de registros: {len(lista)}")

def main():
    """
    Construir um programa que popule 2 listas: uma com números aleatórios e outra com números sequenciais... temporizando cada rotina
    """
    lista_aleatoria = []
    lista_sequencial = []
    
    # Rotina 1 - popular uma lista com 100000 aleatórios na faixa 100 a 100000
    tempo_inicio = time.perf_counter()
    Utilidades.popular_lista(lista_aleatoria, 100000, 100, 100000, True)
    # Utilidades.exibir_lista(lista_aleatoria, "Lista aleatoria")
    tempo_fim = time.perf_counter()
    tempo_ms = (tempo_fim - tempo_inicio) * 1000
    print(f"Tempo (ms) rotina 1: {tempo_ms:.2f}")
    
    # Rotina 2 - popular uma lista com 100000 de forma crescente 1 na posição 0, 2 na posição 1, e assim por diante
    tempo_inicio = time.perf_counter()
    Utilidades.popular_lista(lista_sequencial, 100000, 1, 100000, False)
    # Utilidades.exibir_lista(lista_sequencial, "Lista sequencial")
    tempo_fim = time.perf_counter()
    tempo_ms = (tempo_fim - tempo_inicio) * 1000
    print(f"Tempo (ms) rotina 2: {tempo_ms:.2f}")

if __name__ == "__main__":
    main()