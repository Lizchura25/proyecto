/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.util.Base64;
/**
 *
 * @author HP
 */
public class funciones {
    public static String encrypt(String string, String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char charToEncrypt = string.charAt(i);
            char keyChar = key.charAt(i % key.length()); // Corregido aquí
            char encryptedChar = (char) (charToEncrypt + keyChar);
            result.append(encryptedChar);
        }

        return Base64.getEncoder().encodeToString(result.toString().getBytes());
    }

    public static String decrypt(String string, String key) {
        StringBuilder result = new StringBuilder();

        byte[] decodedBytes = Base64.getDecoder().decode(string);
        String decodedString = new String(decodedBytes);
        for (int i = 0; i < decodedString.length(); i++) {
            char charToDecrypt = decodedString.charAt(i);
            char keyChar = key.charAt(i % key.length()); // Corregido aquí
            char decryptedChar = (char) (charToDecrypt - keyChar);
            result.append(decryptedChar);
        }

        return result.toString();
    }
}
