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
public class Proyecto_socep {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
    // TODO code application logic here
    
    Socio Daniel = new Socio("Daniel Vegas Antoyo", 2, "VEYCU Interiorismo", "2224250472", "VEYCU Interiorismo", "No disponible");
    System.out.println("Socio Ejemplo\n");
    System.out.println("Id\tNombre\t\t\tEmpresa\t\t\tTelefono\tRed Social\t\tDireccion\t");
    System.out.print(Daniel.getId_socio()+"\t");
    System.out.print(Daniel.getNombre()+"\t");
    System.out.print(Daniel.getNombre_empresa()+"\t");
    System.out.print(Daniel.getNum_telefono()+"\t");
    System.out.print(Daniel.getRed_social()+"\t");
    System.out.print(Daniel.getDireccion()+"\t");
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
    System.out.println("Articulo Ejemplo\n");
    Articulos repiza = new Articulos("Repiza de madera", 1, "Una repiza de madera", 20);
    System.out.println("Articulo\n");
    System.out.println("Id\tNombre\t\t\tDescripcion\t\tCantidad Disponible\t");
    System.out.print(repiza.getId_articulo()+"\t");
    System.out.print(repiza.getNombre()+"\t");
    System.out.print(repiza.getDescripcion()+"\t");
    System.out.print(repiza.getCant_disp()+"\t");
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
    System.out.println("Cliente Ejemplo\n");
    Cliente Julion = new Cliente("Julion Alvarez", 1, "El norte de Sinaloa");
    System.out.println("Cliente\n");
    System.out.println("Id\tNombre\t\t\tDireccion");
    System.out.print(Julion.getId_cliente()+"\t");
    System.out.print(Julion.getNombre()+"\t\t");
    System.out.print(Julion.getDireccion()+"\t");
    
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
    System.out.println("Red Ejemplo\n");
    Red Facebook = new Red ("VEYCU Interiorismo", 1, "https://www.facebook.com/pg/Veycuinteriorismo/about/?ref=page_internal");
    System.out.println("REd\n");
    System.out.println("Id\tNombre\t\t\tURL");
    System.out.print(Facebook.getId_red()+"\t");
    System.out.print(Facebook.getNombre_red()+"\t");
    System.out.print(Facebook.getDescripcion()+"\t");
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
    System.out.println("Servicio Ejemplo\n");
    Servicio Consultoria = new Servicio ("Consultoria Empresarial", 1, "Consultoria ejemplo", 200);
    System.out.println("Servicio\n");
    System.out.println("Id\tNombre\t\t\tDescripcion\t\tCosto");
    System.out.print(Consultoria.getId_servicio()+"\t");
    System.out.print(Consultoria.getNombre()+"\t");
    System.out.print(Consultoria.getDescripcion()+"\t");
    System.out.print(Consultoria.getCosto()+"\t");
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
    System.out.println("Pedido Ejemplo\n");
    pedido Pedidoejemplo = new pedido (1, "Un pedido", 10, 0, 1200, "28/11/19", "05/12/19");
    System.out.println("Pedido\n");
    System.out.println("Id\tDescripcion\t\tArticulos\tServicios\tMonto total\tFecha de pedido\t\tFecha de entrega");
    System.out.print(Pedidoejemplo.getId_pedido()+"\t");
    System.out.print(Pedidoejemplo.getDescripcion()+"\t\t");
    System.out.print(Pedidoejemplo.getCant_art()+"\t\t");
    System.out.print(Pedidoejemplo.getCant_serv()+"\t\t");
    System.out.print(Pedidoejemplo.getPago_total()+"\t\t");
    System.out.print(Pedidoejemplo.getFecha_pedido()+"\t\t");
    System.out.print(Pedidoejemplo.getFecha_envio()+"\t\t");
    
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
    System.out.println("Evento Ejemplo\n");
    Eventos Eventoejemplo = new Eventos ("Un evento",1, "Un evento jaja", "30/11/19", "14:00 hrs");
    System.out.println("Evento\n");
    System.out.println("Nombre\t\tId\tDescripcion\t\tFecha del evento\tHora de comienzo");
    System.out.print(Eventoejemplo.getNombre()+"\t");
    System.out.print(Eventoejemplo.getId_evento()+"\t");
    System.out.print(Eventoejemplo.getDescripcion()+"\t\t");
    System.out.print(Eventoejemplo.getFecha()+"\t\t");
    System.out.print(Eventoejemplo.getHora()+"\t\t");
    
    
    System.out.println();
    for(int k=0;k<=80;k++){
            System.out.print("-");
        }
    System.out.println();
    
        System.out.print("\nEMPRESA: Forum Edition\t");
        System.out.print("\tSECCION:1\nBENEMERITA UNIVERSIDAD AUTONOMA DE PUEBLA");
        System.out.print("\nCOMPLEJO REGIONAL CENTRO\tSEDE SAN JOSE CHIAPA");
        System.out.println("\nFECHA: 28 de Noviembre de 2019");
    }
    
}