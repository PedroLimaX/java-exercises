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
public class matriz {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public static void main(String[] args) {
        int numero_filas=3;
        int numero_columnas=3;
        int matriz[][]=new int[numero_filas][numero_columnas];
        matriz[0][0]=5;
        matriz[1][1]=8;
        matriz[2][2]=1;
        for(int fila=0;fila<numero_filas;fila++){
            for(int columna=0;columna<numero_columnas;columna++){
                System.out.print(matriz[fila][columna]+"\t");
            }
            System.out.println("");
        }
    }
}