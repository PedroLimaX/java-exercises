/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoconmaestro;

/**
 *
 * @author PLEIDMRAO
 */
public class TrabajandoConMaestro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno Yo;
        Yo=new Alumno("Yo",201928847);
        Alumno Pedro=new Alumno("Pedro",201928846);
        System.out.println(Pedro.getMatricula());
        System.out.println(Yo.getMatricula());
    }
    
}
