package com.senac.av01;

 import java.util.Scanner;
 import java.util.Random;

/**
 *
 * @author Lucas Eschechola, Alison Avelino
 */
class Main03 {
    public static void main(String[] args){
        System.out.println("Executando exercício 03");
        Scanner sn = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanhoArray = sn.nextInt();

        int[] array = new int[tamanhoArray];

        while(true){
            System.out.println("1 - Inserir valores aleatorios no array ");
            System.out.println("2 - Exibir valores múltiplos de 3 ");
            System.out.print("> ");
            int option = sn.nextInt();

            switch(option){
                case 1:
                    array = ArrayFuncionalidades.InserirValoresAleatorios(array);
                break;

                case 2:
                    ArrayFuncionalidades.ExibirValoresMultiplosDe3(array);
                break;
            }
        }
    }
}

class ArrayFuncionalidades{
    public static final int MIN_VALUE = 1;

    public static int[] InserirValoresAleatorios(int[] array){
        System.out.println("Inserindo valores aleatorios...");
        
        int[] novoArray = array;
        
        for(int i = 0; i < array.length; i++)
            novoArray[i] = new Random().nextInt((array.length - MIN_VALUE) + 1) + MIN_VALUE;
        
        return novoArray;
    }

    public static void ExibirValoresMultiplosDe3(int[] array){
        System.out.println("Exibindo valores multiplos de 3...");

        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0)
                System.out.println("> " + array[i]);
        }
    }
}