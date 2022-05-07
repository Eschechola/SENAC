/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlabs.alg2.ado1.Exercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ex04 {
    public static void Execute(){
        System.out.println("Executando exercício 04");
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Executando exercício 04");
        
        System.out.println("Quantidade de linhas: ");
        int linhas = Integer.parseInt(sn.nextLine());
        
        System.out.println("Quantidade de colunas: ");
        int colunas = Integer.parseInt(sn.nextLine());
        
        float[][] matriz = new float[linhas][colunas];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Elemento ["+ i +"]["+ j +"]: ");
                matriz[i][j] = Float.parseFloat(sn.nextLine());
            }
        }
        
        int sumLine;
        for(int i = 0; i < matriz.length; i++){
            sumLine = 0;
            for(int j = 0; j < matriz[0].length; j++){
                sumLine +=  matriz[i][j];
            }
            System.out.printf("Soma dos elementos da linha [%d]: %d\n", i, sumLine);
        }
    }
}
