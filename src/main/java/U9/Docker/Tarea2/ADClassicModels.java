package U9.Docker.Tarea2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public List<Empleado> getEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList<>();
        try {
            Connection c = ConexionBD.getConnection();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from employees");

            while(rs.next()){
                Empleado e = new Empleado(rs.getInt("employeeNumber"),rs.getString("lastName"),rs.getString("firstName"),rs.getString("extension"),rs.getString("email"),rs.getString("officeCode"),rs.getString("jobTitle"),rs.getInt("reportsTo"));
                listaEmpleados.add(e);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listaEmpleados;
    }

    public List<Oficina> getOffice() {
        List<Oficina> listaOficina = new ArrayList<>();
        try {
            Connection c = ConexionBD.getConnection();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from offices");

            while (rs.next()){
                Oficina o = new Oficina(rs.getString("officeCode"),rs.getString("city"),rs.getString("phone"), rs.getString("adressLine1"),rs.getString("adressLine2"),rs.getString("state"),rs.getString("country"),rs.getString("postalCode"),rs.getString("territory"));
                listaOficina.add(o);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaOficina;
    }
}
