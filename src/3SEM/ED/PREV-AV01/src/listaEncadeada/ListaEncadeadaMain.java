package listaEncadeada;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ListaEncadeadaMain {
    public static void Execute() throws IOException {
        Scanner sn = new Scanner(System.in);

        Random _random = new Random();
        ListaEncadeada _lista = new ListaEncadeada();

        System.out.print("Quantos carros deseja inserir? \n> ");
        int quantidadeDeCarros = sn.nextInt();

        for (int i = 0; i < quantidadeDeCarros; i++) {
            sn.nextLine();

            System.out.println("\n\nCarro: " + (i + 1));

            System.out.print("Digite a marca do carro: \n> ");
            String marca = sn.nextLine();

            System.out.print("Digite o modelo do carro: \n> ");
            String modelo = sn.nextLine();

            System.out.print("Digite o ano do carro: \n> ");
            int ano = sn.nextInt();

            System.out.print("Digite o preço do carro: \n> ");
            double preco = sn.nextDouble();

            var carro = new Carro(_random.nextInt(0, 99), ano, preco, marca, modelo);
            _lista.inserirItem(carro);
        }

        while(true){
            System.out.println("\n\n\n");
            System.out.println("----------------------------------");
            System.out.println("1 - Inserir novo carro");
            System.out.println("2 - Remover um carro por id");
            System.out.println("3 - Buscar um carro por id");
            System.out.println("4 - Exibir carros");
            int opcao = sn.nextInt();

            switch (opcao){
                case 1:
                    sn.nextLine();

                    System.out.print("Digite a marca do carro: \n> ");
                    String marcaInserir = sn.nextLine();

                    System.out.print("Digite o modelo do carro: \n> ");
                    String modeloInserir = sn.nextLine();

                    System.out.print("Digite o ano do carro: \n> ");
                    int anoInserir = sn.nextInt();

                    System.out.print("Digite o preço do carro: \n> ");
                    double precoInserir = sn.nextDouble();

                    var carro = new Carro(_random.nextInt(0, 99), anoInserir, precoInserir, marcaInserir, modeloInserir);
                    _lista.inserirItem(carro);

                    System.out.println("Carro " + modeloInserir + " inserido com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o id do carro que deseja remover: \n> ");
                    int idRemover = sn.nextInt();

                    if(_lista.removerItem(idRemover))
                        System.out.println("Carro removido com sucesso!");
                    else
                        System.out.println("Carro não encontrado, tente novamente!");
                    break;

                case 3:
                    System.out.print("Digite o id do carro que deseja buscar: \n> ");
                    int idBuscar = sn.nextInt();

                    var carroItemEncontrado = _lista.pesquisarItemPorId(idBuscar);

                    if(carroItemEncontrado != null){
                        var carroEncontrado = (Carro)carroItemEncontrado.getObjeto();
                        System.out.println("Carro encontrado! \n" + carroEncontrado.toString());
                    }
                    else
                        System.out.println("Carro não encontrado, por favor tente novamente!");
                    break;

                case 4:
                    _lista.exibirItens();
                    break;
            }

            System.out.print("\nAperte qualquer tecla para continuar...");
            System.in.read();
        }
    }
}
