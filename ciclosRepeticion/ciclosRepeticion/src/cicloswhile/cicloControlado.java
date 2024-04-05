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
public class cicloControlado {
	public static void main(String[] args)
	{
		float suma = 0.0f, num, promedio;
    int contador = 0;   
    Scanner numero = new Scanner(System.in);
    System.out.println("Teclee un número (-1 = fin):");
    num = numero.nextInt();
    while(num != -1){
        suma += num;
        contador++;
        System.out.println( "Teclee un número (-1 = fin):");
        num = numero.nextInt();
    }
    if(contador>0){
       promedio = suma/contador;
       System.out.println( "El promedio es: "+ promedio);
    }
    else
       System.out.println( "No se teclearosn valores" );

	}
}
