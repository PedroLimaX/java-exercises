/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rsa;

/**
 *
 * @author pedro
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
import java.util.Scanner;

  
  
public class Rsa {
  
  public static final String ALGORITHM = "RSA"; 
  /**
   * Definimos la ruta de la clave privada generada en los archivos del sistema.
   */
  public static final String PATH_PRIVATE_KEY = "C:/keys/private.key";
  /**
   * Tambien definimos la clave publica en los archivos del sistema.
   */
  public static final String PATH_PUBLIC_KEY = "C:/keys/public.key";
  /**
   * Ahora se generan las dos llaves con una longitud de 1024 Bytes, esto genera los dos archivos .key
   */
  public static void generateKey() {
    try {
        final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
        keyGen.initialize(1024);
        final KeyPair keys = keyGen.generateKeyPair();

        File privateKeyFile = new File(PATH_PRIVATE_KEY);
        File publickeyFile = new File(PATH_PUBLIC_KEY);

        // Crear el directorio para guardar las llaves en caso de no existir
        if (privateKeyFile.getParentFile() != null) {
          privateKeyFile.getParentFile().mkdirs();
        }

        privateKeyFile.createNewFile();

        if (publickeyFile.getParentFile() != null) {
          publickeyFile.getParentFile().mkdirs();
        }

        publickeyFile.createNewFile();

      try ( // Guardar el contenido de la llave publica en el archivo .key
          ObjectOutputStream publicKeyOS = new ObjectOutputStream(new FileOutputStream(publickeyFile))) {
        publicKeyOS.writeObject(keys.getPublic());
      }

      try ( // Guardamos el contenido de la llave privada en el otro archivo .key
          ObjectOutputStream privateKeyOS = new ObjectOutputStream(new FileOutputStream(privateKeyFile))) {
        privateKeyOS.writeObject(keys.getPrivate());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  
  }
  
  /**
   * Verificar que existe el par de llaves.
   * @return 
   */
  public static boolean thereIsKeyPaarConfigured() {
  
    File privateKey = new File(PATH_PRIVATE_KEY);
    File publicKey = new File(PATH_PUBLIC_KEY);
  
    return privateKey.exists() && publicKey.exists();
  }
  
  /**
   * Encriptacion del mensaje usando la llave publica
   * @param content
   * @param key
   * @return 
   */
  public static byte[] encrypt(byte[] content, PublicKey key) {
    byte[] cipherText = null;
     
    try {
      final Cipher cipher = Cipher.getInstance(ALGORITHM);
      cipher.init(Cipher.ENCRYPT_MODE, key);
      cipherText = cipher.doFinal(content);
    } catch (Exception e) {
      e.printStackTrace();
    }
     
    return cipherText;
  }
  
  /**
   * Desencriptado del mens
   * @param content
   * @param key
   * @return 
   */
  public static byte[] decrypt(byte[] content, PrivateKey key) {
    byte[] dectyptedText = null;
     
    try {
      final Cipher cipher = Cipher.getInstance(ALGORITHM);
      cipher.init(Cipher.DECRYPT_MODE, key);
      dectyptedText = cipher.doFinal(content);
  
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  
    return dectyptedText;
  }
  

  public static void main(String[] args) { 
    try {
      if (!thereIsKeyPaarConfigured()) {
        generateKey();
      }
      Scanner sc = new Scanner(System.in);
      System.out.print("Mensaje a encriptar:");
      String txt = sc.nextLine();
  
      final String message = txt;
      ObjectInputStream inputStream = null;
  
      // Encriptacion usando la llave publica
      inputStream = new ObjectInputStream(new FileInputStream(PATH_PUBLIC_KEY));
      final PublicKey publicKey = (PublicKey) inputStream.readObject();
      final byte[] contentEncrypted = encrypt(message.getBytes(), publicKey);
  
      // Desencriptado usando la llave privada
      inputStream = new ObjectInputStream(new FileInputStream(PATH_PRIVATE_KEY));
      final PrivateKey privateKey = (PrivateKey) inputStream.readObject();
       byte[] originalContent= decrypt(contentEncrypted, privateKey);
       final String plainText= new String(originalContent);

      System.out.println("Original: " + message);
      System.out.println("Encriptado: " +new String(contentEncrypted));
      System.out.println("Desencriptado: " + plainText);
  
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
