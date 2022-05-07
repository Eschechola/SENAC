package com.senac.av01;

 import java.util.Scanner;

/**
 *
 * @author Lucas Eschechola, Alison Avelino
 */
class Main04 {
    public static void main(String[] args){
        System.out.println("Executando exercício 04");
        
        char[] array = new char[]{ 'T','G','C','C','G','G','C','C','A','T','A','C','G' };
        ArrayFuncionalidades.ExibirBasesNitrogenadas(array);
    }
}

class ArrayFuncionalidades{
    public static void ExibirBasesNitrogenadas(char[] array){
        int quantidadeA = 0;
        int quantidadeC = 0;
        int quantidadeG = 0;
        int quantidadeT = 0;
        
        for(int i = 0; i < array.length; i++){
            switch(array[i]){
                case 'A':
                    quantidadeA++;
                    break;
                    
                case 'C':
                    quantidadeC++;
                    break;
            
                case 'G':
                    quantidadeG++;
                    break;
                    
                case 'T':
                    quantidadeT++;
                    break;
            }
        }
        
        System.out.printf("A - %d vezes\n", quantidadeA);
        System.out.printf("C - %d vezes\n", quantidadeC);
        System.out.printf("G - %d vezes\n", quantidadeG);
        System.out.printf("T - %d vezes\n", quantidadeT);
    }
}