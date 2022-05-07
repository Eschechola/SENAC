import java.util.Scanner;

/*
 * Ex: 
 * 7. Criar um programa que leia dois números inteiros e apresente uma mensagem indicando se o primeiro número é múltiplo do segundo.
 *  
 * Nome: Lucas Gabriel Eschechola
*/

class Main7 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sn.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = sn.nextInt();

        if(primeiroNumero % segundoNumero == 0)
            System.out.println("O primeiro número É múltiplo do segundo número.");
        else
            System.out.println("O primeiro número NÃO É múltiplo do segundo número.");
    }
}
