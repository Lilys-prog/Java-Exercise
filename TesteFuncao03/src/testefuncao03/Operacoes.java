    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao03;

/**
 *
 * @author lyli
 */
public class Operacoes {
    public static String contador (int i, int f){
        String s = "";    //começa vazia
        for (int c = i; c<=f; c++){
            s+= c + " ";
        }
        return s; 
    }
    
}
