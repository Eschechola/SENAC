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

class Produto{
    public String Name;
    public String Category;
    public int Code;
    public float Price;
    
    public Produto(){}
}

public class Ex03 {
    public static void Execute(){
        System.out.println("Executando exercício 03");
        
        Scanner sn = new Scanner(System.in);
        
        
        float sumProducts = 0;
        Produto[] produtos = new Produto[10];
        
        for(int i = 0; i < 3; i++){ 
            var produto = new Produto();
            
            System.out.println("Digite o nome do item: ");
            produto.Name = sn.nextLine();
            
            System.out.println("Digite a categoria do item: ");
            produto.Category = sn.nextLine();
            
            System.out.println("Digite o codigo do item: ");
            produto.Code = Integer.parseInt(sn.nextLine());
            
            System.out.println("Digite o preco do item: ");
            produto.Price = Float.parseFloat(sn.nextLine());
            
            produtos[i] = produto;
            sumProducts += produtos[i].Price;
        }
        
        System.out.printf("A soma do preço de todos os produtos é: R$ %.2f", sumProducts);
    }
}
