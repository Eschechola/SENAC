import java.util.Scanner;

/*
 * Ex: 
 * 9. Criar um programa que leia a hora de início e a hora de fim de um jogo de xadrez (considere apenas horas inteiras, sem os minutos),
 * calcule e apresente na tela a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 *  
 * Nome: Lucas Gabriel Eschechola
*/

class Main9 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Peso: ");
        double peso = sn.nextFloat();

        System.out.println("Altura: ");
        double altura = sn.nextFloat();

        double imc = peso / Math.pow(altura, 2);

        if(imc < 20)
            System.out.println("Abaixo do peso");
        else if(imc >= 20 && imc < 25)
            System.out.println("Peso ideal");
        else
            System.out.println("Acima do peso");
    }
}
