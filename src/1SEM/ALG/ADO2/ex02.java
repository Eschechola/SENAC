import java.util.Scanner;

/*
 * Ex: 
 * 2. O número 3025 possui a seguinte característica:30 + 25 = 55 e 55^2= 3025.
 * Criar um algoritmo que apresente na tela todosos números positivos de quatro algarismos que possuem a característica citada.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main2 {
    public static void main(String args[]){
        for(int i = 1000; i <=9999;i++){            
            double numAoQuadrado = Math.pow(((i/100) + (i%100)), 2);

            if(i == numAoQuadrado){
                System.out.printf("\n%d", i);
            }
        }
    }
}