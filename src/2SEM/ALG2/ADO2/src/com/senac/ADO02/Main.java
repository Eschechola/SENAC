package com.senac.ADO02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in).useDelimiter("\n");

        Musica[] musicas =
        {
            new Musica("Why'd You Only Call Me When You're High", "Artic Monkeys", 4.48),
            new Musica("505", "Artic Monkeys", 4.13),
            new Musica("Knee Socks", "Artic Monkeys", 4.18),
            new Musica("RU Mine", "Artic Monkeys", 3.44),
            new Musica("A Certain Romance", "Artic Monkeys", 5.31),
        };

        MusicaService _musicaService = new MusicaService(musicas);

        while (true)
        {
            try
            {
                System.out.println("\n\n");
                System.out.println("================================");
                System.out.println("1 - Mostrar lista de músicas");
                System.out.println("2 - Pesquisar uma música pelo título");
                System.out.println("3 - Remover uma música da lista");
                System.out.print("> ");
                int option = sn.nextInt();

                switch (option)
                {
                    case 1:
                        System.out.println("\n\nExibindo lista de músicas...");
                        _musicaService.exibirListaDeMusicas();

                        System.out.println("Pressione 1 voltar ao menu...");
                        sn.nextInt();
                        break;

                    case 2:
                        System.out.println("\n\nDigite o nome da música que deseja buscar");
                        System.out.print("> ");
                        String nomeMusicaPesquisar = sn.next();

                        Musica musicaPesquisarEncontrada = _musicaService.pesquisarMusicaPorNome(nomeMusicaPesquisar);

                        if(musicaPesquisarEncontrada != null)
                            _musicaService.exibirMusica(musicaPesquisarEncontrada);
                        else
                            System.out.println("Nenhuma música foi encontrada com o nome: " + nomeMusicaPesquisar);

                        System.out.println("\nPressione 1 voltar ao menu...");
                        sn.nextInt();
                        break;

                    case 3:
                        System.out.println("\n\nDigite o nome da música que deseja remover");
                        System.out.print("> ");
                        String nomeMusicaRemover = sn.next();

                        boolean musicaFoiDeletada = _musicaService.removerMusica(nomeMusicaRemover);

                        if(musicaFoiDeletada)
                            System.out.println("A música com o título " + nomeMusicaRemover + " foi removida com sucesso!");
                        else
                            System.out.println("Nenhuma música foi encontrada com o nome: " + nomeMusicaRemover);

                        System.out.println("\nPressione 1 voltar ao menu...");
                        sn.nextInt();
                        break;
                }
            }
            catch(Exception err)
            {
                break;
            }
        }
    }
}

