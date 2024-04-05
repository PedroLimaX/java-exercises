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
public class pedido {
    private int id_pedido;
    private String descripcion;
    private int cant_art;
    private int cant_serv;
    private int pago_total;
    private String fecha_pedido;
    private String fecha_envio;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant_art() {
        return cant_art;
    }

    public void setCant_art(int cant_art) {
        this.cant_art = cant_art;
    }

    public int getCant_serv() {
        return cant_serv;
    }

    public void setCant_serv(int cant_serv) {
        this.cant_serv = cant_serv;
    }

    public int getPago_total() {
        return pago_total;
    }

    public void setPago_total(int pago_total) {
        this.pago_total = pago_total;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public pedido(int id_pedido, String descripcion, int cant_art, int cant_serv, int pago_total, String fecha_pedido, String fecha_envio) {
        this.id_pedido = id_pedido;
        this.descripcion = descripcion;
        this.cant_art = cant_art;
        this.cant_serv = cant_serv;
        this.pago_total = pago_total;
        this.fecha_pedido = fecha_pedido;
        this.fecha_envio = fecha_envio;
    }
}
