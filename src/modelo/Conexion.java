package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    protected Connection conexion;
    
    public void conectar() throws Exception{
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
        //conexion = DriverManager.getConnection ("jdbc:derby://localhost:1527/data","root", "abc123");
        //conexion = DriverManager.getConnection ("jdbc:derby:/home/jismael/Java_bd/data","root", "abc123");
        conexion = DriverManager.getConnection ("jdbc:derby:data","root", "abc123");
    }
    
    public void cerrar() throws SQLException{
        if(conexion != null)
            if(!conexion.isClosed()){
                conexion.close();
            }
    }
    
}