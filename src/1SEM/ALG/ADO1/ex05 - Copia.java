import java.util.Scanner;

/*
 * Ex: 
 * 5. Criar um programa que leia o salário de um funcionário (salário bruto), calcule e apresente na tela:
 * Desconto de 8% de INSS
 * Desconto de 15% de IR
 * Bônus de 5,75% sobre o salário líquido
 * Salário Bruto e Líquido
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main5 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Salário bruto: ");
        double salarioBruto = sn.nextFloat();
        System.out.printf("Salário bruto R$%.2f\n", salarioBruto);
        
        double descontoINSS = salarioBruto * 0.08;
        System.out.printf("Desconto de 8 porcento INSS R$%.2f\n", descontoINSS);
        
        double descontIR = salarioBruto * 0.15;
        System.out.printf("Desconto de 15 porcento IR R$ %.2f\n", descontIR);

        double bonusSobSalarioLiquido = (salarioBruto - (salarioBruto * 0.15) - (salarioBruto * 0.08)) * 0.0575;
        System.out.printf("Bônus de 5,75 porcento R$ %.2f\n", bonusSobSalarioLiquido);

        double salarioLiquido = (salarioBruto - (salarioBruto * 0.15) - (salarioBruto * 0.08)) + bonusSobSalarioLiquido;
        System.out.printf("Salário Líquido R$ %.2f", salarioLiquido);
    }
}
