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
 public class SoParaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digigte a largura:");
        double largura = sc.nextDouble();
        
    System.out.println("Digite o comprimento:");  
        double comprimento = sc.nextDouble();
        
    System.out.println("Digite o metro quadrado:");    
        double metroQuadrado = sc.nextDouble();
        
        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        
        
        
   System.out.println("AREA = " + area);
   System.out.println("PRECO = " + preco);
   
    
sc.close();                 
                
        
    }
    
}


