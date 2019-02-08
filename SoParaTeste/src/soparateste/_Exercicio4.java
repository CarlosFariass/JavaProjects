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
public class _Exercicio4 {
    
    public static void main(String[] args) {  
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    
    int numero, horas;
    double valorHora, salario;
    
    numero = sc.nextInt();
    horas = sc.nextInt();
    valorHora = sc.nextDouble();
    
    salario = valorHora * horas;
    
    System.out.println("NUMBER = " + numero);
    System.out.println("SALARY = " + salario);
    
           
    
    
}
}