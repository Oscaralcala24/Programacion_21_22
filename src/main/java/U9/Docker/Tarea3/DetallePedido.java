package U9.Docker.Tarea3;

import java.sql.*;

public class DetallePedido {
    public static void mostrarDetallePedido(int numeroPedido) {
        try {
            Connection c = ConexionBBDD.getConnection();
            PreparedStatement statement = c.prepareStatement("SELECT o.*, p.productName, od.quantityOrdered, p.buyPrice, (od.quantityOrdered*p.buyPrice) AS sumaTotal\n" +
                    "FROM orders o\n" +
                    "INNER JOIN orderdetails od\n" +
                    "ON o.orderNumber = od.orderNumber\n" +
                    "INNER JOIN products p\n" +
                    "ON od.productCode = p.productCode\n" +
                    "WHERE o.orderNumber = ?;\n");
            statement.setInt(1,numeroPedido);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int numPedidoAux = rs.getInt("orderNumber");
                Date fecha1 = rs.getDate("orderDate");
                Date fecha2 = rs.getDate("requiredDate");
                Date fecha3 = rs.getDate("shippedDate");
                String estado = rs.getString("status");
                String comentario = rs.getString("comments");
                int numeroCliente = rs.getInt("customerNumber");
                String nombreProducto = rs.getString("productName");
                int cantidad = rs.getInt("quantityOrdered");
                double precio = rs.getDouble("buyPrice");
                double precioTotal = rs.getDouble("sumaTotal");


                System.out.println("-------------------------");
                System.out.println("orderNumber: " + numPedidoAux);
                System.out.println("orderDate: " + fecha1);
                System.out.println("requiredDate: " + fecha2);
                System.out.println("shippedDate: " + fecha3);
                System.out.println("status: " + estado);
                System.out.println("comments: " + comentario);
                System.out.println("customerNumber: " + numeroCliente);
                System.out.println("productName: " + nombreProducto);
                System.out.println("quantityOrdered: " + cantidad);
                System.out.println("buyPrice: " + precio);
                System.out.println("sumaTotal: " + precioTotal);
                System.out.println("-------------------------");
            }
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
