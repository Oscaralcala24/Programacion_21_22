package U4.Entregable_20_21_Manana;

import java.time.LocalDateTime;
import java.util.Date;

public class Empleado {
    private String nombreCompleto;
    private String numeroSS;
    private String telefono;
    private LocalDateTime fechaInicio = LocalDateTime.now();
    private tipoEmpleado tipoDeEmpleado = tipoEmpleado.TECNICO;

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
}
