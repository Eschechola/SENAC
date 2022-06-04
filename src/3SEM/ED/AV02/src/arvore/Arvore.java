package arvore;

import java.util.ArrayList;

public class Arvore {
    private int[] _arrayValores = new int[0];
    private No raiz = null;

    public No getRaiz() {
        return raiz;
    }

    public void inserir(Object objeto) {
        No novoNo = new No(objeto, null, null);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            inserir(novoNo, raiz);
        }
    }

    private void inserir(No novoNo, No x) {
        int v = (int) novoNo.getObjeto();
        int r = (int) x.getObjeto();
        if (v < r) {
            if (x.getEsquerda() == null) {
                x.setEsquerda(novoNo);
            } else {
                inserir(novoNo, x.getEsquerda());
            }
        } else {
            if (x.getDireita() == null) {
                x.setDireita(novoNo);
            } else {
                inserir(novoNo, x.getDireita());
            }
        }
    }

    public void ordem(No x) {
        if (x != null) {
            ordem(x.getEsquerda());
            System.out.print(x.getObjeto() + " ");
            ordem(x.getDireita());
        }
    }

    public void exibirFolhasDaArvore(No x){
        if(raiz == null){
            System.out.println("Arvore vazia!");
            return;
        }

        if(x.getEsquerda() == null && x.getDireita() == null){
            System.out.print(x.getObjeto() + " | ");
            return;
        }

        if(x.getEsquerda() != null)
            exibirFolhasDaArvore(x.getEsquerda());

        if(x.getDireita() != null)
            exibirFolhasDaArvore(x.getDireita());
    }

    public void armazenarValoresOrdenadosNoArray(No x) {
        if (x != null) {
            armazenarValoresOrdenadosNoArray(x.getEsquerda());
            adicionarElementoNoArray((int)x.getObjeto());
            armazenarValoresOrdenadosNoArray(x.getDireita());
        }
    }

    public void exibirArray(){
        for(int i = 0; i < _arrayValores.length; i++)
            System.out.print(_arrayValores[i] + " | ");
    }

    private void adicionarElementoNoArray(int elemento){
        int[] novoArray = new int[_arrayValores.length + 1];
        for(int i = 0; i < _arrayValores.length; i++)
            novoArray[i] = _arrayValores[i];

        novoArray[novoArray.length - 1] = elemento;
        _arrayValores = novoArray;
    }

    public void preOrdem(No x) {
        if (x != null) {
            System.out.print(x.getObjeto() + " ");
            preOrdem(x.getEsquerda());
            preOrdem(x.getDireita());
        }
    }

    public void posOrdem(No x) {
        if (x != null) {
            posOrdem(x.getEsquerda());
            posOrdem(x.getDireita());
            System.out.print(x.getObjeto() + " ");
        }
    }

    public void percurso(No x, ListaPercursos tipo) {
        if (x != null) {
            if (tipo.equals(ListaPercursos.PRE)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getEsquerda(), tipo);
            if (tipo.equals(ListaPercursos.ORDEM)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getDireita(), tipo);
            if (tipo.equals(ListaPercursos.POS)) {
                System.out.print(x.getObjeto() + " ");
            }
        }
    }

    public No buscar(int vb, No atual) {
        if (atual != null) {
            int valorAtual = (int) atual.getObjeto();
            if (vb == valorAtual) {
                return atual;
            } else {
                if (vb < valorAtual) {
                    return buscar(vb, atual.getEsquerda());
                } else {
                    return buscar(vb, atual.getDireita());
                }
            }
        }
        return null;
    }
}
