import java.util.Scanner;

/*
 * Ex: 
 * 5. Uma loja está levantando o valor total de todas as mercadorias em estoque.
 * Criar um algoritmo que leia o valor da mercadoriae pergunte “Mais Mercadorias (S/N)?”.
 * Ao final, apresentar na tela o total em estoque e a média de valores das mercadorias em estoque.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main5 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        int qtMercadorias = 0;
        double valorMercadorias = 0;

        System.out.println("Quantas mercadorias tem em estoque: ");
        qtMercadorias = sn.nextInt();

        System.out.println("Valor das mercadorias em estoque: ");
        valorMercadorias = sn.nextDouble();

        while(true){
            System.out.println("Mais mercadorias? (S/N)");
            char adicionar = sn.next().charAt(0);

            if(adicionar == 'S' || adicionar == 's'){
                System.out.println("Quantidade de mercadorias: ");
                int qtMercadoriasAdd = sn.nextInt();

                System.out.println("Valor de cada unidade: ");
                double valorMercadoriaAdd = sn.nextDouble();

                qtMercadorias += qtMercadoriasAdd;
                valorMercadorias += (valorMercadoriaAdd * qtMercadoriasAdd);
            }
            else{
                break;
            }
        }
        
        double mediaMercadorias = (valorMercadorias/qtMercadorias);

        System.out.printf("\nQuantidade em estoque: %d", qtMercadorias);
        System.out.printf("\nMédia de valor das mercadorias: R$%.1f", mediaMercadorias);
    }
}