/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_for;
import java.util.Scanner;
/**
 *
 * @author ALUMNO
 */
public class wail {
    public static void main(String []Args){
        int contador=0;
        int suma=0;
        float num;
        Scanner sc=new Scanner(System.in);
       System.out.print("¿Cuantos numeros desea sumar? ");
       int limite= sc.nextInt();
       
      if(limite>0){
       while(contador<limite){
           System.out.print("Numero "+ (contador+1)+": ");
           num=sc.nextFloat();
           suma+=num;
           contador++;
            }
       System.out.println("La suma es: "+suma);
       }
    }
}
