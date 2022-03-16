package U7.Tarea4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Empleado extends Persona{
    private double sueldo;
    private static Empleado[] arrayEmpleados = new Empleado[0];

    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
        anadirEmpleado(this);
    }

    private void anadirEmpleado(Empleado empleado1) {
        arrayEmpleados = Arrays.copyOf(this.arrayEmpleados, this.arrayEmpleados.length+1);
        arrayEmpleados[arrayEmpleados.length-1] =  empleado1;
    }
}
