
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Program {
    
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there any initial deposit? (Y or N)");
        char response = sc.next(). charAt(0); // pra ler o caractere Y ou N //
            if(response == 'y'){
                System.out.println("Enter initial deposit value:");
                double initialDeposit = sc.nextDouble();
                account = new Account(number, holder, initialDeposit);
            }
            else { 
                    account = new Account(number, holder);
        
            }   
        System.out.println("");
        System.out.println("Account data:");
        System.out.println(account);
        
        System.out.println("");
        System.out.println("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        
        sc.close();
    }
}


/*Código precisa ser alterado */