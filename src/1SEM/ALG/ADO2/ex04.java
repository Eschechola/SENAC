import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;


/*
 * Ex: 
 * 1. Criar um algoritmo que leia o sexo (M ou F), a idade e o tempo de carteira de habilitação de várias pessoas.
 * Ao final, apresentarna tela a quantidade de mulheres (F) com idade entre 24 e 30 anos com tempo de carteira de habilitação superior a 3 anos.
 * Para encerrar a entrada de dados o usuário deve digitar uma idade menor ou igual a zero
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Pessoa{
    public char Sexo;
    public int Idade;
    public int TempoHabilitacao;

    public Pessoa(char sexo, int idade, int tempoHabilitacao){
        Sexo = sexo;
        Idade = idade;
        TempoHabilitacao = tempoHabilitacao;
    }
}

class Main4 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        var pessoas = new ArrayList<Pessoa>();

        System.out.println("PARA PARAR A EXECUÇÃO DIGITE 0\n");

        while(true){
            System.out.println("Digite sua idade: ");
            int idade = sn.nextInt();

            if(idade <= 0)
                break;

            System.out.println("Digite seu sexo: M ou F ");
            char sexo = sn.next().charAt(0);

            System.out.println("Digite quanto tempo de habilitação: ");
            int tempoHabilitacao = sn.nextInt();

            pessoas.add(new Pessoa(sexo, idade, tempoHabilitacao));
        }

        var mulheres = pessoas.stream()
            .filter(p -> (p.Sexo == 'F' || p.Sexo == 'F') && p.Idade >= 24 && p.Idade <= 30 && p.TempoHabilitacao > 3)
            .collect(Collectors.toList());

        System.out.printf("\nA quantidade de mulheres de 24 a 30 anos que tem mais de 3 anos de habilitação é: %d", mulheres.size());
    }
}