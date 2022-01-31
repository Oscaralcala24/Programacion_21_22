package U4.Entregable_20_21_Manana;

import java.util.Arrays;

public class Departamento {

    private String nombreDepartamento;
    private String sede = "Castilleja";
    private int extensionTfn;
    private Empleado[] listaEmpleados = new Empleado[0];
    private int contadorEmpleados = 0;

    public Departamento(String nombreDepartamento, String sede, int extensionTfn) {
        this.nombreDepartamento = nombreDepartamento;
        this.sede = sede;
        this.extensionTfn = extensionTfn;
    }
    public Departamento(String nombreDepartamento, int extensionTfn) {
        this.nombreDepartamento = nombreDepartamento;
        this.extensionTfn = extensionTfn;
    }

    void anadirEmpleado(Empleado empleadoAnadir){
        this.listaEmpleados = Arrays.copyOf(this.listaEmpleados, this.listaEmpleados.length + 1);
        listaEmpleados[contadorEmpleados - 1] = empleadoAnadir;
    }

    void eliminarEmpleado(int posicion){
        for (int i = 0; i < listaEmpleados.length-1; i++) {
            if (i >= posicion){
                listaEmpleados[i] = listaEmpleados[i+1];
            }
        }
        System.out.println("Empleado eliminado con exito");
        this.listaEmpleados = Arrays.copyOf(this.listaEmpleados, this.listaEmpleados.length - 1);
    }
    void mostrarListaEmpleados(){
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println(listaEmpleados[i]);
        }
    }
}
