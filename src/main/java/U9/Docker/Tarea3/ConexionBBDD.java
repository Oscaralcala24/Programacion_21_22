package U9.Docker.Tarea3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {
    private static Connection con = null;
    public static Connection getConnection(){
        try{
            if (con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
                System.out.println("Conection Succesfull");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
}
