/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliclosdowhile;

import java.util.Scanner;

/**
 *
 * @author Ricardo-LVC-INAOE
 */
public class validacionFecha {
	public static void main(String[] args) {
		int d,m,a;//día, mes, año
    boolean anioBisiesto,mes30dias,mes31dias,fechaValida;
    Scanner numero = new Scanner(System.in);
		do{
			System.out.println("Teclee una fecha (dd mm aa): ");
			d = numero.nextInt();  
			m = numero.nextInt(); 
			a = numero.nextInt();
			anioBisiesto = (a%4==0);
			mes30dias = (m==4 || m==6 || m==9 || m==11);
			mes31dias = (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12);
			fechaValida = (
					 (d<=31 && mes31dias)|| 
					 (d<=30 && mes30dias)||
					 (d<=28 && m==2)||
					 (d<=29 && anioBisiesto)
			);
		}while(!fechaValida);
		
		//Imprimiendo fecha
		System.out.print( d + " de "); //Indica el día
		switch(m){ //Indica el mes
			case 1: System.out.print("enero"); break;
			case 2: System.out.print("febrero"); break;
			case 3: System.out.print("marzo"); break;
			case 4: System.out.print("abril"); break;
			case 5: System.out.print("mayo"); break;
			case 6: System.out.print("junio"); break;
			case 7: System.out.print("julio"); break;
			case 8: System.out.print("agosto"); break;
			case 9: System.out.print("septiembre"); break;
			case 10: System.out.print("octubre"); break;
			case 11: System.out.print("noviembre"); break;
			case 12: System.out.print("diciembre"); break;
		}
		System.out.println(" de " + a); //Indica el año

	}
}
