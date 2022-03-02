package U4.Tarea1.Ejercicio9.Personal;

import java.io.Serializable;

public class Mecanicos implements Serializable {
    private String nombreMecanico;
    private long telefono;
    private tipoEspecialidad tipo;

    public Mecanicos(String nombreMecanico,long telefono,tipoEspecialidad tipo){
        this.nombreMecanico = nombreMecanico;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public enum tipoEspecialidad{
        FRENOS,
        HIDRAULICA,
        MOTOR,
        AERODINAMICA
    }
}
