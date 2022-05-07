import java.util.Scanner;

/*
 * Ex: 
 * 1. Crie um programa que simule uma calculadora simples capaz de realizar as operaçoes basicas
 * O programa deve receber 3; dois números e um caractere. Este caractere poderá ser '+', '-', '*' ou '/',
 * e representarão a operação matemática que você deseja realizar entre os números
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main1 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Primeiro número: ");
        float primeiroNumero = sn.nextFloat();

        System.out.println("Segundo número: ");
        float segundoNumero = sn.nextFloat();

        System.out.println("Digite a operação: ");
        String operacao = sn.next();

        switch(operacao){
            case "+":
                System.out.printf("A soma dos números é: %.2f", primeiroNumero + segundoNumero);
            break;

            case "-":
                System.out.printf("A subtração dos números é: %.2f", primeiroNumero - segundoNumero);
            break;

            case "*":
                System.out.printf("A multiplicação dos números é: %.2f", primeiroNumero * segundoNumero);
            break;

            case "/":
                System.out.printf("A divisão dos números é: %.2f", primeiroNumero / segundoNumero);
            break;
        }
    }
}