/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_socep;

/**
 *
 * @author América
 */
public class Red {
    private String nombre_red;
    private int id_red;
    private String descripcion;

    public String getNombre_red() {
        return nombre_red;
    }

    public void setNombre_red(String nombre) {
        this.nombre_red = nombre;
    }

    public int getId_red() {
        return id_red;
    }

    public void setId_red(int id_red) {
        this.id_red = id_red;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Red(String nombre_red, int id_red, String descripcion) {
        this.nombre_red = nombre_red;
        this.id_red = id_red;
        this.descripcion = descripcion;
    }
    
    
}
