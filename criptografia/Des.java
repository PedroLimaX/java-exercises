/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package des;

/**
 *
 * @author pedro
 */

import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;


public class Des {

    private final SecretKey key;
    private Cipher encCipher;
    private Cipher decCipher;

    public Des() throws Exception {
        this.key = generateKey();
        initCiphers();
    }

    public Des(SecretKey key) throws Exception {
        this.key = key;
        initCiphers();
    }

    private void initCiphers() throws Exception {
        encCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        decCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        encCipher.init(Cipher.ENCRYPT_MODE, key);
        decCipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(encCipher.getIV()));
    }


    public byte[] encrypt(String message) throws Exception {
        return encCipher.doFinal(message.getBytes());
    }

    public String decryt(byte[] messsage) throws Exception {
        return new String(decCipher.doFinal(messsage));
    }


    public static SecretKey generateKey() throws Exception {
        return KeyGenerator.getInstance("DES").generateKey();
    }
    
    
    
    public static void main(String[] args) throws Exception {

        SecretKey key = Des.generateKey();
        System.out.print("Encrypt/Decrypt Key: ");
        System.out.println(encode(key.getEncoded()));
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Mensaje a encriptar:");
        String txt = sc.nextLine();
        String message = txt;

        Des des = new Des(key);
        String encryptedMessage = encode(des.encrypt(message));
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + des.decryt(decoder(encryptedMessage)));

    }

    public static String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    public static byte[] decoder(String data) {
        return Base64.getDecoder().decode(data);
    }
}