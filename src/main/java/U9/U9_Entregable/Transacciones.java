package U9.U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transacciones {
    private static Connection c = ConexionDB.getConnection();

    public static void insertarNuevaOficina(){
        try {
            c.setAutoCommit(false);
            insertarOficina(new Oficina("8","Tokyo", "+81 35 277 545", "Doraemon 5","Doraemon 4", "Chiyoda-Ku", "Japon", "102-8578","Japon"));

            System.out.println("Se ha insertado correctamente");

            PreparedStatement preparedStatement = c.prepareStatement("UPDATE employees SET officeCode = 8 WHERE officeCode = ?;");
            preparedStatement.setString(1,"5");
            preparedStatement.executeUpdate();
            c.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try{
                if (c != null){
                    System.out.println("Estado anterior BBDD");
                    c.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
    public static void insertarEmpleadoCliente(){
        try {
            c.setAutoCommit(false);

            insertarEmpleado(new Empleado(1203,"Alcala", "Oscar", "x48045","oscaralcalasev97@gmail.com", "3","Sales Rep",1002));

            System.out.println("Se ha insertado correctamente");

            insertarCliente(new Cliente(1003, "Alonso","Hamilton", "Lewis", "87567856","Calle Sevilla", "Calle Cordoba", "Sevilla", "Andalucia", "41900","España",1203,283843));

            insertarCliente(new Cliente(6374, "Antonio","Flores", "Antonio", "565756765","Calle Jaen", "Calle Granada", "Cordoba", "Andalucia", "417576","España",1203,777223));

            c.commit();

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


    public static void insertarEmpleado(Empleado e){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,e.getEmployeeNumber());
            preparedStatement.setString(2,e.getLastName());
            preparedStatement.setString(3,e.getFirstName());
            preparedStatement.setString(4,e.getExtension());
            preparedStatement.setString(5,e.getEmail());
            preparedStatement.setString(6, e.getOfficeCode());
            preparedStatement.setInt(7,e.getReportsTo());
            preparedStatement.setString(8,e.getJobTitle());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void insertarCliente(Cliente c1){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,c1.getCustomerNumber());
            preparedStatement.setString(2,c1.getCustomerName());
            preparedStatement.setString(3,c1.getContactLastName());
            preparedStatement.setString(4,c1.getContactFirstName());
            preparedStatement.setString(5,c1.getPhone());
            preparedStatement.setString(6, c1.getAddressLine1());
            preparedStatement.setString(7,c1.getAddressLine2());
            preparedStatement.setString(8,c1.getCity());
            preparedStatement.setString(9,c1.getState());
            preparedStatement.setString(10,c1.getPostalCode());
            preparedStatement.setString(11,c1.getCountry());
            preparedStatement.setInt(12,c1.getSalesRepEmployeeNumber());
            preparedStatement.setDouble(13,c1.getCreditLimit());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void insertarOficina(Oficina o){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,o.getOfficeCode());
            preparedStatement.setString(2,o.getCity());
            preparedStatement.setString(3,o.getPhone());
            preparedStatement.setString(4,o.getAddressLine1());
            preparedStatement.setString(5,o.getAddressLine2());
            preparedStatement.setString(6, o.getState());
            preparedStatement.setString(7,o.getCountry());
            preparedStatement.setString(8,o.getPostalCode());
            preparedStatement.setString(9,o.getTerritory());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
