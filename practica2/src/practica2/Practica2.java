/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author América
 */
import java.util.Scanner;
import java.util.Calendar;
//01/01/2000
public class Practica2 {
    public static void main(String args[]) {
        
        int  anionaz, mesnaz, dianaz, edad, anio_rfc,dias;
        char ap_pat_rfc[]=new char[2];
        char ap_mat_rfc;
        char nom_rfc;
        float sal_diario, sal_mensual;
        boolean soltero;
        String nombre,ap_pat, ap_mat, direc, resp=""; //resp es para el valor de soltero
        
        Scanner sc=new Scanner(System.in);//lector
        System.out.println("Ingrese los datos: ");
        System.out.print("Nombre: ");
        nombre=sc.nextLine();
        nom_rfc=nombre.charAt(0);
        System.out.print("Apellido paterno: ");
        ap_pat=sc.nextLine();
        
        for(int i=0; i<2;i++){
            ap_pat_rfc[i]=ap_pat.charAt(i);
        }
        System.out.print("Apellido materno: ");
        ap_mat=sc.nextLine();
        ap_mat_rfc=ap_mat.charAt(0);
        System.out.print("Direccion: ");
        direc=sc.nextLine();
        System.out.print("Estado civil:");
        resp=sc.nextLine();
        System.out.print("Salario diario ($): ");
        sal_diario=sc.nextFloat();
        System.out.print("Dias a la semana que trabaja: ");
        dias=sc.nextInt();
        System.out.println("Fecha de nacimiento(dd/mm/aaaa): ");
        System.out.print("Dia: ");
        dianaz=sc.nextInt();
        System.out.print("Mes: ");
        mesnaz=sc.nextInt();
        System.out.print("Año :");
        anionaz=sc.nextInt();  
        sal_mensual=(sal_diario*dias)*4;
        //Imprimir datos recibidos
        System.out.println("\nFICHA PERSONAL");
        //separador
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
            //ToUpperCase se usara para convertir en mayusculas las palabras
        System.out.println("\nNOMBRE: "+nombre.toUpperCase()+" "+ap_pat.toUpperCase()+" "+ap_mat.toUpperCase());
        System.out.println("DIRECCION: "+direc.toUpperCase());
        System.out.println("ESTADO CIVIL: "+resp.toUpperCase());
        System.out.println("SALARIO DIARIO: "+sal_diario);
        System.out.println("DIAS QUE TRABAJA: "+dias);
        System.out.println("SALARIO MENSUAL:"+sal_mensual);
        System.out.println("FECHA DE NACIMIENTO: "+dianaz+"/"+mesnaz+"/"+anionaz);
         //crear clase para la fecha del sistema
        Calendar fecha = Calendar.getInstance();
        int anioact = fecha.get(Calendar.YEAR); //año del sistema
        int mesact = fecha.get(Calendar.MONTH) + 1; //mes del sistema
        int diaact = fecha.get(Calendar.DAY_OF_MONTH);  //dia del sistema
        if(mesnaz<mesact){
            edad=(anioact-anionaz);
            System.out.println("EDAD: "+edad+" AÑOS");
        }
        if(mesnaz==mesact){
            if(dianaz<=diaact){
                edad=(anioact-anionaz);
                System.out.println("EDAD: "+edad+" AÑOS");
            }
            else{
                edad=(anioact-(anionaz+1));
                System.out.println("Edad: "+edad+" años");
            }
        }
        if(mesnaz>mesact){
            edad=(anioact-(anionaz+1));
            System.out.println("Edad: "+edad+" años");
        }
        System.out.print("RFC: ");
        for(int i=0; i<2;i++){  //imprimir primeras letras del apellido paterno
            System.out.print(Character.toUpperCase(ap_pat_rfc[i])); //ToUpperCase se usa para convertir en mayusculas las letras
        }
        System.out.print(Character.toUpperCase(ap_mat_rfc));//imprimir primera letra de apellido materno y del nombre
        System.out.print(Character.toUpperCase(nom_rfc)); 
        //se usa para que aparezcan 2 digitos del año cuando esta entre el 0 y el 9 en el rfc
        if(anionaz<2000){
            anio_rfc=(anionaz-1900);
            System.out.print(anio_rfc);
        }
        if(anionaz>2010){
            anio_rfc=(anionaz-2000);
            System.out.print(anio_rfc);
        }
        if(anionaz>2000&&anionaz<2010){
            System.out.print("0"+(anionaz-2000));
        }
        if(anionaz==2000){
            System.out.print("00");
        }
        if(mesnaz<10){
            System.out.print("0");  
        }
        System.out.print(mesnaz);
        if(dianaz<10){
            System.out.print("0");  //lo del comentario de arriba
        }
        System.out.println(dianaz+"---");   //los --- representan la homoclave del rfc
    
        //separador
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
    }
}
