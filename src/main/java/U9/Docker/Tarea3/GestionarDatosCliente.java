package U9.Docker.Tarea3;

import java.sql.*;
import java.util.Scanner;

public class GestionarDatosCliente {

    public static void insertarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer number: ");
        int customerNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer name: ");
        String customerName = sc.nextLine();
        System.out.println("Customer last name: ");
        String contactLastName = sc.nextLine();
        System.out.println("Customer first name: ");
        String contactFirstName = sc.nextLine();
        System.out.println("Customer phone: ");
        String phone = sc.nextLine();
        System.out.println("Customer address 1:");
        String addressLine1 = sc.nextLine();;
        System.out.println("Customer address 2:");
        String addressLine2 = sc.nextLine();;
        System.out.println("Customer city: ");
        String city = sc.nextLine();;
        System.out.println("Customer state: ");
        String state = sc.nextLine();;
        System.out.println("Customer postal Code: ");
        String postalCode = sc.nextLine();;
        System.out.println("Customer country: ");
        String country = sc.nextLine();;
        System.out.println("Customer credit limit: ");
        double creditLimit = sc.nextDouble();
        sc.nextLine();;
        try {
            Connection c = ConexionBBDD.getConnection();
            PreparedStatement statement = c.prepareStatement("INSERT INTO customers " +
                    "(customerNumber, customerName, contactLastName, contactFirstName," +
                    "phone, addressLine1, addressLine2, city," +
                    "state, postalCode, country,creditLimit) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            statement.setQueryTimeout(30);
            statement.setInt(1,customerNumber);
            statement.setString(2,customerName);
            statement.setString(3,contactLastName);
            statement.setString(4,contactFirstName);
            statement.setString(5,phone);
            statement.setString(6,addressLine1);
            statement.setString(7,addressLine2);
            statement.setString(8,city);
            statement.setString(9,state);
            statement.setString(10,postalCode);
            statement.setString(11,country);
            statement.setDouble(12,creditLimit);
            statement.executeUpdate();

            c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
