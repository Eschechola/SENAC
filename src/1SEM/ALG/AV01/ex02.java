import java.util.Scanner;

/*
 * Ex: 
 * 2. Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do mês
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main2 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = sn.next();

        System.out.println("Digite o salário do vendedor: ");
        float salarioVendedor = sn.nextFloat();

        System.out.println("Digite o valor de vendas efetuadas no mês: ");
        float valorVendasEfetuadas = sn.nextFloat();

        System.out.printf("O vendedor, %s\n", nomeVendedor);
        System.out.printf("Receberá no fim do mês: R$%.2f", salarioVendedor + (valorVendasEfetuadas * 0.15));
    }
}
