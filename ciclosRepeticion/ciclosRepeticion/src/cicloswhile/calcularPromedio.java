package cicloswhile;


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
public class calcularPromedio {
	public static void main(String[] args)
	{
		float suma = 0.0f, num, promedio;
    int contador = 0;
	  Scanner numero = new Scanner(System.in);
		while(contador < 5){
				System.out.println( "Introduce un número: ");
				num = numero.nextFloat();
				suma = suma + num;
				contador++;
		}
		promedio = suma/5;
		System.out.println( "El promedio es: " + promedio);
	}
}
