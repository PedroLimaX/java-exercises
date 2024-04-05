/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_for;

/**
 *
 * @author yo
 */
import java.util.Scanner;
public class Ejemplo_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        for(i=0; i<5; i++){
            System.out.println("i="+i);
        }
        for(i=500; i<=1000; i+=2){
            System.out.println(i);
        }        
        for (i=100; i>0; i--){
            System.out.println(i);
        }
        
        int[] arreglo={1,5,7,9,4,5,100};
        for(int k=0; k<=arreglo.length-1;k++){
            System.out.println("Posicion ["+k+"] ="+arreglo[k]);
        }
    }
}
