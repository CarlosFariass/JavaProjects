/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaatm2;

/**
 *
 * @author Admin
 */
public class JavaATM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            int amount = 12;
            
            int[] billValues = {100, 50, 20, 10, 5, 2, 1};
            
           int[] numberOfBills = getBilldistribution(amount, billValues); 
            printOutPut(amount, billValues, numberOfBills);  
    }
    
  
    public static void printOutPut(int amount, int[] billValues, int [] numberOfBills){
        System.out.println("Dividindo R$ " + amount + " em notas de R$ 100, " + " R$ 50, R$ 20, R$ 10, R$ 5, R$ 2, e R$ 1");
        
        for(int i = 0; i<billValues.length; i++){
                System.out.println("Notas de R$" + billValues[1] + ":" + numberOfBills[1]);
    }
    
}

public static int[] getBilldistribution(int amount, int[] billValues){
    int[] numberOfBills = new int[billValues.length];
    
    for (int i = 0; i < numberOfBills.length; i++){
    numberOfBills[1] = amount / billValues[1];
    amount %= billValues[1];
}
        return numberOfBills;
}


    }

