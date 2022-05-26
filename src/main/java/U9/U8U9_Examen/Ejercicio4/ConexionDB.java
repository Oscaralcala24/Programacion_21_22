package U9.U8U9_Examen.Ejercicio4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
     static Connection con;
    public static Connection getConnection(){
        try{
            if( con == null ){
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
                System.out.println("Conexion realizada con exito");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }

    public static void closeConnection(){
        try {
            if (con!= null){
                con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
