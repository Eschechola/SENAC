package arrays;

import javax.management.InstanceNotFoundException;

public class LivroService
{
    //region Array Functions

    public Livro[] inserirLivro(Livro[] livros, int id, String titulo, String autor, double preco){
        Livro[] livrosAuxiliar = new Livro[livros.length + 1];

        for(int i = 0; i < livros.length; i++)
            livrosAuxiliar[i] = livros[i];

        livrosAuxiliar[livrosAuxiliar.length - 1] = new Livro(id, titulo, autor, preco);

        return livrosAuxiliar;
    }

    public Livro[] removerLivroPorId(Livro[] livros, int idLivroRemover) throws InstanceNotFoundException {
        boolean livroEncontrado = false;
        for(int i = 0; i < livros.length; i++)
            if(livros[i].getId() == idLivroRemover)
                livroEncontrado = true;

        if(!livroEncontrado)
            throw new InstanceNotFoundException("Livro com o id " + idLivroRemover + "não encontrado.");

        int contadorLivrosAuxiliar = 0;
        Livro[] livrosAuxiliar = new Livro[livros.length - 1];

        for(int i = 0; i < livros.length; i++){
            if(livros[i].getId() != idLivroRemover){
                livrosAuxiliar[contadorLivrosAuxiliar] = livros[i];
                contadorLivrosAuxiliar++;
            }
        }
        return livrosAuxiliar;
    }

    public Livro buscarLivroPorTitulo(Livro[] livros, String tituloPesquisar) throws InstanceNotFoundException {
        tituloPesquisar = tituloPesquisar.toLowerCase();
        ordenarLivrosPorTituloUsandoQuickSort(livros);

        int posicaoInicial = 0;
        int posicaoFinal = livros.length - 1;
        int meio;

        while(posicaoInicial <= posicaoFinal){
            meio = (posicaoInicial + posicaoFinal) / 2;
            String tituloLivroMeio = livros[meio].getTitulo().toLowerCase();

            if(tituloLivroMeio.compareTo(tituloPesquisar) < 0)
                posicaoInicial = meio + 1;
            else if (tituloLivroMeio.compareTo(tituloPesquisar) > 0)
                posicaoFinal = meio - 1;
            else
                return livros[meio];
        }

        throw new InstanceNotFoundException("Livro com o titulo " + tituloPesquisar + "não encontrado.");
    }

    public void exibirLivros(Livro[] livros){
        for(int i = 0; i< livros.length; i++)
            System.out.println(livros[i].toString());
    }

    //endregion

    //region Quick Sort

    public void ordenarLivrosPorTituloUsandoQuickSort(Livro[] livros){
        ordenarUsandoQuickSort(livros, 0, livros.length - 1);
    }

    private void ordenarUsandoQuickSort(Livro[] livros, int inicio, int fim){
        if(inicio < fim){
            int indicePivo = getIndiceDoPivo(livros, inicio, fim);
            ordenarUsandoQuickSort(livros, inicio, indicePivo - 1);
            ordenarUsandoQuickSort(livros, indicePivo + 1, fim);
        }
    }

    private int getIndiceDoPivo(Livro[] livros, int inicio, int fim)
    {
        Livro pivo = livros[fim];
        int indicePivo = inicio - 1;

        for(int i = inicio; i < fim; i++)
        {
            if(livros[i].getTitulo().compareTo(pivo.getTitulo()) <= 0)
            {
                indicePivo++;
                mudarPosicaoElementos(livros, indicePivo, i);
            }
        }

        mudarPosicaoElementos(livros, indicePivo + 1, fim);
        return indicePivo + 1;
    }

    private void mudarPosicaoElementos(Livro[] livros, int indiceElementoAtual, int indiceNovoElemento)
    {
        Livro livroAuxiliar = livros[indiceElementoAtual];
        livros[indiceElementoAtual] = livros[indiceNovoElemento];
        livros[indiceNovoElemento] = livroAuxiliar;
    }

    //endregion

    //region MergeSort

    public void ordenarLivrosPorTituloUsandoMergeSort(Livro[] livros){
        ordernarUsandoMergeSort(livros, 0, livros.length -1);
    }

    private void ordernarUsandoMergeSort(Livro[] livros, int esquerda, int direita){
        if(esquerda < direita){
            int meio = (esquerda + direita) / 2;

            ordernarUsandoMergeSort(livros, esquerda, meio);
            ordernarUsandoMergeSort(livros, meio + 1, direita);

            mergearValores(livros, esquerda, meio, direita);
        }
    }

    private void mergearValores(Livro[] livros, int esquerda, int meio, int direita){
        int tamanhoArrayEsquerda = meio - esquerda + 1;
        int tamanhoArrayDireita = direita - meio;

        Livro[] livrosArrayEsquerda = new Livro[tamanhoArrayEsquerda];
        Livro[] livrosArrayDireita = new Livro[tamanhoArrayDireita];

        dividirArray(livros, livrosArrayEsquerda, esquerda, 0, tamanhoArrayEsquerda);
        dividirArray(livros, livrosArrayDireita, meio+1, 0, tamanhoArrayDireita);

        int contadorEsquerda = 0;
        int contadorDireita = 0;
        for (int i = esquerda; i < direita + 1; i++)
        {
            if (contadorEsquerda == livrosArrayEsquerda.length)
            {
                livros[i] = livrosArrayDireita[contadorDireita];
                contadorDireita++;
            }
            else if (contadorDireita == livrosArrayDireita.length)
            {
                livros[i] = livrosArrayEsquerda[contadorEsquerda];
                contadorEsquerda++;
            }
            else if (livrosArrayEsquerda[contadorEsquerda].getTitulo().compareTo(livrosArrayDireita[contadorDireita].getTitulo()) <= 0)
            {
                livros[i] = livrosArrayEsquerda[contadorEsquerda];
                contadorEsquerda++;
            }
            else
            {
                livros[i] = livrosArrayDireita[contadorDireita];
                contadorDireita++;
            }
        }
    }

    private static void dividirArray(Livro[] livrosOrigem, Livro[] livrosDestino, int inicioOrigem, int inicioDestino, int tamanhoDivisao)
    {
        for (int i = inicioDestino; i < tamanhoDivisao; i++)
        {
            livrosDestino[i] = livrosOrigem[inicioOrigem];
            inicioOrigem++;
        }
    }

    //endregion
}

