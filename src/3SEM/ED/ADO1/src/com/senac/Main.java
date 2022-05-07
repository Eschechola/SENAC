package com.senac;

import javax.management.InstanceNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        var _livroService = new LivroService();

        Livro[] livros = new Livro[0];

        System.out.print("Quantos livros deseja inserir? \n> ");
        int quantidadeDeLivros = sn.nextInt();

        for(int i =0; i < quantidadeDeLivros; i++){
            System.out.print("Digite o titulo do livro: \n> ");
            String titulo = sn.next();

            System.out.print("Digite o autor do livro: \n> ");
            String autor = sn.next();

            System.out.print("Digite o preço do livro: \n> ");
            double preco = sn.nextDouble();

            livros = _livroService.inserirLivro(livros, i, titulo, autor, preco);
        }

        while(true){
            System.out.println("----------------------------------");
            System.out.println("1 - Inserir novo Livro");
            System.out.println("2 - Remover um livro por id");
            System.out.println("3 - Buscar um livro por título");
            System.out.println("4 - Exibir livros");
            System.out.println("5 - Ordenar e exibir livros pelo título");
            System.out.print("> ");
            int opcao = sn.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Digite o titulo do livro: \n> ");
                    String titulo = sn.next();

                    System.out.print("Digite o autor do livro: \n> ");
                    String autor = sn.next();

                    System.out.print("Digite o preço do livro: \n> ");
                    double preco = sn.nextDouble();

                    livros = _livroService.inserirLivro(livros, livros.length, titulo, autor, preco);

                    System.out.print("\nLivro " + titulo + " inserido com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o id do livro que deseja remover: \n> ");
                    int idRemover = sn.nextInt();

                    try
                    {
                        livros = _livroService.removerLivroPorId(livros, idRemover);
                        System.out.print("\nLivro com o id " + idRemover + " removido com sucesso!");
                    }
                    catch(InstanceNotFoundException error){
                        System.out.println("\nNão foi encontrado nenhum livro com o id " + idRemover);
                    }
                    break;

                case 3:
                    System.out.print("Digite o titulo do livro que deseja buscar: \n> ");
                    String tituloBuscar = sn.next();

                    try{
                        Livro livro = _livroService.buscarLivroPorTitulo(livros, tituloBuscar);
                        System.out.println("Livro encontrado com sucesso!");
                        System.out.println(livro.toString());
                    }
                    catch(InstanceNotFoundException error){
                        System.out.println("\nNão foi encontrado nenhum livro com o titulo " + tituloBuscar);
                    }
                    break;

                case 4:
                    _livroService.exibirLivros(livros);
                    break;

                case 5:
                    _livroService.ordenarLivrosPorTitulo(livros);
                    _livroService.exibirLivros(livros);
                    break;
            }

            System.out.print("\nAperte qualquer tecla para continuar...");
            System.in.read();
        }
    }
}