package U5.Prueba2021;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Participante {
    private String nombreAtleta;
    private int edadAtleta;

    public Participante(String nombreAtleta, int edadAtleta) {
        this.nombreAtleta = nombreAtleta;
        this.edadAtleta = edadAtleta;

    }

    public abstract void hacerjuramento();

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public int getEdadAtleta() {
        return edadAtleta;
    }

    public void setEdadAtleta(int edadAtleta) {
        this.edadAtleta = edadAtleta;
    }

    void mostrarJugadoresBaloncestoPorAltura(Participante[] baloncestistas){
        Arrays.sort(baloncestistas,new OrdenarXAltura());
        for (int i = 0; i < baloncestistas.length; i++) {
            System.out.println(baloncestistas[i]);
        }
    }
}
