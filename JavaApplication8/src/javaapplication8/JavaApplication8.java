/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.PrintStream;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String product1 = "Computer";
        String product2 = "Office Desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'f';
        
        double price1 = 2100.5;
        double price2 = 650.50;
        double measue = 53.234567;
        
        
        System.out.println("Products:");
        System.out.printf("%s, which price is about S %.2f%n", product1, price1);
        System.out.printf("%s, which price is about S %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
        System.out.println();
        System.out.printf("Measue %.8f%n", measue);
        System.out.printf("Rouded: %.3f%n", measue);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measue);
        
    }
    
}
