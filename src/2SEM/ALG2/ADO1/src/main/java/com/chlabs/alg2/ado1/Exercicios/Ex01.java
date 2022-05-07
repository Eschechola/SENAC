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
public class Ex01 {
    public static void Execute(){
        System.out.println("Executando exercício 01");
        
        int arraySum = 1;
        int[] array = new int[15];
        
        for(int i = 0; i < 15; i++){
            arraySum += i;
            array[i] = i + arraySum;
            
            System.out.println(array[i] + ", ");
        }
    }
}
