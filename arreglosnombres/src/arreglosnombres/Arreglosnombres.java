/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosnombres;

/**
 *
 * @author Agustin
 */
import java.util.Scanner;
public class Arreglosnombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,cal;
        String nombre[],nom;
        int calif[];
        Scanner leer=new Scanner(System.in);
        System.out.print("Cuantos alumnos va a ingresar: ");
        n=leer.nextInt();
        nombre=new String[n];
        calif=new int [n];
        for(i=0;i<n;i++)
        {
            System.out.print("Nombre del alumno: ");
            nom=leer.next();
            nombre[i]=nom;
            System.out.print("Calificacion: ");
            cal=leer.nextInt();
            calif[i]=cal;
        }
        System.out.println("\nAprobados:");
        for(i=0;i<n;i++)
        {
            if(calif[i]>=6)
            {
                System.out.println(nombre[i]);
            }
        }
        System.out.println("\nReprobados:");
        for(i=0;i<n;i++)
        {
            if(calif[i]<6)
            {
                System.out.println(nombre[i]);
            }
        }   
    }
}
