import java.util.Scanner;

/*
 * Ex: 
 * 7. Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
 * Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de numero negativo, mostre 
 * a mensagem correspondente “Impossivel calcular ”.
 * 
 * Nome: Lucas Gabriel Eschechola
 * 
*/

class Main7 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sn.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sn.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = sn.nextInt();

        if(2*a == 0){
            System.out.println("Impossivel calcular.");
            return;
        }

        double delta = Math.pow(b, 2) - (4 * a * c);

        if(delta <= 0){
            System.out.println("Impossivel calcular.");
            return;
        }

        double raizDelta = Math.sqrt(delta);

        if(delta % raizDelta != 0){
            System.out.println("Impossivel calcular.");
            return;
        }

        double x1 = (-b + raizDelta) / 2 * a;
        double x2 = (-b - raizDelta) / 2 * a;

        System.out.printf("x1: %.1f\n", x1);
        System.out.printf("x2: %.1f", x2);
    }
}