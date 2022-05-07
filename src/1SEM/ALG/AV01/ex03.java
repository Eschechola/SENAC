import java.util.Scanner;

/*
 * Ex: 
 * 3. Criar um programa que leia três números inteiros e apresente na tela o maior deles.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main3 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int maiorNumero = 0;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            
            int numero = sn.nextInt();

            if(numero > maiorNumero)
                maiorNumero = numero;
        }

        System.out.printf("O maior número é: %d", maiorNumero);
    }
}
