/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author RicardoAdair
 */
public class utilidades {

	private static final String path_imagenes = "/img/";
	
	public URL obtenerDireccionImagen( String nombre_archivo )
  {
		URL resource = getClass().getResource( path_imagenes + nombre_archivo );
		if ( resource != null ) 
		{
			return resource;
		} 
		else 
		{
			System.out.println("Archivo NO existe");
			return null;
		}
  }
	
	public ImageIcon obtenerIcono( String nombre_icono )
  {
		URL url = obtenerDireccionImagen( nombre_icono );
		if(url != null)
		{
			return new ImageIcon( obtenerDireccionImagen( nombre_icono ) );
		}
		else
		{
			return new ImageIcon();
		}
  }

  public ImageIcon obtenerIconoEscalado( String nombre_icono, int ancho, int alto )
  {
		URL url = obtenerDireccionImagen( nombre_icono );
		if(url != null)
		{
			return new ImageIcon(
				(
					new ImageIcon( 
						 url
					).getImage()
				).getScaledInstance(
					ancho, 
					alto, 
					Image.SCALE_SMOOTH
				)
			);
		}
		else
		{
			return new ImageIcon();
		}
  }
	
	public Color hex2Rgb(String color_hex) 
  {
		return new Color
		(
				Integer.valueOf( color_hex.substring( 1, 3 ), 16 ),
				Integer.valueOf( color_hex.substring( 3, 5 ), 16 ),
				Integer.valueOf( color_hex.substring( 5, 7 ), 16 ) 
		);
  }
	
}
