/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cicloswhile;

import java.util.Scanner;

/**
 *
 * @author Ricardo-LVC-INAOE
 */
public class rectangulo {
	public static void main(String[] args) {
		int ancho,alto,c,r;
		Scanner numero = new Scanner(System.in);
    System.out.println( "ancho del rectangulo (maximo 20):");
		ancho = numero.nextInt();
		System.out.println("alto del rectangulo (maximo 20):");
		alto = numero.nextInt();
		if(ancho>1 && ancho<=20 && alto>1 && alto<=20){
			r=0;
			while(r < alto){ 
				c = 0;
				while(c < ancho){ //Imprime varios * en cada renglón
					System.out.print( "*" ); //No se deja fin de línea
					c++;
				}
				System.out.println();  //Hasta aquí se deja el fin de línea
				r++;
			}
		}
	}
}
