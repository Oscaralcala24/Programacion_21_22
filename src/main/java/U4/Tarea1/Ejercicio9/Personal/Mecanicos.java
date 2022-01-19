package U4.Tarea1.Ejercicio9.Personal;

public class Mecanicos {
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
