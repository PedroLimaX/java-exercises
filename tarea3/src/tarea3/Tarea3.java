package tarea3;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.*;
import utils.utilidades;

public class Tarea3 extends JFrame
{
    utilidades utils = new utilidades();
    JTable tabla, tabla2;
    JComboBox combobox;
    JList lista;
    Color bgcolor = new Color(34, 40, 49);
    Color labelcolor = new Color(230, 230, 230);
    Color textcolor = new Color(230, 230, 230);
    
    public Tarea3()   {
        super("FORMULARIO");
        setLayout(null);
        this.getContentPane().setBackground(new Color(80, 80, 80));
        String path = System.getProperty( "user.dir" );
        
        setSize(625, 660);
        
        //NOMBRE
        JLabel nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(100, 140, 80, 20);
        nombre.setFont(new Font("Hevetica", Font.BOLD, 14));
        nombre.setForeground(labelcolor);

        JTextField nombre_campo = new JTextField();
        nombre_campo.setText("");
        nombre_campo.setBounds(205, 140, 255, 30);
        nombre_campo.setForeground(textcolor);
        nombre_campo.setBorder(null);

        
        //APELLIDO 1
        JLabel apellido1 = new JLabel();
        apellido1.setText("Primer Apellido:");
        apellido1.setBounds(100, 200, 130, 20);
        apellido1.setFont(new Font("Hevetica", Font.BOLD, 14));
        apellido1.setForeground(labelcolor);

        JTextField apellido1_campo = new JTextField();
        apellido1_campo.setText("");
        apellido1_campo.setBounds(235, 200, 225, 30);
        apellido1_campo.setForeground(textcolor);
        apellido1_campo.setBorder(null);

        
        //APELLIDO 2
        JLabel apellido2 = new JLabel();
        apellido2.setText("Segundo Apellido:");
        apellido2.setBounds(100, 260, 130, 20);
        apellido2.setFont(new Font("Hevetica", Font.BOLD, 14));
        apellido2.setForeground(labelcolor);

        JTextField apellido2_campo = new JTextField();
        apellido2_campo.setText("");
        apellido2_campo.setBounds(235, 260, 225, 30);
        apellido2_campo.setForeground(textcolor);
        apellido2_campo.setBorder(null);

        

        //EDAD
        JLabel edad = new JLabel();
        edad.setText("Edad:");
        edad.setBounds(100, 310, 100, 20);
        edad.setFont(new Font("Hevetica", Font.BOLD, 14));
        edad.setForeground(labelcolor);

        JTextField edad_campo = new JTextField();
        edad_campo.setText("");
        edad_campo.setBounds(165, 310, 100, 30);
        edad_campo.setForeground(textcolor);
        edad_campo.setBorder(null);


        //DIRECCION
        JLabel direc = new JLabel();
        direc.setText("Direccion:");
        direc.setBounds(100, 350, 100, 20);
        direc.setFont(new Font("Hevetica", Font.BOLD, 14));
        direc.setForeground(labelcolor);

        JTextArea direc_campo = new JTextArea();
        direc_campo.setText("");
        direc_campo.setBounds(100, 370, 180, 160);
        direc_campo.setForeground(textcolor);
        direc_campo.setBorder(null);


        //ESPACIO PARA IMAGEN
        JLabel imagen = new JLabel();
        imagen.setBounds(240, 10, 100, 100);
        imagen.setIcon( utils.obtenerIconoEscalado("user.png",100, 100) );

        //BOTON DE GUARDAR
        JButton guardar = new JButton("Guardar");
        guardar.setFont(new Font("Verdana", Font.BOLD, 20));
        guardar.setForeground(labelcolor);
        guardar.setBounds(230, 545, 130, 35);
        guardar.setBackground(new Color(130, 130, 130));
        guardar.setBorder(null);

        combobox = new JComboBox();
        combobox.addItem("Estado");
        combobox.addItem("Ya pude Profe");
        combobox.setBounds(290, 310, 170, 25);
        
        JList listareligion=new JList();
        DefaultListModel modelolista = new DefaultListModel();
        listareligion.setBounds(290, 360, 170, 170);
        modelolista.addElement("Tambien pude Profe");
        listareligion.setModel(modelolista);
       
        
        add(imagen);
        
        add(nombre);
        add(nombre_campo);
        
        add(apellido1);
        add(apellido1_campo);
        
        add(apellido2);
        add(apellido2_campo);

        add(edad);
        add(edad_campo);

        add(direc);
        add(direc_campo);
        
        add(combobox);
        add(listareligion); 
        
        
        add(guardar);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    try
    {

        Class.forName("com.mysql.jdbc.Driver");

        try (
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3307/registro","root", "12345")) {
            Statement stat = conexion.createStatement();
            ResultSet resultado = stat.executeQuery ("SELECT nombre FROM estado_republica");
            while (resultado.next())
            {
                combobox.addItem (resultado.getObject("nombre"));
            }
        }catch(Exception ex){
            System.out.println("Error al llenar ComboBox");
        }
        try (
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3307/registro","root", "12345")) {
            Statement stat = conexion.createStatement();
            ResultSet resultado = stat.executeQuery ("SELECT nombre FROM religion");
            while (resultado.next())
            {
                modelolista.addElement (resultado.getObject("nombre"));
            }
        }catch(Exception ex){
            System.out.println("Error al llenar Lista");
        }
    }
    
    catch (ClassNotFoundException e)
    {
        System.out.println (e);
    }
    }   
public static void main (String [] args) throws SQLException
    {
     Tarea3 tarea3 = new Tarea3();

    }
}