public class Principal{
    public static void main(String[] args){
        ArrayList<Integer> listaNumeros = newArraylist<>();
        ArrayList<Integer> listaPalavras = newArraylist<>();

        util.PopularListaNumerosAleatorio(listaNumeros, quantidade:10, inicio:50, fim:100);
        util.exibirListaNumeros(listaNumeros);

        util.popularListaPalavrasAleatorio(listaPalavra, quantidade:10, tamanho:10);
        util.exibirListaPalavra(listaPalavra);
    }
}