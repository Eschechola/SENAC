import java.util.Scanner;
import java.io.IOException;

/*
* Lucas Gabriel Eschechola da Silva
* Milia Gonçalves
*/

class AV2 {
    public static void main(String args[]) throws IOException {
        Scanner sn = new Scanner(System.in);
        final int VETOR_TAM = 2;
        String[] nomes = new String[VETOR_TAM];
        int preenchidos = 0;

        try{
            while(true)
            {
                System.out.flush();
                System.out.println("=========================");
                System.out.println("=         MENU          =");
                System.out.println("1 - Adicionar um novo nome");
                System.out.println("2 - Apresentar os nomes");
                System.out.println("3 - Pesquisar um nome");
                System.out.println("4 - Remover um nome");
                System.out.println("0 - Sair");
                System.out.print("> ");
                int opcao = sn.nextInt();

                switch(opcao){
                    case 1:
                        System.out.println("\nDigite o nome a ser inserido: ");
                        String nome = sn.next();

                        boolean cheia = true;
                        for(int i = 0; i < VETOR_TAM; i++){
                            if(nomes[i] == null){
                                cheia = false;
                                break;
                            }
                        }

                        if(cheia){
                            System.out.println("A lista já está cheia! Para adicionar um novo nome remova algum já existente.");
                            break;
                        }
                        
                        boolean jaExiste = false;
                        for(int i = 0; i < VETOR_TAM; i++){
                            if(nomes[i] != null){
                                if(nomes[i].toLowerCase().equals(nome.toLowerCase())){
                                    System.out.println("O nome informado já existe na lista!");
                                    jaExiste = true;
                                    break;
                                }
                            }
                        }

                        if(!jaExiste){
                            nomes[preenchidos] = nome;
                            System.out.printf("%d - %s adicionado com sucesso!\n", (preenchidos+1), nome);
                            preenchidos++;
                        }
                        break;

                    case 2:
                        boolean listaVazia = true;
                        for(int i = 0; i<VETOR_TAM;i++){
                            if(nomes[i]!=null)
                                listaVazia = false;
                        }

                        if(listaVazia){
                            System.out.println("A lista de nomes está vazia!");
                        }
                        else{
                            System.out.println("Apresentando todos os nomes!");
                            for(int i = 0; i < VETOR_TAM;i++){
                                if(nomes[i] != null)
                                    System.out.println((i+1) + " - " + nomes[i]);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("\nDigite o nome a ser pesquisado: ");
                        String nomePesquisar = sn.next();

                        System.out.println("Resultado da pesquisa:");

                        boolean nomeExiste = false;
                        for(int i = 0; i < VETOR_TAM; i++){
                            if(nomes[i] != null){
                                if(nomes[i].toLowerCase().contains(nomePesquisar.toLowerCase())){
                                    nomeExiste = true;
                                    System.out.println((i + 1) + " - " + nomes[i]);
                                }
                            }
                        }

                        if(!nomeExiste){
                            System.out.println("O nome não foi encontrado na lista!");
                        }
                        break;

                    case 4:
                        String[] nomesAuxiliar = new String[VETOR_TAM];

                        System.out.println("Digite o nome que deseja deletar: ");
                        String nomeDeletar = sn.next();

                        boolean nomeDeletarExiste = false;
                        for(int i = 0; i < VETOR_TAM;i++){
                            if(nomes[i]!=null){
                                if(nomes[i].toLowerCase().equals(nomeDeletar.toLowerCase())){
                                    nomes[i] = null;
                                    nomeDeletarExiste = true;
                                    break;
                                }
                            }
                        }

                        if(nomeDeletarExiste){
                            int contadorAuxiliar = 0;

                            for(int i = 0; i < VETOR_TAM; i++){
                                try{
                                    if(nomes[i] == null && nomes[i+1] != null){
                                        nomesAuxiliar[contadorAuxiliar] = nomes[i+1];
                                        contadorAuxiliar++;
                                        i++;
                                    }
                                    else if(nomes[i]!=null){
                                        nomesAuxiliar[contadorAuxiliar] = nomes[i]; 
                                        contadorAuxiliar++;
                                    }
                                }
                                catch(Exception e)
                                {}
                            }

                            nomes = nomesAuxiliar;
                            System.out.printf("O nome %s foi deletado com sucesso!\n", nomeDeletar);
                        }
                        else{
                            System.out.printf("O nome %s não foi encontrado!\n", nomeDeletar);
                        }
                        break;

                    case 0:
                        System.out.println("Para sair aperte enter!");
                        System.in.read();
                        System.exit(1);
                        break;

                    default:
                        System.out.println("Opção não encontrada!");
                        break;
                }
            }
        }
        catch(Exception e){
            throw e;
        }
    }
}