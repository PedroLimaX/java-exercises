/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajando_conalumnos;

/**
 *
 * @author RicardoAdair
 */
public class Trabajando_ConAlumnos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    Alumno ricardo;
    ricardo = new Alumno("Ricardo Romero", 200224072);
    Alumno joel = new Alumno("Joel Martínez", 2019847854  );
    Alumno sergio = new Alumno("Sergio Gutierrez", 2019489583);
    System.out.println(joel.getMatricula());
    joel.setMatricula(2019123456);
    System.out.println(joel.getMatricula());
  }
  
}
