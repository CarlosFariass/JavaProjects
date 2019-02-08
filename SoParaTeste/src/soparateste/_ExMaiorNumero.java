/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soparateste;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class _ExMaiorNumero {
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter three numbers mother fucker:");
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int higher = max(a, b, c);
                
            showResult(higher);
            
    
            sc.close();
    }
public static int max( int a, int b, int c){   // Metodo para criar função, criei a função MAX e a função SHOWRESULT.
    
    int aux;
    if (a > b && a > c){
          aux = a;
    }
    else if( b > c){
       aux = b;
    }   
    else {        
        aux = c;
     }  
    return aux;
   } 

public static void showResult(int value){
    
    System.out.println(" Higher =" + value);
    
    }
}