package formulario;

import java.awt.Color;
import java.awt.Font;	
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

/**
 *
 * @author Pleidmrao
 */
public class Formulario extends JFrame {

    Color bgcolor = new Color(34, 40, 49);
    Color labelcolor = new Color(0, 74, 185);
    Color textcolor = new Color(0, 74, 185);
    Border campo_borde = new LineBorder(new Color(0, 74, 185), 2); //para crear bordes en los campos de texto

    public Formulario() {

        super("Tarea 2: Registro de producto SOCEP");
        setSize(750, 600);
        setLayout(null);

        //ID DEL PRODUCTO
        JLabel id = new JLabel();
        id.setText("Id de Producto:");
        id.setBounds(40, 40, 120, 20);
        id.setFont(new Font("Hevetica", Font.BOLD, 14));
        id.setForeground(labelcolor);

        JTextField id_campo = new JTextField();
        id_campo.setText("");
        id_campo.setBounds(165, 40, 235, 30);
        id_campo.setFont(new Font("Hevetica", Font.ITALIC, 14));
        id_campo.setForeground(textcolor);
        id_campo.setBorder(campo_borde);

        //NOMBRE DEL PRODUCTO
        JLabel nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(40, 90, 100, 20);
        nombre.setFont(new Font("Hevetica", Font.BOLD, 14));
        nombre.setForeground(labelcolor);

        JTextField nombre_campo = new JTextField();
        nombre_campo.setText("");
        nombre_campo.setBounds(145, 90, 255, 30);
        nombre_campo.setFont(new Font("Hevetica", Font.ITALIC, 14));
        nombre_campo.setForeground(textcolor);
        nombre_campo.setBorder(campo_borde);

        //DESCRIPCION DEL PRODUCTO
        JLabel desc = new JLabel();
        desc.setText("Descripcion:");
        desc.setBounds(40, 150, 100, 20);
        desc.setFont(new Font("Hevetica", Font.BOLD, 14));
        desc.setForeground(labelcolor);

        JTextArea desc_campo = new JTextArea();
        desc_campo.setText("");
        desc_campo.setBounds(40, 175, 360, 120);
        desc_campo.setFont(new Font("Hevetica", Font.ITALIC, 14));
        desc_campo.setForeground(textcolor);
        desc_campo.setBorder(campo_borde);

        //PRECIO DEL PRODUCTO
        JLabel precio = new JLabel();
        precio.setText("Precio:");
        precio.setBounds(40, 320, 100, 20);
        precio.setFont(new Font("Hevetica", Font.BOLD, 14));
        precio.setForeground(labelcolor);

        JTextField precio_campo = new JTextField();
        precio_campo.setText("");
        precio_campo.setBounds(105, 320, 100, 30);
        precio_campo.setFont(new Font("Hevetica", Font.ITALIC, 14));
        precio_campo.setForeground(textcolor);
        precio_campo.setBorder(campo_borde);

        //CANTIDAD DEL PRODUCTO
        JLabel cant = new JLabel();
        cant.setText("Cantidad:");
        cant.setBounds(220, 320, 100, 20);
        cant.setFont(new Font("Hevetica", Font.BOLD, 14));
        cant.setForeground(labelcolor);

        JTextField cant_campo = new JTextField();
        cant_campo.setText("");
        cant_campo.setBounds(300, 320, 100, 30);
        cant_campo.setFont(new Font("Hevetica", Font.ITALIC, 14));
        cant_campo.setForeground(textcolor);
        cant_campo.setBorder(campo_borde);

        //ESPACIO PARA IMAGEN
        JLabel imagen = new JLabel();
        imagen.setText("*Imagen*");
        imagen.setBounds(440, 90, 250, 250);
        imagen.setFont(new Font("verdana", Font.BOLD, 40));
        imagen.setForeground(Color.LIGHT_GRAY);
        imagen.setBorder(campo_borde);

        //BOTON DE AÑADR
        JButton anadir = new JButton("A\u00f1adir");
        anadir.setFont(new Font("Verdana", Font.BOLD, 30));
        anadir.setForeground(labelcolor);
        anadir.setBounds(300, 465, 130, 35);
        anadir.setBackground(Color.WHITE);
        anadir.setBorder(campo_borde);

        add(id);
        add(id_campo);

        add(nombre);
        add(nombre_campo);

        add(desc);
        add(desc_campo);

        add(precio);
        add(precio_campo);

        add(cant);
        add(cant_campo);

        add(imagen);
        add(anadir);

        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formulario formulario = new Formulario();
    }

}
