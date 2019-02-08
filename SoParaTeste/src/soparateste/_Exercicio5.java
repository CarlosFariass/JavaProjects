/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soparateste;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class _Exercicio5 {
    
    public static void main(String[] args) {  
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    
    int cod1, cod2, num1, num2;
    double preco1, preco2, total;
    
    
    cod1 = sc.nextInt();
    num1 = sc.nextInt();
    preco1 = sc.nextDouble();
    
    cod2 = sc.nextInt();
    num2 = sc.nextInt();
    preco2 = sc.nextDouble();
    
    total = preco1 * num1 + preco2 * num2;
    
            System.out.printf("VALOR A PAGAR: R$  %.2f%n", total);
            
            
    
    sc.close();
}
}