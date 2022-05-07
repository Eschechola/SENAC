import java.util.Scanner;

/*
 * Ex: 
 * 2. Criar um programa que leia a idade de uma pessoa expressa em anos,
 * mês e dias e apresente na tela a idade dessa pessoaexpressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main2 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Anos: ");
        int anos = sn.nextInt();

        System.out.println("Meses: ");
        int meses = sn.nextInt();

        System.out.println("Dias: ");
        int dias = sn.nextInt();

        System.out.printf("Você está vivo há %d dias", (anos * 365) + (meses * 30) + dias);
    }
}
