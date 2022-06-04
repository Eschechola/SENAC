package arvore;

public class UsaArvore {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
//        arvore.inserir(5);
//        arvore.inserir(28);
//        arvore.inserir(13);
//        arvore.inserir(4);
//        arvore.inserir(1);
//        arvore.inserir(104);
//        arvore.inserir(65);
//        arvore.inserir(13);

        arvore.inserir(1);
        arvore.inserir(7);
        arvore.inserir(9);
        arvore.inserir(9);
        arvore.inserir(5);
        arvore.inserir(2);
        arvore.inserir(6);
        arvore.inserir(5);
        arvore.inserir(11);

//        arvore.armazenarValoresOrdenadosNoArray(arvore.getRaiz());
//        arvore.exibirArray();

        arvore.exibirFolhasDaArvore(arvore.getRaiz());
    }

}
