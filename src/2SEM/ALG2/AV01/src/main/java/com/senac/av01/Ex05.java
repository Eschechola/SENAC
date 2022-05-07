package com.senac.av01;

 import java.util.Scanner;

/**
 *
 * @author Lucas Eschechola, Alison Avelino
 */
class Main04 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Executando exercício 05");
        
        System.out.println("Quantidade de linhas: ");
        int linhas = sn.nextInt();
        
        System.out.println("Quantidade de colunas: ");
        int colunas = sn.nextInt();
        
        float[][] matriz = new float[linhas][colunas];
        
        while(true){
            System.out.println("\n\n1 - Ler valores da matriz");
            System.out.println("2 - Exibir valores da matriz");
            System.out.println("2 - Exibir valores menores ou iguais a media");
            int opcao = sn.nextInt();
            
            switch(opcao){
                case 1:
                    matriz = ArrayFuncionalidades.LerValoresDaMatriz(linhas, colunas);
                    break;
                
                case 2:
                    ArrayFuncionalidades.ExibirValoresDaMatriz(matriz);
                    break;
                    
                case 3:
                    ArrayFuncionalidades.ExibirValoresMenoresOuIguaisAMediaAritimetica(matriz);
                    break;
            }
        }
    }
}

class ArrayFuncionalidades{
   public static float[][] LerValoresDaMatriz(int linhas, int colunas){
       Scanner sn = new Scanner(System.in);
       float[][] matriz = new float[linhas][colunas];
       
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[0].length; j++){
               System.out.println("Digite o valor [" + i + "]x[" + j + "]");
               matriz[i][j] = sn.nextFloat();
           }
       }
       
       return matriz;
   }
   
   public static void ExibirValoresDaMatriz(float[][] matriz){
       System.out.println("Matriz: ");
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[0].length; j++){
               System.out.printf(" [%.2f] ", matriz[i][j]);
           }
           
           System.out.print("\n");
       }
   }
   
   public static void ExibirValoresMenoresOuIguaisAMediaAritimetica(float[][] matriz){
       ExibirValoresDaMatriz(matriz);
       
       float somaDosElementos = 0;
       int quantidadeDeElementos = matriz.length * matriz[0].length;
       
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[0].length; j++){
               somaDosElementos += matriz[i][j];
           }
       }
       
       float mediaAritimetica = somaDosElementos/quantidadeDeElementos;
       System.out.println("Media Aritimetica: ");
       System.out.printf("%.2f", mediaAritimetica);
       
       System.out.println("\nValores menores ou iguais á média");
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[0].length; j++){
               if(matriz[i][j] <= mediaAritimetica)
                   System.out.printf(" [%.2f] ", matriz[i][j]);
           }
       }
   }
}