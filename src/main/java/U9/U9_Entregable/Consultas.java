package U9.U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {
    static Scanner sc = new Scanner(System.in);


    public static void informeCategoria() {
        System.out.println("Introduce nombre de una categoria: ");
        String categoria = sc.nextLine();
        try {
            Connection c = ConexionDB.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT p.productName,od.quantityOrdered, od.priceEach FROM products p\n" +
                    "INNER JOIN orderdetails od\n" +
                    "ON p.productCode=od.productCode\n" +
                    "WHERE p.productLine = ?;");
            preparedStatement.setString(1,categoria);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            System.out.println("Informe categoria");
            while (rs.next()){
                System.out.println("Nombre del producto: " + rs.getString("productName"));
                System.out.println("Cantidad del producto: " + rs.getInt("quantityOrdered"));
                System.out.println("Precio unitario del producto: " + rs.getDouble("priceEach"));
                System.out.println("/////////////////////////////////////////////////");

            }
            ConexionDB.closeConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void InfoPagos() {
        System.out.println("Introduce numero del cliente del que desea informacion: ");
        int numCliente = sc.nextInt();
        try {
            Connection c = ConexionDB.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT c.customerName, p.checkNumber, p.paymentDate, p.customerNumber, p.amount\n" +
                    "FROM customers c INNER JOIN payments p \n" +
                    "ON c.customerNumber=p.customerNumber\n" +
                    "WHERE p.customerNumber= ?;\n");
            preparedStatement.setInt(1,numCliente);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            System.out.println("Informacion de pagos del cliente");
            while (rs.next()){
                System.out.println("Numero de cliente: "+ rs.getInt("customerNumber"));
                System.out.println("Nombre del cliente: "+ rs.getString("customerName"));
                System.out.println("Numero de check: "+ rs.getString("checkNumber"));
                System.out.println("Fecha de pago: "+ rs.getDate("paymentDate"));
                System.out.println("Cantidad del pago: "+ rs.getDouble("amount"));
                System.out.println("/////////////////////////////////////////////////");
            }
            ConexionDB.closeConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void FiltroPrecio() {

        System.out.println("Introduce precio a filtrar: ");
        double precio = sc.nextDouble();
        try {
            Connection c = ConexionDB.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM products WHERE buyPrice > ?");
            preparedStatement.setDouble(1,precio);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()){
                System.out.println("Producto : "+ rs.getString("productName"));
                System.out.println("Precio : "+ rs.getDouble("buyPrice"));
                System.out.println("/////////////////////////////////////////////////");
            }
            ConexionDB.closeConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
