import java.util.Scanner;

/*
 * Ex: 
 * 1. Desenvolver uma função que recebe uma matriz bidimensional por parâmetro e retorne a transposta desta matriz
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main5 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Quantidade de linhas: ");
        int linhas = sn.nextInt();

        System.out.println("Quantidade de colunas: ");
        int colunas = sn.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Digite o valor da linha %d e da coluna %d: ", i+1, j+1);
                matriz[i][j] = sn.nextInt();
            }
        }

        System.out.print("Matriz: \n");
        ExibirMatriz(matriz);

        System.out.print("Matriz transposta: \n");
        ExibirMatriz(ObterMatrizTransposta(matriz));
    }

    public static int[][] ObterMatrizTransposta(int matriz[][]){
        //pega a quantidade de colunas da matriz enviada e transforma em linhas
        int linhas = matriz[0].length;

        //pega a quantidade de linhas da matriz enviada e transforma em colunas
        int colunas = matriz.length;

        int[][] matrizTransposta = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        return matrizTransposta;
    }

    public static void ExibirMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.printf("[%d]", matriz[i][j]);
            }

            System.out.println("");
        }
    }
}