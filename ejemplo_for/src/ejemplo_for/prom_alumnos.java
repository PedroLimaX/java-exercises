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
public class prom_alumnos {
    public static void main(String[] args){
        int suma=0,aprobados=0,reprobados=0;
        int contador=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Para terminar de registrar escriba -1");
        System.out.print("Calificacion "+(contador)+" :");
        float cal=sc.nextFloat();
        suma+=cal;
        if(cal>6)
            aprobados++;
        else reprobados++;
        while(cal!=-1){
            System.out.print("Calificacion "+(contador+1)+" :");
            cal=sc.nextFloat();
            contador++;
            suma+=cal;
        }
        float prom=suma/contador;
        System.out.print(prom);
    }
}
