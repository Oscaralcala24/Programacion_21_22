package U9.Docker.Tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarRelacionEmpleClien {
    public static void asignarEmpleadoCLiente(int numEmpleado, int numCliente) {
        boolean estaEmpleado = false;
        boolean estaCliente = false;
        try{
            Connection c = ConexionBBDD.getConnection();
            PreparedStatement statement = c.prepareStatement("Select * FROM employees WHERE employeeNumber = ? ");
            statement.setInt(1,numEmpleado);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                estaEmpleado = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try{
            Connection c = ConexionBBDD.getConnection();
            PreparedStatement statement = c.prepareStatement("Select * FROM customers WHERE customerNumber = ? ");
            statement.setInt(1,numCliente);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                estaCliente = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (!estaEmpleado || !estaCliente){
            System.out.println("Uno de los dos campos no se encuentra en la base de datos");
        }else {
            try {
                Connection c = ConexionBBDD.getConnection();
                PreparedStatement statement = c.prepareStatement("UPDATE customers SET salesRepEmployeeNumber = ? " +
                        "WHERE customerNumber = ?");
                statement.setInt(1,numEmpleado);
                statement.setInt(2,numCliente);
                statement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
