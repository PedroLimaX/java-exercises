/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

/**
 *
 * @author Agustin
 */
import java.util.Scanner;
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2,res,limite;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Cuantos numeros desea generar: ");
        limite=entrada.nextInt();
        System.out.println("Numeros generados: "+limite);
        n1=0;
        n2=1;
        for(int i=0;i<=limite;i++)
        {
        res=n1+n2;
        System.out.println(n1);
        n1=n2;
        n2=res;
        }
    }
    
}
