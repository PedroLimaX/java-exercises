package paint2;

import ZoeloeSoft.projects.JFontChooser.JFontChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Arrays;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import utils.funcionesArchivos;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Paint2 extends JFrame {
    private funcionesArchivos funciones_archivo = new funcionesArchivos();
    private JPanel panel_centro;
    private JPanel barra_estado;
    private JLabel estado_etiqueta;
    private panelDibujo panel_dibujo = new panelDibujo();
    private JPanel panel_botones_dibujo;
    private NoneSelectedButtonGroup grupo_botones_dibujo;
    private JToggleButton boton_dibuja_linea;
    private JToggleButton boton_dibuja_rectangulo;
    private JToggleButton boton_dibuja_circulo;
    private JButton boton_dibuja_texto;
    private JButton boton_selecciona_color;
    private JComboBox colores_fondo;
    private JMenuItem nuevo;
    private JMenuItem abrir;
    private JMenuItem guardar;
    private JMenuItem dibujar_linea;
    private JMenuItem dibujar_rectangulo;
    private JMenuItem dibujar_ovalo;
    private JMenuItem dibujar_texto;
    private JMenuItem acercade;
    private JLabel label_texto;
    private JLabel copy_right;
    private String respuesta;
    int ancho = 35;
    int alto = ancho;
  
    ActionListener accion_botones_dibujo = new ActionListener() {
          @Override
          public void actionPerformed( ActionEvent evento ) {
                Object control = evento.getSource();
                panel_dibujo.setDibujando( false );
                int modo = 0;
                String que_dibuja = "";

                if( ( (JToggleButton) control ).isSelected() ) {
                        if( control.equals( boton_dibuja_linea ) ) {
                          modo = 1;
                          que_dibuja = "Línea";
                        }
                        else if( control.equals( boton_dibuja_rectangulo ) ) {
                          modo = 2;
                          que_dibuja = "Rectangulo";
                        }
                        else if( control.equals( boton_dibuja_circulo ) ) {
                          modo = 3;
                          que_dibuja = "Circulo";
                        }
                    escribirBarraEstado( "Vas a dibujar un(a) " + que_dibuja );
                }
                panel_dibujo.setX1( 0 );
                panel_dibujo.setY1( 0 );
                panel_dibujo.setX2( 0 );
                panel_dibujo.setY2( 0 );
                panel_dibujo.setModo( modo );
            }
    };
  
    ActionListener menu_nuevo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
                panel_dibujo.setDibujando( false );
                int modo=4;
                panel_dibujo.setColorFondo(Color.WHITE);
                colores_fondo.setSelectedItem("Blanco");
                panel_centro = new JPanel();
                panel_dibujo.setModo( modo );
            }
    };

   
   JFileChooser dialogo = new JFileChooser();        
   FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes, Recortes", "png", "jpg");
        
    ActionListener menu_abrir = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            dialogo.setFileFilter(filtro);
            int valor = dialogo.showOpenDialog(new Frame());
            if (valor == dialogo.APPROVE_OPTION){
                String nombre_archivo = dialogo.getSelectedFile().getAbsolutePath();
                File archivo = new File(nombre_archivo);
                //archivo.
            } 
        }
    };
    
    ActionListener menu_guardar = new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            dialogo.setFileFilter(filtro);
            int valor2 = dialogo.showSaveDialog(new Frame());
            if (valor2 == dialogo.APPROVE_OPTION){
                String nombre_archivo = dialogo.getSelectedFile().getAbsolutePath();
                File archivo = new File(nombre_archivo);
            }
        }
    };
  
    ActionListener menu_acercade = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            JOptionPane.showMessageDialog(null, "Integrantes:\nPedro Degante Lima\n201928846\nSeccion 1\nTengo errores con el texto :(\n no se borra cuando dibujo otra cosa");
        }
    };
      
    ActionListener boton_dibujar_texto = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            respuesta = JOptionPane.showInputDialog(null, "Escribe tu texto", "Dibujar texto", JOptionPane.DEFAULT_OPTION);
            label_texto.setText(respuesta);
            escribirBarraEstado( "Vas a dibujar un Texto" );
        }
    };
  

    ActionListener menu_dibujar_linea = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            escribirBarraEstado( "Vas a dibujar una Línea " );
            panel_dibujo.setX1( 0 );
            panel_dibujo.setY1( 0 );
            panel_dibujo.setX2( 0 );
            panel_dibujo.setY2( 0 );
            panel_dibujo.setModo( 1 );
        }
    };
  
    ActionListener menu_dibujar_rectangulo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            escribirBarraEstado( "Vas a dibujar un Rectangulo");
            panel_dibujo.setX1( 0 );
            panel_dibujo.setY1( 0 );
            panel_dibujo.setX2( 0 );
            panel_dibujo.setY2( 0 );
            panel_dibujo.setModo( 2 );
        }
    };
  
    ActionListener menu_dibujar_ovalo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            panel_dibujo.setDibujando( false );
            escribirBarraEstado( "Vas a dibujar un Ovalo" );
            panel_dibujo.setX1( 0 );
            panel_dibujo.setY1( 0 );
            panel_dibujo.setX2( 0 );
            panel_dibujo.setY2( 0 );
            panel_dibujo.setModo( 3 );
        }
    };
    
    ActionListener menu_tipo_fuente = new ActionListener() {
        @Override
        public void actionPerformed( ActionEvent evento ) {
            JFontChooser selector_fuente = new JFontChooser( null );
            selector_fuente.setTitle( "Elige una fuente" );
            int seleccion = selector_fuente.showDialog();
            if( seleccion == JFontChooser.OK_OPTION ) {
                Font fuente_nueva = selector_fuente.getFont();
                label_texto.setFont(fuente_nueva);
            }
        }
    };
    
    ActionListener accion_boton_color = new ActionListener() {
        @Override
        public void actionPerformed( ActionEvent evento ) {
            JColorChooser selector_color = new JColorChooser();
            Color nuevo_color = selector_color.showDialog( null, "Seleccione un Color", panel_dibujo.getColorPluma() );
            panel_dibujo.setColorPluma( nuevo_color );
            label_texto.setForeground(nuevo_color);
        }
    };

  
    MouseListener acccionPanelDibujo = new MouseListener() {
        @Override
        public void mouseClicked( MouseEvent me ) {}    
        @Override
        public void mousePressed( MouseEvent me ) {}
        @Override
        public void mouseReleased( MouseEvent me ) {
            int x = me.getX();
            int y = me.getY();
            escribirBarraEstado( "Presionaste el área de dibujo ( " + x + ", " + me.getY() + " )"  );
            int modos[] = new int[]{ 1, 2, 3};
            if( Arrays.binarySearch( modos, panel_dibujo.getModo() ) >= 0 ) {
                if( panel_dibujo.isDibujando() == false ) {
                    panel_dibujo.setPunto1( x, y );
                }
                else {
                    switch( panel_dibujo.getModo() ) {
                        case 1:
                            panel_dibujo.setPunto2( x, y );
                        break;
                        case 2:
                        case 3:
                            if( x < panel_dibujo.getX1() ) {
                                panel_dibujo.setX2( panel_dibujo.getX1() );
                                panel_dibujo.setX1( x );
                            }
                            if( y < panel_dibujo.getY1() ) {
                                panel_dibujo.setY2( panel_dibujo.getY1() );
                                panel_dibujo.setY1( y );
                            }
                            int ancho = Math.abs(panel_dibujo.getX2() - panel_dibujo.getX1() );
                            int alto = Math.abs(panel_dibujo.getY2() - panel_dibujo.getY1() );
                            panel_dibujo.setAnchoAlto( ancho, alto );
                        break;
                    }
                    panel_dibujo.setDibujando( false );
                }
            }
        }
        @Override
        public void mouseEntered( MouseEvent me ) {
            escribirBarraEstado( "Entraste al área de dibujo" );
        }
        @Override
        public void mouseExited( MouseEvent me ) {
             escribirBarraEstado( "Saliste del área de dibujo" );
        }
    };
  
    MouseMotionListener accion_panel_dibujo_motion = new MouseMotionListener() {
        boolean intercambio_x = false;
        boolean intercambio_y = false;

        public void mouseDragged( MouseEvent mme ) {}
        
        public void mouseMoved( MouseEvent mme ) {
            int x = mme.getX();
            int y = mme.getY();
            if( panel_dibujo.isDibujando() ) {
                switch( panel_dibujo.getModo() ) {
                    case 1:
                        panel_dibujo.setPunto2( x, y );
                    break;
                    case 2:
                    case 3:
                        if( x < panel_dibujo.getX1() || y < panel_dibujo.getY1() ) {
                            if( x < panel_dibujo.getX1() && intercambio_x == false ) {
                                panel_dibujo.setX2( panel_dibujo.getX1() );
                                intercambio_x = true;
                            }
                            if( y < panel_dibujo.getY1() && intercambio_y == false ) {
                              panel_dibujo.setY2( panel_dibujo.getY1() );
                              intercambio_y = true;
                            }
                        }
                        if( intercambio_x ) {
                            panel_dibujo.setX1( x );
                        }
                        else {
                            panel_dibujo.setX2( x );
                        }
                        if( intercambio_y ) {
                            panel_dibujo.setY1( y );
                        }
                        else {
                            panel_dibujo.setY2( y );
                        }
                        int ancho = Math.abs( panel_dibujo.getX2() - panel_dibujo.getX1() );
                        int alto = Math.abs( panel_dibujo.getY2() - panel_dibujo.getY1() );
                        panel_dibujo.setAnchoAlto( ancho, alto );
                    break;
                }
            }
            else {
                intercambio_x = false;
                intercambio_y = false;
            }
        }
    };
    public Paint2() {
        super( "Ejemplo Paint" ); 
        JMenuBar barra=new JMenuBar();
        barra.setBackground(new Color(80, 80, 80));
        JMenu archivo=new JMenu("Archivo");
        archivo.setForeground(new Color(230, 230, 230));
        nuevo=new JMenuItem("Nuevo");
        nuevo.addActionListener(menu_nuevo);
        abrir=new JMenuItem("Abrir");
        abrir.addActionListener(menu_abrir);
        guardar=new JMenuItem("Guardar");
        guardar.addActionListener(menu_guardar);
        
        barra.add(archivo);
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        
        JMenu edicion=new JMenu("Edici\u00f3n");
        edicion.setForeground(new Color(230, 230, 230));
        JMenuItem copiar=new JMenuItem("Copiar");
        JMenuItem cortar=new JMenuItem("Cortar");
        JMenuItem pegar=new JMenuItem("Pegar");
        
        barra.add(edicion);
        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        
        
        JMenu ver=new JMenu("Ver");
        ver.setForeground(new Color(230, 230, 230));
        JMenuItem acercar=new JMenuItem("acercar");
        JMenuItem alejar=new JMenuItem("alejar");
        
        barra.add(ver);
        ver.add(acercar);
        ver.add(alejar);
        
        JMenu imagen=new JMenu("Imagen");
        imagen.setForeground(new Color(230, 230, 230));
        dibujar_linea=new JMenuItem("Dibujar L\u00ednea");
        dibujar_linea.addActionListener(menu_dibujar_linea);
        dibujar_rectangulo=new JMenuItem("Dibujar Rect\u00e1ngulo");
        dibujar_rectangulo.addActionListener(menu_dibujar_rectangulo);
        dibujar_ovalo=new JMenuItem("Dibujar \u00d3valo");
        dibujar_ovalo.addActionListener(menu_dibujar_ovalo);
        dibujar_texto=new JMenuItem("Dibujar Texto");
        dibujar_texto.addActionListener(boton_dibujar_texto);
        
        JMenu formato = new JMenu("Formato");
        formato.setForeground(new Color(230, 230, 230));
        JMenuItem fuente = new JMenuItem("Cambiar Fuente");
        fuente.addActionListener(menu_tipo_fuente);
        formato.add(fuente);
        JMenuItem color = new JMenuItem("Cambiar Color");
        color.addActionListener(accion_boton_color);
        formato.add(color);
        barra.add(formato);
        
        barra.add(imagen);
        imagen.add(dibujar_linea);
        imagen.add(dibujar_rectangulo);
        imagen.add(dibujar_ovalo);
        imagen.add(dibujar_texto);
        
        JMenu colores=new JMenu("Color");
        colores.setForeground(new Color(230, 230, 230));
        JMenuItem color_primario=new JMenuItem("Color Principal");
        color_primario.addActionListener(accion_boton_color);
        JMenuItem color_secundario=new JMenuItem("Color Secundario");
        color_secundario.addActionListener(accion_boton_color);
        
        barra.add(colores);
        colores.add(color_primario);
        colores.add(color_secundario);
        
        JMenu ayuda=new JMenu("Ayuda");
        ayuda.setForeground(new Color(230, 230, 230));
        acercade=new JMenuItem("Acerca de...");
        acercade.addActionListener(menu_acercade);

        barra.add(ayuda);
        ayuda.add(acercade);
    
        setJMenuBar(barra);
    
        panel_centro = new JPanel();
        panel_centro.setBackground(new Color(80, 80, 80));
        panel_centro.setLayout( null );

        panel_botones_dibujo = new JPanel( );
        panel_botones_dibujo.setLayout( new BoxLayout( panel_botones_dibujo, BoxLayout.Y_AXIS ) );
        panel_botones_dibujo.setBackground(Color.WHITE);
        grupo_botones_dibujo = new NoneSelectedButtonGroup();

        boton_dibuja_linea = new JToggleButton();
        boton_dibuja_linea.setIcon( funciones_archivo.obtenerIconoEscalado( "line.png", 40,40 ) );
        boton_dibuja_linea.setRolloverIcon( funciones_archivo.obtenerIconoEscalado( "line_over.png", 41,41 ) );
        boton_dibuja_linea.setSelectedIcon( funciones_archivo.obtenerIconoEscalado( "line_over.png", 41,41 ) );
        boton_dibuja_linea.addActionListener(accion_botones_dibujo );
        boton_dibuja_linea.setBackground(Color.WHITE);
        boton_dibuja_linea.setBorder(null);
        panel_botones_dibujo.add( boton_dibuja_linea );
        grupo_botones_dibujo.add( boton_dibuja_linea );

        boton_dibuja_rectangulo = new JToggleButton();
        boton_dibuja_rectangulo.setIcon( funciones_archivo.obtenerIconoEscalado( "rectangle.png", 40,40 ) );
        boton_dibuja_rectangulo.setRolloverIcon( funciones_archivo.obtenerIconoEscalado( "rectangle_over.png", 41,41 ) );
        boton_dibuja_rectangulo.setSelectedIcon( funciones_archivo.obtenerIconoEscalado( "rectangle_over.png", 41,41 ) );
        boton_dibuja_rectangulo.addActionListener(accion_botones_dibujo );
        boton_dibuja_rectangulo.setBackground(Color.WHITE);
        boton_dibuja_rectangulo.setBorder(null);
        panel_botones_dibujo.add(boton_dibuja_rectangulo );
        grupo_botones_dibujo.add(boton_dibuja_rectangulo );

        boton_dibuja_circulo = new JToggleButton();
        boton_dibuja_circulo.setIcon( funciones_archivo.obtenerIconoEscalado( "circle.png", 40,40 ) );
        boton_dibuja_circulo.setRolloverIcon( funciones_archivo.obtenerIconoEscalado( "circle_over.png", 41,41 ) );
        boton_dibuja_circulo.setSelectedIcon( funciones_archivo.obtenerIconoEscalado( "circle_over.png", 41,41 ) );
        boton_dibuja_circulo.addActionListener(accion_botones_dibujo );
        boton_dibuja_circulo.setBackground(Color.WHITE);
        boton_dibuja_circulo.setBorder(null);
        panel_botones_dibujo.add( boton_dibuja_circulo );
        grupo_botones_dibujo.add( boton_dibuja_circulo );

        boton_dibuja_texto = new JButton();
        boton_dibuja_texto.setIcon( funciones_archivo.obtenerIconoEscalado( "text.png", 40,40 ) );
        boton_dibuja_texto.setRolloverIcon( funciones_archivo.obtenerIconoEscalado( "text_over.png", 41,41 ) );
        boton_dibuja_texto.setSelectedIcon( funciones_archivo.obtenerIconoEscalado( "text_over.png", 41,41 ) );
        boton_dibuja_texto.addActionListener(boton_dibujar_texto );
        boton_dibuja_texto.setBackground(Color.WHITE);
        boton_dibuja_texto.setBorder(null);
        panel_botones_dibujo.add( boton_dibuja_texto );
        grupo_botones_dibujo.add( boton_dibuja_texto );

        boton_selecciona_color = new JButton();
        boton_selecciona_color.setIcon( funciones_archivo.obtenerIconoEscalado( "palette.png", 40,40 ) );
        boton_selecciona_color.setRolloverIcon( funciones_archivo.obtenerIconoEscalado("palette_over.png", 41,41 ) );
        boton_selecciona_color.addActionListener( accion_boton_color );
        boton_selecciona_color.setBackground(Color.WHITE);
        boton_selecciona_color.setBorder(null);
        panel_botones_dibujo.add( boton_selecciona_color );
    
        String Colores[] = { 
            "Blanco", 
            "Negro", 
            "Verde", 
            "Azul", 
            "Rojo",
            "Cian",
            "Gris Oscuro",
            "Gris",
            "Gris Claro",
            "Magenta",
            "Anaranjado",
            "Rosa",
            "Amarillo",
        };
    
        colores_fondo = new JComboBox( Colores );
        colores_fondo.setToolTipText( "Elige un color de fondo" );
        colores_fondo.setSelectedIndex( 0 );
        
        colores_fondo.addActionListener(
            new ActionListener() {
                @Override 
                public void actionPerformed( ActionEvent e ) {
                    String seleccion = colores_fondo.getSelectedItem().toString();
                    Color nuevo_color_fondo = panel_dibujo.getColorFondo();
                    switch( seleccion ) {
                        case "Blanco":
                            nuevo_color_fondo = Color.WHITE;
                        break;
                        case "Negro":
                            nuevo_color_fondo = Color.BLACK;
                        break;
                        case "Verde":
                            nuevo_color_fondo = Color.GREEN;
                        break;
                        case "Azul":
                            nuevo_color_fondo = Color.BLUE;
                        break;
                        case "Rojo":
                            nuevo_color_fondo = Color.RED;
                        break;
                       case "Cian":
                            nuevo_color_fondo = Color.CYAN;
                        break;
                       case "Gris Oscuro":
                             nuevo_color_fondo = Color.DARK_GRAY;
                        break;
                       case "Gris":
                             nuevo_color_fondo = Color.GRAY;
                        break;
                       case "Gris Claro":
                             nuevo_color_fondo = Color.LIGHT_GRAY;
                        break;
                       case "Magenta":
                             nuevo_color_fondo = Color.MAGENTA;
                        break;
                       case "Anaranjado":
                             nuevo_color_fondo = Color.ORANGE;
                        break;
                        case "Rosa":
                             nuevo_color_fondo = Color.PINK;
                        break;
                        case "Amarillo":
                            nuevo_color_fondo = Color.YELLOW;
                        break;
                    }
                    panel_dibujo.setColorFondo( nuevo_color_fondo );
                }
            }
        );
        
        label_texto = new JLabel();
        label_texto.setBounds( 130, 50, 675, 675 );
        panel_dibujo.add( label_texto );
        add( label_texto, BorderLayout.CENTER);
        
        panel_botones_dibujo.add( colores_fondo );
        panel_botones_dibujo.setBounds( 20, 150, 100, 250 );
        panel_botones_dibujo.setBorder( new TitledBorder( "Dibuja" ) );
        panel_centro.add( panel_botones_dibujo );
        panel_dibujo.addMouseListener( acccionPanelDibujo );
        panel_dibujo.addMouseMotionListener( accion_panel_dibujo_motion );
        panel_dibujo.setBounds( 130, 50, 675, 675 );
        panel_centro.add( panel_dibujo );
        add( panel_centro, BorderLayout.CENTER );

        barra_estado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        barra_estado.setBorder( new CompoundBorder( new LineBorder( Color.DARK_GRAY ), new EmptyBorder( 4, 4, 4, 4 ) ) );
        estado_etiqueta = new JLabel();
        estado_etiqueta.setForeground(new Color(173, 0, 0));
        barra_estado.add( estado_etiqueta );
        
        copy_right = new JLabel();
        copy_right.setForeground(new Color(173, 0, 0));
        copy_right.setText("|   Todos los derechos reservados para mi xd");
        barra_estado.add( copy_right );
        
        add( barra_estado, BorderLayout.SOUTH );
        setSize( 950, 950 );  
        setVisible( true );  
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
  
    public void escribirBarraEstado( String mensaje ) {
        estado_etiqueta.setText( mensaje );
    }
  
    public static void main(String[] args) {
        new Paint2();
    }
}