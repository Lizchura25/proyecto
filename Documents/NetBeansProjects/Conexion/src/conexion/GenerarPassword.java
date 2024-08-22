/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author HP
 */
public class GenerarPassword {
    public static void main(String[]args){
        String llave = config.llave_publica;
        String Password ="12345678";
        System.out.println(funciones.encrypt(Password, llave));
        String pass_encriptado="woHCpMKiwq3CmsKZwqvCpw==";
        System.out.println(funciones.decrypt(pass_encriptado, llave));
    }
}
