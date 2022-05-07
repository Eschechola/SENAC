import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/*
 * Ex: 
 * 3. Criar um algoritmo que leia a idade e o peso de 15 pessoas e apresente na tela a média dos pesos das pessoas da mesma faixaetária.
 * As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 30 anos.
 * 
 * Nome: Lucas Gabriel Eschechola
*/

class Pessoa{
    public int Idade;
    public double Peso;

    public Pessoa(int idade, double peso){
        Idade = idade;
        Peso = peso;
    }
}

class Main3 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);

        var pessoas = new ArrayList<Pessoa>();

        for(int i = 0; i < 15; i++){
            int idade = 0;
            double peso = 0;
            
            System.out.println("Digite sua idade: ");
            idade = sn.nextInt();

            System.out.println("Digite seu peso: ");
            peso = sn.nextDouble();

            pessoas.add(new Pessoa(idade,peso));
        }

        var pessoas1a10 = pessoas.stream()
            .filter(p -> p.Idade >= 1 && p.Idade <= 10)
            .collect(Collectors.toList());

        double mediaPessoas1a10 = (pessoas1a10.stream().mapToDouble(p->p.Peso).sum() / pessoas1a10.stream().count());

        System.out.printf("\nA média de peso de pessoas entre 1 a 10 anos é: %.2fKG", mediaPessoas1a10);

        var pessoas11a20 = pessoas.stream()
            .filter(p -> p.Idade >= 11 && p.Idade <= 20)
            .collect(Collectors.toList());

        double mediaPessoas11a20 = (pessoas11a20.stream().mapToDouble(p->p.Peso).sum() / pessoas11a20.stream().count());

        System.out.printf("\nA média de peso de pessoas entre 11 a 20 anos é: %.2fKG", mediaPessoas11a20);

        var pessoas21a30 = pessoas.stream()
            .filter(p -> p.Idade >= 21 && p.Idade <= 30)
            .collect(Collectors.toList());

        double mediaPessoas21a30 = (pessoas21a30.stream().mapToDouble(p->p.Peso).sum() / pessoas21a30.stream().count());

        System.out.printf("\nA média de peso de pessoas entre 21 a 30 anos é: %.2fKG", mediaPessoas21a30);

        var pessoasMaiores30 = pessoas.stream()
            .filter(p -> p.Idade > 30)
            .collect(Collectors.toList());

        double mediaPessoasMaiores30 = (pessoasMaiores30.stream().mapToDouble(p->p.Peso).sum() / pessoasMaiores30.stream().count());

        System.out.printf("\nA média de peso de pessoas maiores que 30 anos é: %.2fKG", mediaPessoasMaiores30);
    }
}