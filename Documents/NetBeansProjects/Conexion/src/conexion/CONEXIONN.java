/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
//las 3 librerias sirven para conexion
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//las 2 librerias sirven para obtener datos
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author HP
 */
public class CONEXIONN {
    String db="proyecto_dsb";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    public CONEXIONN(){
    }
     //crear la clse conexion
        public Connection conectar(){
       try{
           Class.forName(driver);
           cx=DriverManager.getConnection(url+db,user,password);
           System.out.println("se realizo la conexion");
       }catch(ClassNotFoundException |SQLException ex){
           System.out.println("No se realizo la conexion");
       }  
       return cx;
    }
    public void desconectar(){
        try{
            cx.close();
        }catch(SQLException ex){
            System.out.println("Error! no se realizo la desconexion");
        } 
    }
    public ResultSet ObtenerDatos(String consulta){
        Connection con = conectar();
        ResultSet rs=null;
        try{
           Statement stmt = con.createStatement();
           rs = stmt.executeQuery(consulta);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return rs;
    }
    public static void main(String[]args){
        CONEXIONN conn= new CONEXIONN();
        conn.conectar();
    }
}
