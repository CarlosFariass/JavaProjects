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
public class Ex7 {
    
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
                
                int a[]= new int[5];
        int maior = 0;

        for(int i=0;i<5;i++){
        System.out.print("Entre com o número : ");
        a[i] = sc.nextInt();

         if (a[i]>maior)
         {
             maior = a[i];
         }
        }
        System.out.println("o maior numero e: " + maior);
    }
}
                        
                        
      /** VERIFICAR QUAL NÚMERO É MAIOR          


