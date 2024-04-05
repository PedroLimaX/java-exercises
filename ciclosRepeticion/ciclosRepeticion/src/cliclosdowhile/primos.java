/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliclosdowhile;

/**
 *
 * @author Ricardo-LVC-INAOE
 */
public class primos {
	public static void main(String[] args) {
		int n, num = 2, limite;
		boolean esPrimo;
    while(num<=100){    
      esPrimo = true;
      n = 2;
      limite = (int)Math.sqrt(num);
      while(n <= limite && esPrimo){
          if(num % n == 0)  //es divisible entre n
            esPrimo = false;
          n++;
      }
      if(esPrimo)
         System.out.println(num + " es numero primo");
      num++;
    }
	}
}
