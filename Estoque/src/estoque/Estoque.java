/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;
    import java.util.Locale;
    import java.util.Scanner;
    import estoqueSendoCriado.Product;
/**
 *
 * @author Admin
 */
public class Estoque {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         Product product = new Product();
         
            System.out.println(" Enter product data:");
            System.out.print("Name: ");
            product.name = sc.nextLine();
            System.out.print("Price: ");
            product.price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            product.quantity = sc.nextInt();
            
            
            System.out.println("Product Data: " + product);
            
            System.out.println("");
            System.out.println("Enter the number of product to be add in stock: ");
            int quantity = sc.nextInt(); //serve para atualizar a quantidade de produtos no estoque //
            product.addProduct(quantity); // same //
            
            System.out.println("");
            System.out.println("Updated Data: " + product);
            
            System.out.println("");
            System.out.println("Enter the number of product to be removed from stock: ");
            quantity = sc.nextInt();
            product.removeProduct(quantity);
            
            
            
    }
    
}
