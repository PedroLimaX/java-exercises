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
public class Articulos {
    private String nombre;
    private int id_articulo;
    private String descripcion;
    private int cant_disp;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant_disp() {
        return cant_disp;
    }

    public void setCant_disp(int cant_disp) {
        this.cant_disp = cant_disp;
    }

    public Articulos(String nombre, int id_articulo, String descripcion, int cant_disp) {
        this.nombre = nombre;
        this.id_articulo = id_articulo;
        this.descripcion = descripcion;
        this.cant_disp = cant_disp;
    }
    
    
}
