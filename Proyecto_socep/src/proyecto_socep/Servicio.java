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
public class Servicio{
    private String nombre;
    private int id_servicio;
    private String descripcion;
    private int costo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Servicio(String nombre, int id_servicio, String descripcion, int costo) {
        this.nombre = nombre;
        this.id_servicio = id_servicio;
        this.descripcion = descripcion;
        this.costo = costo;
    }

   
    
}