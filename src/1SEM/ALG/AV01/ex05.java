import java.util.Scanner;

/*
 * Ex: 
 * 5. Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela abaixo:
 * 5 a 7 anos = Infantil A
 * 8 a 10 anos = Infantil B
 * 11 a 13 anos = Juvenil A
 * 14 a 17 anos = Juvenil B
 * Maior de idade = Adulto
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main5 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = sn.nextInt();

        if(idade < 5)
            System.out.println("Menores de 5 anos não podem nadar!");

        if(idade >= 5 && idade <= 7)
            System.out.println("Infantil A");

        if(idade >= 8 && idade <= 10)
            System.out.println("Infantil B");

        if(idade >= 11 && idade <= 13)
            System.out.println("Juvenil A");

        if(idade >= 14 && idade <= 17)
            System.out.println("Juvenil B");

        if(idade >= 18)
            System.out.println("Adulto");
    }
}