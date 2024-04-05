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
public class Eventos {
    private String nombre;
    private int id_evento;
    private String descripcion;
    private String fecha;
    private String hora;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Eventos(String nombre, int id_evento, String descripcion, String fecha, String hora) {
        this.nombre = nombre;
        this.id_evento = id_evento;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    

}
