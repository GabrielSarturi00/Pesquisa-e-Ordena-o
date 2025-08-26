public class util{
    /*metodo de classe que popula aleatoriamente uma lista com numeros inteiros*/
    public static void popularListaNumerosAleatorio(ArrayList<integer> lista, int quantidade, int inicio, int fim){
        Random gerador = new Random();
        int numero;
        for(; quantidade > 0; quantidade--){
            numero = gerador.nextInt(inicio, fim);
            lista.add(numero);
        }
    }

    /*metodo*/
    public static void exibirListaNumeros(ArrayList<integer> lista){
        for(Integer item : lista){
            System.out.println(item);
        }
    }
    public static vid popularListaPalavraAleatorio(ArrayList<string> list, int quantidade, int quantidade, int tamanho){
        Random gerador = new Random();
        String palavraGerada;
        char letraSorteada;
        String posicao;
        String letras = "abcdefghijklmnopqrstuvwxyz ";

        for (; quantidade > 0; quantidade--){
            palavraGerada = "";
            for(; tamanho > 0; tamanho--){
                posicao = gerador.nextInt(letra.length());
                letraSorteada = letras.charAt(posicao);
                palavraGerada += letraSorteada;
            }
            lista.add(palavraGerada);
        }

    }
    public static void exibirListaPalavras(ArrayList<String> lista){
        for(String item:lista)

    }
}