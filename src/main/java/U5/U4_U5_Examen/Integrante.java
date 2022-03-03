package U5.U4_U5_Examen;

public class Integrante {
    private int numeroParticipante;
    private String nombre;
    private int edad;
    private String localidad;
    private static int contador = 1;

    public Integrante( String nombre, int edad, String localidad) {
        this.numeroParticipante = contador;
        contador++;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numeroParticipante=" + numeroParticipante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
