/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecontas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SistemaDeContas {

    private int number;
    private String holder;
    private double balance;

    
    public SistemaDeContas(int number, String holder) {
        this.number = number;
        this.holder = holder;
        
    }

    public SistemaDeContas(int number, String holder, double initialDeposit) {
        this.number = number;
        deposit(initialDeposit);
        this.holder = holder;
    
    } 

    public int getNumber() {
        return number;
    }

    
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
        
    public void deposit(double amount){
        balance += amount; 
    }
    
    public void withdrow(double amount) {
     balance -= amount + 5.0; //acrescentando os 5% de taxa na hora do saque//
     
    }
        
    public String toString (){
        return " Account "
        + number
        + ", holder: "
        + holder
        + ", balance: $ "  
        + String.format("%.2f", balance);        
        }
    
    }
