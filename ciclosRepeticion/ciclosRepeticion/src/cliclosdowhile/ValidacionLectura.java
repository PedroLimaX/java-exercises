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
public class ValidacionLectura {
	public static void main(String[] args) {
		int a,b;
    Scanner numero = new Scanner(System.in);
		do{
			System.out.println("Teclee un número positivo para A: ");
			a = numero.nextInt(); 
		}while(a<=0);
		do{
			System.out.println( "Teclee un número positivo para B: ");
			b = numero.nextInt(); 
		}while(b<=0);
		System.out.println( "a * b = " + a*b);
	}
}
