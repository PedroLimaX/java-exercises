package paint2;

import javax.swing.*;
import java.awt.*;

class panelDibujo extends JPanel {
    private int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    private int ancho = 0, alto = 0;
    private int modo = 0;
    private boolean dibujando = false;
    private Color color_pluma = Color.BLACK;
    private Color color_fondo = Color.WHITE;

    public Color getColorFondo() {
        return color_fondo;
    }

    public void setColorFondo(Color color_fondo) {
        this.color_fondo = color_fondo;
        repaint();
    }

    public Color getColorPluma() {
        return color_pluma;
    }

    public void setColorPluma(Color color_pluma) {
        this.color_pluma = color_pluma;
        repaint();
    }

    public boolean isDibujando() {
        return dibujando;
    }

    public void setDibujando(boolean dibujando) {
        this.dibujando = dibujando;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }
  
    public void setPunto1(int x, int y) {
        this.x1 = x;
        this.y1 = y;
        this.dibujando = true;
    }
  
    public void setPunto2(int x, int y) {
        this.x2 = x;
        this.y2 = y;
        repaint();
    }
  
    public void setAnchoAlto( int ancho, int alto ) {
        this.ancho = ancho;
        this.alto = alto;
        repaint();
    }
  
    @Override
    public void paint( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( color_fondo );
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight() );
        g2d.setColor( color_pluma );
        switch( modo ) {
            case 1:
                g2d.drawLine( x1, y1, x2, y2);
            break;
             case 2:
                g2d.drawRect( x1, y1, ancho, alto );
            break;          
            case 3:
                g2d.drawOval( x1, y1, ancho, alto );
            break;
            case 4:
                clear(g);
            break;
        }
    }
        
    protected void clear( Graphics g) {
        super.paintComponent( g );
    }
}