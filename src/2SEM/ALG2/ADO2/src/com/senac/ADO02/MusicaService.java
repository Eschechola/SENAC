package com.senac.ADO02;

public class MusicaService {
    private static Musica[] _musicas;

    public MusicaService(Musica[] musicas)
    {
        this._musicas = musicas;
    }

    public boolean removerMusica(String nomeMusicaRemover)
    {
        Musica musicaExiste = pesquisarMusicaPorNome(nomeMusicaRemover);

        if(musicaExiste == null)
            return false;

        int musicasAtualizadasContador = 0;
        Musica[] musicasAtualizadas = new Musica[_musicas.length - 1];

        for(int i = 0; i < _musicas.length; i++)
        {
            if(_musicas[i].getNome() == musicaExiste.getNome())
                continue;

            musicasAtualizadas[musicasAtualizadasContador] = _musicas[i];
            musicasAtualizadasContador++;
        }

        _musicas = musicasAtualizadas;
        return true;
    }

    public void exibirMusica(Musica musica)
    {
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.printf("Código: %s\n", musica.getCode());
        System.out.printf("Nome: %s\n", musica.getNome());
        System.out.printf("Banda: %s\n", musica.getArtista());
        System.out.printf("Duracao: %.2fm", musica.getDuracao());
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
    }

    public void exibirListaDeMusicas()
    {
        Musica[] musicasOrdenadas = ordenarListaDeMusicas(_musicas);
        for(int i = 0; i < musicasOrdenadas.length; i++)
            exibirMusica(musicasOrdenadas[i]);
    }

    public Musica pesquisarMusicaPorNome(String nomeMusica)
    {
        String nomeMusicaMinusculo = nomeMusica.toLowerCase();

        Musica[] musicasOrdenadas = ordenarListaDeMusicas(_musicas);

        int posicaoInicial = 0;
        int posicaoFinal = _musicas.length - 1;
        int meio;

        while(posicaoInicial <= posicaoFinal)
        {
            meio = (posicaoInicial + posicaoFinal) / 2;

            String nomeMusicaMeioMinusculo = musicasOrdenadas[meio].getNome().toLowerCase();

            if(nomeMusicaMeioMinusculo.compareTo(nomeMusicaMinusculo) < 0)
                posicaoInicial = meio + 1;

            else if(nomeMusicaMeioMinusculo.compareTo(nomeMusicaMinusculo) > 0)
                posicaoFinal = meio - 1;

            else
                return musicasOrdenadas[meio];
        }

        return null;
    }

    private Musica[] ordenarListaDeMusicas(Musica[] musicas)
    {
        Musica[] musicasOrdenadas = musicas;

        for(int i = 0; i < musicas.length; i++)
        {
            for(int j = i + 1; j < musicas.length; j++)
            {
                String nomeMusicaAtual = musicasOrdenadas[j].getNome().toLowerCase();
                String nomeProximaMusica = musicasOrdenadas[i].getNome().toLowerCase();

                if(nomeMusicaAtual.compareTo(nomeProximaMusica) < 0)
                {
                    Musica temp = musicasOrdenadas[i];
                    musicasOrdenadas[i] = musicasOrdenadas[j];
                    musicasOrdenadas[j] = temp;
                }
            }
        }

        return musicasOrdenadas;
    }
}
