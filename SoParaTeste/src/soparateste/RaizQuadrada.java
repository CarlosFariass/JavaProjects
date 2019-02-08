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
public class RaizQuadrada {
    
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        char resp;
                
            do {    
                System.out.println("Enter a number:");
                double n = sc.nextDouble();
                
                double sr = Math.sqrt(n);
                    
                    System.out.printf("%.3f%n", sr);
                    
                    System.out.print("Wanna repeat? (Y or N) ");
                    resp = sc.next().charAt(0);
                    
                } while (resp != 'n');
            }
    
   } 
