package U9.Docker.Tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarProducto {

    public static void anadirProductoPedido(String numProducto, int numPedido, int cantidadProducto) {
        boolean estaProducto = false;
        boolean estaPedido = false;
        try{
            Connection c = ConexionBBDD.getConnection();
            PreparedStatement statement = c.prepareStatement("SELECT * FROM products WHERE productCode = ?");
            statement.setString(1, numProducto);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                estaProducto = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try{
            Connection c = ConexionBBDD.getConnection();
            PreparedStatement statement = c.prepareStatement("SELECT * FROM orders WHERE orderNumber = ?");
            statement.setInt(1,numPedido);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                estaPedido = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (!estaProducto || !estaPedido){
            System.out.println("Uno de los dos campos no se encuentra en la base de datos");
        }else {
            try{
                Connection c = ConexionBBDD.getConnection();
                PreparedStatement statement = c.prepareStatement("SELECT * FROM orderdetails WHERE orderNumber = ? AND productCode = ?");
                statement.setInt(1,numPedido);
                statement.setString(2,numProducto);
                ResultSet rs = statement.executeQuery();
                if (rs.next()){
                    int cantidad = rs.getInt("quantityOrdered");
                    try {
                        Connection cAux = ConexionBBDD.getConnection();
                        PreparedStatement statementAux = cAux.prepareStatement("UPDATE orderdetails SET quantityOrdered = ? WHERE productCode = ?" +
                                "AND orderNumber = ?");
                        statementAux.setInt(1,cantidad+cantidadProducto);
                        statementAux.setString(2,numProducto);
                        statementAux.setInt(3,numPedido);
                        statementAux.executeUpdate();
                    }catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }else {
                    PreparedStatement statementAux = c.prepareStatement("INSERT INTO orderdetails VALUES (?,?,?,?,?)");
                    statementAux.setInt(1,numPedido);
                    statementAux.setString(2,numProducto);
                    statementAux.setInt(3,cantidadProducto);
                    statementAux.setDouble(4,0);
                    statementAux.setDouble(5,3);
                    statementAux.executeUpdate();

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
