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
public class calificaciones {
	
	public static void main(String[] args)
	{
		int total = 0, aprobados = 0, reprobados = 0;
		float cal, suma = 0, prom;
		Scanner numero = new Scanner(System.in);
		System.out.println("teclee calificacion (-1 para terminar):");
		cal = numero.nextInt();
		//Ciclo de lectura
		while(cal != -1){
			suma += cal;
			if(cal >= 6)
				aprobados++;
			else
				reprobados++;
			total++;
			System.out.println("teclee calificacion (-1 para terminar): ");
			cal = numero.nextInt();
		}
		//Cálculo del promedio:
		prom = suma/total;
		//Impresión de resultados:
		System.out.println("Total de alumnos: " + total);
		System.out.println("Promedio: " + prom);
		System.out.println("Total de aprobados: " + aprobados);
		System.out.println("Total de reprobados: " + reprobados);

	}
	
}
