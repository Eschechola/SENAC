/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlabs.alg2.ado1.Exercicios;

/**
 *
 * @author Lucas
 */
public class Ex02 {
    public static void Execute(){
        System.out.println("Executando exercício 02");
        
        int[] array = new int[]{ 1,2,3,4,5,6,7,8,10,234,11,12,1300 };
        
        System.out.printf("A quantidade de valores maior que a média é: %d", CalculateMountOfValuesGreatherThanAverage(array));
    }
    
    public static int CalculateMountOfValuesGreatherThanAverage(int[] array)
    {
        int average = 0;
        int sumOfValues = 0;
        int mountOfValues = 0;
        
        for(int i = 0; i < array.length; i++)
            sumOfValues += array[i];
        
        average = sumOfValues/array.length;
        
        for(int i = 0; i < array.length; i++)
            if(array[i] > average)
                mountOfValues++;
        
        return mountOfValues;
    }
}
