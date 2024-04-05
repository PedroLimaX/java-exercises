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
public class arrays {
	public static void main(String args[]){
		
		int[] miArreglo= { 1,5,7,9,4,5,100 };
		for( int i = 0; i<= miArreglo.length - 1; i++ )
		{
			System.out.println( "Posición ["+ i +"] = " + miArreglo[i] );
		}
		
		int[] otroArreglo = new int[5];
		Scanner entrada = new Scanner( System.in );
		for(int i = 0; i< 5; i++)
		{
			System.out.print( "Ingrese un valor: ");
			otroArreglo[i] = entrada.nextInt();
		}
		for( int i = 0; i<= otroArreglo.length - 1; i++ )
		{
			System.out.println( "Posición ["+ i +"] = " + otroArreglo[i] );
		}
		

	}
}
