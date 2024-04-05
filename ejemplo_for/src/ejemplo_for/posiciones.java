/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_for;

/**
 *
 * @author ALUMNO
 */
public class posiciones {
    public static void main(String[]args){int contador=0;
        for(int j=0;j<=10000; j++){
            if(j%20==0){
                contador++;
            }
        }
        System.out.println("\nHay "+contador+" multiplos de 20");
    }
}
