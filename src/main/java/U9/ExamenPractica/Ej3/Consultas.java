package U9.ExamenPractica.Ej3;

import U9.U9_Entregable.ConexionDB;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static void main(String[] args) {
        mostrarJson(MostrarOficinas());
    }

    private static List<Office> MostrarOficinas(){
        List<Office> listaOficinas = new ArrayList<>();
        try{
            Connection c = ConexionDB.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM offices");

            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()){
                Office o1 = new Office(rs.getString("officeCode"), rs.getString("city") ,rs.getString("phone") ,rs.getString("addressLine1") ,rs.getString("addressLine2") ,rs.getString("state") ,rs.getString("country") ,rs.getString("postalCode") ,rs.getString("territory"));
                listaOficinas.add(o1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaOficinas;
    }

    private static void mostrarJson(List<Office> offices){
        Gson gson = new Gson();
        String listajson = gson.toJson(offices);
        System.out.println(listajson);
    }
}
