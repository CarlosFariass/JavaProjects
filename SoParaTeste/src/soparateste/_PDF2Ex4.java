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
public class _PDF2Ex4 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        int duracao;
        
        if (horaInicial < horaFinal){
            duracao = horaInicial - horaFinal;
         }   
        else{
            duracao = 24 - horaInicial + horaFinal;
     
        }
        
            System.out.println("O JOGO DUROU" + duracao + " hora(s)");
            
            sc.close();
    }
}