import java.util.Scanner;

/*
 * Ex: 
 * 10. Criar um programa que leia o valor de três notas escolares de um aluno.
 * Calcular a média aritmética e apresentar na tela amensagem “Aprovado” se a média obtida for maior ou igual a 7;
 * caso contrário, o programa deve solicitar a nota de examedo aluno e calcular uma nova média aritmética entre a nota do exame e a primeira média aritmética.
 * Se o valor da nova média for maior ou igual a 5, apresentar na tela a mensagem “Aprovado em exame”;
 * caso contrário, apresentar a mensagem “Reprovado”.
 * Informar junto com cada mensagem o valor da média obtida
 *  
 * Nome: Lucas Gabriel Eschechola
*/

class Main10 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double primeiraNota = sn.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = sn.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = sn.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if(media >= 7){
            System.out.printf("Aluno APROVADO!\nMédia: %.2f", media);
        }
        else{
            System.out.println("Aluno EM EXAME\nDigite a nota do exame: ");
            double notaDoExame = sn.nextDouble();
        
            double novaMedia = (media + notaDoExame)/2;
            if(novaMedia > 5)
                System.out.printf("Aluno APROVADO EM EXAME\nMédia: %.2f", novaMedia);
            else
                System.out.printf("Aluno REPROVADO\nMédia: %.2f", novaMedia);
        }
        
    }
}
