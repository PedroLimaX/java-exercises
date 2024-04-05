/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import javax.swing.*;
import utils.utilidades;

/**
 *
 * @author Pleidmrao
 */
public class Paint extends JFrame{
        utilidades util=new utilidades();
    Color bgcolor = new Color(34, 40, 49);
    Color labelcolor = new Color(235, 234, 210);
    Color textcolor = new Color(0, 74, 185);
    
    
    public Paint(){
    super("Interfaz Grafica de Paint");
        this.getContentPane().setBackground(new Color(255, 255, 255));
        setSize(600, 550);
        setLayout(null);
        
        JMenuBar barra=new JMenuBar();
        JMenu archivo=new JMenu("Archivo");
        JMenuItem nuevo=new JMenuItem("Nuevo");
        JMenuItem abrir=new JMenuItem("Abrir");
        JMenuItem guardar=new JMenuItem("Guardar");
        
        barra.add(archivo);
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        
        
        JMenu edicion=new JMenu("Edici\u00f3n");
        JMenuItem copiar=new JMenuItem("Copiar");
        JMenuItem cortar=new JMenuItem("Cortar");
        JMenuItem pegar=new JMenuItem("Pegar");
        
        barra.add(edicion);
        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        
        
        JMenu ver=new JMenu("Ver");
        JMenuItem acercar=new JMenuItem("acercar");
        JMenuItem alejar=new JMenuItem("alejar");
        
        barra.add(ver);
        ver.add(acercar);
        ver.add(alejar);
        
        
        JMenu imagen=new JMenu("Imagen");
        JMenuItem dibujar_linea=new JMenuItem("Dibujar L\u00ednea");
        JMenuItem dibujar_rectangulo=new JMenuItem("Dibujar Rect\u00e1ngulo");
        JMenuItem dibujar_ovalo=new JMenuItem("Dibujar \u00d3valo");
        JMenuItem dibujar_texto=new JMenuItem("Dibujar Texto");
        
        barra.add(imagen);
        imagen.add(dibujar_linea);
        imagen.add(dibujar_rectangulo);
        imagen.add(dibujar_ovalo);
        imagen.add(dibujar_texto);
        
        
        JMenu colores=new JMenu("Color");
        JMenuItem color_primario=new JMenuItem("Color Principal");
        JMenuItem color_secundario=new JMenuItem("Color Secundario");       
        
        barra.add(colores);
        colores.add(color_primario);
        colores.add(color_secundario);
        
        
        JMenu ayuda=new JMenu("Ayuda");
        JMenuItem Acercade=new JMenuItem("Acerca de...");

        barra.add(ayuda);
        ayuda.add(Acercade);
        
        setJMenuBar(barra);
        
        
        
        
        JLabel menu1 = new JLabel();
        menu1.setBounds(0, 0, 80, 400);
        menu1.setBackground(labelcolor);
        menu1.setOpaque(true);
        add(menu1);
        
                JButton btn1 = new JButton();
                btn1.setBounds(10, 10, 30, 30);
                btn1.setIcon( util.obtenerIconoEscalado("Btn-01.png",30, 30) );
                btn1.setBorder(null);
                add(btn1);

                JButton btn2 = new JButton();
                btn2.setBounds(40, 10, 30, 30);
                btn2.setIcon( util.obtenerIconoEscalado("Btn-02.png",30, 30) );
                btn2.setBorder(null);
                add(btn2);

                JButton btn3 = new JButton();
                btn3.setBounds(10, 40, 30, 30);
                btn3.setIcon( util.obtenerIconoEscalado("Btn-03.png",30, 30) );
                btn3.setBorder(null);
                add(btn3);

                JButton btn4 = new JButton();
                btn4.setBounds(40, 40, 30, 30);
                btn4.setIcon( util.obtenerIconoEscalado("Btn-04.png",30, 30) );
                btn4.setBorder(null);
                add(btn4);

                JButton btn5 = new JButton();
                btn5.setBounds(10, 70, 30, 30);
                btn5.setIcon( util.obtenerIconoEscalado("Btn-05.png",30, 30) );
                btn5.setBorder(null);
                add(btn5);

                JButton btn6 = new JButton();
                btn6.setBounds(40, 70, 30, 30);
                btn6.setIcon( util.obtenerIconoEscalado("Btn-06.png",30, 30) );
                btn6.setBorder(null);
                add(btn6);

                JButton btn7 = new JButton();
                btn7.setBounds(10, 100, 30, 30);
                btn7.setIcon( util.obtenerIconoEscalado("Btn-07.png",30, 30) );
                btn7.setBorder(null);
                add(btn7);

                JButton btn8 = new JButton();
                btn8.setBounds(40, 100, 30, 30);
                btn8.setIcon( util.obtenerIconoEscalado("Btn-08.png",30, 30) );
                btn8.setBorder(null);
                add(btn8);

                JButton btn9 = new JButton();
                btn9.setBounds(10, 130, 30, 30);
                btn9.setIcon( util.obtenerIconoEscalado("Btn-09.png",30, 30) );
                btn9.setBorder(null);
                add(btn9);

                JButton btn10 = new JButton();
                btn10.setBounds(40, 130, 30, 30);
                btn10.setIcon( util.obtenerIconoEscalado("Btn-10.png",30, 30) );
                btn10.setBorder(null);
                add(btn10);

                JButton btn11 = new JButton();
                btn11.setBounds(10, 160, 30, 30);
                btn11.setIcon( util.obtenerIconoEscalado("Btn-11.png",30, 30) );
                btn11.setBorder(null);
                add(btn11);

                JButton btn12 = new JButton();
                btn12.setBounds(40, 160, 30, 30);
                btn12.setIcon( util.obtenerIconoEscalado("Btn-12.png",30, 30) );
                btn12.setBorder(null);
                add(btn12);

                JButton btn13 = new JButton();
                btn13.setBounds(10, 190, 30, 30);
                btn13.setIcon( util.obtenerIconoEscalado("Btn-13.png",30, 30) );
                btn13.setBorder(null);
                add(btn13);

                JButton btn14 = new JButton();
                btn14.setBounds(40, 190, 30, 30);
                btn14.setIcon( util.obtenerIconoEscalado("Btn-14.png",30, 30) );
                btn14.setBorder(null);
                add(btn14);

                JButton btn15 = new JButton();
                btn15.setBounds(10, 220, 30, 30);
                btn15.setIcon( util.obtenerIconoEscalado("Btn-15.png",30, 30) );
                btn15.setBorder(null);
                add(btn15);

                JButton btn16 = new JButton();
                btn16.setBounds(40, 220, 30, 30);
                btn16.setIcon( util.obtenerIconoEscalado("Btn-16.png",30, 30) );
                btn16.setBorder(null);
                add(btn16);

                JButton btn17 = new JButton();
                btn17.setBounds(10, 270, 60, 50);
                btn17.setIcon( util.obtenerIconoEscalado("Btn-17.png", 60, 50) );
                btn17.setBorder(null);
                add(btn17);

                JButton btn18 = new JButton();
                btn18.setBounds(10, 330, 60, 50);
                btn18.setIcon( util.obtenerIconoEscalado("Btn-18.png",60, 50) );
                btn18.setBorder(null);
                add(btn18);
        
        JLabel colors = new JLabel();
        colors.setBounds(10, 400, 60, 60);
        colors.setIcon( util.obtenerIconoEscalado("Btn-19.png",60, 60) );
        colors.setBorder(null);
        add(colors);
        
        JButton primarycolor = new JButton();
        primarycolor.setBounds(20, 410, 25, 25);
        primarycolor.setBackground(new Color(0, 0, 0));
        primarycolor.setBorder(null);
        add(primarycolor);
        
        JButton secondarycolor = new JButton();
        secondarycolor.setBounds(35, 425, 25, 25);
        secondarycolor.setBackground(new Color(255, 255, 255));
        secondarycolor.setBorder(null);
        add(secondarycolor);

        
        JLabel menu2 = new JLabel();
        menu2.setBounds(0, 380, 600, 80);
        menu2.setBackground(labelcolor);
        menu2.setOpaque(true);
        add(menu2);
                
                JButton color1 = new JButton();
                color1.setBounds(80, 400, 25, 25);
                color1.setBackground(new Color(0, 0, 0));
                add(color1);

                JButton color2 = new JButton();
                color2.setBounds(80, 430, 25, 25);
                color2.setBackground(new Color(255, 255, 255));
                add(color2);
                
                JButton color3 = new JButton();
                color3.setBounds(110, 400, 25, 25);
                color3.setBackground(new Color(94, 94, 94));
                add(color3);
                
                JButton color4 = new JButton();
                color4.setBounds(110, 430, 25, 25);
                color4.setBackground(new Color(163, 163, 163));
                add(color4);
                
                JButton color5 = new JButton();
                color5.setBounds(140, 400, 25, 25);
                color5.setBackground(new Color(187, 0, 0));
                add(color5);
                
                JButton color6 = new JButton();
                color6.setBounds(140, 430, 25, 25);
                color6.setBackground(new Color(255, 0, 0));
                add(color6);
                
                JButton color7 = new JButton();
                color7.setBounds(170, 400, 25, 25);
                color7.setBackground(new Color(133, 146, 0));
                add(color7);
                
                JButton color8 = new JButton();
                color8.setBounds(170, 430, 25, 25);
                color8.setBackground(new Color(232, 255, 0));
                add(color8);
                
                JButton color9 = new JButton();
                color9.setBounds(200, 400, 25, 25);
                color9.setBackground(new Color(23, 126, 0));
                add(color9);
                
                JButton color10 = new JButton();
                color10.setBounds(200, 430, 25, 25);
                color10.setBackground(new Color(46, 255, 0));
                add(color10);
                
                JButton color11 = new JButton();
                color11.setBounds(230, 400, 25, 25);
                color11.setBackground(new Color(0, 165, 167));
                add(color11);
                
                JButton color12 = new JButton();
                color12.setBounds(230, 430, 25, 25);
                color12.setBackground(new Color(0, 252, 255));
                add(color12);
                
                JButton color13 = new JButton();
                color13.setBounds(260, 400, 25, 25);
                color13.setBackground(new Color(0, 33, 162));
                add(color13);
                
                JButton color14 = new JButton();
                color14.setBounds(260, 430, 25, 25);
                color14.setBackground(new Color(0, 52, 255));
                add(color14);
                
                JButton color15 = new JButton();
                color15.setBounds(290, 400, 25, 25);
                color15.setBackground(new Color(124, 0, 150));
                add(color15);
                
                JButton color16 = new JButton();
                color16.setBounds(290, 430, 25, 25);
                color16.setBackground(new Color(211, 0, 255));
                add(color16);
                
                JButton color17 = new JButton();
                color17.setBounds(320, 400, 25, 25);
                color17.setBackground(new Color(196, 184, 94));
                add(color17);
                
                JButton color18 = new JButton();
                color18.setBounds(320, 430, 25, 25);
                color18.setBackground(new Color(255, 240, 122));
                add(color18);
                
                JButton color19 = new JButton();
                color19.setBounds(350, 400, 25, 25);
                color19.setBackground(new Color(33, 77, 33));
                add(color19);
                
                JButton color20 = new JButton();
                color20.setBounds(350, 430, 25, 25);
                color20.setBackground(new Color(122, 255, 122));
                add(color20);
                
                JButton color21 = new JButton();
                color21.setBounds(380, 400, 25, 25);
                color21.setBackground(new Color(0, 175, 255));
                add(color21);
                
                JButton color22 = new JButton();
                color22.setBounds(380, 430, 25, 25);
                color22.setBackground(new Color(145, 255, 243));
                add(color22);
                
                JButton color23 = new JButton();
                color23.setBounds(410, 400, 25, 25);
                color23.setBackground(new Color(12, 72, 122));
                add(color23);
                
                JButton color24 = new JButton();
                color24.setBounds(410, 430, 25, 25);
                color24.setBackground(new Color(119, 119, 203));
                add(color24);
                
                JButton color25 = new JButton();
                color25.setBounds(440, 400, 25, 25);
                color25.setBackground(new Color(144, 0, 255));
                add(color25);
                
                JButton color26 = new JButton();
                color26.setBounds(440, 430, 25, 25);
                color26.setBackground(new Color(240, 0, 165));
                add(color26);
                
                JButton color27 = new JButton();
                color27.setBounds(470, 400, 25, 25);
                color27.setBackground(new Color(147, 76, 31));
                add(color27);
                
                JButton color28 = new JButton();
                color28.setBounds(470, 430, 25, 25);
                color28.setBackground(new Color(255, 129, 51));
                add(color28);
                
        JLabel footer = new JLabel("Para obtener Ayuda, haga clic en Temas de Ayuda en");
        footer.setBounds(0, 460, 600, 40);
        footer.setBackground(labelcolor);
        footer.setOpaque(true);
        add(footer);
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paint paint = new Paint();
    }
    
}
