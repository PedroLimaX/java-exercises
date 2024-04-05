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
public class calculadora {
	public static void main(String[] args) {
		float x,y,r;     //datos de entrada y resultado
		char operador;   //operador
		Scanner numero = new Scanner(System.in);
		System.out.println( "Captura num1 Operador num2"); 
		x = numero.nextFloat ();
		operador = numero.next().charAt(0);  //Lee un carácter como entrada
		y = numero.nextFloat ();

		while (!(x==0 && y==0)){
			switch(operador){
				case '+': r = x+y; break;
				case '-': r = x-y; break;
				case '*': r = x*y; break;
				case '/': r = x/y; break;
				default: r = 0;
			}
			System.out.println( " = " + r); 
			x = numero.nextFloat ();
			operador = numero.next().charAt(0);
			y = numero.nextFloat ();
		}

	}
}
