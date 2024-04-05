/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.*;
import com.google.gson.reflect.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import utils.utilidades;
import utils.funcionesArchivos;

/**
 *
 * @author Pleidmrao
 */
public class API extends JFrame{
    
    Border campo_borde = new LineBorder(new Color(100, 100, 100), 2); //para crear bordes en los campos de texto
    utilidades utils = new utilidades();
    private final funcionesArchivos funciones_archivo = new funcionesArchivos();
    Date date = new Date();
    DateFormat hourdateFormat = new SimpleDateFormat("hh:mm a dd/MM/yyyy");
    
    
    public API(){
        
        super("Tarea 5 - Implementacion de API de OpenWeather");
        setSize(1080, 720);
        setLocationRelativeTo(null);
        setLayout(null);
        this.getContentPane().setBackground(new Color(40, 40, 40));
        JLabel titulo = new JLabel();
        titulo.setText("EL CLIMA");
        titulo.setBounds(470, 20, 140, 20);
        titulo.setFont(new Font("Hevetica", Font.BOLD, 26));
        titulo.setForeground(Color.WHITE);
        add(titulo);
        
        JLabel ingresar = new JLabel();
        ingresar.setText("Ingresa el nombre de la ciudad: ");
        ingresar.setBounds(270, 100, 240, 20);
        ingresar.setFont(new Font("Hevetica", Font.BOLD, 14));
        ingresar.setForeground(Color.WHITE);
        add(ingresar);
        
        JTextField city_campo = new JTextField();
        city_campo.setText(null);
        city_campo.setBounds(495, 95, 235, 30);
        city_campo.setFont(new Font("Hevetica", Font.PLAIN, 14));
        city_campo.setForeground(Color.BLACK);
        city_campo.setBorder(campo_borde);
        add(city_campo);
               
        JLabel city = new JLabel();
        city.setText("");
        city.setBounds(440, 170, 300, 50);
        city.setFont(new Font("Hevetica", Font.BOLD, 34));
        city.setForeground(Color.WHITE);
        add(city);
        
        JLabel tiempo = new JLabel();
        tiempo.setText(hourdateFormat.format(date));
        tiempo.setBounds(450, 210, 350, 50);
        tiempo.setFont(new Font("Hevetica", Font.BOLD, 18));
        tiempo.setForeground(Color.WHITE);
        add(tiempo);
                        
        JLabel temp = new JLabel();
        temp.setText("");
        //un digito
        temp.setBounds(140, 270, 550, 100);
        temp.setFont(new Font("Hevetica", Font.PLAIN, 100));
        temp.setForeground(Color.WHITE);
        add(temp);
        
        JLabel grad = new JLabel();
        grad.setText(" ºC");
        grad.setBounds(200, 280, 240, 40);
        grad.setFont(new Font("Hevetica", Font.BOLD, 44));
        grad.setForeground(Color.WHITE);
        add(grad);
        
        JLabel estatus = new JLabel();
        estatus.setText("");
        estatus.setBounds(300, 260, 240, 30);
        estatus.setFont(new Font("Hevetica", Font.BOLD, 20));
        estatus.setForeground(Color.WHITE);
        add(estatus);
        
        JLabel sensacion = new JLabel();
        sensacion.setText("Sensacion Termica: ");
        sensacion.setBounds(300, 290, 240, 30);
        sensacion.setFont(new Font("Hevetica", Font.BOLD, 20));
        sensacion.setForeground(Color.WHITE);
        add(sensacion);
        
        JLabel grad2 = new JLabel();
        grad2.setText("ºC");
        //un digito
        grad2.setBounds(510, 280, 240, 40);        
        grad2.setFont(new Font("Hevetica", Font.BOLD, 14));
        grad2.setForeground(Color.WHITE);
        add(grad2);
        
        JLabel temp_min = new JLabel();
        temp_min.setText("Temperatura Minima: ");
        temp_min.setBounds(300, 320, 240, 30);
        temp_min.setFont(new Font("Hevetica", Font.BOLD, 20));
        temp_min.setForeground(Color.WHITE);
        add(temp_min);
        
        JLabel grad3 = new JLabel();
        grad3.setText("ºC");
        //un digito
        grad3.setBounds(525, 310, 240, 40);
        grad3.setFont(new Font("Hevetica", Font.BOLD, 14));
        grad3.setForeground(Color.WHITE);
        add(grad3);
        
        JLabel temp_max = new JLabel();
        temp_max.setText("Temperatura Maxima: ");
        temp_max.setBounds(300, 350, 240, 30);
        temp_max.setFont(new Font("Hevetica", Font.BOLD, 20));
        temp_max.setForeground(Color.WHITE);
        add(temp_max);
        
        JLabel grad4 = new JLabel();
        grad4.setText("ºC");
        //un digito
        grad4.setBounds(530, 340, 240, 40);
        grad4.setFont(new Font("Hevetica", Font.BOLD, 14));
        grad4.setForeground(Color.WHITE);
        add(grad4);
        
        JLabel humedad = new JLabel();
        humedad.setText("Humedad: ");
        humedad.setBounds(300, 380, 240, 30);
        humedad.setFont(new Font("Hevetica", Font.BOLD, 20));
        humedad.setForeground(Color.WHITE);
        add(humedad);
        
        JLabel porc = new JLabel();
        porc.setText("%");
        //un digito
        porc.setBounds(415, 380, 240, 30);
        porc.setFont(new Font("Hevetica", Font.BOLD, 18));
        porc.setForeground(Color.WHITE);
        add(porc);
        
        JLabel viento = new JLabel();
        viento.setText("Viento: ");
        viento.setBounds(300, 410, 240, 30);
        viento.setFont(new Font("Hevetica", Font.BOLD, 20));
        viento.setForeground(Color.WHITE);
        add(viento);
        
        JLabel vel = new JLabel();
        vel.setText("km/h");
        //un digito
        vel.setBounds(415, 410, 240, 30);
        vel.setFont(new Font("Hevetica", Font.BOLD, 18));
        vel.setForeground(Color.WHITE);
        add(vel);

        JLabel icon = new JLabel();
        icon.setBounds(750, 220, 150, 150);
        add(icon);
        
        city.setVisible(false);
        tiempo.setVisible(false);
        temp.setVisible(false);
        grad.setVisible(false);
        estatus.setVisible(false);
        sensacion.setVisible(false);
        grad2.setVisible(false);
        temp_min.setVisible(false);
        grad3.setVisible(false);
        temp_max.setVisible(false);
        grad4.setVisible(false);
        humedad.setVisible(false);
        porc.setVisible(false);
        viento.setVisible(false);
        vel.setVisible(false);
        icon.setVisible(false);
        
        JButton buscar = new JButton();
        buscar.setFont(new Font("Verdana", Font.BOLD, 18));
        buscar.setForeground(Color.WHITE);
        buscar.setBounds(740, 92, 35, 35);
        buscar.setBackground(new Color(50, 50, 50));
        buscar.setBorder(campo_borde);
        buscar.setIcon( funciones_archivo.obtenerIconoEscalado( "search.png", 20,20 ) );
        buscar.setRolloverIcon( funciones_archivo.obtenerIconoEscalado( "search.png", 22,22 ) );
        buscar.setSelectedIcon( funciones_archivo.obtenerIconoEscalado( "search.png", 22,22 ) );
        ActionListener accion_boton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!city.equals("")){
                    temp.setText("");
                    estatus.setText("");
                    sensacion.setText("Sensacion Termica: ");
                    temp_min.setText("Temperatura Minima: ");
                    temp_max.setText("Temperatura Maxima: ");
                    humedad.setText("Humedad: ");
                    viento.setText("Viento: ");
                }
                if(city_campo.getText().equals("")){
                    JOptionPane.showMessageDialog(
                            null, 
                            "El campo esta vacio",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                } else {
                    String API_KEY = "896f8a7e3a15a9ed853c4ca80ca9833b";
                    String ciudad = city_campo.getText();
                    String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + ciudad + "&appid=" + API_KEY + "&units=metric&lang=es";
                    try{
                        StringBuilder result = new StringBuilder();
                        URL url = new URL(urlString);
                        URLConnection conn = url.openConnection();
                        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        String line;
                        while((line=rd.readLine())!= null){
                            result.append(line);
                        }
                        rd.close();
                        System.out.println(result);

                        Map<String, Object> respMap = jsonToMap(result.toString());
                        ArrayList<Map<String, Object>> weathers = (ArrayList<Map<String, Object>>) respMap.get("weather");
                        Map<String, Object> weatherMap = weathers.get(0);
                        Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
                        Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());

                        city.setText(ciudad.toUpperCase());
                        
                        String estado = (String) weatherMap.get("description");
                        estatus.setText(estado);
                        
                        double dtemp = (double) mainMap.get("temp");
                        int itemp = (int) dtemp;
                        if((itemp<0)||(itemp>9)){
                            //dos digitos
                            temp.setBounds(100, 270, 550, 100);
                        }
                        if((itemp<-9)){
                                //tres digitos
                                temp.setBounds(40, 270, 550, 100);
                            }
                        String tem = String.valueOf(itemp);
                        temp.setText(temp.getText().concat(tem));

                        double dsens = (double) mainMap.get("feels_like");
                        int isens = (int) dsens;
                        if((isens<0)||(isens>9)){
                            //dos digitos
                            grad2.setBounds(520, 280, 240, 40);
                        }
                        if((isens<-9)){
                                //tres digitos
                                grad2.setBounds(530, 280, 240, 40);
                            }
                        String sens = String.valueOf(isens);
                        sensacion.setText(sensacion.getText().concat(sens));

                        double dmin = (double) mainMap.get("temp_min");
                        int imin = (int) dmin;
                        if((imin<0)||(imin>9)){
                            //dos digitos
                            grad3.setBounds(535, 310, 240, 40);
                        }
                        if((imin<-9)){
                                //tres digitos
                                grad3.setBounds(545, 310, 240, 40);
                            }
                        String min = String.valueOf(imin);
                        temp_min.setText(temp_min.getText().concat(min));

                        double dmax = (double) mainMap.get("temp_max");
                        int imax = (int) dmax;
                        if((imax<0)||(imax>9)){
                            //dos digitos
                            grad4.setBounds(540, 340, 240, 40);
                        }
                        if((imax<-9)){
                                //tres digitos
                                grad4.setBounds(550, 340, 240, 40);
                            }
                        String max = String.valueOf(imax);
                        temp_max.setText(temp_max.getText().concat(max));

                        double dhum = (double) mainMap.get("humidity");
                        int ihum = (int) dhum;
                        if((ihum<0)||(ihum>9)){
                            //dos digitos
                            porc.setBounds(425, 380, 240, 30);
                        }
                        if((ihum<-9)||(ihum==100)){
                                //tres digitos
                                porc.setBounds(435, 380, 240, 30);
                            }
                        String hum = String.valueOf(ihum);
                        humedad.setText(humedad.getText().concat(hum));

                        double dvient = (double) windMap.get("speed");
                        if((dvient<0)||(dvient>9)){
                            //dos digitos
                            vel.setBounds(425, 410, 240, 30);
                        }
                        if((dvient<-9)){
                                //tres digitos
                                vel.setBounds(435, 410, 240, 30);
                            }
                        String vient = String.valueOf(dvient);
                        viento.setText(viento.getText().concat(vient));

                        String icono = (String) weatherMap.get("icon");
                        icon.setIcon( funciones_archivo.obtenerIconoEscalado( icono + ".png", 150, 150 ) );

                        city.setVisible(true);
                        tiempo.setVisible(true);
                        temp.setVisible(true);
                        grad.setVisible(true);
                        estatus.setVisible(true);
                        sensacion.setVisible(true);
                        grad2.setVisible(true);
                        temp_min.setVisible(true);
                        grad3.setVisible(true);
                        temp_max.setVisible(true);
                        grad4.setVisible(true);
                        humedad.setVisible(true);
                        porc.setVisible(true);
                        viento.setVisible(true);
                        vel.setVisible(true);
                        icon.setVisible(true);

                    }catch(IOException ex){
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(
                            null, 
                            "Ciudad no encontrada\nVuelve a intentarlo",
                            "Error",
                            JOptionPane.WARNING_MESSAGE
                        );
                    }
                }
            }
        };
        buscar.addActionListener(accion_boton);
        add(buscar);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static Map<String, Object> jsonToMap(String str){
        Map<String, Object> map = new Gson().fromJson(
                str, new TypeToken<HashMap<String, Object>>(){}.getType()
        );
        return map;    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        API api = new API();
        // TODO code application logic here
    }   
}