package ciclosfor;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo-LVC-INAOE
 */
public class matrices {
	public static void main(String args[]){
		int numero_filas = 3;
		int numero_columnas = 3;
		int miMatriz [][] = new int [numero_filas][numero_columnas];
		//llenar la primera fila
		miMatriz[0][0]=5;
		miMatriz[0][1]=8;
		miMatriz[0][2]=1;
		//llenar la segunda fila
		miMatriz[1][0]=9;
		miMatriz[1][1]=7;
		miMatriz[1][2]=2;
		// llenar la tercera fila
		miMatriz[2][0]=10;
		miMatriz[2][1]=15;
		miMatriz[2][2]=25;
		for(int fila = 0; fila < numero_filas; fila++){
			for(int columna = 0; columna < numero_columnas; columna++){
				System.out.print(miMatriz[fila][columna] + "\t");
			}
			System.out.println("");
		}
		
		int otraMatriz [][] = new int [numero_filas][numero_columnas];
		Scanner entrada = new Scanner( System.in );
		for(int fila = 0; fila < numero_filas; fila++){
			for(int columna = 0; columna < numero_columnas; columna++){
				System.out.print( "Ingrese un valor  [" + fila + "][" + columna +"] : ");
				otraMatriz[fila][columna] = entrada.nextInt();	
			}
		}
		for(int fila = 0; fila < numero_filas; fila++){
			for(int columna = 0; columna < numero_columnas; columna++){
				System.out.print(otraMatriz[fila][columna] + "\t");
			}
			System.out.println("");
		}
		
	}
}
