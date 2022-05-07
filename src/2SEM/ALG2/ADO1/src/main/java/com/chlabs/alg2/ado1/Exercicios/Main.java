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

public class Main {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.println("Selecione o exercício que deseja executar\n");
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");
        System.out.println("3 - Exercício 3");
        System.out.println("4 - Exercício 4");
        int op = Integer.parseInt(sn.next());
        
        switch(op){
            case 1:
                Ex01.Execute();
                break;
                
            case 2:
                Ex02.Execute();
                break;
                
            case 3:
                Ex03.Execute();
                break;
                
            case 4:
                Ex04.Execute();
                break;
        }
    }
}
