package U9.U8U9_Examen.Ejercicio4;

import U9.U9_Entregable.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    private static Connection c = ConexionDB.getConnection();

    public static void insertarLineaProducto(){
        try {
            c.setAutoCommit(false);
            insertaLinea(new ProductLine("Deportivos","Coches deportivos para competicion",null,null));

            System.out.println("Se ha insertado la linea correctamente");

            insertarProducto(new Product("S1000_1676","Mcclaren 720s","Deportivos", "1:10", "Oscar", "Coche con muchos caballos", 838,19983,200));

            System.out.println("Se ha insertado el producto correctamente");

            insertarProducto(new Product("S1000_3456","Ferrari F40","Deportivos", "1:10", "Oscar", "Coche con muchos caballos de ferrari", 16,13333,233));

            System.out.println("Se ha insertado el producto correctamente");


            c.commit();
            ConexionDB.closeConnection();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try{
                if (c != null){
                    System.out.println("Estado anterior BBDD");
                    c.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void insertaLinea(ProductLine pl){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO productlines VALUES (?,?,?,?)");
            preparedStatement.setString(1,pl.getProductLine());
            preparedStatement.setString(2,pl.getTextDescription());
            preparedStatement.setString(3,pl.getHtmlDescription());
            preparedStatement.setString(4,pl.getImage());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void insertarProducto(Product product){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,product.getProductCode());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setString(3, product.getProductLine());
            preparedStatement.setString(4, product.getProductScale());
            preparedStatement.setString(5, product.getProductVendor());
            preparedStatement.setString(6, product.getProductDescription());
            preparedStatement.setInt(7,product.getQuantityInStock());
            preparedStatement.setDouble(8,product.getBuyPrice());
            preparedStatement.setDouble(9,product.getMSRP());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
