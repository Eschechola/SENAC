

package arvore;


public class No {
  private Object objeto;
  private No esquerda, direita;

    public No(Object objeto, No esquerda, No direita) {
        this.objeto = objeto;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
   
}
