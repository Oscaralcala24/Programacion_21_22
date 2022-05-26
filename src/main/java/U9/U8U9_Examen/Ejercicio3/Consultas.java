package U9.U8U9_Examen.Ejercicio3;

import U9.ExamenPractica.Ej3.Office;
import U9.U9_Entregable.ConexionDB;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {
    public static List<Employee> MostrarEmpleados(){
        List<Employee> listaEmpleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce codigo de oficina: ");
        int codigoOficina = sc.nextInt();
        try{
            Connection c = ConexionDB.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM employees WHERE officeCode = ?");
            preparedStatement.setInt(1,codigoOficina);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()){
                Employee e1 = new Employee(rs.getInt("employeeNumber"), rs.getString("lastName") ,rs.getString("firstName") ,rs.getString("extension") ,rs.getString("email") ,rs.getString("officeCode") ,rs.getInt("reportsTo") ,rs.getString("jobTitle"));
                listaEmpleados.add(e1);
            }
            ConexionDB.closeConnection();
            System.out.println("Conexion cerrada con exito!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaEmpleados;
    }
}
