import java.util.Scanner;

/*
 * Ex: 
 * 1. Criar um programa que receba o valor do salário de um funcionário e o valor do salário mínimo e
 * apresente na tela quantossalários mínimos ganha esse funcionário.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main1 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Salário do colaborador: ");
        float salario = sn.nextFloat();

        System.out.println("Salário do mínimo: ");
        float salarioMinimo = sn.nextFloat();

        System.out.printf("O colaborar recebe %.2f salários mínimos", (salario/salarioMinimo));
    }
}