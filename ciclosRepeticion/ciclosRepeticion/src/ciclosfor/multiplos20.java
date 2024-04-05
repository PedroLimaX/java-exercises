/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclosfor;

/**
 *
 * @author Ricardo-LVC-INAOE
 */
public class multiplos20 {
	
	public static void main(String[] args) {
		int contador = 0; //Iniciamos el contador en cero 
    for(int i = 0; i <= 10000; i++) 
		{ 
			if(i % 20 == 0){ //Revisa si el residuo es 0 (es múltiplo de 20) 
				 contador++; //Si es múltiplo aumentamos el contador en 1 
			} //Si no es múltiplo no hacemos nada 
		} 
		//Mostramos el valor del contador 
		System.out.println( "Hay "+ contador + " múltiplos de 20" );
	}
}
