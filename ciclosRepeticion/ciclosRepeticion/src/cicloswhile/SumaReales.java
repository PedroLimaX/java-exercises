package cicloswhile;


import java.util.Scanner;


public class SumaReales {
	
	public static void main(String[] args)
	{
		Scanner numero = new Scanner(System.in);
		System.out.println( "Introduce n entero: ");
		int n = numero.nextInt();
		int contador = 0;
		float suma = 0;
		float num = 0;
		while(contador < n){
			System.out.println( "Introduce un número real: ");
			num = numero.nextFloat();
			suma = suma + num;
			contador++;
		}
		System.out.println( "La suma de los " + n + " reales es: " + suma);
	}
	
}
