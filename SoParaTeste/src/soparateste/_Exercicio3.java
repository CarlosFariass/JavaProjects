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
public class _Exercicio3 {
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        
    int A, B, C, D, dif;
    
    
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    
    dif = A * B - C * D;
    
    System.out.println("DIFERENÇA = " + dif);
    
    
   sc.close();    
}
}