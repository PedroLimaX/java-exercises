/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_for;

/**
 *
 * @author Pedro Degante Lima
 */
public class tablamultiplicar {
    public static void main(String[] args){
        int mult1[]=new int [10];
        int mult2[]= new int [10];
        for(int k=0;k<=80;k++){
            System.out.print("-");
        }
        System.out.println("");//lo puse para saltar de linea despues de la linea punteada
        for(int i=0;i<mult1.length;i++){
            mult1[i]=i+1;
            for(int j=0;j<mult2.length;j++){
            mult2[j]=j+1;
            System.out.print(mult1[i]*mult2[j]+"\t");
            }
            System.out.println("");
        }
        for(int k=0;k<=80;k++){
            System.out.print("-");
        }
        System.out.print("\nAUTOR: Pedro Degante Lima\tMATRICULA:201928846");
        System.out.print("\tSECCION:1\nBENEMERITA UNIVERSIDAD AUTONOMA DE PUEBLA");
        System.out.print("\nCOMPLEJO REGIONAL CENTRO\tSEDE SAN JOSE CHIAPA");
        System.out.println("\nFECHA: 21 de Octubre de 2019");
    }
}
