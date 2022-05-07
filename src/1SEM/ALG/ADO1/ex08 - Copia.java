import java.util.Scanner;

/*
 * Ex: 
 * 8. Criar um programa que leia a hora de início e a hora de fim de um jogo de xadrez (considere apenas horas inteiras, sem os minutos),
 * calcule e apresente na tela a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 *  
 * Nome: Lucas Gabriel Eschechola
*/

class Main8 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo: ");
        int horaInicio = sn.nextInt();

        System.out.println("Digite a hora de fim do jogo: ");
        int horaFim = sn.nextInt();

        if(horaInicio > horaFim)
            System.out.printf("O jogo durou %d horas", (24 - horaInicio) + horaFim);
        else
            System.out.printf("O jogo durou %d horas", horaFim - horaInicio);
    }
}
