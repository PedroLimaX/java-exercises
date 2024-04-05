package utils;

import utils.*;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Alienwara-Ricardo
 */
public class funcionesArchivos 
{
  private static final String path_imagenes = "/img/";
  
  public funcionesArchivos()
  {
    
  }
  
  public URL obtenerDireccionImagen( String nombre_archivo )
  {
    return this.getClass().getResource( path_imagenes + nombre_archivo );
  }
  
  public ImageIcon obtenerIcono( String nombre_icono )
  {
    return new ImageIcon( obtenerDireccionImagen( nombre_icono ) );
  }
  
  public ImageIcon obtenerIconoEscalado( String nombre_icono, int ancho, int alto )
  {
    return new ImageIcon(
      (
        new ImageIcon( 
          obtenerDireccionImagen( nombre_icono ) 
        ).getImage()
      ).getScaledInstance(
        ancho, 
        alto, 
        Image.SCALE_SMOOTH
      )
    );
  }
}
