package U4.Entregable_20_21_Manana;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Empleado {

    private String nombreCompleto;
    private String numeroSS;
    private String telefono;
    private LocalDate fechaInicio = LocalDate.now();
    private tipoEmpleado tipoDeEmpleado = tipoEmpleado.TECNICO;
    private int contadorEmpleado = 0;



    public Empleado(String nombreCompleto, String numeroSS, String telefono, tipoEmpleado tipoDeEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.numeroSS = numeroSS;
        this.telefono = telefono;
        this.tipoDeEmpleado = tipoDeEmpleado;
        contadorEmpleado++;
    }


    public Empleado(String nombreCompleto, String numeroSS, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.numeroSS = numeroSS;
        this.telefono = telefono;
    }



    public enum tipoEmpleado{
        ADMINISTRATIVO,
        TECNICO,
        DIRECTIVO
    }

    void mostrarDatosEmpleado(){
        System.out.println("El nombre del empleado es: " + this.nombreCompleto);
        System.out.println("El numero de la Seguridad Social del empleado es: " + this.numeroSS);
        System.out.println("El numero de telefono del empleado es: " + this.telefono);
        System.out.println("Fue contratado el: " + this.fechaInicio);
        System.out.println("Su cargo en la empresa es: " + this.tipoDeEmpleado);
    }

    public void getNombreCompleto() {
        System.out.println(this.nombreCompleto);
    }


    public int getContadorEmpleado() {
        return contadorEmpleado;
    }

}
