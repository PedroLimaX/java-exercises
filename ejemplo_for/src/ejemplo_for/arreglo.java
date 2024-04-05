/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_for;

import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class arreglo {
    public static void main(String[]args){
    int[] arreglo2=new int[5];
        Scanner entrada= new Scanner(System.in);
        for(int l=0; l<=arreglo2.length-1;l++){
            System.out.println("Posicion ["+l+"] ="+arreglo2[l]);
        }
    }
}
