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
public class Alumno {
  private String nombre;
  private int matricula;
  private String curp;
  private double promedio;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }
  
  public Alumno(String nombre, int matricula)
  {
    this.nombre = nombre;
    this.matricula = matricula;
  }
  
}
