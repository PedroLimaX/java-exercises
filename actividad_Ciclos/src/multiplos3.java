
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author América
 */
public class multiplos3 {
    public static void main(String[] args){
        int contador = 0,num;
        int acumulador[]=new int [9999];
        Scanner numero = new Scanner(System.in);
        do{
            System.out.println("Ingresa un número (9999 = fin):");
            num = numero.nextInt();
            if(num % 3 == 0){ 
                acumulador[contador]=num;
                contador++;
            }
        }
        while (num!=9999); 
		//Mostramos el valor del contador 
        System.out.println( "De los numeros ingresados, "+ (contador-1) + " son múltiplos de 3" );
        //Reste 1 para que no imprima 9999 ya que tambien es multiplo de 3
        System.out.println("Los multipos son: ");
        for(int i=0;i<(contador-1);i++){ 
            System.out.println(acumulador[i]);
        }	
        for(int k=0;k<=80;k++){
            System.out.print("-");
        }
        System.out.print("\nAUTOR: Pedro Degante Lima\tMATRICULA:201928846");
        System.out.print("\tSECCION:1\nBENEMERITA UNIVERSIDAD AUTONOMA DE PUEBLA");
        System.out.print("\nCOMPLEJO REGIONAL CENTRO\tSEDE SAN JOSE CHIAPA");
        System.out.println("\nFECHA: 31 de Octubre de 2019");
    }
 
}
