/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author lyli
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here         
                  
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio",
        "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Scanner tec = new Scanner(System.in);
        int ano;
        System.out.print("Qual o ano que você gostaria de verificar? ");
        ano = tec.nextInt();
        
        if ((ano%4==0 && ano%100!=0) || (ano%400==0)){
            dias[1] = 29;
            System.out.println("O ano é bissexto.");
        } 
        
        for (int i = 0; i < mes.length; i++){
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
        }
        
        
        
    }
    
}
