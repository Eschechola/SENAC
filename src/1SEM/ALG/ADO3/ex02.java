import java.util.Arrays;
import java.util.Scanner;

/*
 * Ex: 
 * 2. Desenvolver um programa que leia um vetor de 16 posições de valores inteiros e troque os 8 primeiros valores
 * pelos 8 últimos valores e vice-versa. Ao final apresentar na tela os dados do vetor obtido.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main2 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        int[] vetor = new int[16];
        int[] vetorTrocado = new int[16];
        int[] vetorAuxiliar8 = new int[8];
        int[] vetorAuxiliar16 = new int[8];

        for(int i = 0; i < 16; i++){
            System.out.printf("\nDigite o valor da posição %d: ", i+1);
            vetor[i] = sn.nextInt();

            if(i < 8)
                vetorAuxiliar8[i] = vetor[i];
            else
                vetorAuxiliar16[(i-8)] = vetor[i];
        }

        for(int i = 0; i < 8; i++)
            vetorTrocado[i] = vetorAuxiliar16[i];

        for(int i = 8; i < 16; i++)
            vetorTrocado[i] = vetorAuxiliar8[(i-8)];

        System.out.printf("Vetor original: %s", Arrays.toString(vetor));
        System.out.printf("\nVetor trocado: %s", Arrays.toString(vetorTrocado));
    }
}