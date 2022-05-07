import java.util.Scanner;

/*
 * Ex: 
 * 1. Criar um programa que leia um número inteiroNmaior do que zero e calcule o fatorial desse número.
 * Fatorial deNérepresentado porN!e calculado da seguinte maneira:
 * N! =N∗(N−1)∗(N−2)∗...∗3∗2∗1
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main1 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        int resultado = 1;

        System.out.println("Número: ");
        int numero = sn.nextInt();

        while(numero != 0){
            resultado = resultado * numero;
            numero--;
        }
        
        System.out.printf("Fatorial: %d", resultado);
    }
}