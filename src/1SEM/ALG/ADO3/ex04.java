import java.util.Scanner;

/*
 * Ex: 
 * 4. Desenvolver um programa que leia uma matriz 2 x 2 de valores inteiros e apresente o seu determinante. 
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main4 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        int[][] matriz = new int[2][2];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("Digite o valor da linha %d e da coluna %d: ", i+1, j+1);
                matriz[i][j] = sn.nextInt();
            }
        }

        int resultado = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

        System.out.printf("O resultado é: %d", resultado);
    }
}