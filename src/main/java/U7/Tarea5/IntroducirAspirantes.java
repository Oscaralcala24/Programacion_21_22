package U7.Tarea5;

public class IntroducirAspirantes extends Aspirante {
    private static int contador = 1;
    private int numeroId;

    public IntroducirAspirantes(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
        this.numeroId = contador;
        contador++;
    }
}
