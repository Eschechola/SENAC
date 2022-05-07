import java.util.Scanner;

/*
 * Ex: 
 * 6. Criar um programa que leia 3 números reais A, B e C e ordene-os em ordem decrescente, de modo que o lado
 * A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base
 * nos seguintes casos, sempre escrevendo uma mensagem adequada:
 * 
 * se A ≥ B + C, apresente a mensagem: NAO FORMA TRIANGULO
 * se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
 * se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
 * se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
 * se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 * se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 * 
 * Nome: Lucas Gabriel Eschechola
 * 
*/

class Main6 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Digite o lado A: ");
        float ladoA = sn.nextFloat();
        
        System.out.println("Digite o lado B: ");
        float ladoB = sn.nextFloat();

        System.out.println("Digite o lado C: ");
        float ladoC = sn.nextFloat();

        if(ladoA >= (ladoB + ladoC))
            System.out.println("NÃO FORMA TRIANGULO");

        else if(ladoA == ladoB && ladoB == ladoC)
            System.out.println("TRIÂNGULO EQUILÁTERO");

        else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC)
            System.out.println("TRIÂNGULO ISÓSCELES");

        else if(Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2))
            System.out.println("TRIÂNGULO RETÂNGULO");

        else if(Math.pow(ladoA, 2) > Math.pow(ladoB, 2) + Math.pow(ladoC, 2))
            System.out.println("TRIÂNGULO OBTUSÂNGULO");

        else if(Math.pow(ladoA, 2) < Math.pow(ladoB, 2) + Math.pow(ladoC, 2))
            System.out.println("TRIÂNGULO ACUTÂNGULO");
    }
}