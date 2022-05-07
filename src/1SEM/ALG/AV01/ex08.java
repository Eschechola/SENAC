import java.util.Scanner;

/*
 * Ex: 
 * 8. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja abaixo
 * alguns exemplos
 * 
 * Nome: Lucas Gabriel Eschechola
 * 
*/

class Main8 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo: ");
        int horaInicio = sn.nextInt();

        System.out.println("Digite a hora de fim do jogo: ");
        int horaFim = sn.nextInt();

        if(horaInicio >= horaFim)
            System.out.printf("O jogo durou %d horas", (24 - horaInicio) + horaFim);
        else
            System.out.printf("O jogo durou %d horas", horaFim - horaInicio);
    }
}