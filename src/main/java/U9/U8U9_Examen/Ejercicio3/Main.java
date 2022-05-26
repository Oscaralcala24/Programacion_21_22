package U9.U8U9_Examen.Ejercicio3;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listaEmpleados = Consultas.MostrarEmpleados();
        Gson gson = new Gson();
        String listajson = gson.toJson(listaEmpleados);
        System.out.println(listajson);
    }
}
