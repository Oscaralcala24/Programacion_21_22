package U5.Prueba2021;

public class Baloncesto extends Deporte{
    private int numeroEquipos;

    public Baloncesto(String nombreDeporte, String nombrePabellon, int numeroEquipos) {
        super(nombreDeporte, nombrePabellon);
        this.numeroEquipos =  numeroEquipos;
    }

}
