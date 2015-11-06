/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cmch05
 */
public class ConectarDB {
    
    //instanciamos Connection
    Connection con=null;
    //un metodo tipo Connection
    public Connection coneccion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //direccion base de datos, usurario, contraseña del usuario
            con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
            
           // JOptionPane.showMessageDialog(null, "coneccion establecida");
        }
        //try catch validacion de errores
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error en la coneccion "+e);
        }
        return con;
    }
    
}
