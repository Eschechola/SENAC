import java.util.Scanner;

/*
 * Ex: 
 * 4. O custo ao consumidor, de um carro novo, é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos(aplicados ao custo de fábrica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, criar umprograma que leia o custo de fábrica de um carro e apresenta na tela o custo final ao consumidor.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Main4 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do veículo: ");
        double custoDeFabrica = sn.nextDouble();

        System.out.printf("O custo final do veículo é: R$%.2f", custoDeFabrica + (custoDeFabrica * 0.28) + (custoDeFabrica * 0.45));
    }
}
