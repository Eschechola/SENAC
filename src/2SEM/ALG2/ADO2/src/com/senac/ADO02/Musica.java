package com.senac.ADO02;

import java.util.Random;

public class Musica {
    private String _nome;
    private String _artista;
    private double _duracao;
    private int _code;

    public Musica(
            int code,
            String nome,
            String artista,
            double duracao) {
        this._code = code;
        this._nome = nome;
        this._artista = artista;
        this._duracao = duracao;
    }

    public Musica(
            String _nome,
            String _artista,
            double _duracao) {
        gerarCodigoAleatorio();
        this._nome = _nome;
        this._artista = _artista;
        this._duracao = _duracao;
    }

    public void gerarCodigoAleatorio(){
        this._code = new Random().nextInt(1000);
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getArtista() {
        return _artista;
    }

    public void setArtista(String artista) {
        this._artista = artista;
    }

    public double getDuracao() {
        return _duracao;
    }

    public void setDuracao(double duracao) {
        this._duracao = duracao;
    }

    public int getCode() {
        return _code;
    }

    public void setCode(int code) {
        this._code = code;
    }
}
