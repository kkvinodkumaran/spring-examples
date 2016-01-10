package com.vinod.test;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryptionTest {

    static String keyString = "Pretec_SecretKeu";

    /**
 * @param args
 */
    public static void main(String[] args) {
        System.out.println();

        byte[] encryptedValue = encrypt(keyString, "Hello world");

        System.out.println("Encrypted Value" + encryptedValue);

        String decryptedValue = decrypt(keyString, encryptedValue);
        System.out.println("Decrypted value : " + decryptedValue);

    }

    public static byte[] encrypt(String keyString, String msg) {
        SecretKey secKey;
        byte[] byteCipherText = null;
        try {
            secKey = new SecretKeySpec(keyString.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            byte[] byteText = msg.getBytes();
            aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
            byteCipherText = aesCipher.doFinal(byteText);
            System.out.println("Encrypted Value" + byteCipherText);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return byteCipherText;
    }

    public static String decrypt(String keyString, byte[] msg) {
        SecretKey secKey;
        byte[] bytePlainText = null;
        try {
            secKey = new SecretKeySpec(keyString.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secKey);
            bytePlainText = aesCipher.doFinal(msg);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new String(bytePlainText);
    }

}