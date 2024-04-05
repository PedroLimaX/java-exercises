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
public class controladoUsuario {
	public static void main(String[] args) {
		float suma = 0.0f, num, promedio;
    int contador = 0;
    Scanner numero = new Scanner(System.in);
    do{
        System.out.println("Teclee un número (-1 = fin):");
        num = numero.nextInt();
        if(num != -1){ 
          suma += num;
          contador++;
        }
    }while(num != -1);
    if(contador > 0){
      promedio = suma/contador;
      System.out.println("El promedio es: " + promedio);
    }
    else
      System.out.println("No se teclearos valores");
	}
}
