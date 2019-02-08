/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soparateste;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ExercicioSenha {
                                                    //Programa para verificar a preferencia do consumidor. //
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
                int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	} 
}

//estutura for: for( int(ou double ou a que for) i = 1, i <= n, i++){
                     //   }