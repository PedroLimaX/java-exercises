/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pues Yo
 */
public class ajedrez {
    public static void main(String[] args){
        System.out.println("     A      B       C      D      E      F      G      H    ");
        for(int i=8;i>0;i--){
            if(i!=1&&i!=3&&i!=5&&i!=7){
                System.out.print("  ");
                for(int j=0;j<4;j++){
                    System.out.print("████╔     ╗");
                    }
                System.out.println();
                System.out.print(i+" ");
                for(int j=0;j<4;j++){
                    
                    System.out.print("████╚     ╝");
                    }
                System.out.println(" "+i);
            }
           else{
                System.out.print("  ");
                for(int j=0;j<4;j++){
                    System.out.print("╔     ╗████");
                }
                System.out.println();
                System.out.print(i+" ");
                for(int j=0;j<4;j++){
                    System.out.print("╚     ╝████");
                }
                System.out.println(" "+i);
            }
        }
        System.out.println("     A      B       C      D      E      F      G      H    ");
          for(int k=0;k<=80;k++){
            System.out.print("-");
        }
        System.out.print("\nAUTOR: Pedro Degante Lima\tMATRICULA:201928846");
        System.out.print("\tSECCION:1\nBENEMERITA UNIVERSIDAD AUTONOMA DE PUEBLA");
        System.out.print("\nCOMPLEJO REGIONAL CENTRO\tSEDE SAN JOSE CHIAPA");
        System.out.println("\nFECHA: 31 de Octubre de 2019");
    }
}
