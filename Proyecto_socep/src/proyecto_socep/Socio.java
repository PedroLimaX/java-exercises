/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_socep;

/**
 *
 * @author Pedro Degante Lima
 */
public class Socio {
    
    private String nombre;
    private int id_socio;
    private String nombre_empresa;
    private String num_telefono;
    private String red_social;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getRed_social() {
        return red_social;
    }

    public void setRed_social(String red_social) {
        this.red_social = red_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Socio(String nombre, int id_socio, String nombre_empresa, String num_telefono, String red_social, String direccion) {
        this.nombre = nombre;
        this.id_socio = id_socio;
        this.nombre_empresa = nombre_empresa;
        this.num_telefono = num_telefono;
        this.red_social = red_social;
        this.direccion = direccion;
    }
    
    
}

