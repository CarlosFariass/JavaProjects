/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author Admin
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int originalAmount = 1245;
        int amount = originalAmount;
        
        System.out.println("Dividindo R$" + originalAmount + "em notas de R$ 100, " + " R$50, R$20, R$10, R$5, R$2 e R$1");
    
        int[] billValues = {100, 50, 20, 10, 5, 2, 1};
        int[] numberOfBills = new int [billValues.length];
        
        for(int i = 0; i<billValues.length; i++){
            
            numberOfBills[i] = amount / billValues[i];
            amount %= billValues[1];
            
            System.out.println("Notas de R$" + billValues[i] + ": " + numberOfBills[i]);
        }
    }
    
}
