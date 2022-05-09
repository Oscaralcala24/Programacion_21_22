package U9.Docker.Tarea2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public List<Empleado> getEmpleados() throws SQLException {
        try {
            List<Empleado> listaEmpleados = new ArrayList<>();
            Connection c = ConexionBD.getConnection();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from employees");

            while(rs.next()){
                Empleado e = new Empleado(rs.getInt("employeeNumber"),rs.getString("lastName"),rs.getString(),rs.getString());
            }
        }
    }
}
