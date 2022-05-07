import java.util.Scanner;

/*
 * Ex: 
 * 3. Criar um programa que calcule e apresente na tela o volume de uma esfera de raio R,
 * em que R é um dado fornecido pelousuário. O volume de uma esfera é dado porV=4/3πR3.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main3 {
    public static void main(String args[]){
        double PI = 3.14;
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Digite o raio da esfera: ");
        float raio = sn.nextFloat();

        System.out.printf("O volume da esfera é: %.2f", ((4/3) * PI * Math.pow(raio, 3)));
    }
}
