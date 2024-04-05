/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package md5;

/**
 *
 * @author pedro
 */
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    public static void main(String [] args)
    {
        String str;
        System.out.print("Texto a Encriptar: ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        System.out.println("Your input: "+str);

        byte[] msg = str.getBytes();

        byte [] hash = null;
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            hash = md.digest(msg);
        }
        catch (NoSuchAlgorithmException e) {
        }
        StringBuilder strBuilder = new StringBuilder();
        for(byte b:hash)
        {
            strBuilder.append(String.format("%02x", b));
        }
        String strHash = strBuilder.toString();
        System.out.println("The MD5 hash: "+strHash);
    }
}