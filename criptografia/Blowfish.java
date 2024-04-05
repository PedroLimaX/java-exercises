/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blowfish;

/**
 *
 * @author pedro
 */

import javax.swing.*;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

class Blowfish {

  byte[] skey = new byte[1000]; //cresting an array of 1000 size
  String skeyString;
  static byte[] raw;
  String inputMessage, encryptedData,decryptedMessage;
  public Blowfish(){
    try{
        generateSymmetricKey();
        inputMessage=JOptionPane.showInputDialog(null,"Enter Message to encrypt");
        byte[] ibyte = inputMessage.getBytes();
        byte[] ebyte=encrypt(raw,ibyte);
        String encryptedData=new String(ebyte);
        System.out.println("Encrypted Message " + encryptedData);
        JOptionPane.showMessageDialog(null, "Encrypted Data " + "\n" + encryptedData);
        byte[] dbyte = decrypt(raw,ebyte);
        String decryptedMessage = new String (dbyte);
        System.out.println("Decrypted Message" + decryptedMessage);
        JOptionPane.showMessageDialog(null, "Decrypted Data" + "\n" + decryptedMessage);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
  
  void generateSymmetricKey(){
    try{
        Random r = new Random ();
        int num = r.nextInt(10000);
        String knum = String.valueOf(num);
        byte[] knumb = knum.getBytes();
        skey = getRawKey(knumb);
        skeyString = new String(skey);
        System.out.println("Blowfish Symmetric key = " + skeyString);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
  
  private static byte[] getRawKey(byte[] seed) throws Exception{
    KeyGenerator kgen = KeyGenerator.getInstance("Blowfish");
    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
    sr.setSeed(seed);
    kgen.init(128, sr); //128, 256 y 448 bits pueden no estar disponibles
    SecretKey skey = kgen.generateKey();
    raw = skey.getEncoded();
    return raw;
  }
  private static byte[] encrypt(byte[] raw, byte[] clear) throws Exception{
    SecretKeySpec skeySpec = new SecretKeySpec(raw, "Blowfish");
    Cipher cipher = Cipher.getInstance("Blowfish");
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
    byte[] encrypted = cipher.doFinal(clear);
    return encrypted;
  }
  private static byte[] decrypt(byte[] raw, byte[] encrypted) throws Exception{
    SecretKeySpec skeySpec = new SecretKeySpec(raw, "Blowfish");
    Cipher cipher = Cipher.getInstance("Blowfish");
    cipher.init(Cipher.DECRYPT_MODE, skeySpec);
    byte[] decrypted = cipher.doFinal(encrypted);
    return decrypted;
  }
  
  public static void main(String args[]){
    Blowfish bf = new Blowfish();
  }
}
