import java.util.Scanner;

/*
 * Ex: 
 * 3. Um vetor é palíndromo se ele não se altera quando as posições das componentes são invertidas. Por exemplo, o
 * vetor v = {1, 3, 5, 2, 2, 5, 3, 1} é palíndromo. Desenvolver uma função que recebe por parâmetro um vetor de
 * inteiros e retorna uma valor booleano indicando de o vetor é ou não palíndromo.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main3 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Vetor de quantas posições: ");
        int posicoes = sn.nextInt();

        int[] vetor = new int[posicoes];

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o valor da posição: %d: ", i+1);
            vetor[i] = sn.nextInt();
        }

        System.out.println("O vetor é palíndrono: " + EhPalindrono(vetor));
    }


    public static boolean EhPalindrono(int vetor[]){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != vetor[vetor.length - i -1])
                return false;
        }

        return true;
    }
}