import java.util.Scanner;

/*
 * Ex: 
 * 1. Desenvolver uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna XZ
 * (sem utilizar funções ou operadores de potência prontos).
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main1 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite X: ");
        int x = sn.nextInt();

        System.out.println("Digite Z: ");
        int z = sn.nextInt();
        
        int resultado = 1;

        for(int i = 0; i < z; i++)
            resultado = x * resultado;

        System.out.printf("O resultado é: %d", resultado);
    }
}