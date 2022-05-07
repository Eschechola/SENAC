import java.util.Scanner;

/*
 * Ex: 
 * 6. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
 * Criar um programa que leia o número de maçãs compradas, calcule e apresente na tela o custo total da compra.
 *  
 * Nome: Lucas Gabriel Eschechola
*/

class Main6 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Quantidade de maçãs: ");
        int quantidadeDeMacas = sn.nextInt();

        if(quantidadeDeMacas < 12)
            System.out.printf("Valor: R$%.2f", quantidadeDeMacas * 1.3);
        else
            System.out.printf("Valor: R$%d", quantidadeDeMacas);
    }
}
